package com.example.duolingo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.duolingo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.loading_screen_2)
        Handler(Looper.getMainLooper()).postDelayed( Runnable {
            setContentView(R.layout.loading_screen_1)
        }, 2000)
        Handler(Looper.getMainLooper()).postDelayed( Runnable {
            setContentView(binding.root)
        }, 6500)
        binding.btCasa.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(binding.fcontainer.id, HomeFragment())
        }
        binding.btFeed.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(binding.fcontainer.id, FeedFragment())
        }
    }
}