package com.davidtps.simplenewsdemo.okhttp.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonParser {
	public static Gson gson = new Gson();

	public static <T> T deserializeByJson(String data,Type type) {
		if (TextUtil.isValidate(data)) {
			return gson.fromJson(data, type);
		}
		return null;
	}
	
	public static <T> T deserializeByJson(String data,Class<T> clz) {
		if (TextUtil.isValidate(data)) {
			return gson.fromJson(data, clz);
		}
		return null;
	}

	public static <T> String serializeToJson(T t) {
		if (t == null) {
			return "";
		}
		return gson.toJson(t);
	}
	
}