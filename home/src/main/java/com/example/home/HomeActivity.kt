package com.example.home

import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.BaseActivity
import com.example.base.RouteUtils

@Route(path = RouteUtils.HOME)
class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)
        findViewById<View>(R.id.tv).setOnClickListener {
            ARouter.getInstance().build(RouteUtils.HOME1).navigation()
        }
    }
}