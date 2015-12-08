// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;


final class A extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/greendao/Environment$a, s);
    }

    public static A[] values()
    {
        return (A[])m.clone();
    }

    static 
    {
        a = new <init>("ID", 0);
        b = new <init>("ENVTIME", 1);
        c = new <init>("DEVICEID", 2);
        d = new <init>("MANUFACTURER", 3);
        e = new <init>("MODEL", 4);
        f = new <init>("MEMORY", 5);
        g = new <init>("OSVERSION", 6);
        h = new <init>("LANGUAGE", 7);
        i = new <init>("SDKVERSION", 8);
        j = new <init>("TIMEZONE", 9);
        k = new <init>("CARRIER", 10);
        l = new <init>("OSNAME", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private A(String s, int i1)
    {
        super(s, i1);
    }
}
