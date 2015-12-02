// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.net.NetworkInfo;

public final class au
{

    private final boolean a;
    private final int b;
    private final boolean c;

    public au(boolean flag, boolean flag1, int i)
    {
        a = flag;
        c = flag1;
        b = i;
    }

    public static au a(NetworkInfo networkinfo)
    {
        if (networkinfo != null)
        {
            return new au(networkinfo.isConnected(), networkinfo.isRoaming(), networkinfo.getType());
        } else
        {
            return new au(false, false, -1);
        }
    }

    public int a()
    {
        return b;
    }
}
