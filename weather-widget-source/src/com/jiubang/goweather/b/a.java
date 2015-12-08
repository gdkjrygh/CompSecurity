// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;


class a
{

    private final String a;
    private final String b;

    public a(String s, String s1)
    {
        if (s == null || "".equals(s))
        {
            throw new IllegalArgumentException("Invalid key");
        } else
        {
            a = s;
            b = s1;
            return;
        }
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }
}
