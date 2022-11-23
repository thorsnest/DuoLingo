package com.example.duolingo

import android.graphics.Typeface
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFeedBinding.inflate(layoutInflater)
        feeds = arrayListOf()
        omplirFeed()
        llancarLlista()
    }

    private fun llancarLlista() {
        binding.rvFeed.layoutManager = LinearLayoutManager(requireParentFragment().context)
        binding.rvFeed.adapter = Adaptador(feeds)
    }

    private fun omplirFeed() {
        feeds.addAll(
            listOf(
            Feed("fa 1 minut", R.drawable.backpack, "aa"),
            Feed("fa 1 minut", R.drawable.shop, "aa")
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }
}