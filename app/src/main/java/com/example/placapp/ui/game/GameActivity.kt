package com.example.placapp.ui.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.placapp.R
import com.example.placapp.ui.game.event.EventFragment
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        showEventFragment()
        ivBack.setOnClickListener {
            onBackPressed()
        }
    }
    private fun showEventFragment() {
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.containerGame, EventFragment())
        ft.commit()
    }
}
