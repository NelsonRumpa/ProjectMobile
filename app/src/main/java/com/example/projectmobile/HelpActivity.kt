package com.example.projectmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        if(intent.extras != null){
            var bundle : Bundle ?= intent.extras
            var strTes : String = bundle?.getString("tesText").toString()
            Snackbar.make(getWindow().getDecorView().getRootView(),strTes, Snackbar.LENGTH_LONG).show()
        }

    }

    override fun onBackPressed() {
        val mainActivity = Intent(Intent.ACTION_MAIN)
        mainActivity.addCategory(Intent.CATEGORY_HOME)
        mainActivity.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(mainActivity)
        finish()
    }
}