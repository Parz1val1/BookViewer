package com.example.bookviewer

import retrofit2.http.GET

interface BookService{
    @GET("/books.json")
    suspend fun getBooks(): List<Book>

}