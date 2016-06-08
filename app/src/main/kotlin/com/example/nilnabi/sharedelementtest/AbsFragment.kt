package com.example.nilnabi.sharedelementtest

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by nilnabi on 2016/06/09.
 */
abstract class AbsFragment: Fragment() {

    /**
     * レイアウトリソース設定
     */
    abstract @LayoutRes fun getLayoutResource(): Int

    override fun onCreateView(
            inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(getLayoutResource(), container, false)
    }

}