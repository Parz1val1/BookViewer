package com.example.bookviewer

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder(bookView: View) : RecyclerView.ViewHolder(bookView) {
    var mTitleView: TextView? = null
    var mAuthorView: TextView? = null
    var mImageView: ImageView? = null



    init {
        mTitleView = bookView.findViewById(R.id.titleText)
        mAuthorView = bookView.findViewById(R.id.authorText)
        mImageView = bookView.findViewById(R.id.bookImage)
    }
}