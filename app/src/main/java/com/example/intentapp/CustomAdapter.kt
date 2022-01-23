package com.example.intentapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contacts_list.view.*

class CustomAdapter(val context: Context,val contacts : List<ContactListModel>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contacts_list,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(customViewHolder: CustomViewHolder, position: Int) {
        val contactsListModel = contacts[position]
        customViewHolder.ImageView.setImageResource(contactsListModel.photo)
        customViewHolder.textView1.text = contactsListModel.tvPersonName
        customViewHolder.textView2.text = contactsListModel.tvPhoneNUmber
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val ImageView : ImageView = itemView.ivPhoto
            val textView1 : TextView = itemView.tvPersonName
            val textView2 : TextView = itemView.tvPhoneNumber

    }

}