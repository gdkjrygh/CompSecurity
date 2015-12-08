// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;


public final class p extends Enum
{

    public static final p a;
    public static final p b;
    public static final p c;
    private static final p d[];

    private p(String s, int i)
    {
        super(s, i);
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/go/weatherex/common/p, s);
    }

    public static p[] values()
    {
        return (p[])d.clone();
    }

    static 
    {
        a = new p("PENDING", 0);
        b = new p("RUNNING", 1);
        c = new p("FINISHED", 2);
        d = (new p[] {
            a, b, c
        });
    }
}
