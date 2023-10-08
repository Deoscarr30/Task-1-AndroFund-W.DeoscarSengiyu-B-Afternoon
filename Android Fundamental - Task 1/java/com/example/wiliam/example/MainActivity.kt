package com.example.wiliam.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.wiliam.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnimplicit: Button = findViewById(R.id.btn_implicit)
        btnimplicit.setOnClickListener(this)

        val btnFragmen: Button = findViewById(R.id.btn_fragment)
        btnFragmen.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_implicit -> {
                    val massage = "inpo inpo Broo"
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, massage)
                    intent.type = "text/plain"
                    startActivity(intent)
                }
                R.id.btn_fragment -> {
                    val intent = Intent(this@MainActivity, FragmentActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}