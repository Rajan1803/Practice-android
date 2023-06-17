package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdatapassing.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentCart.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentCart : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_cart, container, false)

        return view
    }

}