package com.thetechbhakta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var obtainedName = intent.getStringExtra("ReferName")
        var obtainedGender = intent.getStringExtra("ReferGender")
        var obtainedCourse  = intent.getStringExtra("ReferCourse")
        displayTextView.text = "Welcome, "+obtainedName+"\nGender: "+obtainedGender+"\nCourse: "+obtainedCourse
    }
}