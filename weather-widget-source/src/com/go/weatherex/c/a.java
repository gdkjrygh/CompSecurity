// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.c;

import com.gtp.a.a.b.c;

public class a
{

    private int a;
    private long b;

    public a()
    {
    }

    public void a()
    {
        if (c.a())
        {
            if (b == 0L || System.currentTimeMillis() - b >= 1100L)
            {
                b = System.currentTimeMillis();
                a = 0;
                return;
            }
            a = a + 1;
            if (System.currentTimeMillis() - b >= 1000L)
            {
                c.a("FrameCounter", (new StringBuilder()).append(a).append(" frame per second \n").toString());
                b = System.currentTimeMillis();
                a = 0;
                return;
            }
        }
    }
}
