package com.example.bookviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.JsonArray
import org.json.JSONArray

class MainActivity : AppCompatActivity() {

    val books: ArrayList<Book> = ArrayList()
    val url: String = "http://de-coding-test.s3.amazonaws.com/books.json"
    var bookAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter()
        recyclerView.adapter = bookAdapter
        getData()
    }

    private fun getData() {
    }

}
