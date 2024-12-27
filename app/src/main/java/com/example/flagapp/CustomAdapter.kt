package com.example.flagapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        //holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.checkbox.text = ItemsViewModel.text
        holder.checkbox.setChecked(ItemsViewModel.checked)
        holder.textView.setId(ItemsViewModel.ID)
        holder.textView.text = ItemsViewModel.text2

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val checkbox: CheckBox = itemView.findViewById(androidx.appcompat.R.id.checkbox)
        val textView: TextView = itemView.findViewById(R.id.textView8)
    }

    fun updateItem(list: ArrayList<ItemsViewModel>, position: Int, input: String) {
        list[position].text2 = input
        notifyItemChanged(position)
    }
    fun updateItem2(list: ArrayList<ItemsViewModel>, position: Int, checking: Boolean) {
        list[position].checked = checking
    }
}