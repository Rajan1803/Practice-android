package com.example.fragmentdatapassing.FragmentTask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragmentdatapassing.DataPass
import com.example.fragmentdatapassing.R

class MainActivity : AppCompatActivity(), DataPass {





//    replace vs add
//    add activity for result
//    listview implimentation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentItem = findViewById<FragmentContainerView>(R.id.fragmentCItems)
//        val fragmentCart = findViewById<FragmentContainerView>(R.id.fragmentCCart)
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentItem = ProductListingFragment()

        fragmentTransaction.replace(R.id.fragmentCItems, ProductListingFragment())
        fragmentTransaction.commit()


        val secondTransaction = fragmentManager.beginTransaction()
        val fragmentCart = FragmentCart()

        secondTransaction.replace(R.id.fragmentCCart, FragmentCart())
        secondTransaction.commit()

    }

}