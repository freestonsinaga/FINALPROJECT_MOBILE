package com.example.melodiamusik.ui.keyboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R
import kotlinx.android.synthetic.main.keyboard_list_item.view.*

class KeyboardAdapter (val keyboardItemList: List<KeyboardData>, val clickListener: (KeyboardData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.keyboard_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(keyboardItemList[position], clickListener)
    }

    override fun getItemCount() = keyboardItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(keyboard: KeyboardData, clickListener: (KeyboardData) -> Unit) {
            itemView.KeyboardNama.text = keyboard.KeyboardNama.toString()
            itemView.KeyboardPhoto.setImageResource(keyboard.KeyboardPhoto)
            itemView.setOnClickListener { clickListener(keyboard) }
        }
    }
}