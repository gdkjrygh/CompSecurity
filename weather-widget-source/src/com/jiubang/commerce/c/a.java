// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.c;

import android.os.Handler;
import android.os.Looper;

public class a
{

    private static Handler a;

    public static void a()
    {
        if (a != null)
        {
            return;
        } else
        {
            a = new Handler(Looper.getMainLooper());
            return;
        }
    }

    public static void a(Runnable runnable)
    {
        if (a == null)
        {
            a();
        }
        a.post(runnable);
    }
}
