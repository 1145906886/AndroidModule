package com.example.androidmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.BaseActivity
import com.example.base.RouteUtils
import com.orhanobut.logger.Logger


class MainActivity : BaseActivity(), View.OnClickListener {
    lateinit var tv1: TextView
    lateinit var tv2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listener = MyVideoPlayListener()
        lifecycle.addObserver(listener)
    }

    override fun onContentChanged() {
        super.onContentChanged()
        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)
        tv1.setOnClickListener(this)
        tv2.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.tv1 -> ARouter.getInstance().build(RouteUtils.HOME).navigation()
            R.id.tv2 -> {}
        }
    }

}

class MyVideoPlayListener : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun initVideo() {
        Logger.d("initVideo")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun startPlay() {
        Logger.d("startPlay")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun pausePlay() {
        Logger.d("pausePlay")
    }

    companion object {
        private const val TAG = "MyVideoPlayListener"
    }
}