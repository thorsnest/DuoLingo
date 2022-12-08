package com.example.duolingo

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AdaptadorPersonRanked(private val llista: ArrayList<PersonRanked>):RecyclerView.Adapter<AdaptadorPersonRanked.Viewholder>() {
    class Viewholder(val view: View):ViewHolder(view) {
        val pos: TextView = view.findViewById(R.id.tv_pos)
        val name: TextView = view.findViewById(R.id.tv_nom)
        val xp: TextView = view.findViewById(R.id.tv_xp)
        val imatge: ImageView = view.findViewById(R.id.iv_fotoPerfilRanked)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.cardview_personranked, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.pos.text = (position + 1).toString()
        holder.imatge.setImageResource(llista[position].imatge)
        holder.name.text = llista[position].name
        if (position < 8) {
            holder.pos.setTextColor(Color.GREEN)
        }
        else if (position > 22) {
            holder.pos.setTextColor(Color.RED)
        }
        else {
            holder.pos.setTextColor(Color.BLACK)
        }
        holder.xp.text = llista[position].xp.toString() + "XP"
    }

    override fun getItemCount() : Int = llista.size
}