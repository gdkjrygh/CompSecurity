// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;


public final class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    private static final aa c[];

    private aa(String s, int i)
    {
        super(s, i);
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/gau/go/launcherex/gowidget/weather/globalview/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])c.clone();
    }

    static 
    {
        a = new aa("DEFAULT_STYLE", 0);
        b = new aa("BLUE_STYLE", 1);
        c = (new aa[] {
            a, b
        });
    }
}
