package com.charity.jointnewsletter.data

import androidx.annotation.DrawableRes
import com.charity.jointnewsletter.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)
val article = listOf(
    Page(
        title = "Lorem ipsum",
        description = "Lorem Ipsum",
        image= R.drawable.batman
    ),
    Page(
        title = "Lorem ipsum",
        description = "Lorem Ipsum",
        image= R.drawable.batman
    ),
    Page(
        title = "Lorem ipsum",
        description = "Lorem Ipsum",
        image= R.drawable.batman
    ),
)
