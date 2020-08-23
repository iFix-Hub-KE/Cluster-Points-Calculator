package com.example.clusterpointscalculator

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import java.lang.UnsupportedOperationException

//creating a singleton

object PreferenceHelper{
    fun defaultPrefs(context: Context)
            : SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    fun customPrefs(context: Context,name:String):
            SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor)-> Unit){
        val editor = this.edit()
        operation(editor) // do the work needed
        editor.apply()
    }

    operator fun SharedPreferences.set(key:String, value:Any){
        when(value){
            is String -> edit {it.putString(key,value)}
            is Int -> edit{it.putInt(key,value)}
            is Boolean -> edit { it.putBoolean(key,value) }
            else -> throw UnsupportedOperationException("Unsupported Operation")
        }
    }

    inline operator fun <reified T> SharedPreferences.get(key:String, defaultValue: T? = null): T?{
        return when (T::class){
            String::class -> getString(key,defaultValue as? String) as T?
            Int::class -> getInt(key,defaultValue as? Int ?: -1) as T?
            Boolean::class -> getBoolean(key,defaultValue as? Boolean ?: false) as T?
            else -> throw UnsupportedOperationException("Unsupported Operation")
        }
    }
}
