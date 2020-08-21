package com.example.clusterpointscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        //setting listener to the bottom nav items
        //bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        //setting the fragment that will be loaded when the app starts
        //var fragment = HomeFragment()
        //addFragment(fragment)
    }

    fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("")
            .replace(R.id.fragment_container,fragment)
            .commit()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.bottom_navigation_home ->{
                var fragment = HomeFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.bottom_navigation_facts ->{
                val fragment = FactsFragment()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}