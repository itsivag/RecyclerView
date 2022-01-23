package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contacts_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contacts = createContacts()
        myRecyclerView.adapter = CustomAdapter(this,contacts)
        myRecyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun createContacts(): MutableList<ContactListModel> {
        val contacts = mutableListOf<ContactListModel>()
        for (i in 0..50) {
            contacts.add(
                ContactListModel(
                    R.drawable.ic_launcher_background,
                    "Name : $i",
                    "Phone : $i"
                )
            )
        }
        return contacts
    }
}