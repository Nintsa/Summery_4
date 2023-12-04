package com.example.assignment13.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment13.model.ItemClass
import com.example.assignment13.databinding.RvItemBinding

class ItemAdapter(private var itemsList: MutableList<ItemClass>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(
        parent:
        ViewGroup, viewType: Int
    ): ItemViewHolder {
        return ItemViewHolder(
            RvItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class ItemViewHolder(private var binding: RvItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}