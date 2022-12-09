package com.example.duolingo

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.duolingo.databinding.FragmentGoalsBinding

class GoalsFragment : Fragment() {
    private lateinit var binding: FragmentGoalsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGoalsBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val tvgoals = root.findViewById<TextView>(R.id.tv_goals)
        val bargoals = root.findViewById<ConstraintLayout>(R.id.bar_goals)
        val tvbadges = root.findViewById<TextView>(R.id.tv_badges)
        val barbadges = root.findViewById<ConstraintLayout>(R.id.bar_badges)

        tvgoals.setOnClickListener {
            tvgoals.setTextColor(resources.getColor(R.color.macaw, null))
            bargoals.setBackgroundColor(resources.getColor(R.color.macaw, null))
            tvbadges.setTextColor(resources.getColor(R.color.lightgrey, null))
            barbadges.setBackgroundColor(resources.getColor(R.color.lightgrey, null))
        }
        tvbadges.setOnClickListener {
            tvbadges.setTextColor(resources.getColor(R.color.macaw, null))
            barbadges.setBackgroundColor(resources.getColor(R.color.macaw, null))
            tvgoals.setTextColor(resources.getColor(R.color.lightgrey, null))
            bargoals.setBackgroundColor(resources.getColor(R.color.lightgrey, null))
        }


        return root
    }

}