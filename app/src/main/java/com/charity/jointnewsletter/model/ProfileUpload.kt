package com.charity.jointnewsletter.model

class ProfileUpload{
    var name:String=""
    var email:String=""
    var phone:String=""
    var imageUrl:String=""
    var id:String=""

    constructor(name:String,email:String,phone:String,imageUrl:String,id:String){

        this.name=name
        this.email=email
        this.phone=phone
        this.imageUrl=imageUrl
        this.id=id

    }
    constructor()
}