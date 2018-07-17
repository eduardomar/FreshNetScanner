package com.freshsoftwareconcepts.freshnetscanner.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.freshsoftwareconcepts.freshnetscanner.R
import com.freshsoftwareconcepts.freshnetscanner.adapter.ManifestDetailAdapter
import com.freshsoftwareconcepts.freshnetscanner.adapter.PalletsDetailAdapter
import com.freshsoftwareconcepts.freshnetscanner.pojo.ManifestDetail
import com.freshsoftwareconcepts.freshnetscanner.pojo.PalletsDetail

class PalletsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pallets_detail)

        supportActionBar?.setHomeButtonEnabled(true);
    }

    fun savePallet(v: View) {
        startActivity(Intent(this, PalletsDetailsActivity::class.java))
    }
}
