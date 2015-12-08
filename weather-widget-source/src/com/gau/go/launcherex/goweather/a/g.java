// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    private static final g f[];
    String e;

    private g(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/gau/go/launcherex/goweather/a/g, s);
    }

    public static g[] values()
    {
        return (g[])f.clone();
    }

    static 
    {
        a = new g("SAT_IR4", 0, "sat_ir4");
        b = new g("SAT_IR4_BOTTOM", 1, "sat_ir4_bottom");
        c = new g("SAT_VIS", 2, "sat_vis");
        d = new g("SAT_VIS_BOTTOM", 3, "sat_vis_bottom");
        f = (new g[] {
            a, b, c, d
        });
    }
}
