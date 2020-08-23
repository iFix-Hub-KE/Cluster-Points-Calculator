package com.example.clusterpointscalculator

import android.content.Context
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

        prefs[PREFERENCE_ENGLISH] = pref_Eng.text
        prefs[PREFERENCE_KISWAHILI] = pref_Kisw.text
        prefs[PREFERENCE_MATHEMATICS] = pref_Maths.text
        prefs[PREFERENCE_PHYSICS] = pref_Phyc.text
        prefs[PREFERENCE_BIOLOGY] = pref_Bio.text
        prefs[PREFERENCE_CHEMISTRY] = pref_Chem.text
        prefs[PREFERENCE_AGRICULTURE] = pref_Bst.text
        prefs[PREFERENCE_BUSINESS] = pref_Agri.text
        prefs[PREFERENCE_COMPUTER] = pref_Comp.text
        prefs[PREFERENCE_GEOGRAPHY] = pref_Hist.text
        prefs[PREFERENCE_HISTORY] = pref_Geo.text
        prefs[PREFERENCE_CRE] = pref_CRE.text
    }
}