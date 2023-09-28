package com.example.nafuurealestateapp.models

class Upload {
    var serviceName: String=""
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
    constructor(s: String, s1: String, s2: String, s3: String, s4: String)
}