package com.example.jobik.presentation.main

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jobik.R
import com.example.jobik.presentation.base.Item

class RecMainAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list: MutableList<Item> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rec_main_item, parent, false)
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

    inner class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(model: Item.Elements) {
            val toggleButton = itemView.findViewById<ToggleButton>(R.id.tgb_main)
            val container = itemView.findViewById<ConstraintLayout>(R.id.const_main)
            val txt = itemView.findViewById<TextView>(R.id.txtVie_main)
            val recImg = itemView.findViewById<ImageView>(R.id.image_main)
            txt.setText(model.name)
            recImg.backgroundTintList = ColorStateList.valueOf(model.color)
            Glide.with(itemView).load(model.image).into(recImg)
            container.setOnClickListener {
                model.state = !model.state
                toggleButton.isChecked = model.state
            }
            toggleButton.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    container.backgroundTintList = ColorStateList.valueOf(model.color)
                } else {
                    container.backgroundTintList = ColorStateList.valueOf(Color.WHITE)
                }
                model.state = isChecked
            }
            toggleButton.isChecked = model.state
        }
    }

    override fun getItemCount(): Int = list.size
}

