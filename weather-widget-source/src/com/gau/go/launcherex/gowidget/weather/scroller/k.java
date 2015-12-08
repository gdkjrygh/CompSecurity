// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;


public final class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    private static final k e[];
    int d;

    private k(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/gau/go/launcherex/gowidget/weather/scroller/k, s);
    }

    public static k[] values()
    {
        return (k[])e.clone();
    }

    static 
    {
        a = new k("GLOW", 0, 1);
        b = new k("REBOUND", 1, 2);
        c = new k("GLOW_REBOUND", 2, 3);
        e = (new k[] {
            a, b, c
        });
    }
}
