package com.freshsoftwareconcepts.freshnetscanner.adapter

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.freshsoftwareconcepts.freshnetscanner.R
import com.freshsoftwareconcepts.freshnetscanner.pojo.ManifestDetail
import com.freshsoftwareconcepts.freshnetscanner.ui.PalletsDetailsActivity

class ManifestDetailAdapter(private val details: ArrayList<ManifestDetail>, private val activity: Activity) : RecyclerView.Adapter<ManifestDetailAdapter.ManifestDetailViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManifestDetailViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view_manifest_detail, parent, false)

        return ManifestDetailViewHolder(v, activity)
    }

    override fun getItemCount(): Int {
        return this.details.size
    }

    override fun onBindViewHolder(holder: ManifestDetailViewHolder, index: Int) {
        val detail = this.details[index]
        holder.tvProductDesc.setText(detail.productDesc)
        holder.tvPkgsMan.setText(detail.pkgsMan.toString())
        holder.tvPkgsRec.setText(detail.pkgsRec.toString())
    }

    class ManifestDetailViewHolder(itemView: View, activity: Activity) : RecyclerView.ViewHolder(itemView) {
        private val _tvProductDesc by lazy { itemView.findViewById<TextView>(R.id.tvProductDesc) }
        private val _tvPkgsMan by lazy { itemView.findViewById<TextView>(R.id.tvPkgsMan) }
        private val _tvPkgsRec by lazy { itemView.findViewById<TextView>(R.id.tvPkgsRec) }

        val tvProductDesc get() = this._tvProductDesc
        val tvPkgsMan get() = this._tvPkgsMan
        val tvPkgsRec get() = this._tvPkgsRec

        init {
            itemView.setOnClickListener({
                activity.startActivity(Intent(activity, PalletsDetailsActivity::class.java))
            })
        }
    }
}