// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;


public final class t extends Enum
{

    public static final t a;
    public static final t b;
    public static final t c;
    private static final t d[];

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t a(boolean flag)
    {
        if (flag)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/wf/wellsfargomobile/util/t, s);
    }

    public static t[] values()
    {
        return (t[])d.clone();
    }

    static 
    {
        a = new t("TRUE", 0);
        b = new t("FALSE", 1);
        c = new t("UNKNOWN", 2);
        d = (new t[] {
            a, b, c
        });
    }
}
