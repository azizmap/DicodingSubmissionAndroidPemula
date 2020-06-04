package com.digitalsoftware.topdestination

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvDesti : RecyclerView
    private var list: ArrayList<Destination> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDesti = findViewById(R.id.rv_desti)
        rvDesti.setHasFixedSize(true)

        val btnMoveProfile: Button = findViewById(R.id.btn_profile)
        btnMoveProfile.setOnClickListener(this)

        list.addAll(DestinationsData.listData)

        rvDesti.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rvDesti.adapter = cardViewAdapter
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_profile ->{
                val moveProfile = Intent(this@MainActivity, MyProfileActivity::class.java)
                startActivity(moveProfile)
            }
        }
    }
}
