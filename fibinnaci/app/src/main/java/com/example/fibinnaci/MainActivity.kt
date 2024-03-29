package com.example.fibinnaci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibinnaci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList= displayFabonacciNumbers(100)
        println(numberList)
        binding.rvnumbers.layoutManager=LinearLayoutManager(this)
        binding.rvnumbers.adapter=NumberRecyclerViewAdapter(numberList)

    }

    fun displayFabonacciNumbers(size:Int):List<Int>{
//        fun genarate100Fibonnaci(){
//        var fibList:MutableList<BigInterger>=mutableListOf(0,1)
//        while (fibList.size<100){
//            var last=fibList.get(fibList.lastIndex)
//            var secondLast.fibList.get(fibList.lastindex-1)
//            var next=last+secondLast
//            fibList.add(next)
//        }
//    println(fibList)
//    return fibList
//}
        var list=ArrayList<Int>()
        var fn1=0
        var fn2=1
        var number=0
        while (number<=size){
            print(fn1)
            var add=fn1+fn2
            fn1=fn2
            fn2=add
            number++
            list+=add
        }
        return list
    }
}
