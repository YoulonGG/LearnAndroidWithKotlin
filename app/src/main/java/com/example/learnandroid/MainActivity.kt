package com.example.learnandroid

import android.net.Network
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import com.example.learnandroid.weekTwo.Week2DayOne
import com.example.learnandroid.weekOne.DayOne
import com.example.learnandroid.weekThree.Week3DayOne
import com.example.learnandroid.weekThree.Week3DayOne.Calculation
import com.example.learnandroid.weekTwo.Week2DayFive
import com.example.learnandroid.weekTwo.Week2DayFive.Me
import com.example.learnandroid.weekTwo.Week2DayFour
import com.example.learnandroid.weekTwo.Week2DaySix
import com.example.learnandroid.weekTwo.Week2DayThree
import com.example.learnandroid.weekTwo.Week2DayTwo
import com.example.learnandroid.weekTwo.Week2DayTwo.Direction.Down.move

class MainActivity : ComponentActivity(){

    private val dayOne = DayOne()
    private val week2Day2 = Week2DayTwo()
    private val week2DayFive = Week2DayFive()
    private val week2DaySix = Week2DaySix()

    private val userName: String by lazy { "Youlong" }
    private val userID: Int by lazy { 4813 }
    private val userPosition: String by lazy { "Android Internship" }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Type of Function
//        dayOne.funWithArgument("John Youlong", 21,4813)
//        dayOne.funWithoutArgument()
//        val result = dayOne.funWithDefaultArgument()
//        Log.e("Test", "$result")

        //Calling Array from Class DayOne
//        val arr1 = dayOne.array1
//        Log.e("Array", arr1.toList().toString())

        //Sum Array
        val arr2 = dayOne.array2
        var sum = 0
        for (arr in arr2) {
//            sum += arr
        }
//        Log.e("Array", "$sum")

        val arr3 = dayOne.nestedArray
//        Log.e("Array", arr3.contentDeepToString())

         //Calling Empty ArrayList and add value
        val arrList = dayOne.arrayList1
        arrList.add("Apple")
        arrList.add("Orange")
        arrList.add("Watermelon")
        arrList.add("Peach")
        arrList.add(10.toString())
//        Log.e("arrayList", "$arrList")

        //Immutable list
        val list1 = dayOne.immuttablelist
//        Log.e("list","$list1")

        //Mutable List, Add, Modify and Remove
        val list2 = dayOne.muttablelist
        list2.add(10)
        list2[1] = 99
        list2.removeAt(3)
//        Log.e("list","$list2")

        //set
        val set1 = dayOne.setOf
//        Log.e("list","$set1")

        //Add add and remove
        val set2 = dayOne.mutableSetOf1
        set2.add(99)
        set2.remove(10)
//        Log.e("list","$set2")

        //Map
        val map1 = dayOne.map2
//        Log.e("map", "$map1")
        val map2 = dayOne.map2
//        Log.e("Map", "$map2")

        //MutableMap
        val map3 = dayOne.mutablemap
        //add , modify and
        map3.put("Geography", 60)
        map3.remove("Math")
//        Log.e("Map", "$map3")

        //Using Enum Class
        val week2day1 = Week2DayOne()
        val enum1 = week2day1.light(Week2DayOne.TrafficLight1.GREEN)
//        Log.e("", enum1)

        val enum2 = week2day1.day(Week2DayOne.Weekday.MONDAY)
        for(i in Week2DayOne.TrafficLight1.entries) {
//            Log.e("", "$i")
        }
//        Log.e("", enum2)


        for(i in Week2DayOne.TrafficLight2.entries) {
//            Log.e("", "$i")
        }

        val result = Week2DayOne.TrafficLight2.YELLOW
//        Log.e("", "$enum3")
//        if (result == Week2DayOne.TrafficLight2.RED) {
//            Week2DayOne.TrafficLight2.RED.info()
//        } else if(result == Week2DayOne.TrafficLight2.YELLOW){
//             Week2DayOne.TrafficLight2.YELLOW.info()
//        } else {
//            Week2DayOne.TrafficLight2.GREEN.info()
//        }
//        Week2DayOne.TrafficLight2.RED.info()
//        Week2DayOne.TrafficLight2.GREEN.info()
//        Week2DayOne.TrafficLight2.YELLOW.info()

        val traffic = Week2DayOne.TrafficLight2.GREEN
//        Log.e("", "The color is ${traffic.getColor()} for ${traffic.getDuration()} second")


        val direction = move(Week2DayTwo.Direction.Left)
//        Log.e("",  "The direction is $direction")


        //Using sealed class
        val circle: Week2DayTwo.Shape = Week2DayTwo.Shape.Circle(5.0)
        val rectangle1: Week2DayTwo.Shape = Week2DayTwo.Shape.Rectangle(4.0, 6.0)
        val triangle: Week2DayTwo.Shape = Week2DayTwo.Shape.Triangle(10.0,12.5)
//        Log.e("", "${triangle.area()}")



