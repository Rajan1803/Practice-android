package com.example.fragmentdatapassing.broadcastTask

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.databinding.FragmentFirstBroadcastBinding

class First_broadcast : Fragment() {



    lateinit var binding: FragmentFirstBroadcastBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBroadcastBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSend.setOnClickListener {
            val intent = Intent()
            intent.setAction("CustomAcion")
            intent.putExtra("data",binding.etxtBroad.text.toString())
            activity?.sendBroadcast(intent)
        }
    }

}