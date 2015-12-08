// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;

import org.json.JSONException;
import org.json.JSONObject;

public class EndPoint
{

    public static final String ADDRESS = "addr";
    public static final String CHANNEL = "chan";
    public static final String STATUS = "status";
    private String address;
    private String channel;
    private String status;

    public EndPoint(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        address = s.getString("addr");
        channel = s.getString("chan");
        status = s.getString("status");
    }

    public EndPoint(String s, String s1, String s2)
    {
        address = s;
        channel = s1;
        status = s2;
    }

    public String getAddress()
    {
        return address;
    }

    public String getChannel()
    {
        return channel;
    }

    public String getStatus()
    {
        return status;
    }

    public void setAddress(String s)
    {
        address = s;
    }

    public void setChannel(String s)
    {
        channel = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("addr", address);
        jsonobject.put("chan", channel);
        jsonobject.put("status", status);
        return jsonobject;
    }
}
