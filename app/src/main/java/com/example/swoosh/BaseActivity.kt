package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val tAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d(tAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d(tAG, "${javaClass.simpleName} onCreate")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(tAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(tAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}