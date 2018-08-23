package com.loicdumas.testrecyclerviewtodelete

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.my_cell_view.view.*


class MyAdapter(var data: List<Person>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name: TextView
        val profession: TextView

        init {
            Log.v("LAMADRG", "ViewHolder in View Holder")

            name = itemView.tv_name
            profession = itemView.tv_profession
        }
    }

    companion object {
        private const val JOHN = 0
        private const val OTHER = 1
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        Log.v("LAMADRG", "CreateViewHolder in onCreateViewHolder - viewtype $viewType")

        val layoutId = if(viewType == JOHN) R.layout.my_cell_view_john else R.layout.my_cell_view

        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, positon: Int) {
        Log.v("LAMADRG", "CreateViewHolder in onBindViewHolder pour ${data[positon].name} n° $positon - for holder $holder")

        holder.name.text = "${data[positon].name} n° $positon"
        holder.profession.text = data[positon].profession

    }


    override fun getItemViewType(position: Int): Int {
        return if (data[position].name.equals("John")) JOHN else OTHER
    }
}
