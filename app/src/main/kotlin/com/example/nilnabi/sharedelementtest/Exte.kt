package com.example.nilnabi.sharedelementtest

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by nilnabi on 2016/06/09.
 */


fun AppCompatActivity.replaceFramgnet(targetId: Int, fragment: Fragment) {
    supportFragmentManager.beginTransaction().apply {
        replace(targetId, fragment)
        commit()
    }
}