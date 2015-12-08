// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.d;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

public class aa
{

    private Context a;
    private e b;
    private a c;

    public aa(Context context)
    {
        a = context.getApplicationContext();
        b = e.a(a);
        b.a(com.gtp.a.a.b.c.a());
        c = com.gtp.a.a.a.a.a();
    }

    public void a(String s)
    {
        com.gtp.a.a.b.c.a("StatisticsManager", (new StringBuilder()).append("ThemeStatisticsHandler.postUploadPotentailInstalled").append(s).toString());
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(a, s))
        {
            d d1 = new d(a);
            d1.e = s;
            d1.f = "b000";
            b.a(d1.a());
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append("[\u64CD\u4F5C\uFF1A");
            stringbuffer.append("\u5B89\u88C5\u4E3B\u9898");
            stringbuffer.append(s);
            stringbuffer.append("] ");
            stringbuffer.append("[\u4E0A\u4F20\u4FE1\u606F\uFF1A");
            stringbuffer.append(d1.a());
            stringbuffer.append("]");
            c.a(stringbuffer.toString(), "theme_statistics.txt");
        }
    }
}
