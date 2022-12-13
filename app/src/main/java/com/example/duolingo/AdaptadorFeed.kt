@file:Suppress("SpellCheckingInspection")

package com.example.duolingo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AdaptadorFeed(private val llista: ArrayList<Feed>):RecyclerView.Adapter<AdaptadorFeed.Viewholder>() {
    class Viewholder(view: View):ViewHolder(view) {
        val temps: TextView = view.findViewById(R.id.tv_hora)
        val desc: TextView = view.findViewById(R.id.tv_desc)
        val imatge: ImageView = view.findViewById(R.id.iv_feed)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.cardview_feed, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.temps.text = llista[position].temps
        holder.imatge.setImageResource(llista[position].imatge)
        holder.desc.text = llista[position].desc
    }

    override fun getItemCount() : Int = llista.size
}