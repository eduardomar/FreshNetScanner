package com.freshsoftwareconcepts.freshnetscanner

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.freshsoftwareconcepts.freshnetscanner.ui.ManifestConfirmationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        MenuInflater(this).inflate(R.menu.meu_opciones, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.btnArrivals -> {
                startActivity(Intent(this, ManifestConfirmationActivity::class.java))
            }

            R.id.btnShipments -> {
            }

            R.id.btnMovePallets -> {
            }
        }

        return super.onOptionsItemSelected(item)
    }
}