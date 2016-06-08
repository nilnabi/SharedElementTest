package com.example.nilnabi.sharedelementtest

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import com.example.nilnabi.sharedelementtest.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val url = "http://www.at-x.com/images/program/f6efdec7d161ac9cc86695319ed55137.jpg"

        binding.contentMain.firstImage.setOnClickListener {
            startActivity(
                    Intent().apply {
                        setClass(applicationContext, SecondActivity::class.java)
                    },
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            binding.contentMain.firstImage,
                            binding.contentMain.firstImage.transitionName
                    ).toBundle()
            )
        }

        Picasso.with(applicationContext)
                .load(url)
                .into(binding.contentMain.firstImage)

    }



}


