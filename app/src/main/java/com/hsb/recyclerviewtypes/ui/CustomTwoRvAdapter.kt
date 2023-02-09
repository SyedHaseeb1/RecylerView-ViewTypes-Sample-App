package com.hsb.recyclerviewtypes.ui

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.hsb.recyclerviewtypes.databinding.IncomingRowBinding


class CustomTwoRvAdapter(var mList: ArrayList<String>) :
    RecyclerView.Adapter<CustomTwoRvAdapter.ViewHolder>() {


    inner class ViewHolder(var binding: IncomingRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = IncomingRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding) {
        }
    }

    override fun getItemCount() = mList.size
}