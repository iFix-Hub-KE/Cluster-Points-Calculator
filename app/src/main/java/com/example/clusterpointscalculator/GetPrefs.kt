package com.example.clusterpointscalculator

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clusterpointscalculator.PreferenceHelper.get
import kotlinx.android.synthetic.main.activity_get_prefs.*

class GetPrefs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_prefs)

        val prefs: SharedPreferences = PreferenceHelper.defaultPrefs(applicationContext!!)
        val val_Eng: Boolean? = prefs[PREFERENCE_ENGLISH]
        val val_Kis: Boolean? = prefs[PREFERENCE_KISWAHILI]
        val val_Maths: Boolean? = prefs[PREFERENCE_MATHEMATICS]
        val val_Phy: Boolean? = prefs[PREFERENCE_PHYSICS]
        val val_Bio: Boolean? = prefs[PREFERENCE_BIOLOGY]
        val val_Chem: Boolean? = prefs[PREFERENCE_CHEMISTRY]
        val val_Bst: Boolean? = prefs[PREFERENCE_BUSINESS]
        val val_Agr: Boolean? = prefs[PREFERENCE_AGRICULTURE]
        val val_Comp: Boolean? = prefs[PREFERENCE_COMPUTER]
        val val_His: Boolean? = prefs[PREFERENCE_HISTORY]
        val val_Geo: Boolean? = prefs[PREFERENCE_GEOGRAPHY]
        val val_Cre: Boolean? = prefs[PREFERENCE_CRE]


        all_prefs.text = ("English $val_Eng Kiswahili $val_Kis Maths $val_Maths Bio " +
                "$val_Bio  Phy $val_Phy Chem $val_Chem Bst $val_Bst Comp" +
                " $val_Comp Agri $val_Agr Hist $val_His Geo $val_Geo CRE $val_Cre")
    }
}