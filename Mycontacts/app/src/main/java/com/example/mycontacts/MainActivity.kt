package com.example.mycontacts

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding
import java.util.logging.LogManager

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun displayContacts(){
        var contact=Contact("Whitney","0788888888","epuulucy@gmail.com","616 korongoRoad","https://pbs.twimg.com/media/FXYTXIpWAAARQUF?format=jpg&name=900x900")
        var contact1=Contact("Amekwi","8446475757","ndni@gmail.com","616 korongoRoad","https://pbs.twimg.com/media/FXYTXIpWAAARQUF?format=jpg&name=900x900")
        var contact2=Contact("Jane","744744475","h@gmail.com","616road","https://pbs.twimg.com/media/FXYTXIpWAAARQUF?format=jpg&name=900x900")
        var contact3=Contact("Tanyasis","67446647","tt@gmail.com","road","https://pbs.twimg.com/media/FXYTXIpWAAARQUF?format=jpg&name=900x900")
        var contact4=Contact("Epuu","8758475","yy@gmail.com","ggroad","https://pbs.twimg.com/media/FXYTXIpWAAARQUF?format=jpg&name=900x900")

        var contactList= listOf(contact,contact1,contact2,contact3,contact4)
        var contactAdapter=ContactRvAdapter(contactList)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=contactAdapter
    }
}