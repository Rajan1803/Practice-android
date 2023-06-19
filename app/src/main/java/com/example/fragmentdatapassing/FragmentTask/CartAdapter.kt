package com.example.fragmentdatapassing.FragmentTask

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdatapassing.R
import org.w3c.dom.Text

class CartAdapter(val cartList: ArrayList<String>?): RecyclerView.Adapter<CartAdapter.CartItemHolder>() {
    class CartItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textview = itemView.findViewById<TextView>(R.id.txtvCartText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartItemHolder {
        Log.d("onCreateViewHolder passD",cartList?.size.toString())
        return CartItemHolder( LayoutInflater.from(parent.context).inflate(R.layout.recycler_cart,parent, false))
    }

    override fun getItemCount(): Int {
        Log.d("getItemCount passD",cartList?.size.toString())
        return cartList?.size ?: 0
    }

    override fun onBindViewHolder(holder: CartItemHolder, position: Int) {
        holder.textview.text = cartList?.get(position).toString()
        Log.d("onBindViewHolder passD",cartList?.get(position).toString())
    }

}