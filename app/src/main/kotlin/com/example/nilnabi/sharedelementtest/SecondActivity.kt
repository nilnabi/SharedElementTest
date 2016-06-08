package com.example.nilnabi.sharedelementtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val url = "http://www.at-x.com/images/program/f6efdec7d161ac9cc86695319ed55137.jpg"

        val image = findViewById(R.id.second_image) as ImageView
        Picasso.with(applicationContext)
                .load(url)
                .fit()
                .into(image)
    }
}
