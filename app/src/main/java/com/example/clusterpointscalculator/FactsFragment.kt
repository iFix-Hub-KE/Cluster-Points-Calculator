package com.example.clusterpointscalculator

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FactsFragment : Fragment(){

    val TAG = "FactsFragment"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        //!! means the inflater should not be null
        val view: View = inflater.inflate(R.layout.facts_fragment,container,false)
        return  view
    }
}