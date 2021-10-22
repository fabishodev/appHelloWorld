package com.example.apphelloworld.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.apphelloworld.R

class MainActivity : AppCompatActivity() {

    private lateinit var btnSayHello:Button
    private lateinit var btnSayHello2:Button
    private lateinit var btnToolBar:Button
    private lateinit var btnFragments:Button
    private lateinit var txtLabel: TextView
    private lateinit var editName: EditText
    private lateinit var btnFragments2:Button

    private val TAG = "TEST"
    private val TAG2 = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val btnSayHello = findViewById<Button>(R.id.btn_say_hello)
        btnSayHello = findViewById(R.id.btn_say_hello)
        btnSayHello2 = findViewById(R.id.btn_say_hello_2)
        btnToolBar = findViewById(R.id.btn_toolbar)
        btnFragments2 = findViewById(R.id.btn_fragments_2)
        txtLabel = findViewById(R.id.txt_label)
        editName = findViewById(R.id.edit_name)

        btnSayHello.setOnClickListener{
            val name = editName.text.toString()
            sayHello(name)
        }

        btnSayHello2.setOnClickListener{
            val name = editName.text.toString()
            var intent = Intent(this, HelloActivity::class.java)
            intent.putExtra("name", name)
            //startActivity(intent)
            startActivityForResult(intent, 1)
        }

        btnToolBar.setOnClickListener{

        }

        btnFragments.setOnClickListener{

        }

        btnFragments2.setOnClickListener{

        }

        Log.e(TAG, "This is an error")
        Log.d(TAG, "This is for debugging")
        Log.w(TAG, "This is an warning")
        Log.i(TAG, "This is information")
        Log.d(TAG2, "onCreate")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK)
        {
            val valor1 = data?.getStringExtra("valor1")
            Toast.makeText(this, "$valor1", Toast.LENGTH_LONG).show()
        }
    }

    fun sayHello(name:String){
        var hello = getString(R.string.hello)
        txtLabel.text = "$hello $name"
    }

    override fun onStart(){
        super.onStart()
        Log.d("LifeCycle", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("LifeCycle", "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("LifeCycle", "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("LifeCycle", "onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d("LifeCycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy")
    }


}