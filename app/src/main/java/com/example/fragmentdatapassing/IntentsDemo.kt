package com.example.fragmentdatapassing

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentdatapassing.databinding.ActivityIntentsDemoBinding


class IntentsDemo : AppCompatActivity() {
    lateinit var binding: ActivityIntentsDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentsDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent()
        intent.putExtra("data","hello")

        setResult(2,intent)

        binding.btnSubmit.setOnClickListener {

                val intent = Intent(Intent.ACTION_SEND)
               intent.setType("image/*")
            intent.putExtra("address","215478")
                intent.putExtra("sms_body","hello rajan")

            if (intent.resolveActivity(this.packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "problem", Toast.LENGTH_SHORT).show()
            }

//            val intent = Intent(Intent.ACTION_VIEW)
////            intent.setPackage("com.simform.glimpses.activities.LocationActivity")
//            intent.setClassName("com.simform.glimpses","com.simform.glimpses.activities.LocationActivity")
//            startActivity(intent)
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivity")
//            startActivity(intent)

        }
    }
}