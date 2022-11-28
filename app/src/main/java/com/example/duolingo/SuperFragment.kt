package com.example.duolingo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.duolingo.databinding.FragmentSuperBinding

class SuperFragment : Fragment() {

    private lateinit var binding: FragmentSuperBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentSuperBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        binding.botoSuperCv.setOnClickListener {
            val intent = Intent(this.context, FreeSuperActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}