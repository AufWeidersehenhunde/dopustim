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
        val numbers = arrayOf(1 to 15)
        for (i in 1..15)
            println(i)
        println(numbers)
        
        println("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15")
        println("Max")
        val numberss = arrayOf(2,7,3,6,9,14,8,1)
        numberss.sort()
        println(numberss)
        val womanname = arrayOf("Lola, Huela, Vika, Slava, Izolda")
        Log.d("MyLog3","Names:${womanname[0]}")
        Log.d("MyLog3","Names:${womanname[1]}")
        Log.d("MyLog3","Names:${womanname[2]}")
        Log.d("MyLog3","Names:${womanname[3]}")
        Log.d("MyLog3","Names:${womanname[4]}")

        val mass5 = arrayOf(1,2,3,4,5)
        Log.d("MyLog2", "Numbers: ${mass5[0]}${mass5[0]}${mass5[0]}${mass5[0]}${mass5[0]}")
        Log.d("MyLog2", "Numbers: ${mass5[1]}${mass5[1]}${mass5[1]}${mass5[1]}${mass5[1]}")
        Log.d("MyLog2", "Numbers: ${mass5[2]}${mass5[2]}${mass5[2]}${mass5[2]}${mass5[2]}")
        Log.d("MyLog2", "Numbers: ${mass5[3]}${mass5[3]}${mass5[3]}${mass5[3]}${mass5[3]}")
        Log.d("MyLog2", "Numbers: ${mass5[4]}${mass5[4]}${mass5[4]}${mass5[4]}${mass5[4]}")

        val massivB= arrayOf(1, 8, 2, 4, 8, 4, 3, 5)
        massivB.sortDescending()
        massivB.sort()
        val sortedArray = massivB.sortedArray()
        val sortedDescendingArray = massivB.sortedArrayDescending()
        println(sortedDescendingArray)





    }
}