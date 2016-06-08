package com.example.nilnabi.sharedelementtest

import android.app.ActivityOptions
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nilnabi.sharedelementtest.databinding.FragmentMainBinding

/**
 * Created by nilnabi on 2016/06/09.
 */
class MainFragment : AbsFragment() {

    lateinit var binding: FragmentMainBinding

    override fun getLayoutResource(): Int {
        return R.layout.fragment_main
    }

    override fun onCreateView(
            inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.bind<FragmentMainBinding>(view)
        return binding.root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        val url = "http://www.at-x.com/images/program/f6efdec7d161ac9cc86695319ed55137.jpg"

        binding.setVariable(BR.url, url)
        binding.setVariable(BR.name, url)


        binding.firstImage.setOnClickListener {
            startActivity(
                    Intent().apply {
                        setClass(activity.applicationContext, SecondActivity::class.java)
                        putExtra("image", it.transitionName)
                    },
                    ActivityOptions.makeSceneTransitionAnimation(
                            activity,
                            it,
                            it.transitionName
                    ).toBundle()
            )
        }

    }


}