// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.f;

import com.jiubang.commerce.ad.d.h;

// Referenced classes of package com.jiubang.commerce.ad.f:
//            c, b

public class a
    implements h
{

    private b a;
    private volatile boolean b;
    private long c;
    private c d;

    public void a()
    {
        d.a();
    }

    public void b()
    {
        b = true;
        a.a();
    }

    public void c()
    {
        b = false;
        c = System.currentTimeMillis();
    }
}