        val rectangle2 = Week2DayTwo.MathCalculation.PerimeterOfRectangle(10.0,15.0)
//        Log.e("", "${rectangle2.result()}")


        //Inline Function
        val week2day3 = Week2DayThree()
        val result1 = week2day3.calculate(10,3) { a, b -> a + b }
        val result6 = week2day3.calculate(9,5) { a, b -> a * b }
        val result7 = week2day3.calculate(2,50) { a, b -> a / b }
        val result8 = week2day3.calculate(25,80) { a, b -> a - b }
//        Log.e("", "$result1")
//        Log.e("", "$result6")
//        Log.e("", "$result7")
//        Log.e("", "$result8")

        val result2 = week2day3.test("John", " Youlong") { a, b -> a + b }
//        Log.e("", result12)

//        val result3 = week2day3.performOperation{
//            Log.e("","Perform operation...")
//        }
//        Log.e("", "$result3")


        val result4 = week2day3.name.value
//        Log.e("" , result4)

//        val result5 = week2day3.Pass
        val result5= Week2DayThree.Password("You can access this!!")
//        Log.e("", "$result5")

//        week2day3.performOperation {
//            println("Hello Bro")
//        }

//        val result9 = week2day3.test1("John", "Youlong") { A,B -> A + B }
//        week2day3.performOperation {
//            Log.e("","Operating......")
//        }
//        Log.e("", "$result10")

//        observeNetworkState(context = this, lifecycleOwner = this)


        val carA = Week2DayFour.BMW()
        val carB = Week2DayFour.Nissan()
//        Log.e("", """
//            |BMW Car
//            |Model   : ${carA.model}
//            |Year    : ${carA.year}
//            |Color   : ${carA.color}
//            |InStock : ${carA.inStock} """.trimMargin())
//        Log.e("", """
//            |===========
//            |Nissan Car
//            |Model   : ${carB.model}
//            |Year    : ${carB.year}
//            |Color   : ${carB.color}
//            |Speed   : ${carB.speed}
//            |InStock : ${carB.inStock} """.trimMargin())


        val classDelegation = Week2DayFour.ComputationExample()
//        Log.e("", "${classDelegation.lazyIntValue}")

        val lazy = Week2DayFour.ComputationExample()
//        lazy.printLazy()

        val person = Week2DayFour.Person()
//        Log.e("", person.person)

        //Lazy delegation
//        Log.e("", "Username is : $userName")
//        Log.e("", "User ID is  : $userID")
//        Log.e("", "Position is : $userPosition")


        val dog = Week2DayFive.Dog("Bull Dog")
//        week2DayFive.makeSound(dog)

        fun Me.isAdult(): Boolean {
            return age >= 18
        }
        fun Me.isFromCambodia(): Boolean {
            return true
        }

        val extensionPerson = Me("Youlong", 21, "Cambodia")
//        Log.e("TAG", "" +
//                "${extensionPerson.name} " +
//                "${extensionPerson.isAdult()} " +
//                extensionPerson.country
//        )

        //Using Inline Function
//        week2DayFive.inlineFunction("John", "Youlong")

        val inline1 = week2DayFive.runOperation(10,10) {a, b -> a / b}
//        Log.e("", "$inline1")

//        week2DayFive.person("Youlong", 21) {
//            Log.e("", "Upload Information.....")
//            Thread.sleep(3000)
//        }

//        week2DayFive.measureTime {
//            Log.e("", "Loading....")
//            Thread.sleep(5000)
//        }

//        week2DayFive.doctor(
//            "Youlong",
//            4813,
//            "Dentist",
//            true) { message ->
//            Log.e("", message)
//            Thread.sleep(5000)
//        }

//            week2DayFive.doctor1(
//            "Youlong",
//            4813,
//            "Dentist",
//
//            true)

        //Use let scope function
//        week2DayFive.letFunction()


        //Use Also Scope Function
//        val alsoScope = mutableListOf(10, 2, 3).also {
//            Log.e("", "The list : $it")
//        }.also {
//            it.add(4)
//            it.add(66)
//            it.add(9)
//            Log.e("", "Adding new value to list...")
//            Thread.sleep(3000)
//        }
//        Log.e("", "$alsoScope")
//        Week2DaySix.Me(
//            "Youlong",
//            21,
//            "Android Intern",
//            true
//            ).also {
//                Log.e("", "Information is loading...")
//                Thread.sleep(3000)
//                Log.e("", "$it")
//        }.also {
//            it.age += 1
//            Log.e("", "Updating Age....")
//            Thread.sleep(3000)
//            Log.e("", "$it")
//        }.also {
//            Log.e("", "Thank you!")
//        }

