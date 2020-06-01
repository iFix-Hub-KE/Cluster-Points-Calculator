package com.example.clusterpointscalculator

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.home_fragment.*
import kotlin.math.sqrt

class HomeFragment : Fragment(){

    val TAG = "HomeFragment"

    private lateinit var selected:String
    private lateinit var gradeSelected1:String
    private lateinit var gradeSelected2:String
    private lateinit var gradeSelected3:String
    private lateinit var gradeSelected4:String
    private lateinit var calculateC: Button
    private lateinit var resultC: TextView



    override fun onAttach(context: Context) {
        Log.d(TAG,"onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        Log.d(TAG,"onCreateView")
        //!! means the inflater should not be null
        val view: View = inflater!!.inflate(R.layout.home_fragment,container,false)

        calculateC = view.findViewById(R.id.calculate)
        resultC = view.findViewById(R.id.result)

        val spinner1 = view.findViewById<Spinner>(R.id.spinner)
        val options = arrayOf("Cluster 1","Cluster 8","Cluster 11")
        spinner1?.adapter = ArrayAdapter(activity?.applicationContext!!,R.layout.support_simple_spinner_dropdown_item,options)
        spinner1?.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                print("Error")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selected = parent?.getItemAtPosition(position).toString()
                Toast.makeText(activity,selected,Toast.LENGTH_SHORT).show()
            }

        }

        val spinnner2 = view.findViewById<Spinner>(R.id.subj1)
        val grades = arrayOf("A","A-","B+","B","B-","C+","C","C-","D+","D","D-","E")
        spinnner2?.adapter = ArrayAdapter(activity?.applicationContext!!,R.layout.support_simple_spinner_dropdown_item,grades)
        spinnner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(activity,"Error",Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                 gradeSelected1 = parent?.getItemAtPosition(position).toString()
                //Toast.makeText(activity,gradeSelected.toString(),Toast.LENGTH_SHORT).show()
            }

        }

        val spinner3 = view.findViewById<Spinner>(R.id.subj2)
        spinner3?.adapter = ArrayAdapter(activity?.applicationContext!!,R.layout.support_simple_spinner_dropdown_item,grades)
        spinner3.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(activity,"Error",Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                 gradeSelected2 = parent?.getItemAtPosition(position).toString()
            }

        }

        val spinner4 = view.findViewById<Spinner>(R.id.subj3)
        spinner4?.adapter = ArrayAdapter(activity?.applicationContext!!,R.layout.support_simple_spinner_dropdown_item,grades)
        spinner4.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(activity,"Error",Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                 gradeSelected3 = parent?.getItemAtPosition(position).toString()
            }

        }

        val spinner5 = view.findViewById<Spinner>(R.id.subj4)
        spinner5?.adapter = ArrayAdapter(activity?.applicationContext!!,R.layout.support_simple_spinner_dropdown_item,grades)
        spinner5.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(activity,"Error",Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                 gradeSelected4 = parent?.getItemAtPosition(position).toString()
            }

        }
        calculateC.setOnClickListener(View.OnClickListener {

            resultC.text = calculatePoints(70,selected,convertSubj(gradeSelected1),convertSubj(gradeSelected2),
                convertSubj(gradeSelected3),convertSubj(gradeSelected4)).toString()
        })

        return view
    }

    fun calculatePoints(totalPoints:Int,cluster:String,subj1:Int,subj2:Int,subj3:Int,subj4:Int) : Double {

        var x:Double = (subj1+subj2+subj3+subj4).toDouble()

        var z:Double = x/48 * ((totalPoints.toDouble())/84)

        var z_sqrt:Double = sqrt(z)

        var c:Double = z_sqrt*48

        return c
    }

    fun convertSubj(subj:String): Int {
        var points:Int = 0
        when(subj){
            "A" -> points = 12
            "A-" -> points =  11
            "B+" -> points =  10
            "B" -> points =  9
            "B-" -> points =  8
            "C+" -> points =  7
            "C" -> points =  6
            "C-" -> points =  5
            "D+" -> points =  4
            "D" -> points =  3
            "D-" -> points =  2
            "E" -> points =  1
            }
        return points
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
        Log.d(TAG,"onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"onDetach")
        super.onDetach()
    }
}