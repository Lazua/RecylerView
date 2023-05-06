package com.praktek.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapterGrid(private val data: ArrayList<Hero>): RecyclerView.Adapter<ViewHolderGrid>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderGrid {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderGrid(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderGrid, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}