package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
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
        setFragmentResultListener("ItemData") { requestKey, bundle ->
            val value = bundle.getString("Item")
            Log.d("passD","log msg")
//            Toast.makeText(activity?.baseContext, "abbbc", Toast.LENGTH_SHORT).show()
        }
        return view
    }

}