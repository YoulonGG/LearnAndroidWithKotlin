package com.example.learnandroid.weekTwo

import android.util.Log

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
}