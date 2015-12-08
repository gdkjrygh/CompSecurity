// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;


// Referenced classes of package com.jiubang.playsdk.imageload:
//            m, j

class n
    implements Runnable
{

    final j a;
    final m b;

    n(m m1, j j)
    {
        b = m1;
        a = j;
        super();
    }

    public void run()
    {
        b.a(a, false);
    }
}
