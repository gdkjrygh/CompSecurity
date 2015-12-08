// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.Context;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;

public class aa
{

    public static void a(Context context, String s, String s1)
    {
        if (!"widget_theme_ts_ap".equals(s) && !"widget_theme_ad_ap".equals(s))
        {
            throw new IllegalArgumentException("bad dealId...");
        } else
        {
            s = new a(93, s);
            s.c("1");
            s.d(s1);
            q.a(context.getApplicationContext()).a(s);
            return;
        }
    }
}
