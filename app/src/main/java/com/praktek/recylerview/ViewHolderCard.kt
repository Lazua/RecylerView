package com.praktek.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class ViewHolderCard(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_cardview, parent, false)){

            private var imgView: ImageView? = null
            private var TxtName: TextView? = null
            private var TxtFrom: TextView? = null

    init{
        imgView = itemView.findViewById(R.id.img_item_photo)
        TxtName = itemView.findViewById(R.id.tv_item_name)
        TxtFrom = itemView.findViewById(R.id.tv_item_from)
    }

    fun bind(data: Hero){
        Glide.with(imgView!!.context).load(data.photo).into(imgView!!)
        TxtName?.setText(data.name)
        TxtFrom?.setText(data.from)
    }
}