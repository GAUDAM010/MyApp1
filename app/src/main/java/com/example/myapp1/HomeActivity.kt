package com.example.myapp1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {
    //lateinit var brake:Int?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


    }

    override fun onStart() {
        super.onStart()
        var view:ConstraintLayout=findViewById(R.id.main)
        Snackbar.make(view,"sending sms wishes",Snackbar.LENGTH_LONG).setAction("stop sending",
            View.OnClickListener {  }).show()
    }
}