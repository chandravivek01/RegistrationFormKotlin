package com.thetechbhakta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = " "

        var gender = " "

        var courseList = arrayListOf("Java", "Kotlin", "Sql")
        var course = " "

        courseSpinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, courseList)
        courseSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    course = courseList[p2]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

        submitButton.setOnClickListener() {
            name =nameText.text.toString()
            var genderId = radioGroup.checkedRadioButtonId
            if(genderId != -1) {
                val selected_gender : RadioButton = findViewById(genderId)
                gender = selected_gender.text.toString()
            }
            var intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("ReferName", name)
                putExtra("ReferGender", gender)
                putExtra("ReferCourse", course)
            }
            startActivity(intent)
        }
    }
}