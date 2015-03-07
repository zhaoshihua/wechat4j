package com.wisedu.wechat4j.examples.oauth;

import com.wisedu.wechat4j.api.Wechat;
import com.wisedu.wechat4j.client.WechatFactory;
import com.wisedu.wechat4j.entity.ResponseAccessToken;

public class GetToken {
    public static void main(String args[]) throws Exception {
        Wechat wechat = new WechatFactory().getInstance();
        ResponseAccessToken token = wechat.getAccessToken();
        if (token.getResponse().getErrCode() == 0){
            System.out.println("Get Token Succeed." + token);
        } else {
            System.err.println("Get Token Failed." + token);
        }
    }
}
