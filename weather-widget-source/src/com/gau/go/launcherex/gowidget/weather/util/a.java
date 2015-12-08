// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import java.util.ArrayList;

public class a
{

    public final ArrayList a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;

    public a()
    {
        a = new ArrayList();
        e = true;
        d();
    }

    private a(String s, String s1)
    {
        a = new ArrayList();
        e = true;
        c = s1;
        b = s;
    }

    private a(String s, String s1, boolean flag)
    {
        a = new ArrayList();
        e = true;
        c = s1;
        b = s;
        d = flag;
    }

    private a(String s, String s1, boolean flag, boolean flag1)
    {
        a = new ArrayList();
        e = true;
        c = s1;
        b = s;
        d = flag1;
        e = flag;
    }

    private void d()
    {
        a.add(new a("com.android.deskclock", "AlarmClock"));
        a.add(new a("com.sec.android.app.clockpackage", "ClockPackage"));
        a.add(new a("com.htc.android.worldclock", "WorldClockTabControl"));
        a.add(new a("com.android.alarmclock", "AlarmClock", true));
        a.add(new a("com.android.clock", "Clock", true));
        a.add(new a("com.android.deskclock", "DeskClock", true));
        a.add(new a("zte.com.cn.alarmclock", "AlarmClock", true));
        a.add(new a("com.google.android.deskclock", "com.android.deskclock.AlarmClock", false, false));
        a.add(new a("com.google.android.deskclock", "com.android.deskclock.DeskClock", false, false));
        a.add(new a("com.motorola.blur.alarmclock", "AlarmClock"));
        a.add(new a("com.lge.clock", "Clock", true));
        a.add(new a("com.baidu.baiduclock", "BaiduClock", true));
    }

    public String a()
    {
        return b;
    }

    public boolean b()
    {
        return d;
    }

    public String c()
    {
        if (e)
        {
            return (new StringBuilder()).append(b).append(".").append(c).toString();
        } else
        {
            return c;
        }
    }
}
