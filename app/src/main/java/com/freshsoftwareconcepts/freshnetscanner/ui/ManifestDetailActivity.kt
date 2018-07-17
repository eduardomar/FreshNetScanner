package com.freshsoftwareconcepts.freshnetscanner.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import com.freshsoftwareconcepts.freshnetscanner.R
import com.freshsoftwareconcepts.freshnetscanner.adapter.ManifestDetailAdapter
import com.freshsoftwareconcepts.freshnetscanner.pojo.ManifestDetail

class ManifestDetailActivity : AppCompatActivity() {
    val rvDetails by lazy { this.findViewById<RecyclerView>(R.id.rvDetails) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manifest_detail)

        supportActionBar?.setHomeButtonEnabled(true);

        val detail = ArrayList<ManifestDetail>()
        detail.add(ManifestDetail(1, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(2, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(3, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(4, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(5, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(6, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(7, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(8, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(9, "Toma Roma Ctns Med", 540, 90))
        detail.add(ManifestDetail(10, "Toma Roma Ctns Med", 540, 90))

        rvDetails.adapter = ManifestDetailAdapter(detail, this)
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.VERTICAL
        this.rvDetails.layoutManager = llm
    }
}