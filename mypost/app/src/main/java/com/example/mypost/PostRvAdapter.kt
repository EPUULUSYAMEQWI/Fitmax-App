package com.example.mypost

//import android.content.Context
import com.example.mypost.databinding.ActivityViewpostactivityBinding


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class PostRvAdapter(var context: Context, var postList: List<Post>): RecyclerView.Adapter<RetrofitViewHolder>() {


    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
        var currentItem = postList.get(position)
        with(holder.bindingView) {
            tvid.text = currentItem.Id.toString()
            tvuserid.text = currentItem.userId.toString()
            tvtitle.text = currentItem.title
            tvbody.text = currentItem.body
            val context = holder.itemView.context
            holder.bindingView.cvpost.setOnClickListener {

            }
                val intent = Intent(holder.itemView.context, commentActivity::class.java)
                intent.putExtra("POST_ID", currentItem.Id)
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return PostListsize
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        var binding = ActivityViewpostactivityBinding.inflate(LayoutInflater.from(context), parent, false)
        return RetrofitViewHolder(binding)
    }
}

class RetrofitViewHolder(var bindingView: ActivityViewpostactivityBinding) :
    RecyclerView.ViewHolder(bindingView.root) {

}




