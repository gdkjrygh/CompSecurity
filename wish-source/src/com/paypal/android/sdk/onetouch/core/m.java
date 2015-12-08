// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class m
{

    private final Context a;

    public m(Context context)
    {
        a = context;
    }

    public final void a(Class class1)
    {
        ActivityInfo aactivityinfo[];
        ActivityInfo activityinfo;
        int i;
        int j;
        try
        {
            aactivityinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 1).activities;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException((new StringBuilder("Exception loading manifest")).append(class1.getMessage()).toString());
        }
        if (aactivityinfo == null) goto _L2; else goto _L1
_L1:
        j = aactivityinfo.length;
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        activityinfo = aactivityinfo[i];
        if (activityinfo.name.equals(class1.getName()) && activityinfo.getThemeResource() != 0x1030010)
        {
            throw new RuntimeException((new StringBuilder("Theme for ")).append(class1.getName()).append(" should be \"@android:style/Theme.Translucent.NoTitleBar\"").toString());
        }
        i++;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
