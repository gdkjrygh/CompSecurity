// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.config:
//            DalConfig

public static class user
{

    private final String endPoint;
    private final String path;
    private final String region;
    private final String requestMethod;
    private final String service;
    private final String user;

    public String getEndpoint()
    {
        return endPoint;
    }

    public String getMethod()
    {
        return requestMethod;
    }

    public String getPath()
    {
        return path;
    }

    public String getRegion()
    {
        return region;
    }

    public String getService()
    {
        return service;
    }

    public String getUser()
    {
        return user;
    }

    public boolean hasNullData()
    {
        return requestMethod == null || region == null || endPoint == null || path == null || service == null || user == null;
    }

    ()
    {
        requestMethod = null;
        endPoint = null;
        path = null;
        region = null;
        service = null;
        user = null;
    }

    user(JSONObject jsonobject)
        throws JSONException
    {
        requestMethod = jsonobject.getString("requestMethod");
        endPoint = jsonobject.getString("endPoint");
        path = jsonobject.getString("path");
        region = jsonobject.getString("region");
        service = jsonobject.getString("service");
        user = jsonobject.getString("user");
    }
}
