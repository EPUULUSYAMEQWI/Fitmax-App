package com.example.twitter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView


class twitterRvAdapter (var twitterList:List<twitter>):
    RecyclerView.Adapter<twitter>

    override fun onCreateViewHolder(parent: RecyclerView.ViewHolder, viewType: Int): twitterViewHolder {
        var itemView  = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_item_list,parent,false)
        return twitterRvAdapter(itemView)

    }

    override fun onBindViewHolder(holder:TwitterViewHolder, position: Int) {
        var currentTwitter =twitterList.get(position)
        holder.tvperson.text = currentTwitter.Person
        holder.tvEmail.text = currentTwitter.Email
        holder.tvStatement.text= currentTwitter.Statement
    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}
