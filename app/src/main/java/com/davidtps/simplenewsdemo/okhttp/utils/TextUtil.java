package com.davidtps.simplenewsdemo.okhttp.utils;

import java.util.Collection;

/** 
 * @author 作者 : davidtps
 * @version 创建时间：2014年5月1日 下午8:08:13 
 */
public class TextUtil {
	
	public static boolean isValidate(String content){
		return content!=null && !"".equals(content.trim());
	}
	
	public static boolean isValidate(Collection<?> list){
		return list != null && list.size() != 0;
	}
}
