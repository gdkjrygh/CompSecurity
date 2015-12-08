// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;

public class g
{

    public static String a(Context context)
    {
        return Proxy.getHost(context);
    }

    public static int b(Context context)
    {
        return Proxy.getPort(context);
    }

    public static boolean c(Context context)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.getType() == 0 && (Proxy.getDefaultHost() != null || Proxy.getHost(context) != null);
    }
}
