package com.davidtps.simplenewsdemo.okhttp.callback;

import com.davidtps.simplenewsdemo.okhttp.utils.JsonParser;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Response;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class JsonCallback<T> extends Callback<T> {
    @Override
    public T parseNetworkResponse(Response response) throws IOException {

        String content = response.body().string();


        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        T temp = null;
        try {
            temp = JsonParser.deserializeByJson(content, type);
        } catch (com.google.gson.JsonSyntaxException e) {
            e.printStackTrace();
            content = "{\"message\":\"无数据\",\"result\":1101}";
            temp = JsonParser.deserializeByJson(content, type);
        }
        return temp;
    }

}
