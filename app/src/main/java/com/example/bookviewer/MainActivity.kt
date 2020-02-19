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
        var book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.ebayimg.com/00/$(KGrHqV,!g0E6ZCwQ)wpBOuWbUNB,g~~_6.JPG?set_id=89040003C1")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        bookAdapter?.setData(books)
        bookAdapter?.notifyDataSetChanged()
    }

}
