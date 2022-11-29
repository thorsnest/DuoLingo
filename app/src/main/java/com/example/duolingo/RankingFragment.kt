package com.example.duolingo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.duolingo.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {
    private lateinit var binding: FragmentRankingBinding
    private lateinit var ranks: ArrayList<Rank>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ranking, container, false)
    }
}