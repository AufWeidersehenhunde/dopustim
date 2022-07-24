package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = ("Maksonchik")
        Log.d("MyLog", "Name:${name}")
        val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
        for (i in numbers)
            println(i)
        for (i in numbers) {
            if (i % 2 != 0) println(i)
        }
        for (i in numbers) {
            if (i % 2 == 0) println(i)
        }

        println("Max")
        val numberss = arrayOf(2,7,3,6,9,14,8,1)
        numberss.sort()
        println(numberss)

        val womanname = arrayOf("Lola, Huela, Vika, Slava, Izolda")
        for (i in womanname)
        println(i)

        val mass5 = arrayOf(1,2,3,4,5)
        for (i in mass5)
        repeat(5) {
            println(i)
        }

        val massivB= arrayOf(1, 8, 2, 4, 8, 4, 3, 5)
        massivB.sortDescending()
        massivB.sort()
        val sortedArray = massivB.sortedArray()
        val sortedDescendingArray = massivB.sortedArrayDescending()
        println(sortedDescendingArray)





    }
}