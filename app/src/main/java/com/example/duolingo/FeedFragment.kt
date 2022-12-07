package com.example.duolingo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.duolingo.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {
    private lateinit var binding: FragmentFeedBinding
    private lateinit var feeds: ArrayList<Feed>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFeedBinding.inflate(inflater, container, false)

        val root: View = binding.root

        omplirFeed()
        llancarLlista()

        return root
    }

    private fun llancarLlista() {
        binding.rvFeed.layoutManager = LinearLayoutManager(context)
        val adaptadorFeed = AdaptadorFeed(feeds)
        binding.rvFeed.adapter = adaptadorFeed
    }

    private fun omplirFeed() {
        feeds = arrayListOf()
        feeds.addAll(
            listOf(
                Feed("fa 1 minut", R.drawable.backpack, "Check out 4 creative ways to practice your new language (after you do your lesson)!"),
                Feed("fa 4 hores", R.drawable.headphones, "Now you can hear to some of our new language podcast and be entertained while you're learning a new language!"),
                Feed("fa 20 hores", R.drawable.pencil, "Don't forget to do your tests to see your progress in every course!"),
                Feed("fa 20 hores", R.drawable.backpack, "Don't forget to do your tests to see your progress in every course!")
            )
        )
    }
}