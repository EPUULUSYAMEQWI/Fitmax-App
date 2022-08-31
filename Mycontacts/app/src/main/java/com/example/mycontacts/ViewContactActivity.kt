package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontacts.databinding.ActivityMainBinding
import com.example.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        val name = intent.extras?.getString("NAME","")
        val phone = intent.extras?.getString("PHONE","")
        val email = intent.extras?.getString("EMAIL","")
        val address = intent.extras?.getString("ADDRESS","")
        val image = intent.extras?.getString("IMAGE","")





        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
    }

}