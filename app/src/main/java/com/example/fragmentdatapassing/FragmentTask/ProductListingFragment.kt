package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentdatapassing.R


class ProductListingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view = inflater.inflate(R.layout.fragment_product_listing, container, false)
        view.findViewById<RecyclerView>(R.id.recyclerVItemList).layoutManager =
            LinearLayoutManager(context)
        view.findViewById<RecyclerView>(R.id.recyclerVItemList).adapter = ItemListAdapter()

        return view
    }

}