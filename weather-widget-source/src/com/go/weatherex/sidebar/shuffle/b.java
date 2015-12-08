// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.gau.go.launcherex.gowidget.c.g;
import java.lang.reflect.Method;

public class b
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
    private static Point n = new Point();

    public static int a(float f1)
    {
        return (int)(a * f1 + 0.5F);
    }

    public static void a(Context context)
    {
        com/go/weatherex/sidebar/shuffle/b;
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
        if (!g.a) goto _L5; else goto _L4
_L4:
        ((Display) (obj)).getSize(n);
        d = n.x;
        e = n.y;
_L7:
        Class class1 = Class.forName("android.view.Display");
        Point point = new Point();
        class1.getMethod("getRealSize", new Class[] {
            android/graphics/Point
        }).invoke(obj, new Object[] {
            point
        });
        f = point.x;
        g = point.y;
_L8:
        context = ViewConfiguration.get(context);
        if (context == null) goto _L2; else goto _L6
_L6:
        j = context.getScaledTouchSlop();
_L2:
        com/go/weatherex/sidebar/shuffle/b;
        JVM INSTR monitorexit ;
        return;
_L5:
        d = ((Display) (obj)).getWidth();
        e = ((Display) (obj)).getHeight();
          goto _L7
        context;
        throw context;
        Throwable throwable;
        throwable;
        f = d;
        g = e;
          goto _L8
        context;
        context.printStackTrace();
          goto _L2
    }

    public static int b(float f1)
    {
        return (int)(a * f1);
    }

    public static int b(Context context)
    {
        if (f == -1 || d == -1)
        {
            a(context);
        }
        if (g.b)
        {
            return f;
        } else
        {
            return d;
        }
    }

    public static int c(Context context)
    {
        if (g == -1 || e == -1)
        {
            a(context);
        }
        if (g.b)
        {
            return g;
        } else
        {
            return e;
        }
    }

}
