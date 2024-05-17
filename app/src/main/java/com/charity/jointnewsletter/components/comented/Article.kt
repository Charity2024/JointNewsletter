package com.charity.jointnewsletter.components.comented

data class Article (
    val id : Int,
    val title:String,
    val topic: String,
    val contributors: String,
    val  description:String,
    val articleImageId:Int =0
)

/*import java.io.Serializable

data class Puppy(
    val id: Int,
    val title: String,
    val sex: String,
    val age: Int,
    val description: String,
    val puppyImageId: Int = 0
) : Serializable*/