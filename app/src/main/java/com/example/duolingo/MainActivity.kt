package com.example.duolingo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_screen_2)
        Handler(Looper.getMainLooper()).postDelayed( Runnable {
            setContentView(R.layout.loading_screen_1)
        }, 2000)
        Handler(Looper.getMainLooper()).postDelayed( Runnable {
            setContentView(R.layout.activity_main)
        }, 6500)
    }
}