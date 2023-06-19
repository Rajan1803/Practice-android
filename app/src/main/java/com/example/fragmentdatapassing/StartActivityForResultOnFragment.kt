package com.example.fragmentdatapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragmentdatapassing.databinding.ActivityStartForResultOnFragmentBinding

class StartActivityForResultOnFragment : AppCompatActivity() {
    lateinit var binding: ActivityStartForResultOnFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartForResultOnFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(binding.fragmentContainer.id,FragmentForResult()).commit()



    }


}