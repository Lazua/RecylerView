package com.praktek.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListHeroAdapterCard (private val data: ArrayList<Hero>): RecyclerView.Adapter<ViewHolderCard>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCard {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderCard(inflater,parent)
    }

    override fun onBindViewHolder(holder: ViewHolderCard, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}