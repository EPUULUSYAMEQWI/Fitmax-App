package com.example.my_post

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_post.databinding.ActivityCommentBinding

class CommentActivity : AppCompatActivity() {
    lateinit var binding: ActivityCommentBinding
    var postId= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        obtainPostId()
        fetchPost()

    }
    fun obtainPostId(){
        postId=intent.extras?.getInt("POST_ID")?:0
    }

    fun fetchPost(){
        var apiClient= ApiClient.buildApiClient(ApiInterface::class.java)
        var request= apiClient.getPostById(postId)

        request.enqueue(object: Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>){
                var post = response.body()
                if (post!=null){
                    binding.tvPostTitle.text=post.title
                    binding.tvPostBody.text=post.body

                }
            }
            override fun onFailure(call: Call<Post>, t:Throwable){

            }
        })
    }
}
