package com.freshsoftwareconcepts.freshnetscanner.adapter

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.freshsoftwareconcepts.freshnetscanner.R
import com.freshsoftwareconcepts.freshnetscanner.pojo.PalletsDetail
import com.freshsoftwareconcepts.freshnetscanner.ui.PalletsDetailActivity

class PalletsDetailAdapter(private val palletsDetails: ArrayList<PalletsDetail>, private val activity: Activity) : RecyclerView.Adapter<PalletsDetailAdapter.PalletsDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PalletsDetailViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view_pallets_detail, parent, false)

        return PalletsDetailViewHolder(v, activity)
    }

    override fun getItemCount(): Int {
        return this.palletsDetails.size
    }

    override fun onBindViewHolder(holder: PalletsDetailViewHolder, index: Int) {
        val pDetail = this.palletsDetails[index]
        holder.tvProductDesc.setText(pDetail.productDesc)
        holder.tvPallet.setText(pDetail.pallet)
        holder.tvQty.setText(pDetail.qty.toString())
    }

    class PalletsDetailViewHolder(itemView: View, activity: Activity) : RecyclerView.ViewHolder(itemView) {
        private val _tvProductDesc by lazy { itemView.findViewById<TextView>(R.id.tvProductDesc) }
        private val _tvPallet by lazy { itemView.findViewById<TextView>(R.id.tvPallet) }
        private val _tvQty by lazy { itemView.findViewById<TextView>(R.id.tvQty) }

        val tvProductDesc get() = this._tvProductDesc
        val tvPallet get() = this._tvPallet
        val tvQty get() = this._tvQty

        init {
            itemView.setOnClickListener({
                activity.startActivity(Intent(activity, PalletsDetailActivity::class.java))
            })
        }
    }
}