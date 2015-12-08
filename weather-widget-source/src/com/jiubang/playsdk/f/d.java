// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.util.Log;

public class d
{

    private static boolean a = false;

    public static int a(String s, String s1)
    {
        if (a)
        {
            return Log.d(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int a(String s, String s1, Throwable throwable)
    {
        if (a)
        {
            return Log.d(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static boolean a()
    {
        return a;
    }

}
