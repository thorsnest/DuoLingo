package com.example.duolingo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowInsetsController
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.duolingo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.loading_screen_2)
        amagaBarraEstat()
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

        binding.btSuper.setOnClickListener {
            val nouFragment = SuperFragment()
            canviFragment(nouFragment)
        }

        binding.btRank.setOnClickListener {
            val nouFragment = RankingFragment()
            canviFragment(nouFragment)
        }

        binding.btFeed.setOnClickListener {

            val nouFragment = FeedFragment()
            canviFragment(nouFragment)
        }
    }

    private fun amagaBarraEstat() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, this.window.decorView.findViewById(android.R.id.content)).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
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