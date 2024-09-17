package com.example.learnandroid.weekTwo

import android.util.Log

class Week2DayOne {

    fun light(light: TrafficLight1):String {
        return when (light) {
            TrafficLight1.RED -> "Stop"
            TrafficLight1.GREEN -> "Go"
            TrafficLight1.YELLOW -> "Be careful"
        }
    }

    fun day(day: Weekday): String{
        return when (day) {
            Weekday.MONDAY, Weekday.TUESDAY, Weekday.WEDNESDAY, Weekday.THURSDAY, Weekday.FRIDAY
            -> "Today is not weekend yet"
            Weekday.SUNDAY,Weekday.SATURDAY -> "Today is holiday"
        }
    }


    enum class TrafficLight1{ RED, YELLOW, GREEN}
    enum class Weekday{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
    enum class TrafficLight2(private val color: String, private val duration: Int){
        RED("Red", 15),
        YELLOW("Yellow", 5),
        GREEN("Green", 40);

        fun getColor(): String = color
        fun getDuration(): Int = duration

        fun info(){
            Log.e("", "The light is $color for $duration s")
        }
    }
}



