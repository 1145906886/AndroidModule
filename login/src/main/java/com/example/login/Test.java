package com.example.login;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.base.ITest;
import com.example.base.RouteUtils;

@Route(path = RouteUtils.Service_User)
public class Test implements ITest {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public void init(Context context) {

    }
}
