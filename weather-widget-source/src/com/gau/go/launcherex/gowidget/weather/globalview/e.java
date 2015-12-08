// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static final e d[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/gau/go/launcherex/gowidget/weather/globalview/e, s);
    }

    public static e[] values()
    {
        return (e[])d.clone();
    }

    static 
    {
        a = new e("DEFAULT_STYLE", 0);
        b = new e("BLUE_STYLE", 1);
        c = new e("BLUE_STYLE_LAYOUT2", 2);
        d = (new e[] {
            a, b, c
        });
    }
}
