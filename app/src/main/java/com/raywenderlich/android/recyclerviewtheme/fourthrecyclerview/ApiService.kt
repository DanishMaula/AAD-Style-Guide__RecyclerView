package com.raywenderlich.android.recyclerviewtheme.fourthrecyclerview

import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {

    @GET("api/recipes")
    fun getNewRecipe(): Flowable<DataResponse>


}