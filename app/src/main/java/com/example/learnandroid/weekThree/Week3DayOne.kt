package com.example.learnandroid.weekThree

import android.util.Log
import androidx.compose.ui.geometry.CornerRadius
import com.example.learnandroid.weekTwo.Week2DaySix

class Week3DayOne {

    //With
    //passed as an argument to the with function
    //Similar to run but multiple operation
    data class UserAccount(
        var userName: String,
        var id: Int,
        var email: String,
        var isLogin: Boolean,
        ) {

        fun isLogin() {
            Log.e("", "$userName is logged in")
        }

        fun isLogout() {
            Log.e("", "$userName is logged out!")
        }

        fun showInformation() {
            Log.e("","""
                Name : $userName 
                Email : $email 
                ID : $id
                Logged in : $isLogin""".trimIndent())
        }
    }

    //Use sealed class wth related subclass
    sealed class Message {
        data object IsSuccess : Message()
        data object IsFail : Message()
        data object IsError : Message()
    }

    sealed class Network {
        data class Success(val success: String): Network()
        data class Failed(val failed: String): Network()
        data object Loading : Network()
    }

    sealed class CalculateShape {
        data class Circle(val radius: Double) : CalculateShape()
        data class Rectangle(val width: Double, val height: Double) : CalculateShape()
        data class Square(val side: Double) : CalculateShape()
        data object NotShape : CalculateShape()
    }

    //Sealed class can contructor but sealed interface can not
    sealed interface PersonInfo {
        val userName: String
        val age: Int
        val address: String
        val isSingle: Boolean
    }

    data object Person1 : PersonInfo {
        override val userName: String
            get() = "John Youlong"
        override val age: Int
            get() = 21
        override val address: String
            get() = "Cambodia"
        override val isSingle: Boolean
            get() = true
        }

    data object Person2 : PersonInfo {
        override val userName: String
            get() = "Christiano Ronaldo"
        override val age: Int
            get() = 39
        override val isSingle: Boolean
            get() = false
        override val address: String
            get() = "Portugal"
    }





}