        //Using Apply, Also and Let together in Scope Function
//        Week2DaySix.Employee()
//            //Use apply to add value
//            .apply {
//            name = "Youlong"
//            id = 4813
//            startDate = null
//            salary = 1200
//            isMarried = null
//
//            //Use let to check is some properties is null
//            name?.let { Log.e("", it) }
//            id?.let { Log.e("", "$it") }
//            startDate?.let { Log.e("", "$it") }
//            salary?.let { Log.e("", "$it") }
//            isMarried?.let { Log.e("", "$it") }
//
//            //Use also to add some side action
//        }.also {
//            Log.e("", "Employee Information")
//            Thread.sleep(3000)
//            Log.e("", "$it")
//        }
//            .let {
//            Log.e("", "Checking if some value is null...")
//            Thread.sleep(3000)
//            Log.e("", "${it.name} ${it.id} ${it.startDate} ${it.salary} ${it.isMarried}")
//        }

//        Week2DaySix.Motor().apply {
//            motorName = "Honda Dream"
//            motorModel = "Honda"
//            motorYear = 2025
//            motorColor = "Black"
//            Log.e("","$motorName")
//            Log.e("","$motorModel")
//            Log.e("","$motorYear")
//            Log.e("","$motorColor")
//        }.also {
//            Log.e("", "Ending...")
//        }

        //Using Run Scope Function
//        val personInfo =  Week2DaySix.Person1("Youlong", 21)
//        personInfo.personInfo()
//
//        Week2DaySix.Person2(null, null, null).run {
//            name?.run {
//
//            }
//        }


        //Using With scope function
//        val user = Week3DayOne.UserAccount(
//            "Youlong", 4813,
//            "admin@gmail.com",
//            false)
//
//        Log.e("", "$user").also {
//            Log.e("","Updating information...")
//        }
//        Thread.sleep(3000)
//
//        with(user) {
//            userName = "John Youlong"
//            id = 9999
//            email = "long@gmail.com"
//
//            if (isLogin) {
//                isLogin()
//            } else {
//                isLogout()
//            }
//
//            showInformation()
//
//        }

        //        val withPerson = Week2DaySix.Person("John", 30, "123 Main St")
//        with(withPerson) {
//            name = "Youlong"
//            age = 21
//            address = "Phnom Penh"
//        }
//        Log.e("", "$withPerson")

        //Using sealed class
        fun success() {
            Log.e("", "$userName is logged in successful.")
        }
        fun failed() {
            Log.e("", "$userName is logged in failed.")
        }

        fun checkMessage(message: Week3DayOne.Message) {
            when (message) {
                Week3DayOne.Message.IsSuccess -> success()
                Week3DayOne.Message.IsFail -> Log.e("", "You have failed to logged in!")
                Week3DayOne.Message.IsError -> Log.e("", "Error!! Try Again")
            }
        }
//        checkMessage(Week3DayOne.Message.IsError)

        fun checkNetwork(network: Week3DayOne.Network) {
            when(network) {
                is Week3DayOne.Network.Loading -> Log.e("", "Loading...")
                is Week3DayOne.Network.Failed -> failed()
                is Week3DayOne.Network.Success -> success()
            }
        }
//        checkNetwork(Week3DayOne.Network.Loading)

        fun checkShape(shape : Week3DayOne.CalculateShape): String {
            val pi = 3.14
            return when (shape) {
                is Week3DayOne.CalculateShape.Circle -> "Circle: ${(shape.radius * shape.radius) * pi }"
                is Week3DayOne.CalculateShape.Rectangle -> "Rectangle: ${(shape.width + shape.height) * 2}"
                is Week3DayOne.CalculateShape.Square -> "Side: ${shape.side * shape.side}"
                Week3DayOne.CalculateShape.NotShape -> "The shape is not valid."
            }
        }
        val shape =  checkShape(Week3DayOne.CalculateShape.Circle(1.2))
        val rectangle =  checkShape(Week3DayOne.CalculateShape.Rectangle(3.2, 2.5))
        val square =  checkShape(Week3DayOne.CalculateShape.Square(10.0))
        val noShape =  checkShape(Week3DayOne.CalculateShape.NotShape)
//        Log.e("", square)

        val person1 = Week3DayOne.Person1
        val person2 = Week3DayOne.Person2
//        Log.e("", "Name: ${person1.userName} Age: ${person1.age} Country: ${person1.address} isSingle: ${person1.isSingle}")
//        Log.e("", "Name: ${person2.userName} Age: ${person2.age} Country: ${person2.address} isSingle: ${person2.isSingle}")


        fun operation(operation: Calculation) {
            when (operation) {
                is Calculation.Add -> Log.e("", "${operation.value1 + operation.value2}")
                is Calculation.Divide -> Log.e("", "${operation.value1 / operation.value2}")
                is Calculation.Multiply -> Log.e("", "${operation.value1 * operation.value2}")
                is Calculation.Subtract -> Log.e("", "${operation.value1 - operation.value2}")
            }
        }
//        operation(Calculation.Multiply(10,10)).toString()

        val listOfMessage = listOf(
            Week3DayOne.Network.Success,
            Week3DayOne.Network.Failed,
            Week3DayOne.Network.Loading )
        listOfMessage.forEach { Log.e("", "$it") }






        enableEdgeToEdge()
    }
}



