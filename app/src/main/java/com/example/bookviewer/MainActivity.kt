package com.example.bookviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONArray
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val books: ArrayList<Book> = ArrayList()
    val url: String = "http://de-coding-test.s3.amazonaws.com"
    var bookAdapter: BookAdapter? = null
    lateinit var bookService: BookService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val picasso  = Picasso.Builder(this).loggingEnabled(true).indicatorsEnabled(false).build()
        Picasso.setSingletonInstance(picasso)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter(this)
        recyclerView.adapter = bookAdapter
        bookService = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build().create(BookService::class.java)
        //testData()
        getData()
    }

    private fun testData() {
        var book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", null)
        books.add(book)

        for(i in 0..20){
            book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
            books.add(book)
        }

        bookAdapter?.setData(books)
        bookAdapter?.notifyDataSetChanged()
    }

    private fun getData() = GlobalScope.launch(Dispatchers.Main){
        var book: Book
        val jsonArray = bookService.getBooks()
        for (jsonIndex in 0 until(jsonArray.size - 1)){
            book = Book(jsonArray[jsonIndex].title, jsonArray[jsonIndex].author, jsonArray[jsonIndex].image)
            books.add(book)
        }
        bookAdapter?.setData(books)
        bookAdapter?.notifyDataSetChanged()
    }
}

