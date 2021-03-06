package com.example.moviecatalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class Splashscreen : AppCompatActivity() {

    private val SPLASH_SCREEN_TIME: Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )
        setContentView(R.layout.activity_splashscreen)


        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, OneActivity::class.java))
            finish()
        },SPLASH_SCREEN_TIME)
    }
}