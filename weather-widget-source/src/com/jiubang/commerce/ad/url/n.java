// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.b.c;

public class n
{

    private String a;
    private int b;
    private int c;
    private String d;
    private long e;

    public n()
    {
    }

    public n(int i, int j, String s, String s1, long l)
    {
        b = i;
        c = j;
        a = s;
        d = s1;
        e = l;
    }

    public String a()
    {
        return a;
    }

    public void a(Context context, String s, String s1, String s2)
    {
        com.jiubang.commerce.b.c.a(context, s1, c, t.a().d(), s2, s, String.valueOf(e), d);
    }
}
