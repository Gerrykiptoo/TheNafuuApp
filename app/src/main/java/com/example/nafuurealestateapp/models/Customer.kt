package com.example.nafuurealestateapp.models

class Customer {
    var name:String=""
    var email:String=""
    var password:String=""
    var credential:String=""

    constructor(name: String, email: String, password: String, credential: String) {
        this.name = name
        this.email = email
        this.password = password
        this.credential = credential
    }
    constructor()
}