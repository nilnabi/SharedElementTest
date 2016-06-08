package com.example.nilnabi.sharedelementtest

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton?
        fab!!.setOnClickListener(View.OnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() })

        val url = "http://www.at-x.com/images/program/f6efdec7d161ac9cc86695319ed55137.jpg"

        val image = findViewById(R.id.first_image) as ImageView
        image.setOnClickListener {
            startActivity(
                    Intent().apply {
                        setClass(applicationContext, SecondActivity::class.java)
                    },
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            image,
                            image.transitionName
                    ).toBundle()
            )
        }

        Picasso.with(applicationContext)
                .load(url)
                .into(image)

    }



}


