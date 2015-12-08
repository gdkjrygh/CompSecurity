// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.util.Log;

public class j
{

    public static boolean a = false;

    public static void a(String s, String s1)
    {
        if (a)
        {
            Log.d(s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (a)
        {
            Log.w(s, s1, throwable);
        }
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            Log.i(s, s1);
        }
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        Log.e(s, s1, throwable);
    }

    public static void c(String s, String s1)
    {
        if (a)
        {
            Log.w(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        Log.e(s, s1);
    }

}
