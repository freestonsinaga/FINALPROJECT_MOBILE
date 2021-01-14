package com.example.melodiamusik.ui.bass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R
import kotlinx.android.synthetic.main.bass_list_item.view.*

class BassAdapter (val BassItemList: List<BassData>, val clickListener: (BassData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.bass_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(BassItemList[position], clickListener)
    }

    override fun getItemCount() = BassItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(bass: BassData, clickListener: (BassData) -> Unit) {
            itemView.BassNama.text= bass.BassNama.toString()
            itemView.BassPhoto.setImageResource(bass.BassPhoto)
            itemView.setOnClickListener { clickListener(bass) }
        }
    }
}