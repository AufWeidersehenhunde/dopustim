package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.min

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
        println(massivB.sorted())
        println(massivB.sortedDescending())

//such a fuck 222222222


        var a = 224
        if (a<0) {
            println("x:$a" )
        } else {
            var b = a+1
            println("x:$b")
        }
        val chisla = arrayOf(1, -3, 2, 2, -5, -23, 3, 4, 6)
        for (l in chisla)
            if (l>0)
            println("Plusi:$l")
            else
                println("Minusa:$l")


        val h = 23
        val u = 27
        val i = 15
        println(minOf(h,u,i))
        println(maxOf(h,u,i))
        val y = maxOf(h,u,i) + minOf(h,u,i)
        println(y)


        val jk = 234
        if (jk % 2 != 0)
            println("chetnoe")
        else
            println("nechetnoe")


        val age = 28
        when(age) {
            in 0..2 -> println("infant")
            in 3..12 -> println("Child")
            in 13..19 -> println("Teenager")
            in 20..39 -> println("Adult")
            in 40..60 -> println("Middle aged")
            else -> println("Eldery")
        }


    }
}
