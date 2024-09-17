package com.example.learnandroid.weekTwo

import android.health.connect.datatypes.units.Length

class Week2DayTwo {

    sealed class Result
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
    data object Loading : Result()


    sealed class Direction

    class Up : Direction()
    class Down : Direction()
    class Left : Direction()
    class Right : Direction()

    fun move(direction: Direction) {
        when (direction) {
            is Down -> "Go down"
            is Left -> "Go Left"
            is Right -> "Go Right"
            is Up -> "Go Up"
        }
    }


    sealed class Shape {
        data class Circle(val radius: Double) : Shape()
        data class Rectangle(val width: Double, val height: Double) : Shape()
        data class Triangle(val base: Double, val height: Double) : Shape()

        fun area(): Double {
            return when (this) {
                is Circle -> Math.PI * radius * radius
                is Rectangle -> width * height
                is Triangle ->(base * height) / 2
            }
        }
    }

    sealed class MathCalculation {
        data class PerimeterOfRectangle(val length: Double, val width: Double): MathCalculation()

        fun result(): Double {
            return when (this){
                is PerimeterOfRectangle -> 2 + (width + length)
            }
        }
    }

}