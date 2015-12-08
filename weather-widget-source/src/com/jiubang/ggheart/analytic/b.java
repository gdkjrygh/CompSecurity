// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.analytic;

import android.content.Context;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.jiubang.core.b.a;

public class b
{

    public static boolean a(Context context)
    {
        return GoWidgetApplication.c(context.getApplicationContext()).a().getBoolean("referrer_info_store_flag", false);
    }

    public static void b(Context context)
    {
        context = GoWidgetApplication.c(context.getApplicationContext()).a().edit();
        context.putBoolean("referrer_info_store_flag", true);
        context.commit();
    }

    public static void c(Context context)
    {
        context = GoWidgetApplication.c(context.getApplicationContext()).a().edit();
        context.putBoolean("referrer_info_store_flag", false);
        context.commit();
    }
}
