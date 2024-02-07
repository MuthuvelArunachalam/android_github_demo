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

        //Change comment in versioniung 2
        Log.d("Versioning Changes in versioning branch","Tag...2")
        //Versioning branch

        //Change comment in versioniung 3
        Log.d("Versioning Changes in versioning branch","Tag...3")
        //Versioning branch
        //Dev Branch Changes
        Log.e("Dev Branch Changes","Tag...1 Dev")

        Log.e("Dev Branch First Changes","tag Cherry pick one")

        Log.e("Versioning push","push")
    }
}