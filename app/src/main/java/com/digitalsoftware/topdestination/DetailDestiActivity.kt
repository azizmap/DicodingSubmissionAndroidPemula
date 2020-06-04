package com.digitalsoftware.topdestination

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailDestiActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_DESTI = "extra_desti"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_desti)

        val btnGoBack: Button = findViewById(R.id.btn_back)
        btnGoBack.setOnClickListener(this)

        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val destiName: TextView = findViewById(R.id.tv_item_name)
        val destiLoc: TextView = findViewById(R.id.tv_item_loc)
        val destiDetail: TextView = findViewById(R.id.tv_item_detail)

        val desti = intent.getParcelableExtra(EXTRA_DESTI) as Destination

        imgPhoto.setImageResource(desti.photo)
        destiName.text = desti.name
        destiLoc.text = desti.loc
        destiDetail.text = desti.detail

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                finish()
            }
        }
    }
}
