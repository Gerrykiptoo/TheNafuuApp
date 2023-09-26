package com.example.nafuurealestateapp.models

class Service {
    var name:String=""
    var serviceProviderName:String=""

    constructor(name: String, type: String) {
        this.name = name
        this.serviceProviderName = type
    }
    constructor()
}