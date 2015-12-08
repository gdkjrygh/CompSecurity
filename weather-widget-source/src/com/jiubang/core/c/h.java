// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    private static final h d[];

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/jiubang/core/c/h, s);
    }

    public static h[] values()
    {
        return (h[])d.clone();
    }

    static 
    {
        a = new h("PENDING", 0);
        b = new h("RUNNING", 1);
        c = new h("FINISHED", 2);
        d = (new h[] {
            a, b, c
        });
    }
}
