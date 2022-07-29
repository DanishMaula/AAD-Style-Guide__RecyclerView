package com.raywenderlich.android.recyclerviewtheme.secondrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hewan(
    var name : String?,
    var photo : String?
): Parcelable
