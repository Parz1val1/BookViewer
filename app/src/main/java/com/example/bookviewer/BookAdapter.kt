package com.example.bookviewer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class BookAdapter : RecyclerView.Adapter<BookViewHolder>() {


    var books: ArrayList<Book> = arrayListOf()

    fun setData(books: ArrayList<Book>){
        this.books = books
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val bookView = layoutInflater.inflate(R.layout.book_card, parent, false)
        return BookViewHolder(bookView)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Book = books[position]
        Picasso.get().load(book.image).into(holder.mImageView)
        holder.mTitleView?.text = book.title
        holder.mAuthorView?.text = book.author
    }
}