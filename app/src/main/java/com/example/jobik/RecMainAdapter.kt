package com.example.jobik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecMainAdapter(private val list: List<RecResult>) :
    RecyclerView.Adapter<RecMainAdapter.RecViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rec_main, parent, false)
        return RecViewHolder(view)

    }
    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {

    }


    class RecViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bild(model: RecResult) {
            val txt = itemView.findViewById<TextView>(R.id.txtVie)
            txt.text = model.name
            val recImg = itemView.findViewById<ImageView>(R.id.image)
        }
    }

    override fun getItemCount(): Int = list.size


}
