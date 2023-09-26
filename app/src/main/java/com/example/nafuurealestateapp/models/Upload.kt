package com.example.nafuurealestateapp.models

class Upload {
   var name: String=""
    var serviceProviderName:String=""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, serviceProviderName: String, imageUrl: String, id: String) {
        this.name = name
        this.serviceProviderName =serviceProviderName
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}