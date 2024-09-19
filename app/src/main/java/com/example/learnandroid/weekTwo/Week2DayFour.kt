package com.example.learnandroid.weekTwo

import android.util.Log

class Week2DayFour {

    //Delegation

    interface Car {
        val model: String
        val color: String
        val year: Int
        val inStock: Boolean
        fun driving(safeDrive: String)

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

    class Nissan : Car by BMW() {
        val speed = 1000
    }


}