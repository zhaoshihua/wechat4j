package com.wisedu.wechat4jv2.enity;

import com.wisedu.wechat4jv2.internal.json.JSONObject;

public interface Response {
    Integer getErrCode();

    String getErrMsg();

    JSONObject getObject();
}
