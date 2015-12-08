// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import org.apache.http.HttpHost;

public class c
{

    public static HttpHost a(Context context)
    {
        String s1 = Proxy.getHost(context);
        String s = s1;
        if (s1 == null)
        {
            s = Proxy.getDefaultHost();
        }
        return new HttpHost(s, Proxy.getPort(context));
    }

    public static int b(Context context)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || networkinfo.getState() != android.net.NetworkInfo.State.CONNECTING && networkinfo.getState() != android.net.NetworkInfo.State.CONNECTED)
        {
            return -1;
        }
        if (networkinfo.getType() == 1)
        {
            return 1;
        }
        if (networkinfo.getType() == 0)
        {
            return Proxy.getDefaultHost() == null && Proxy.getHost(context) == null ? 3 : 2;
        } else
        {
            return -1;
        }
    }
}
