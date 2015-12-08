// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class j
{

    public static float a = 1.0F;
    public static int b;
    public static int c;
    public static int d;
    public static int e = 15;
    public static float f = -1F;
    public static float g = -1F;

    public static int a(float f1)
    {
        return (int)(a * f1 + 0.5F);
    }

    public static void a(Context context)
    {
        if (context != null && context.getResources() != null)
        {
            context = context.getResources().getDisplayMetrics();
            a = ((DisplayMetrics) (context)).density;
            c = ((DisplayMetrics) (context)).widthPixels;
            d = ((DisplayMetrics) (context)).heightPixels;
            b = ((DisplayMetrics) (context)).densityDpi;
        }
    }

}
