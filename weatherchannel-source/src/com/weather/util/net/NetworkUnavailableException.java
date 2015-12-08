// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;


public class NetworkUnavailableException extends Exception
{

    private static final long serialVersionUID = 0x442db637f19dfd32L;
    private final String url;

    public NetworkUnavailableException(String s)
    {
        super(s);
        url = s;
    }

    public String getUrl()
    {
        return url;
    }

    public String toString()
    {
        return (new StringBuilder()).append("NetworkUnavailableException [url=").append(url).append(']').toString();
    }
}
