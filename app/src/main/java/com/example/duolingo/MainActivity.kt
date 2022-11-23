package com.example.duolingo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
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
            val nouFragment = HomeFragment()
            canviFragment(nouFragment)
        }
        binding.btFeed.setOnClickListener {

            val nouFragment = FeedFragment()
            canviFragment(nouFragment)
        }
    }

    private fun canviFragment(nouFragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fcontainer,nouFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}