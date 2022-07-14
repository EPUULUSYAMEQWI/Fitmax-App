package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        fun displayTwitter() {
            var twitter = twitter("Lucy", "@lucy", "I love coding", "", "", "", "")
            var twitter1 = twitter("Amekwi", "@amekwi", "I love travelling", "", "", "", "")
            var twitter2 = twitter("Epuu", "@epuu", "I love watching", "", "", "", "")
            var twitter3 = twitter("Whitney", "@whitney", "I love reading", "", "", "", "")
            var twitter4 = twitter("Wanjiru", "@wanji", "I love helping", "", "", "", "")
            var twitter5 = twitter("Jane", "@jane", "I love laughing", "", "", "", "")
            var twitter6 = twitter("Mary", "@mary", "I love dancing", "", "", "", "")
            var twitter7 = twitter("Wangare", "@wangare", "I am hardworking", "", "", "", "")
            var twitter8 = twitter("Jerop", "@jerop", "I like partying", "", "", "", "")
            var twitter9 = twitter("Akal", "akal", "I love Python", "", "", "", "")
            var twitter10 = twitter("Sarah", "@sarah", "I love travelling", "", "", "", "")
            var twitter11 = twitter("Verah", "@verah", "I love doing makeup", "", "", "", "")
            var twitter12 = twitter("Bright", "@bright", "I love eating", "", "", "", "")
            var twitter13 = twitter("Kukuya", "@kukuya", "I love cooking", "", "", "", "")


            var twitterList = listOf(twitter, twitter2, twitter3, twitter4, twitter5, twitter6, twitter7, twitter8, twitter9, twitter10, twitter11, twitter12, twitter13)
            var twitterAdapter = twitterRvAdapter(twitterList)
            binding.rvtwitter.layoutManager = LinearLayoutManager(this)
            binding.rvtwitter.adapter = twitterAdapter

        }
    }
}