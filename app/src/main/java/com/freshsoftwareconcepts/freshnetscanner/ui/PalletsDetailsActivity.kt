package com.freshsoftwareconcepts.freshnetscanner.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.freshsoftwareconcepts.freshnetscanner.R
import com.freshsoftwareconcepts.freshnetscanner.adapter.PalletsDetailAdapter
import com.freshsoftwareconcepts.freshnetscanner.pojo.PalletsDetail

class PalletsDetailsActivity : AppCompatActivity() {
    val rvPalletsDetails by lazy { this.findViewById<RecyclerView>(R.id.rvPalletsDetails) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pallets_details)

        supportActionBar?.setHomeButtonEnabled(true);

        val detail = ArrayList<PalletsDetail>()
        detail.add(PalletsDetail(1, "Toma Roma Ctns Med", "00.0000.00", 540))
        detail.add(PalletsDetail(2, "Toma Roma Ctns Med", "00.0000.00", 527))
        detail.add(PalletsDetail(3, "Toma Roma Ctns Med", "00.0000.00", 520))
        detail.add(PalletsDetail(4, "Toma Roma Ctns Med", "00.0000.00", 549))
        detail.add(PalletsDetail(5, "Toma Roma Ctns Med", "00.0000.00", 549))
        detail.add(PalletsDetail(6, "Toma Roma Ctns Med", "00.0000.00", 539))
        detail.add(PalletsDetail(7, "Toma Roma Ctns Med", "00.0000.00", 572))
        detail.add(PalletsDetail(8, "Toma Roma Ctns Med", "00.0000.00", 569))
        detail.add(PalletsDetail(9, "Toma Roma Ctns Med", "00.0000.00", 569))
        detail.add(PalletsDetail(10, "Toma Roma Ctns Med", "00.0000.00", 569))

        rvPalletsDetails.adapter = PalletsDetailAdapter(detail, this)
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.VERTICAL
        this.rvPalletsDetails.layoutManager = llm
    }
}
