package com.example.nilnabi.sharedelementtest

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by nilnabi on 2016/06/09.
 */

@BindingAdapter("thumbnail_image_from_url")
fun thumbnailImageFromUrl(imageView: ImageView, url: String?) {

    url?.let {
        Picasso.with(imageView.context)
                .load(url)
                .into(imageView);
    }
}