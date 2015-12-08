// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gtp.a.a.a.a;

public class f
{

    public static void a(String s)
    {
        com.gtp.a.a.a.a.a().a(s, "android_wear_log.txt");
    }

    public static boolean a(Context context)
    {
        return r.a(context.getApplicationContext(), "com.google.android.wearable.app");
    }
}
