package com.bestar.local.scenery

import android.graphics.Bitmap
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bestar.local.R
import com.bestar.local.model.response.BlockEntity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.SimpleTarget

/**
 * Created by lxx  on 2018/1/31
 */
class SceneryHolderView constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var ivBg = itemView.findViewById<ImageView>(R.id.iv_big_bg)
    private var tvContent = itemView.findViewById<TextView>(R.id.contentTv)!!

     fun updateView(entity: BlockEntity){
        tvContent.text = entity.content
        val img = entity.image_list[0].bigImage
         Glide.with(itemView).asBitmap().load(img).into(ivBg)

         Glide.with(itemView).asBitmap().load(img).into(object : SimpleTarget<Bitmap>() {
            override fun onResourceReady(resource: Bitmap, glideAnimation: BitmapGlideAnimation) {
               if (resource!=null){

               }
             }
         })
    }

}