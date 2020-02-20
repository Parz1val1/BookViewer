package com.example.bookviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val books: ArrayList<Book> = ArrayList()
    val url: String = "http://de-coding-test.s3.amazonaws.com/books.json"
    var bookAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        bookAdapter = BookAdapter(this)
        recyclerView.adapter = bookAdapter
        mockData()
    }

    private fun mockData() {
        var book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        book = Book("Harry Potter: Complete 8-Film Collection (DVD, 2011, 8-Disc Set)", "J.K. Rowling", "http://i.imgur.com/DvpvklR.png")
        books.add(book)
        book = Book("test", "test", "test")
        books.add(book)
        bookAdapter?.setData(books)
        bookAdapter?.notifyDataSetChanged()
    }

}
