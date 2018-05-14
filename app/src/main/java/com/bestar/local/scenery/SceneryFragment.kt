package com.bestar.local.scenery

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.bestar.local.Base.BaseFragment
import com.bestar.local.R
import com.bestar.local.model.request.GetSceneryDataRequest
import com.bestar.local.model.response.SceneryResopnse
import com.bestar.recyclerview.BestarRecyclerView
import com.net.app.interfaces.ErrorResponse
import com.net.app.interfaces.RequestInterface
import com.net.app.request.RequestManager
import kotlinx.android.synthetic.main.fragment_scenery.*

/**
 * Created by lxx  on 2018/1/31
 */
class SceneryFragment :BaseFragment(),SwipeRefreshLayout.OnRefreshListener, BestarRecyclerView.PagingableListener, RequestInterface<SceneryResopnse> {

    override fun getViewId(): Int {
        return R.layout.fragment_scenery
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        getData(0)
    }

    override fun initView() {
        recyclerView.isSwipeEnable = true
        recyclerView.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        recyclerView.recyclerView.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        recyclerView.setOnRefreshListener(this)
        recyclerView.setPagingableListener(this)
        recyclerView.setLoadmoreString("玩命加载中...")
    }

    fun getData(page:Int){
        var request = GetSceneryDataRequest()
        request.page = page
        request.pageSize = 20
        request.userId = "37672"
        RequestManager.builder().setResponse(SceneryResopnse::class.java)
                .setRequestListener(this)
                .requestByGet(request)
    }




    override fun onErrorData(p0: ErrorResponse?) {

    }

    override fun onReceivedData(response: SceneryResopnse?) {


    }

    override fun onLoadMoreItems() {
        Toast.makeText(activity,"这是一次上拉加载更多",Toast.LENGTH_LONG).show()
    }

    override fun onRefresh() {
        Toast.makeText(activity,"这是一次下拉刷新",Toast.LENGTH_LONG).show()
    }


}