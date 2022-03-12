package com.example.recipebook.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipebook.R

class HomeAdapter (private var notificationList: List<Notification>): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

    inner class HomeViewHolder(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(
        inflater.inflate(R.layout.notification_view_item,parent,false)) {
        private var notificationText: TextView? = null
        private var notificationMsg: TextView? = null
        private var notificationImage: ImageView? = null

        init {
            notificationImage = itemView.findViewById(R.id.dot)
            notificationMsg = itemView.findViewById(R.id.notification_msg)
            notificationText = itemView.findViewById(R.id.notification_name)
        }

        fun bind(home: Notification){
            notificationImage?.setImageResource(home.image)
            notificationText?.text = home.notification_name
            notificationMsg?.text = home.notification_text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
          val inflater = LayoutInflater.from(parent.context)
          return HomeViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val home: Notification = notificationList[position]
        holder.bind(home)
    }

    override fun getItemCount(): Int = notificationList.size

}