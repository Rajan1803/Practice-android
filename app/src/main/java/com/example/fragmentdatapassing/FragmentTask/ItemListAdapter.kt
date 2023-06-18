package com.example.fragmentdatapassing.FragmentTask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.RecyclerClickEvent


class ItemListAdapter(): RecyclerView.Adapter<ItemListAdapter.ItemListViewHolder>() {

    var itemDelegate: RecyclerClickEvent? = null
    class ItemListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemListViewHolder {
        val holder = ItemListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycle_productlisting,parent,false))
        val txtviewItemName = holder.itemView.findViewById<TextView>(R.id.txtvItem)
        holder.itemView.findViewById<Button>(R.id.btnAddToCart).setOnClickListener {

//            val fragmentTransition = fragmentManager.beginTransaction()
//            fragmentTransition.replace(R.id.fragmentCCart,FragmentCart())
//            fragmentTransition.commit()

//            itemDelegate?.onClickAddCart("hello")
            itemDelegate?.onClickAddCart(txtviewItemName.text.toString() )
        }
        return holder
    }

    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }

}