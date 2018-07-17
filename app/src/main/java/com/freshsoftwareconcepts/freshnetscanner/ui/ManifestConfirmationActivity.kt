package com.freshsoftwareconcepts.freshnetscanner.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.freshsoftwareconcepts.freshnetscanner.R

class ManifestConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manifest_confirmation)

        supportActionBar?.setHomeButtonEnabled(true);
    }

    fun okClick(v: View) {
        startActivity(Intent(this, ManifestDetailActivity::class.java))
    }
}