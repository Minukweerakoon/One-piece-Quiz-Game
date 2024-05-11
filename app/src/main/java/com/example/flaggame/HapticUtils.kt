package com.example.flaggame
import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator

object HapticUtils {

    fun performHapticFeedback(context: Context) {
        val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (isVibrationPermissionGranted(context) && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator.vibrate(100)
            }
        }
    }

    private fun isVibrationPermissionGranted(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            context.checkSelfPermission(android.Manifest.permission.VIBRATE) == android.content.pm.PackageManager.PERMISSION_GRANTED
        } else {
            true
        }
    }
}
