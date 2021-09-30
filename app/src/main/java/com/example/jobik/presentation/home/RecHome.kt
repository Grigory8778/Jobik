package com.example.jobik.presentation.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jobik.R
import com.example.jobik.presentation.base.Category
import com.example.jobik.presentation.base.Item
import com.example.jobik.presentation.onbord.RecAdapter

class RecHome :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Category> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rec_main_item, parent, false)
        )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val i = list[position]) {
            is Category.AddCategory -> (holder as? AddViewHolder)?.bind(i,position)
            is Category.Elements -> (holder as? HomeViewHolder)?.bind(i, position)

        }
    }

    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Category.Elements, position: Int) {
            val image = itemView.findViewById<ImageView>(R.id.rec_home_image)
            val txt = itemView.findViewById<TextView>(R.id.rec_home_txt)
            txt.text = model.name
            Glide.with(itemView).load(model.image).into(image)
        }
    }
    class AddViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Category.AddCategory, position: Int) {
            val image = itemView.findViewById<ImageView>(R.id.rec_home_image)
            val txt = itemView.findViewById<TextView>(R.id.rec_home_txt)
            txt.text = model.name
            Glide.with(itemView).load(model.image).into(image)
        }
    }

    override fun getItemCount(): Int = list.size

    companion object {
        const val ADDCATEGORY = 1
        const val ELEMENTS = 2
    }
}