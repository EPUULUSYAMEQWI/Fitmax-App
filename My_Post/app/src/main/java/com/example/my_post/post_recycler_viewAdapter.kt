package com.example.my_post



import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my_post.databinding.ActivityCommentBinding.inflate
import com.example.my_post.databinding.RetrofitPostsListsBinding

class RetrofitAdapter(var context: Context, var postList: List<Post>)
    : RecyclerView.Adapter<RetrofitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
        var bindingView = RetrofitPostListBinding
            .inflate(LayoutInflater.from(context), parent, false)
        return RetrofitViewHolder(bindingView)
    }


    override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
        var currentItem = postList.get(position)

        with(holder.bindingView) {
            postId.text = currentItem.id.toString()
            userId.text = currentItem.userId.toString()
            tvTittle.text = currentItem.title
            tvBody.text = currentItem.body
            val context=holder.itemView.context
            holder.bindingView.cvCons.setOnClickListener(){
                val intent = Intent(context, CommentActivity::class.java)
                intent.putExtra("POST_ID", currentItem.id)
                context.startActivity(intent)
            }
        }

    }

    override fun getItemCount(): Int {
        return postList.size
    }
}
class RetrofitPostListBinding(var bindingView: RetrofitPostListBinding) :
    RecyclerView.ViewHolder(bindingView.root {


}





