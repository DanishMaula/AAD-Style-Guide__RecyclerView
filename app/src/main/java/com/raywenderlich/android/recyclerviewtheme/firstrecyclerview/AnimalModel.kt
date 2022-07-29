package com.raywenderlich.android.recyclerviewtheme.firstrecyclerview

import android.content.Context
import com.raywenderlich.android.recyclerviewtheme.R

class AnimalModel(val context: Context) {
    fun getAnimal(): Array<String>{
        return context.resources.getStringArray(R.array.animallist)
    }
}