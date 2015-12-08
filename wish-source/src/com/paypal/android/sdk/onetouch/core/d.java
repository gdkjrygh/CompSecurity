// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Build;

public final class d
{

    public d()
    {
    }

    public static String a()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s.equalsIgnoreCase("unknown") || s1.startsWith(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    public static String b()
    {
        return (new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString();
    }
}
