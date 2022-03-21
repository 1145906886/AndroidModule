package com.example.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.BaseActivity;
import com.example.base.ITest;
import com.example.base.RouteUtils;


@Route(path = RouteUtils.HOME1)
public class Home1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home1_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ITest test = ARouter.getInstance().navigation(ITest.class);
                Toast.makeText(Home1Activity.this, test.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
