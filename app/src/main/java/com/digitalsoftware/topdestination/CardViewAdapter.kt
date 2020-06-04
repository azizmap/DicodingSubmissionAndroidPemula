package com.digitalsoftware.topdestination

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(private val listDestination: ArrayList<Destination>) : RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvLoc: TextView = itemView.findViewById(R.id.tv_item_loc)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return  CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDestination.size
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: CardViewAdapter.CardViewViewHolder, position: Int) {
        val destination = listDestination[position]

        Glide.with(holder.itemView.context)
            .load(destination.photo)
            .into(holder.imgPhoto)

        holder.tvName.text = destination.name
        holder.tvDetail.text = destination.detail
        holder.tvLoc.text = destination.loc

        holder.btnFavorite.setOnClickListener{Toast.makeText(holder.itemView.context, "Favorite "+listDestination[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()}
        holder.itemView.setOnClickListener{
            var contexxx = holder.itemView.context
            val moveToDetail = Intent(contexxx, DetailDestiActivity::class.java)
            moveToDetail.putExtra(DetailDestiActivity.EXTRA_DESTI, destination)
            contexxx.startActivity(moveToDetail)
//            moveToDetail.putExtra(DetailDestiActivity.EXTRA_NAME, destination.name)
//            moveToDetail.putExtra(DetailDestiActivity.EXTRA_LOC, destination.loc)
//            moveToDetail.putExtra(DetailDestiActivity.EXTRA_DETAIL, destination.name)
//            moveToDetail.putExtra(DetailDestiActivity.EXTRA_PHOTO, destination.photo)

        }
    }
}