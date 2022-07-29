package com.raywenderlich.android.recyclerviewtheme.secondrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.android.recyclerviewtheme.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showRecyclerList()

    }

    private fun showRecyclerList() {
        binding.rvHewan.apply {
            layoutManager = LinearLayoutManager(this@SecondActivity)
            adapter = HewanAdapter(HewanData.listData)
        }
    }
}