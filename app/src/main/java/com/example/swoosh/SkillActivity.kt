package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class SkillActivity : BaseActivity() {
    var league = ""
    val ballerbtn = findViewById<Button>(R.id.ballerbtn)
    val beginerbtn = findViewById<Button>(R.id.beginerbtn)
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        //println(league)
    }
    fun onballerclick(view: View){
        beginerbtn.isPressed = false
        skill = "baller"
    }
    fun onbeginerclick(view: View){
        ballerbtn.isPressed = true
        skill = "beginer"
    }
    fun onfinishclick(view: View){
        if (skill != ""){
        val finishActivity = Intent(this, FinishActivity::class.java)
         finishActivity.putExtra(EXTRA_LEAGUE, league)
         finishActivity.putExtra(EXTRA_SKILL,skill )
        startActivity(finishActivity)
    }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}