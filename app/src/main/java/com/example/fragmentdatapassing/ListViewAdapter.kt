package com.example.fragmentdatapassing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView

class ListViewAdapter(val context: Context):  BaseAdapter() {
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
       return  p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return LayoutInflater.from(p2?.context).inflate(R.layout.listview_items,p2,false)
    }


}