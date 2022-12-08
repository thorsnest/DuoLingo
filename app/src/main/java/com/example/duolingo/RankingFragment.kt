package com.example.duolingo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.duolingo.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {
    private lateinit var binding: FragmentRankingBinding
    private lateinit var personRankeds: ArrayList<PersonRanked>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRankingBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        val root: View = binding.root

        omplirFeed()
        llancarLlista()

        return root
    }

    private fun llancarLlista() {
        binding.rvRanking.layoutManager = LinearLayoutManager(context)
        val adaptadorPersonRanked = AdaptadorPersonRanked(personRankeds)
        binding.rvRanking.adapter = adaptadorPersonRanked
    }

    private fun omplirFeed() {
        personRankeds = arrayListOf()
        personRankeds.addAll(
            listOf(
                PersonRanked("nesgondia", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10),
                PersonRanked("stranger123", R.drawable.backpack, 10)
            )
        )
    }
}