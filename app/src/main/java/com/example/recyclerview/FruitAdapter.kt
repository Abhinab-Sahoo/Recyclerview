package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitItem: List<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {

    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val fruitNameTextView: TextView = itemView.findViewById(R.id.each_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return FruitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitItem.size
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val fruits = fruitItem[position]
        holder.fruitNameTextView.text = fruits.name
         holder.itemView.setOnClickListener {
             ToastHelper.showToast(holder.itemView.context, "Clicked on ${fruits.name}")
         }
    }

}