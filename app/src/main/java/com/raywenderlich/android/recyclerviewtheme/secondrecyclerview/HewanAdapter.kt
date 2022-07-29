package com.raywenderlich.android.recyclerviewtheme.secondrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.android.recyclerviewtheme.databinding.RowHewanBinding

class HewanAdapter(private val listHewan: List<Hewan>): RecyclerView.Adapter<HewanAdapter.MyViewHolder>() {
   inner class MyViewHolder(val binding : RowHewanBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        RowHewanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val binatang = listHewan[position]

        Glide.with(holder.itemView)
            .load(binatang.photo)
            .into(holder.binding.itemImg)
        holder.binding.itemName.text = binatang.name
    }

    override fun getItemCount(): Int {
        return listHewan.size
    }
}