package com.example.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactlist: List<Contact>) :
    RecyclerView.Adapter<ContactRvAdapter.contactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {

        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return contactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        val context = holder.itemView.context
        var currentContact = contactlist.get(position)
        with(holder.binding) {

            tvname.text = currentContact.name
            tvphone.text = currentContact.phone
            tvemail.text = currentContact.email
            tvaddress.text = currentContact.address


            Picasso.get()
                .load(currentContact.image)
                .centerCrop()
                .resize(300, 300)
                .placeholder(R.drawable.ic_baseline_person_24)
                .error(R.drawable.ic_baseline_error_24)
                .into(imgcontact)




        cvcontact.setOnClickListener {
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME", currentContact.name)
            intent.putExtra("PHONE", currentContact.phone)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
        }

        holder.binding.imgcontact.setOnClickListener {
            Toast.makeText(context,"you click on my face", Toast.LENGTH_LONG).show()
        }

        }
    }


    override fun getItemCount(): Int {
        return contactlist.size
    }


    class contactViewHolder(var binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }
}


