package com.example.clusterpointscalculator

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val prefs: SharedPreferences = PreferenceHelper.defaultPrefs(applicationContext!!)

    }
}