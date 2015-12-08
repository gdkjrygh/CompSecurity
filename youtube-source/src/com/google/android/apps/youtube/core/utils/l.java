// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;

public final class l
{

    public static float a(DisplayMetrics displaymetrics, float f)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(displaymetrics);
        return displaymetrics.density * f;
    }

    public static int a(DisplayMetrics displaymetrics, int i)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(displaymetrics);
        return (int)((double)((float)i * displaymetrics.density) + 0.5D);
    }

    public static boolean a(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static boolean a(Context context, au au1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        boolean flag;
        if (c(context) || a(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && au1.I();
    }

    public static boolean a(au au1)
    {
        return android.os.Build.VERSION.SDK_INT >= 17 && au1.J();
    }

    public static boolean b(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 720;
    }

    public static boolean c(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        context = context.getResources().getDisplayMetrics();
        return Math.min(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels) >= 720;
    }
}
