package com.praktek.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_row_hero, parent, false)){

    private var imgView: ImageView? = null
    private var tvName: TextView? = null
    private var tvFrom: TextView? = null

    init{
        imgView = itemView.findViewById(R.id.img_item_photo)
        tvName = itemView.findViewById(R.id.tv_item_name)
        tvFrom = itemView.findViewById(R.id.tv_item_from)
    }

    fun bind(data: Hero){
        imgView?.setImageResource(data.photo!!)
        tvName?.setText(data.name)
        tvFrom?.setText(data.from)
    }
}