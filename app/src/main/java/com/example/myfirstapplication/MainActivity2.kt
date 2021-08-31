package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var bundle:Bundle? = intent.extras
        var m = bundle?.getString("msg")

        button2.setOnClickListener {
            Toast.makeText(this,m, Toast.LENGTH_SHORT).show()
        }

    }
}