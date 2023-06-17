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
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        val fragmentItem = ProductListingFragment()

        ft.replace(R.id.fragmentCItems, ProductListingFragment())
        ft.commit()


        val ft2 = fm.beginTransaction()
        val fragmentCart = FragmentCart()

        ft2.replace(R.id.fragmentCCart, FragmentCart())
        ft2.commit()

    }

}