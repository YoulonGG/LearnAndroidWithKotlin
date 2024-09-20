package com.example.learnandroid.weekTwo

import android.util.Log
class Week2DayFour {


    //lazy delegation in Kotlin is designed to defer the initialization of a property
    // until it is actually accessed for the first time
    //Lazy delegation must assign values
    val userName: String by lazy { "Youlong" }
    val phone: Int by lazy { 93383965 }

    val name: String?= null //Declared, Initialized and memory allocated
//    var userName: String = "" //Declared, Initialized and memory allocated
    val age: Int = 0  //Declared, Initialized and memory allocated
//    val data = "Name"
    //const val data = "Name"
    //var data = "NAme"


    //Class delegation use (by) key word
    //property delegation use (lazy) key word
    //We use val instead of var because lazy delegation can implement only one time and remain immutable
    //

    //Property delegation
    class ComputationExample {

        private val item by lazy { "Apple" }

        fun printLazy() {
            Log.e("","Item Value: $item")
        }

        val lazyIntValue by lazy {
            Log.e("","Computing the integer value...")
            42 * 2
        }
    }

    open class Person {
        val person: String by lazy {
            val age = 21
            val name = "John Youlong"
            Log.e("", "Initialize Name Age...")
            "Name: $name, Age: $age"
        }
    }



    //Class Delegation
    interface Car {
        val model: String
        val color: String
        val year: Int
        val inStock: Boolean
        fun driving(safeDrive: String)

    }

    //Lazy delegation
    class Motor(private val car: Car) {
        val model by lazy { car.model }
    }

    //Implement the Car interface
    class BMW : Car {
        override fun driving(safeDrive: String) {
            Log.e("", "Driving this car is safety")
        }
        override val inStock: Boolean
            get() = true
        override val year: Int
            get() = 2025
        override val color: String
            get() = "Black"
        override val model: String
            get() = "BMW M5"
    }

    class Mercedes : Car by BMW()

    class Nissan : Car by BMW() {
        val speed = 1000
    }

}