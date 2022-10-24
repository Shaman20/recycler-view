package com.example.recycler_view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "ContactsAdapter"

class ContactsAdapter(val context: Context, val contacts: List<Person>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    // Create a new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.i(TAG,"onCreateViewHolder")
        val view = LayoutInflater.from(context).inflate(R.layout.item_person, parent, false)
        return ViewHolder(view)
    }

    // return how many items are in data set
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i(TAG, "onBindViewHolder $position")
        val contact = contacts[position]
        holder.bind(contact)
    }

    // Bind the data at position into ViewHolder
    override fun getItemCount() = contacts.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvAge = itemView.findViewById<TextView>(R.id.tvAge)

        fun bind(contact: Person) {
            tvName.text = contact.name
            tvAge.text = "Age: ${contact.age}"
        }
    }

}
