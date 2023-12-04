package com.example.assignment13.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment13.model.HomeClass
import com.example.assignment13.databinding.RvHomePageBinding

class HomeAdapter(private var rectanglesList: MutableList<HomeClass>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            RvHomePageBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return rectanglesList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class HomeViewHolder(private var binding: RvHomePageBinding) :
        RecyclerView.ViewHolder(binding.root) {}
}