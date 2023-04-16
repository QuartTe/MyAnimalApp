package com.example.lab2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film(
    val name:String,
    val description:String,
    val image: String
    ): Parcelable