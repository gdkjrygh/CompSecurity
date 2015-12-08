// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.d;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    private static final c i[];

    private c(String s, int j)
    {
        super(s, j);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/wf/wellsfargomobile/d/c, s);
    }

    public static c[] values()
    {
        return (c[])i.clone();
    }

    static 
    {
        a = new c("GET", 0);
        b = new c("POST", 1);
        c = new c("OPTIONS", 2);
        d = new c("HEAD", 3);
        e = new c("PUT", 4);
        f = new c("DELETE", 5);
        g = new c("TRACE", 6);
        h = new c("CONNECT", 7);
        i = (new c[] {
            a, b, c, d, e, f, g, h
        });
    }
}
