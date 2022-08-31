package com.example.my_post

interface ApiInterface {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>

    @GET("/posts/{id}")
    fun getPostById(@Path("id")postId:Int):Call<Post>
}