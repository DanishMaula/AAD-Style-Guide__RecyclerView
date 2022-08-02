package com.raywenderlich.android.recyclerviewtheme.fourthrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.android.recyclerviewtheme.databinding.RowItemRecipeBinding

class RecipeAdapter(): RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
    private val listNewRecipe = ArrayList<ResultsItem>()

    class RecipeViewHolder(val binding: RowItemRecipeBinding) :RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= RecipeViewHolder(
        RowItemRecipeBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        )

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(itemImg.context)
                .load(listNewRecipe[position].thumb)
                .into(itemImg)
            itemName.text = listNewRecipe[position].title
        }
    }

    fun setData(data: List<ResultsItem>?) {
        if (data == null) return
        listNewRecipe.clear()
        listNewRecipe.addAll(data)

    }

    override fun getItemCount() = listNewRecipe.size
}