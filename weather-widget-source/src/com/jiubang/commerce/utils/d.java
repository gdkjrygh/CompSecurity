// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.lang.reflect.Method;

public class d
{

    public static float a = 1.0F;
    public static int b;
    public static float c;
    public static int d = -1;
    public static int e = -1;
    public static int f = -1;
    public static int g = -1;
    public static float h = -1F;
    public static float i = -1F;
    public static int j;
    private static Class k = null;
    private static Method l = null;
    private static Method m = null;

    public static int a(float f1)
    {
        return (int)(a * f1 + 0.5F);
    }

    public static void a(Context context)
    {
        com/jiubang/commerce/utils/d;
        JVM INSTR monitorenter ;
        if (context == null) goto _L2; else goto _L1
_L1:
        if (context.getResources() == null) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = context.getResources().getDisplayMetrics();
        a = ((DisplayMetrics) (obj)).density;
        c = ((DisplayMetrics) (obj)).scaledDensity;
        b = ((DisplayMetrics) (obj)).densityDpi;
        obj = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        d = ((Display) (obj)).getWidth();
        e = ((Display) (obj)).getHeight();
        Class class1 = Class.forName("android.view.Display");
        Point point = new Point();
        class1.getMethod("getRealSize", new Class[] {
            android/graphics/Point
        }).invoke(obj, new Object[] {
            point
        });
        f = point.x;
        g = point.y;
_L5:
        context = ViewConfiguration.get(context);
        if (context == null) goto _L2; else goto _L4
_L4:
        j = context.getScaledTouchSlop();
_L2:
        com/jiubang/commerce/utils/d;
        JVM INSTR monitorexit ;
        return;
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
        f = d;
        g = e;
          goto _L5
        context;
        throw context;
        context;
        context.printStackTrace();
          goto _L2
    }

    public static int b(Context context)
    {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int c(Context context)
    {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

}
