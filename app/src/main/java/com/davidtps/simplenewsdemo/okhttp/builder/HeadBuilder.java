package com.davidtps.simplenewsdemo.okhttp.builder;


import com.davidtps.simplenewsdemo.okhttp.OkHttpUtils;
import com.davidtps.simplenewsdemo.okhttp.request.OtherRequest;
import com.davidtps.simplenewsdemo.okhttp.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
