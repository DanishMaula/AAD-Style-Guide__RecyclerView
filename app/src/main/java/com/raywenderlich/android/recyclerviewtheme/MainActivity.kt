package com.raywenderlich.android.recyclerviewtheme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raywenderlich.android.recyclerviewtheme.databinding.ActivityMainBinding
import com.raywenderlich.android.recyclerviewtheme.firstrecyclerview.FirstActivity
import com.raywenderlich.android.recyclerviewtheme.secondrecyclerview.SecondActivity
import com.raywenderlich.android.recyclerviewtheme.thirdrecyclerview.ThirdctiviityActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnFirstRecyclerView.setOnClickListener{
            startActivity(Intent(this, FirstActivity::class.java))
        }

        binding.btnSecondRecyclerView.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))

        }

        binding.btnThirdRecyclerView.setOnClickListener{
            startActivity(Intent(this, ThirdctiviityActivity::class.java))
        }
    }
}