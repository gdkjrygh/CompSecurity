// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;


// Referenced classes of package com.jiubang.commerce.ad.d:
//            n, l

class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void run()
    {
        a.a(new n(this));
    }
}
