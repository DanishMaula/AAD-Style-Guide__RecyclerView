package com.raywenderlich.android.recyclerviewtheme.fourthrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.android.recyclerviewtheme.databinding.ActivityFourthBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding

    val newRecipe = MutableLiveData<DataResponse>()

    private val apiService = ApiClient.getApiService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)


        getDetail()
        newRecipe.observe(this){
            setupRecyclerView(it.results)
        }
    }

    private fun setupRecyclerView(results: List<ResultsItem?>?) {
        binding.rvRecipe.apply {
            val mAdaper = RecipeAdapter()
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = mAdaper
            mAdaper.setData(results as List<ResultsItem>?)
        }
    }

    private fun getData(
        responseHandler: (DataResponse) -> Unit,
        errorHandler: (Throwable) -> Unit,
    ) {
        apiService.getNewRecipe()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responseHandler(it)
            }, {
                errorHandler(it)
            })
    }

    fun getDetail(){
        getData({
            newRecipe.value = it
        },
            {}
        )
    }
}