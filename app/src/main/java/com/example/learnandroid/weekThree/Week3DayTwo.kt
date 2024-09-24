package com.example.learnandroid.weekThree

class Week3DayTwo {

    sealed class Error(val message: String) {
        class NetworkError : Error("Network failure")
        class DatabaseError : Error("Database cannot be reached")
        class UnknownError : Error("An unknown error has occurred")
    }

    sealed class Car(val type: String) {
        class GTR : Car("Nissan")
        class M5 : Car("BMW")
        class GT : Car("Mercedes")
    }
}