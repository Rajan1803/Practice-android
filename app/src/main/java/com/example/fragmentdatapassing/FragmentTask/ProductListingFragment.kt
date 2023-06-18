package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.RecyclerClickEvent


class ProductListingFragment : Fragment(), RecyclerClickEvent {

    override fun onClickAddCart(data: String) {
        val bundle = Bundle().apply{
            putString("Item","hello")
        }
        setFragmentResult("ItemData",bundle)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view = inflater.inflate(R.layout.fragment_product_listing, container, false)
        val recyclerViewList = view.findViewById<RecyclerView>(R.id.recyclerVItemList)
        recyclerViewList.layoutManager =
            LinearLayoutManager(context)

        recyclerViewList.adapter = ItemListAdapter()

        return view
    }

}

