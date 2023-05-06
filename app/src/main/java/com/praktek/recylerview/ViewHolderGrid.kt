package com.praktek.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ViewHolderGrid(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_grid, parent, false)) {

    private var imgView: ImageView? = null
    private var TxtName: TextView? = null
    private var TxtFrom: TextView? = null

    init{
        imgView = itemView.findViewById(R.id.img_item_photo)
        TxtName = itemView.findViewById(R.id.tv_item_name)
        TxtFrom = itemView.findViewById(R.id.tv_item_from)
    }

    fun bind(data:Hero){
        Glide.with(imgView!!.context).load(data.photo).into(imgView!!)
        TxtName?.setText(data.name)
        TxtFrom?.setText(data.from)
    }
}