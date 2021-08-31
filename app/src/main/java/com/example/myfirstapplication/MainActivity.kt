package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Text_Id.text="Krishna"
        button.setOnClickListener {
            var str= Name.text.toString()
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
            val explicit_intent=Intent(this,MainActivity2::class.java)
            explicit_intent.putExtra("msg","Hi")
            startActivity(explicit_intent)
        }

        button3.setOnClickListener {

            val implicit_intent = Intent()
            implicit_intent.action = Intent.ACTION_SEND
            implicit_intent.putExtra(Intent.EXTRA_TEXT,"hi")
            implicit_intent.type="text/plain"
            startActivity(Intent.createChooser(implicit_intent,"Hello"))
            }


    }

}