package com.example.githubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Change 1
        //Change comment in versioniung
        Log.d("Versioning Changes in versioning branch","Tag...1")
        //Versioning branch
    }
}