package com.example.flaggame

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.flaggame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var toggleButtonMute: ToggleButton
    private lateinit var backgroundMediaPlayer: MediaPlayer
    private val audioResources = intArrayOf(R.raw.bgmusic2new)
    private var currentTrackIndex = 0
    private var screenReceiver: BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        backgroundMediaPlayer = MediaPlayer.create(this, audioResources[currentTrackIndex])
        backgroundMediaPlayer.isLooping = false
        backgroundMediaPlayer.start()



        toggleButtonMute = binding.toggleButtonMute
        toggleButtonMute.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                backgroundMediaPlayer.setVolume(0f, 0f)
            } else {
                backgroundMediaPlayer.setVolume(1f, 1f)
            }
        }

        backgroundMediaPlayer.setOnCompletionListener {
            switchToNextTrack()
        }

        registerScreenReceiver()
    }

    private fun switchToNextTrack() {
        currentTrackIndex = (currentTrackIndex + 1) % audioResources.size
        backgroundMediaPlayer.reset()
        backgroundMediaPlayer = MediaPlayer.create(this, audioResources[currentTrackIndex])
        backgroundMediaPlayer.isLooping = false
        backgroundMediaPlayer.start()
    }

    private fun registerScreenReceiver() {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_SCREEN_OFF)
            addAction(Intent.ACTION_SCREEN_ON)
        }
        screenReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    Intent.ACTION_SCREEN_OFF -> backgroundMediaPlayer.pause()
                    Intent.ACTION_SCREEN_ON -> backgroundMediaPlayer.start()
                }
            }
        }
        registerReceiver(screenReceiver, filter)
    }

    override fun onStop() {
        super.onStop()
        if (!isChangingConfigurations) {
            backgroundMediaPlayer.pause()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(screenReceiver)
        backgroundMediaPlayer.release()
    }
}
