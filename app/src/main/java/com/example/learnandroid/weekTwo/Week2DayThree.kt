package com.example.learnandroid.weekTwo

import android.content.Context
import android.util.Log
import androidx.lifecycle.LifecycleOwner

class Week2DayThree {

    //Type alias use create a new name for an existing type
//    typealias Name = String

//    val firstName: Name = "John"
//    val lastName: Name = "Doe"

    //inline value class is the has only one single value in parameter not more
    @JvmInline
    value class Password(private val s: String)

    //Inline Function is the function compiler takes the code inside the inline function
    // and inserts it directly into the place where the function is called

    //Example
    //if i have inline function with parameter and a block of code.
    // so when i call this function it call all together
    inline fun performOperation(operation: () -> Unit) {
        Log.e("","Before operation")
        operation()
        Log.e("","After operation")

    }

    inline fun test1(a: String, b: String, strTest: (String, String) -> String, operation: () -> Unit): String {
        println("This is inline function!")
        operation()
        return strTest(a, b)
    }

    inline fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    inline fun test(firstName: String, lastName: String, detail: (String, String) -> String): String{
        return detail(firstName, lastName)
    }

//    inline fun performOperation(operation: () -> Int) {
//        Log.e("", "Before operation")
//        operation()
//        Log.e("","After operation")
//    }

    fun someMethod(a: Int, func: () -> Unit):Int {
        func()
        return 2*a
    }
    //inline value class
    @JvmInline
    value class Name(val value: String)
    val name = Name("Sarah Smith")

    //Delegation is like let another class handle the implementation
    interface NetworkStateListener {
        fun observeNetworkState(context: Context, lifecycleOwner: LifecycleOwner) {
            Log.e("", "The Network is working")
        }
    }

    class NetworkStateHandler : NetworkStateListener {
        override fun observeNetworkState(context: Context, lifecycleOwner: LifecycleOwner) {
            Log.e("","The Network is not working.")
        }
    }


}