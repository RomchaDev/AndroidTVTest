package com.romeo.androidtvtest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class StartOnBootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        Log.v("StartReceiverRoman", "Receive broadcast")

        Log.d(
            "StartReceiverRoman",
            "Receive boot completed broadcast"
        )

        val activityIntent = Intent(context, MainActivity::class.java)
        activityIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context!!.startActivity(activityIntent)
    }
}