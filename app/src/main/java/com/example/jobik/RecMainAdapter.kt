package com.example.jobik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecMainAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Item> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rec_main, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val i = list[position]) {
            is Item.Elements -> (holder as? MainViewHolder)?.bind(i)
        }
    }

    fun setList(list: List<Item>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Item.Elements) {
            val txt = itemView.findViewById<TextView>(R.id.txtVie_main)
            val recImg = itemView.findViewById<ImageView>(R.id.image_main)
            txt.text = model.name
            recImg.setBackgroundResource(model.backgraund)
            Glide.with(itemView).load(model.image).into(recImg)
        }
    }
    override fun getItemCount(): Int = list.size
}

