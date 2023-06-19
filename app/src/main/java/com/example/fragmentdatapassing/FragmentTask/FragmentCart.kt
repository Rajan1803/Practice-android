package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdatapassing.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentCart.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentCart() : Fragment() {

    var adapter: CartAdapter? = null
    var cartList = arrayListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_cart, container, false)
        setFragmentResultListener("ItemData") { requestKey, bundle ->
            val value = bundle.getString("Item") ?: ""
            if (!cartList.contains(value)) {
                cartList.add(value)
                adapter?.notifyDataSetChanged()
            }
            Log.d("passD",cartList.toString())
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView =view.findViewById<RecyclerView>(R.id.recyclerVCart)
        adapter = CartAdapter(cartList)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = adapter

    }

}