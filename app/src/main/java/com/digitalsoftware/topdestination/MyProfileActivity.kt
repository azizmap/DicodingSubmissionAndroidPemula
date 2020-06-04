package com.digitalsoftware.topdestination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MyProfileActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        val btnGoBack: Button = findViewById(R.id.btn_back)
        btnGoBack.setOnClickListener(this)

        val btnExit: Button = findViewById(R.id.btn_exit)
        btnExit.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_back ->{
                finish()
            }
            R.id.btn_exit ->{
                finishAffinity()
            }
        }
    }

}
