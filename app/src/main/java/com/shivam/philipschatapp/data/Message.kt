package com.shivam.philipschatapp.data

import androidx.compose.runtime.Immutable
import com.shivam.philipschatapp.R

@Immutable
data class Message(
    val author: String,
    val content: String,
    val timestamp: Long,
    val image: Int? = null,
    val authorImage: Int = if (author == "me") R.drawable.me else R.drawable.someone
)
