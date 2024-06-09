package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.content.Intent
import android.net.Uri
import android.provider.AlarmClock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myClickHandler(view: View){
        Log.i("MainActvity","button clicked")
      //  var dialIntent:Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:987654398765"))
        var webIntent:Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yahoo.com"))
        startActivity(webIntent)

    }

    fun startTimer(message: String, seconds: Int) {
        Log.i("MainActvity","button clicked")
        val timeintent = Intent(AlarmClock.ACTION_SET_TIMER).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        }
        if (timeintent.resolveActivity(packageManager) != null) {
            startActivity(timeintent)
        }
    }
}