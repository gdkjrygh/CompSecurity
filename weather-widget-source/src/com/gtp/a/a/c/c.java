// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Method;

// Referenced classes of package com.gtp.a.a.c:
//            a

public class c
{

    public static boolean a;
    private static Method b = null;

    public static int a(Context context)
    {
        int i;
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        i = displaymetrics.heightPixels;
        if (android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT < 17)
        {
            int j;
            try
            {
                j = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(context, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    context.printStackTrace();
                }
                return i;
            }
            return j;
        }
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        int k;
        Point point = new Point();
        android/view/Display.getMethod("getRealSize", new Class[] {
            android/graphics/Point
        }).invoke(context, new Object[] {
            point
        });
        k = point.y;
        return k;
        context;
        if (com.gtp.a.a.b.c.a())
        {
            context.printStackTrace();
        }
        return i;
    }

    public static File a()
    {
        com.gtp.a.a.b.c.a("Machine", Environment.getExternalStorageDirectory().getAbsolutePath());
        File file = new File(Environment.getExternalStorageDirectory(), "GOWeatherEX");
        if (!file.exists())
        {
            file.mkdir();
        }
        if (!file.isDirectory())
        {
            File file1 = new File("/mnt/emmc/GOWeatherEX");
            file = file1;
            if (!file1.exists())
            {
                file1.mkdir();
                return file1;
            }
        }
        return file;
    }

    public static boolean b()
    {
        return com.gtp.a.a.c.a.a() == 3;
    }

    public static boolean b(Context context)
    {
        int i = context.getResources().getIdentifier("config_enableTranslucentDecor", "bool", "android");
        if (i == 0)
        {
            return false;
        } else
        {
            return context.getResources().getBoolean(i);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
