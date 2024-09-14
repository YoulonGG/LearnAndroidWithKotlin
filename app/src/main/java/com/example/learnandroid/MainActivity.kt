package com.example.learnandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnandroid.ui.theme.LearnAndroidTheme
import com.example.learnandroid.weekOne.DayOne

class MainActivity : ComponentActivity() {

    private val dayOne = DayOne()

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
            sum += arr
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
        Log.e("Map", "$map2")

        //MutableMap
        val map3 = dayOne.mutablemap
        //add , modify and
        map3.put("Geography", 60)
        map3.remove("Math")
        Log.e("Map", "$map3")




















        enableEdgeToEdge()
    }
}