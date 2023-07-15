package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LeagueActivity : BaseActivity() {
    var selectedleague= ""
    val womenbtn = findViewById<Button>(R.id.women)
    val menbtn = findViewById<Button>(R.id.menbtn)
    val coedbtn = findViewById<Button>(R.id.coedbtn)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun onwomenclicked(view: View){
        menbtn.isPressed = false
        coedbtn.isPressed = false
        selectedleague = "women"
    }
    fun onmenclicked(view: View){
        womenbtn.isPressed = false
        coedbtn.isPressed = false
        selectedleague="men"

    }
    fun oncoedclicked(view: View){
        womenbtn.isPressed = false
        menbtn.isPressed = false
        selectedleague="co-ed"

    }
    fun leaguenextclicked(view: View){
        if(selectedleague != ""){
        val skillActivity = Intent(this , SkillActivity::class.java)
        skillActivity.putExtra(EXTRA_LEAGUE, selectedleague)
        startActivity(skillActivity)
    }else{
        Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}