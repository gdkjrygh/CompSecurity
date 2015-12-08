// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class DeviceUtils
{

    private static final boolean IS_LITTLE_MEMORY;
    private static final double LITTLE_MEMORY_LIMIT_MB = 50D;
    private static final double MAX_MEMORY_MB;

    public DeviceUtils()
    {
    }

    public static double getDensityMultiplier(Context context)
    {
        return (double)context.getResources().getDisplayMetrics().density;
    }

    public static double getMaxMemoryMB()
    {
        return MAX_MEMORY_MB;
    }

    public static int getScreenHeightDips(Context context)
    {
        int i = context.getResources().getDisplayMetrics().heightPixels;
        double d = context.getResources().getDisplayMetrics().density;
        return (int)((double)i / d);
    }

    public static int getScreenWidthDips(Context context)
    {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        double d = context.getResources().getDisplayMetrics().density;
        return (int)((double)i / d);
    }

    public static boolean isLittleMemory()
    {
        return IS_LITTLE_MEMORY;
    }

    static 
    {
        MAX_MEMORY_MB = (double)Runtime.getRuntime().maxMemory() / 1048576D;
        boolean flag;
        if (MAX_MEMORY_MB < 50D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_LITTLE_MEMORY = flag;
    }
}
