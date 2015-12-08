// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;


public final class r extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    private static final r e[];

    private r(String s, int i)
    {
        super(s, i);
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(com/android/a/r, s);
    }

    public static r[] values()
    {
        r ar[] = e;
        int i = ar.length;
        r ar1[] = new r[i];
        System.arraycopy(ar, 0, ar1, 0, i);
        return ar1;
    }

    static 
    {
        a = new r("LOW", 0);
        b = new r("NORMAL", 1);
        c = new r("HIGH", 2);
        d = new r("IMMEDIATE", 3);
        e = (new r[] {
            a, b, c, d
        });
    }
}
