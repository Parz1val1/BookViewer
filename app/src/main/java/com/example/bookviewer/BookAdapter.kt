package com.example.bookviewer

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class BookAdapter(context: Context) : RecyclerView.Adapter<BookViewHolder>() {


    var books: ArrayList<Book> = arrayListOf()
    val context: Context = context

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
        Picasso.get().load(book.image).placeholder(R.drawable.ic_crop_original_black_24dp).into(holder.mImageView)
        holder.mTitleView?.text = book.title
        book.author?.let {
            holder.mAuthorView?.text = ("Author: " + book.author)
        }
    }
}