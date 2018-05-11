package com.bestar.local.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by lxx  on 2018/1/31
 */
class MainAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm){

     var fragmentList: MutableList<Fragment> = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment:Fragment){
        fragmentList.add(fragment)
    }
}