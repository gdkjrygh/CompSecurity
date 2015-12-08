// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.lang.reflect.Method;

// Referenced classes of package com.gau.go.a.f:
//            d

public class c
{

    public static float a = 1.0F;
    public static int b;
    public static int c;
    public static int d;
    public static float e;
    public static int f = 15;
    public static int g;
    public static float h = -1F;
    public static float i = -1F;
    private static Class j = null;
    private static Method k = null;
    private static Method l = null;

    public static int a(float f1)
    {
        return (int)(a * f1 + 0.5F);
    }

    public static void a(Context context)
    {
        if (context == null || context.getResources() == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        a = displaymetrics.density;
        e = displaymetrics.scaledDensity;
        c = displaymetrics.widthPixels;
        d = displaymetrics.heightPixels;
        b = displaymetrics.densityDpi;
        if (com.gau.go.a.f.d.c(context))
        {
            g = b(context) - d;
        }
        try
        {
            context = ViewConfiguration.get(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("DrawUtils", (new StringBuilder()).append("resetDensity has error").append(context.getMessage()).toString());
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        f = context.getScaledTouchSlop();
    }

    public static int b(Context context)
    {
        int i1;
        if (context != null)
        {
            context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            int j1;
            try
            {
                if (j == null)
                {
                    j = Class.forName("android.view.Display");
                }
                if (l == null)
                {
                    l = j.getMethod("getRealHeight", new Class[0]);
                }
                i1 = ((Integer)l.invoke(context, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                i1 = 0;
            }
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (i1 == 0)
        {
            j1 = d;
        }
        return j1;
    }

}
