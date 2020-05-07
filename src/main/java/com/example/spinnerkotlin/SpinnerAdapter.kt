package com.example.spinnerkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class SpinnerAdapter(val context:Context, private val items:ArrayList<ItemHolder>): BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view:View?
        val holder:ViewHolder

        if(convertView==null){

            view=LayoutInflater.from(context).inflate(R.layout.custom_spinner,parent,false)
            holder=ViewHolder
            holder.imageName=view.findViewById(R.id.imageView)
            holder.itemName=view.findViewById(R.id.textView)

            view.tag = holder
        }else{
            view=convertView
            holder= view.tag as ViewHolder
        }
        holder.itemName.text=items[position].text
        holder.imageName.setImageResource(items[position].image)

        return view as View

    }

    override fun getItem(position: Int): Any =items[position]

    override fun getItemId(position: Int): Long =position.toLong()

    override fun getCount(): Int =items.size


    object ViewHolder{

        lateinit var imageName:ImageView
        lateinit var itemName:TextView
    }


}