package com.wisedu.wechat4jv2.entity;

import com.wisedu.wechat4jv2.http.HttpResponse;

public class ObjectFactory {
    public Response createResponse(HttpResponse response) {
        return new ResponseJSONImpl(response);
    }

    public AccessToken createAccessToken(String credential, Long expiresIn) {
        return new AccessTokenJSONImpl(credential, expiresIn);
    }

    public ResponseAccessToken createResponseAccessToken(HttpResponse response) {
        return new ResponseAccessTokenJSONImpl(response);
    }

    public ResponseGroup createResponseGroup(HttpResponse response) {
        return new ResponseGroupJSONImpl(response);
    }

    public ResponseGroupCollection createResponseGroupCollection(HttpResponse response) {
        return new ResponseGroupCollectionJSONImpl(response);
    }

    /*public UserCollection createUserCollection(HttpResponse response) {
        return new UserCollectionJSONImpl(response);
    }

    public MenuCollection createMenuCollection(HttpResponse response) {
        return new MenuCollectionJSONImpl(response);
    }*/
}