package com.example.my_post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.my_post.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getPosts()

    }

    fun getPosts() {
        val ApiClient = ApiClient.buildApiClient(ApiInterface::class.java)
        val request = ApiClient.getPosts()
        request.enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                val post = response.body()!!

                if (response.isSuccessful) {
                    var adapter = RetrofitAdapter(baseContext, post)
                    binding.rvRetrofit.adapter = adapter
                    binding.rvRetrofit.layoutManager = LinearLayoutManager(baseContext)
//                   val posts = response.body()
                    Toast.makeText(
                        baseContext, "fetched ${post.size}posts",
                        Toast.LENGTH_LONG
                    ).show()

                }
            }
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()

            }

        })
    }
//    fun displayPosts(postList:List<Post>){
//        binding.rvRetrofit.LayoutManager =LinearLayoutManager(this)
//        val postsAdapter= PostsRvAdapter(postList)
//        binding.rvRetrofit.adapter=postsAdapter
//    }
}