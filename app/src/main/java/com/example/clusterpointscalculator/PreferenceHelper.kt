package com.example.clusterpointscalculator

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

//creating a singleton

object PreferenceHelper{
    fun defaultPrefs(context: Context)
            : SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    fun customPrefs(context: Context,name:String):
            SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)
}
