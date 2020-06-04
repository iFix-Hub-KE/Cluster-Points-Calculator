package com.example.clusterpointscalculator

import android.content.Context
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.facts_fragment.*



class FactsFragment : Fragment(){

    val TAG = "FactsFragment"

    private lateinit var detail_read: TextView
    private lateinit var detail_descrip: Button

    override fun onAttach(context: Context) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG,"onCreateView")
        //!! means the inflater should not be null
        val view: View = inflater.inflate(R.layout.facts_fragment,container,false)

        detail_read = view.findViewById(R.id.tvSongDes)

        detail_descrip = view.findViewById(R.id.btShowmore)


        detail_descrip.setOnClickListener(View.OnClickListener {
            if (btShowmore.text.toString() == "Showmore..."){
                tvSongDes.maxLines = Integer.MAX_VALUE//your TextView
                btShowmore.text = "Showless"
            }
            else
            {
                tvSongDes.maxLines = 3//your TextView
                btShowmore.text = "Showmore..."
            }
        })


        return  view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"onDetach")

    }
}