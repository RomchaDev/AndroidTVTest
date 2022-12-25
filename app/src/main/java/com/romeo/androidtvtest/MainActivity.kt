package com.romeo.androidtvtest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("RomanLaunchTest", "Activity Launched")
    }
}