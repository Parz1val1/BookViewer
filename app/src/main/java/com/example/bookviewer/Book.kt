package com.example.bookviewer

import com.google.gson.annotations.SerializedName

data class Book(
    var title: String?,
    var author: String?,
    @SerializedName("imageURL") var image: String?
)