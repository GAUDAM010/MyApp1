package com.example.myapp1

import androidx.lifecycle.ViewModel
import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import android.util.Log

class HomeViewModel {
    var TAG = HomeViewModel::class.java.simpleName
    lateinit var timer: CountDownTimer
    val _seconds = MutableLiveData<Int>()
    var count = 0


    fun incrementCount(){
        count++
    }
}

fun startTimer() {
    timer = object :CountDownTimer(10_000,1_000){
        override fun onTick(millisUntilFinished: Long) {
            _seconds.value = millisUntilFinished.toInt()
            Log.i(TAG, "time remaining ="+millisUntilFinished.toInt())
        }

        override fun onFinish() {
            Log.i(TAG,"countdown has finished")
        }

    }.start()

}
}