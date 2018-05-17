package com.bestar.local.scenery

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bestar.local.model.response.BlockEntity
import com.bestar.local.R
/**
 * Created by lxx  on 2018/1/31
 */
class SceneryAdapter constructor(context: Context, list:ArrayList<BlockEntity>) :  RecyclerView.Adapter<SceneryHolderView>(){
    var mList = list
    var mContext = context;
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SceneryHolderView {
        var itemView = LayoutInflater.from(mContext).inflate(R.layout.lv_block_list_skill,null)
        return SceneryHolderView(itemView)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: SceneryHolderView, position: Int) {
        holder.updateView(this.mList[position])
    }
}