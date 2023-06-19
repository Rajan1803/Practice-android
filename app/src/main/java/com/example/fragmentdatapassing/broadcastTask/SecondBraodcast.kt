package com.example.fragmentdatapassing.broadcastTask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.databinding.FragmentSecondBraodcastBinding

class SecondBraodcast : Fragment() {


    lateinit var receiver: BroadcastReceiver
    lateinit var binding: FragmentSecondBraodcastBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBraodcastBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         receiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.d("br","got it")
                binding.txtvSecondBroad.text = p1?.getStringExtra("data")
            }

        }
    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter()
        intentFilter.addAction("CustomAcion")
        activity?.registerReceiver(receiver,intentFilter)
    }

    override fun onStop() {
        super.onStop()
        activity?.unregisterReceiver(receiver)
    }

}