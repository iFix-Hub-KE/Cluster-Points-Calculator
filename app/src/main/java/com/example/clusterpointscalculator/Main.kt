package com.example.clusterpointscalculator

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_layout.*
import com.example.clusterpointscalculator.PreferenceHelper.set

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val prefs: SharedPreferences = PreferenceHelper.defaultPrefs(applicationContext!!)



        btn_next.setOnClickListener {

            if(pref_Eng.isChecked){
                prefs[PREFERENCE_ENGLISH] = true
            }

            // prefs[PREFERENCE_ENGLISH] = pref_Eng.isChecked
            prefs[PREFERENCE_KISWAHILI] = pref_Kisw.isChecked
            prefs[PREFERENCE_MATHEMATICS] = pref_Maths.isChecked
            prefs[PREFERENCE_PHYSICS] = pref_Phyc.isChecked
            prefs[PREFERENCE_BIOLOGY] = pref_Bio.isChecked
            prefs[PREFERENCE_CHEMISTRY] = pref_Chem.isChecked
            prefs[PREFERENCE_AGRICULTURE] = pref_Bst.isChecked
            prefs[PREFERENCE_BUSINESS] = pref_Agri.isChecked
            prefs[PREFERENCE_COMPUTER] = pref_Comp.isChecked
            prefs[PREFERENCE_GEOGRAPHY] = pref_Hist.isChecked
            prefs[PREFERENCE_HISTORY] = pref_Geo.isChecked
            prefs[PREFERENCE_CRE] = pref_CRE.isChecked

            val activityIntent = Intent(this, GetPrefs::class.java)
            startActivity(activityIntent)
        }
    }
}