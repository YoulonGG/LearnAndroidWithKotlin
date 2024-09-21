package com.example.learnandroid.weekTwo

import android.util.Log
import kotlin.math.log

class Week2DayFive {

    //help you control what classes can exist under a sealed class,
    //making your code safer and easier to manage.

    //Subclass can be regular class, data class or sealed class and sealed interface

    sealed class Animal
        class Dog(val name: String) : Animal()
        class Cat(val name: String) : Animal()

        fun makeSound(animal: Animal) = when (animal) {
            is Dog -> Log.e("", "${animal.name} says woof!")
            is Cat -> Log.e("", "${animal.name} says meow!")
        }

    //Extension function
    //we use it to add new function to existing class that not our own but still can accessing properties from that class
    class Me(
        val name: String,
        val age: Int,
        val country: String
    )


    //Inline Function
    inline fun inlineFunction(firstName: String, lastName: String): Int {
        return Log.e("","$firstName $lastName")
    }


    inline fun runOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    inline fun person(name: String, age: Int, operation: () -> Unit) {
        val startTime = System.currentTimeMillis()
        operation()
        Log.e("", "Name: $name")
        Log.e("", "Age : $age")
        val endTime = System.currentTimeMillis()
        Log.e("","Execution time: ${endTime - startTime} ms")
    }

    inline fun measureTime(block: () -> Unit) {
        val startTime = System.currentTimeMillis()
        block()
        val endTime = System.currentTimeMillis()
        Log.e("","Execution time: ${endTime - startTime} ms")
    }

    // Inline function is like we create something to load while executing the block of code in the body
    //this way faster than we create another function to do it


    //We use inline function for small and frequently called function
    //We use non-inline fun for larger and complex function
    inline fun doctor(
        doctorName: String, doctorID: Int, doctorDepartment: String,
        doctorAvailable: Boolean, block: (String) -> Unit
        ) {
        block("Loading name...")
        Log.e("","Doctor Name: $doctorName")
        block("Loading department...")
        Log.e("","Department: $doctorDepartment")
        block("Loading ID")
        Log.e("","Doctor ID: $doctorID")
        block("Loading appointment...")
        Log.e("","Doctor Available: $doctorAvailable")
    }

    //No-inline function
    fun doctor1(
        doctorName: String,
        doctorID: Int,
        doctorDepartment: String,
        doctorAvailable: Boolean,
    ) {
//        block("Loading name...")
        Log.e("","Doctor Name: $doctorName")
//        block("Loading department...")
        Log.e("","Department: $doctorDepartment")
//        block("Loading ID")
        Log.e("","Doctor ID: $doctorID")
//        block("Loading appointment...")
        Log.e("","Doctor Available: $doctorAvailable")
    }

    //inline and non-inline functions in Kotlin is how they handle function calls,
    // but their behavior in terms of output and logic remains the same.

    //Let
    //We use let with nullable object
    //Use let to check if properties is null or not,
    // if it still null the let block will not execute anything
    private var userName: String? = null
    private var age: Int? = null
    private var userID: Int? = null
    private var isSingle: Boolean? = null
    fun letFunction() {
        userName = "Youlong"
        //The age property is null so it will not execute
        age = null
        userID = 4813
        isSingle = false
        userName?.let { Log.e("", "Username: $it") }
        age?.let { Log.e("", "Age: $it") }
        userID?.let { Log.e("", "User ID: $it") }
        isSingle?.let { Log.e("", "User is single: $it") }
    }








}