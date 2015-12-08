// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;

public class CapabilityUtils
{

    private static final String TAG = com/walmart/android/utils/CapabilityUtils.getSimpleName();
    private static final String WEAR_APP_PACKAGE_NAME = "com.google.android.wearable.app";
    private static Boolean sCanMakeCalls;

    public CapabilityUtils()
    {
    }

    public static boolean canMakeCalls(Context context)
    {
        boolean flag1 = false;
        if (sCanMakeCalls == null)
        {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:5551231234"));
            context = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean flag = flag1;
            if (context != null)
            {
                flag = flag1;
                if (!context.isEmpty())
                {
                    flag = true;
                }
            }
            sCanMakeCalls = Boolean.valueOf(flag);
        }
        return sCanMakeCalls.booleanValue();
    }

    public static boolean hasAndroidWearApp(Context context)
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.google.android.wearable.app", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

}
