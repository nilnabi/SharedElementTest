package com.example.nilnabi.sharedelementtest

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.nilnabi.sharedelementtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        val url = "http://www.at-x.com/images/program/f6efdec7d161ac9cc86695319ed55137.jpg"

        val name = intent.extras.getString("image")

        binding.setVariable(BR.url, url)
        binding.setVariable(BR.name, name)

        binding.executePendingBindings()
    }

}
