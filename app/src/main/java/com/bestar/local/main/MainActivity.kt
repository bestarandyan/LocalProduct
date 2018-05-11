package com.bestar.local.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.bestar.local.R
import com.bestar.local.mine.MineFragment
import com.bestar.local.msg.MsgFragment
import com.bestar.local.products.ProductsFragment
import com.bestar.local.scenery.SceneryFragment
import com.bestar.local.share.ShareFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                viewPager.setCurrentItem(0,true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_scenery -> {
                viewPager.setCurrentItem(1,true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_msg -> {
                viewPager.setCurrentItem(2,true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_share -> {
                viewPager.setCurrentItem(3,true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_mine -> {
                viewPager.setCurrentItem(4,true)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        initViewPager()
    }

   private fun initViewPager(){
        var mainAdapter = MainAdapter(supportFragmentManager).apply {
            addFragment(ProductsFragment())
            addFragment(SceneryFragment())
            addFragment(MsgFragment())
            addFragment(ShareFragment())
            addFragment(MineFragment())
        }
        viewPager.adapter = mainAdapter
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {
                navigation.selectedItemId = navigation.menu.getItem(position).itemId
            }

        })
    }
}
