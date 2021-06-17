package com.example.jobik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecAdapter(private val list: List<RecResult>) :
    RecyclerView.Adapter<RecAdapter.RecVievHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecVievHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rec_item_one, parent, false)
        return RecVievHolder(view)

    }

    override fun onBindViewHolder(holder: RecVievHolder, position: Int) {
        holder.bild(list[position])
    }

    class RecVievHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bild(model: RecResult) {
            val txt = itemView.findViewById<TextView>(R.id.txtVie)
            val recImg = itemView.findViewById<ImageView>(R.id.image)
            txt.text = model.name
            Glide.with(itemView).load(model.image).into(recImg)
            recImg.setBackgroundResource(R.drawable.ic_ellipse_1)
        }
    }

    override fun getItemCount(): Int = list.size
}