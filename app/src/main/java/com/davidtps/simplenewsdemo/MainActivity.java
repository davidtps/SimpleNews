package com.davidtps.simplenewsdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.davidtps.simplenewsdemo.bean.NewsEntity;
import com.davidtps.simplenewsdemo.okhttp.OkHttpUtils;
import com.davidtps.simplenewsdemo.okhttp.callback.JsonCallback;
import com.davidtps.simplenewsdemo.ui.BaseAppCompatActivity;
import com.davidtps.simplenewsdemo.utils.LogUtils;
import com.davidtps.simplenewsdemo.utils.Urls;

import okhttp3.Call;

public class MainActivity extends BaseAppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private Fragment content_fragment;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    protected void initDatas() {

    }

    @Override
    protected void initListener() {

    }

    public void showFragment(Fragment fragment,String cusTitle){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, fragment).commit();
        toolbar.setTitle(cusTitle);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Snackbar snackbar = Snackbar.make(navigationView, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Snackbar.make(navigationView, "ActionClick", Snackbar.LENGTH_LONG).show();
                        }
                    });
            setSnackbarMessageTextColor(snackbar, Color.parseColor("#FFFFFF"));
            snackbar.show();


        } else if (id == R.id.nav_gallery) {
            getRequest();
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //设置snackbar的文字颜色和背景颜色
    public static void setSnackbarMessageTextColor(Snackbar snackbar, int color) {
        View view = snackbar.getView();
        view.setBackgroundColor(Color.parseColor("#037BFF"));
        ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(color);
    }


    public void getRequest() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Urls.TOP_URL).append(Urls.TOP_ID);
        stringBuffer.append("/").append(0).append(Urls.END_URL);
        String url = stringBuffer.toString();
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new JsonCallback<NewsEntity>() {

                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(NewsEntity response) {
                        LogUtils.d("Main",response.getT1348647909107().get(0).getTitle());
                    }
                });
    }
}
