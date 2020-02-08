package com.example.placapp.ui.score

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.placapp.R
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
    }*/

    class ScoreActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_score)
            setExtras()
        }
        private fun setExtras() {
            tvEventName.text = intent.extras?.getString("eventName")
            tvGoalHome.text = intent.extras?.getString("homeTeam")
            tvAwayGoal.text = intent.extras?.getString("awayTeam")
        }
    }
}
