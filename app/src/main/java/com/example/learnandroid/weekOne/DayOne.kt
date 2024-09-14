package com.example.learnandroid.weekOne
import android.util.Log

//Learning variables and loops
class DayOne {

    private var name = ""
    private var age = 0
    private var id = 0

    //Create Function with Argument || side effect
    fun funWithArgument(newName: String, newAge: Int, newID: Int){
        name = newName
        age = newAge
        id = newID
        Log.e("Test",
            """|
            |Your name is: $name
            |Your age is: $age
            |Your ID is: $id""".trimMargin() )
    }

    // Create function without Argument
    fun funWithoutArgument() {
        name = "John Youlong"
        age = 21
        id = 4813
        Log.e("Test" , """
            Your name is: $name
            Your age is: $age
            Your ID is: $id
        """.trimIndent())
    }

    // Create Function with default value
    fun funWithDefaultArgument(
        firstName: String = "John",
        lastName: String = "Youlong",
        email: String = "johnyoulong@gmail.com",
        phone: Int = 93383965
        ): Any{
        return " First Name: $firstName \n " +
                "Last Name: $lastName \n " +
                "Email Address: $email \n " +
                "Phone Number: $phone"
    }

    fun sum(vararg n: Int): IntArray {
        return n + n
    }

    //Array fixed size so we can not add or delete element
    //Creation of Array
    var array1 = arrayOf(10,19,25,2.22,"Apple",false,'$')
    var array2 = arrayOf(1,2,3,45,6,7,8)

    //Nested Array
    var nestedArray = Array(5) { Array(3) {5} }

    //Empty ArrayList || This can need to add element
    val arrayList1 = ArrayList<String>()
    val arrayList2 = ArrayList<Int>()

    //List allow duplicate value
    //Immutable Lists
    //listOf can not add or remove
    val immuttablelist = listOf("Dog","Cat","Cow","Bat","Bat")

    //Mutable Lists
    //mutablelistof can add and remove and modify
    val muttablelist = mutableListOf(10,8,12,3,5,5)

    //Set doesn't allow duplicate value
    //can not add or remove
    val setOf = setOf("Gray", "Yellow", 5555, "Red")

    //MutableSetOf
    val mutableSetOf1: MutableSet<Int> = mutableSetOf(1,2,3,4,5,7,8,9,10)
    val mutableSetOf2 = mutableSetOf(1,2,3,4,5,7,8,9,10)

    //Map
    val map1 = mapOf("Apple" to 10, "Orange" to 21, "Pineapple" to 30)
    //Nested Map
    val map2 = mapOf(
        "Person1" to mapOf("userName" to "Youlong", "age" to 21, "Address" to "Phnom Penh"),
        "Person2" to mapOf("userName" to "Vitu", "age" to 21, "Address" to "Battambong")
    )

    val mutablemap = mutableMapOf("Math" to 50, "Khmer" to 100, "Biology" to 75)

    // The different between
    // Arraylist is dynamic array that can grow and shrink.
    // Mutablelist is allows modifications, such as adding, removing, or updating elements.

}
