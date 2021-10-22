package com.example.apphelloworld.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.apphelloworld.R

class HelloActivity : AppCompatActivity() {

    private lateinit var txtName:TextView
    private lateinit var btnBack:Button
    private lateinit var btnBackReturn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        txtName = findViewById(R.id.txt_name)
        btnBack = findViewById(R.id.btn_back)
        btnBackReturn = findViewById(R.id.btn_back_return)

        val name = intent.getStringExtra("name")
        val hello = getString(R.string.hello)
        txtName.text = "$hello $name"

        btnBack.setOnClickListener{
            finish()
        }

        btnBackReturn.setOnClickListener{
            var intent = Intent()
            intent.putExtra("valor1", "Test1")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}