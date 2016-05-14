package com.davidtps.simplenewsdemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by davidtps on 2015/10/18 0018.
 */
public abstract class BaseAppCompatActivity extends AppCompatActivity {

    protected Activity currentView_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main_frame_layout);
        currentView_ = this;

            setContentView();
            initViews();
            initDatas();
            initListener();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    protected abstract void setContentView();

    protected abstract void initViews();

    protected abstract void initDatas();

    protected abstract void initListener();






}
