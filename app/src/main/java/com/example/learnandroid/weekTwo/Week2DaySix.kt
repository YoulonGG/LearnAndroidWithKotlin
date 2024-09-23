package com.example.learnandroid.weekTwo

import android.util.Log

class Week2DaySix {


    //Using Also
    //Scope Function
    //In a simple way is we use Also scope function is to add side action
    //But we cant add new properties to it
    val list = listOf(10, 2, 3).also {
        Log.e("", "")
    }.toString()

    val alsoScope = mutableListOf(10, 2, 3).also {
        Log.e("", "The list : $it")
    }.also {
        it.add(4)
        it.add(66)
        it.add(9)
        Log.e("", "Adding new value to list...")
        Thread.sleep(3000)
    }

    data class Me(
        val name: String,
        var age: Int,
        val position: String,
        val isHealthy: Boolean)


    //Apply
    //Use apply to initialize the object
    //In a simple way is we use apply to give values
    //Apply work well with class not function
    data class Employee(
        var name: String? = null,
        var id: Int? = null,
        var startDate: Int? = null,
        var salary: Int? = null,
        var isMarried: Boolean? = null
    )

//    class Motor {
//        var motorName: String? = null
//        var motorModel: String? = null
//        var motorYear: Int? = null
//        var motorColor: String? = null
//    }


    //Run Scope Function
    //run can help you group operations,
    // manage nullability safely, and enhance code readability
    //like Do this, this, and this all together, and give me the result
//    class Calculation(radius: Int) {
//        val PI = 3.14
//        val circle = PI * 2 * radius
//        fun circle() = run {
//            return@run
//        }
//    }

    class Person1(private val name: String, private val age: Int) {
        fun personInfo() = run {
            Log.e("","$name is $age years old")
        }
    }

    data class Person2(
        val name: String?,
        val age: Int?,
        val position: String?

    )
}


