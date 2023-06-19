package com.example.fragmentdatapassing.broadcastTask

import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.UiThread
import com.example.fragmentdatapassing.R
import com.example.fragmentdatapassing.databinding.ActivityReceiveImageBinding

class ReceiveImage : AppCompatActivity() {

    lateinit var binding: ActivityReceiveImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReceiveImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent != null) {
            val uri = intent.getParcelableExtra(Intent.EXTRA_STREAM) as? Uri
            binding.imgReceive.setImageURI(uri)

        }
    }
}