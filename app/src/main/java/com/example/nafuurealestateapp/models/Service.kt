package com.example.nafuurealestateapp.models

class Service {
    var serviceName:String=""
    var serviceProvider:String=""
    var serviceDescription:String = ""
    var imageUrl:String = ""
    var id:String = ""


    constructor(serviceName: String, serviceDescription: String,serviceProvider:String,id:String, image:String) {
        this.serviceName = serviceName
        this.serviceDescription=serviceDescription
        this.serviceProvider=serviceProvider
        this.id=id
        this.imageUrl=image
    }
    constructor()
    constructor(s: String, s1: String, s2: String, s3: String)
}