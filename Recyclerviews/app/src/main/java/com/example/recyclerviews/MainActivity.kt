package com.example.recyclerviews

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames( )
    }
    fun displayNames(){
        var nameList= listOf("Lucy","Tanyasis","Cheko","Nyakuar","Jane","Lavyne","LL")
        val namesAdapter=NamesRecylerViewAdapter(nameList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=namesAdapter

    }
}