package com.example.fragmentdatapassing.broadcastTask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.databinding.ActivityBroadcastFragmentDataBinding

class BroadcastFragmentData : AppCompatActivity() {

    lateinit var binding: ActivityBroadcastFragmentDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBroadcastFragmentDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.broadFirstFragment.id,First_broadcast())
        fragmentTransaction.commit()

        supportFragmentManager.beginTransaction().replace(binding.broadSecondFragment.id,SecondBraodcast()).commit()
    }
}