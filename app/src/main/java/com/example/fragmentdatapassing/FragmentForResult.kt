package com.example.fragmentdatapassing

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentdatapassing.databinding.FragmentForResultBinding

class FragmentForResult : Fragment() {


    lateinit var binding: FragmentForResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentForResultBinding.inflate(layoutInflater)



        binding.btnOpen.setOnClickListener {
            val intent = Intent(activity?.baseContext,IntentsDemo::class.java)
            startActivityForResult(intent,2)
        }
        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Toast.makeText(activity?.baseContext, data?.getStringExtra("data"), Toast.LENGTH_SHORT).show()
    }



}