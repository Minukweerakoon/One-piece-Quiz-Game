package com.minuk.onepiecequiz

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.minuk.onepiecequiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var toggleButtonMute: ToggleButton
    private lateinit var backgroundMediaPlayer: MediaPlayer
    private val audioResources = intArrayOf(R.raw.bgmusic2new, R.raw.binksake)
    private var currentTrackIndex = 0
    private var screenOffReceiver: BroadcastReceiver? = null
    private var screenOnReceiver: BroadcastReceiver? = null
    private var screenReceiver: BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Shuffle the audio resources to play in random order
        audioResources.shuffle()

        // Initialize MediaPlayer with the first background music track
        initializeMediaPlayer()

        toggleButtonMute = binding.toggleButtonMute

        toggleButtonMute.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Mute the background music
                backgroundMediaPlayer.setVolume(0f, 0f)
            } else {
                // Unmute the background music
                backgroundMediaPlayer.setVolume(1f, 1f)
            }
        }

        // Register BroadcastReceiver to listen for screen off event
        registerScreenOffReceiver()

        // Register BroadcastReceiver to listen for screen on event
        registerScreenOnReceiver()

        // Register BroadcastReceiver to listen for screen visibility changes
        registerScreenVisibilityReceiver()
    }

    private fun initializeMediaPlayer() {
        backgroundMediaPlayer = MediaPlayer.create(this, audioResources[currentTrackIndex])
        backgroundMediaPlayer.isLooping = false

        // Set up a listener to switch to the next track when the current one completes
        backgroundMediaPlayer.setOnCompletionListener {
            switchToNextTrack()
        }

        backgroundMediaPlayer.start()
    }

    private fun switchToNextTrack() {
        // Move to the next track
        currentTrackIndex = (currentTrackIndex + 1) % audioResources.size

        // Reset and initialize MediaPlayer with the next track
        backgroundMediaPlayer.reset()
        backgroundMediaPlayer = MediaPlayer.create(this, audioResources[currentTrackIndex])
        backgroundMediaPlayer.isLooping = false

        // Set up a listener to switch to the next track when the current one completes
        backgroundMediaPlayer.setOnCompletionListener {
            switchToNextTrack()
        }

        backgroundMediaPlayer.start()
    }

    private fun registerScreenOffReceiver() {
        val filter = IntentFilter(Intent.ACTION_SCREEN_OFF)
        screenOffReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                if (intent?.action == Intent.ACTION_SCREEN_OFF) {
                    // Pause the background music when the screen turns off
                    backgroundMediaPlayer.pause()
                }
            }
        }
        registerReceiver(screenOffReceiver, filter)
    }

    private fun registerScreenOnReceiver() {
        val filter = IntentFilter(Intent.ACTION_SCREEN_ON)
        screenOnReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                if (intent?.action == Intent.ACTION_SCREEN_ON) {
                    // Resume the background music when the screen turns on
                    backgroundMediaPlayer.start()
                }
            }
        }
        registerReceiver(screenOnReceiver, filter)
    }

    private fun registerScreenVisibilityReceiver() {
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_USER_PRESENT)
        filter.addAction(Intent.ACTION_SCREEN_ON)
        screenReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                if (intent?.action == Intent.ACTION_USER_PRESENT ||
                    intent?.action == Intent.ACTION_SCREEN_ON
                ) {
                    // App is visible on screen, start playing music
                    backgroundMediaPlayer.start()
                } else {
                    // App is not visible on screen, pause music
                    backgroundMediaPlayer.pause()
                }
            }
        }
        registerReceiver(screenReceiver, filter)
    }

    override fun onStop() {
        super.onStop()
        // Pause the music when the app goes into the background
        backgroundMediaPlayer.pause()
    }

    override fun onDestroy() {
        super.onDestroy()

        // Unregister the BroadcastReceivers
        screenOffReceiver?.let {
            unregisterReceiver(it)
        }
        screenOnReceiver?.let {
            unregisterReceiver(it)
        }
        screenReceiver?.let {
            unregisterReceiver(it)
        }

        // Release the MediaPlayer
        backgroundMediaPlayer.release()
    }
}
