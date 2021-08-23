package com.example.jobik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jobik.presentation.base.Item

class RecAdapter() :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Item> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == ELEMENTS)
            MainViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.rec_item_one, parent, false)
            )
        else
            TitleViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.title_item, parent, false)
            )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val i = list[position]){
            is Item.Title -> (holder as? TitleViewHolder)?.bind(i)
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
            val txt = itemView.findViewById<TextView>(R.id.txtVie_one)
            val recImg = itemView.findViewById<ImageView>(R.id.image_one)
            txt.text = model.name
            recImg.setBackgroundResource(model.backgraund)
            Glide.with(itemView).load(model.image).into(recImg)

        }
    }

    class TitleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Item.Title) {
            itemView.findViewById<TextView>(R.id.txt_title_item).text = model.title
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when (list[position]) {
            is Item.Elements -> ELEMENTS
            is Item.Title -> TITLE
        }
    }
    override fun getItemCount(): Int = list.size




    companion object {
        const val TITLE = 1
        const val ELEMENTS = 2
    }
}