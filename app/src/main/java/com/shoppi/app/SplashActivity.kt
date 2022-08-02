package com.shoppi.app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {

    private val TAG2 = "SplashActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        Log.d(TAG2, "onCreate")
        finish()
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG2, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG2, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG2, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG2, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG2, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG2, "onDestroy")
    }
}