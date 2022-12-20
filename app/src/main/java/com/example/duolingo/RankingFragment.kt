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
    ): View {

        binding = FragmentRankingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        omplirFeed()
        llancarLlista()

        binding.rankRuby.requestFocus()

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
                PersonRanked("nesgondia", R.drawable.backpack, 1320),
                PersonRanked("mario", R.drawable.headphones, 1112),
                PersonRanked("montse", R.drawable.pencil, 1078),
                PersonRanked("adrian", R.drawable.bell, 813),
                PersonRanked("jesus", R.drawable.backpack, 510),
                PersonRanked("jose", R.drawable.backpack, 409),
                PersonRanked("maria", R.drawable.backpack, 311),
                PersonRanked("marta", R.drawable.backpack, 284),
                PersonRanked("jesus_mari", R.drawable.backpack, 255),
                PersonRanked("isabel", R.drawable.backpack, 210),
                PersonRanked("susi", R.drawable.backpack, 171),
                PersonRanked("sandra", R.drawable.backpack, 156),
                PersonRanked("juan_jose", R.drawable.backpack, 140),
                PersonRanked("marc", R.drawable.backpack, 133),
                PersonRanked("cristian", R.drawable.backpack, 130),
                PersonRanked("selene", R.drawable.backpack, 120),
                PersonRanked("andy", R.drawable.backpack, 116),
                PersonRanked("blanca", R.drawable.backpack, 114),
                PersonRanked("cristina", R.drawable.backpack, 109),
                PersonRanked("isaac", R.drawable.backpack, 108),
                PersonRanked("encarni", R.drawable.backpack, 81),
                PersonRanked("juan_antonio", R.drawable.backpack, 79),
                PersonRanked("julian", R.drawable.backpack, 78),
                PersonRanked("mari", R.drawable.backpack, 78),
                PersonRanked("alex", R.drawable.backpack, 75),
                PersonRanked("laia", R.drawable.backpack, 72),
                PersonRanked("pepe", R.drawable.backpack, 60),
                PersonRanked("helena", R.drawable.backpack, 59),
                PersonRanked("arnau", R.drawable.backpack, 50),
                PersonRanked("fernando", R.drawable.backpack, 44),
                PersonRanked("ana", R.drawable.backpack, 30),
                PersonRanked("ariadna", R.drawable.backpack, 27),
                PersonRanked("candela", R.drawable.backpack, 25),
                PersonRanked("violeta", R.drawable.backpack, 10)
            )
        )
    }
}