 package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Button

 class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getStartedbtn = findViewById<Button>(R.id.getstartedbtn)
        getStartedbtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}