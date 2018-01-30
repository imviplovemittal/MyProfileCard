package com.monkwish.myprofilecard

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var profileDownButton : ImageButton ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileDownButton = findViewById(R.id.profile_down_button)
        profileDownButton?.setOnClickListener {
            if(linear_layout.visibility==View.INVISIBLE) {
                var slide_down: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_down)
                linear_layout.startAnimation(slide_down)
                linear_layout.visibility = View.VISIBLE
                profileDownButton?.setImageResource(android.R.drawable.arrow_up_float)
            }else{
                var slide_up: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_up)
                linear_layout.startAnimation(slide_up)
                linear_layout.visibility = View.INVISIBLE
                profileDownButton?.setImageResource(android.R.drawable.arrow_down_float)
            }

        }
    }
}
