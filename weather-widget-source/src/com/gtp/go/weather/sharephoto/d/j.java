// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;


public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    private static final j d[];

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/gtp/go/weather/sharephoto/d/j, s);
    }

    public static j[] values()
    {
        return (j[])d.clone();
    }

    static 
    {
        a = new j("THUMBNAIL", 0);
        b = new j("ORIGINAL", 1);
        c = new j("WATERMARK", 2);
        d = (new j[] {
            a, b, c
        });
    }
}
