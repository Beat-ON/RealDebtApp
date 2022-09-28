package com.beaton.realdebtapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beaton.realdebtapp.R
import com.beaton.realdebtapp.model.KirimData
import kotlinx.android.synthetic.main.item_menu.view.*

class KirimAdapter:RecyclerView.Adapter<KirimAdapter.KirimViewHolder>() {

    var list = mutableListOf<KirimData>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class KirimViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun setData(kirim_data:KirimData){
            itemView.item_tv_from_came?.text = kirim_data.firstCame
            itemView.item_tv_summa?.text = kirim_data.summa
            itemView.item_tv_date?.text = kirim_data.date
            itemView.item_tv_description?.text = kirim_data.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KirimViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu,parent,false)
        return KirimViewHolder(view)
    }

    override fun onBindViewHolder(holder: KirimViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int = list.size

}