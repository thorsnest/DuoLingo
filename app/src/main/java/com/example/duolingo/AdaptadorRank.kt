package com.example.duolingo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AdaptadorRank(private val llista: ArrayList<Rank>):RecyclerView.Adapter<AdaptadorRank.Viewholder>() {
    class Viewholder(val view: View):ViewHolder(view) {
        val temps: TextView = view.findViewById(R.id.tv_hora)
        val desc: TextView = view.findViewById(R.id.tv_desc)
        val imatge: ImageView = view.findViewById(R.id.iv_feed)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.cardview_feed, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
    }

    override fun getItemCount() : Int = llista.size
}