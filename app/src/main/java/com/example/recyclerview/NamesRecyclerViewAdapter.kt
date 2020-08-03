package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_row_name_item.view.*


class NamesRecyclerViewAdapter(
    val namesList: List<String>,
    i: Int,
    s: String,
    s1: String
) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return namesList.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvNames.text = namesList[position]
        holder.rowView.tvNames.text = person.name
        holder.rowView.tvNames.text = person.age
        holder.rowView.tvNames.text = person.DOB
        holder.rowView.tvNames.text = person.hobby
    }

    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}