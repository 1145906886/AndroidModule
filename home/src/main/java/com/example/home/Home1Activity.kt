package com.example.home

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.base.BaseActivity
import com.example.base.RouteUtils

@Route(path = RouteUtils.HOME1)
class Home1Activity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home1_main)
    }
}