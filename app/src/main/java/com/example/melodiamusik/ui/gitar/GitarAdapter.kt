package com.example.melodiamusik.ui.gitar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R
import kotlinx.android.synthetic.main.gitar_list_item.view.*


class GitarAdapter (val GitarItemList: List<GitarData>, val clickListener: (GitarData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.gitar_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(GitarItemList[position], clickListener)
    }

    override fun getItemCount() = GitarItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(gitar: GitarData, clickListener: (GitarData) -> Unit) {
            itemView.GitarNama.text = gitar.GitarNama.toString()
            itemView.GitarPhoto.setImageResource(gitar.GitarPhoto)
            itemView.setOnClickListener { clickListener(gitar) }
        }
    }
}