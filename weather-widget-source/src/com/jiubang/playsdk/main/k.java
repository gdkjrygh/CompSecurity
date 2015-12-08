// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;


// Referenced classes of package com.jiubang.playsdk.main:
//            g

class k
    implements Runnable
{

    final g a;

    k(g g1)
    {
        a = g1;
        super();
    }

    public void run()
    {
        if (g.c(a))
        {
            a.b();
        }
    }
}
