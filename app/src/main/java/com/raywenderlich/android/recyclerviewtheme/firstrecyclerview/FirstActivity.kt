package com.raywenderlich.android.recyclerviewtheme.firstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.android.recyclerviewtheme.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = AnimalModel(this).getAnimal()
        binding.rvRecycler.adapter = AnimalAdapter(animalList)
    }
}