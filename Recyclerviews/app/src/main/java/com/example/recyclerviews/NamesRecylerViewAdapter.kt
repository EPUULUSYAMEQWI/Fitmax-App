package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class NamesRecylerViewAdapter (var nameList:List<String>):RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvname.text= nameList.get(position)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }
}
class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname = itemView.findViewById<TextView>(R.id.tvname)

}