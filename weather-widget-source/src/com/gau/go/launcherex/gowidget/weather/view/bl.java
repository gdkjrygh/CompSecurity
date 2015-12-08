// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;


public final class bl extends Enum
{

    public static final bl a;
    public static final bl b;
    private static final bl c[];

    private bl(String s, int i)
    {
        super(s, i);
    }

    public static bl valueOf(String s)
    {
        return (bl)Enum.valueOf(com/gau/go/launcherex/gowidget/weather/view/bl, s);
    }

    public static bl[] values()
    {
        return (bl[])c.clone();
    }

    static 
    {
        a = new bl("CITY", 0);
        b = new bl("THEME_ENTERANCE", 1);
        c = (new bl[] {
            a, b
        });
    }
}
