// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;


// Referenced classes of package com.go.weatherex.home.current:
//            d, w

class g
    implements Runnable
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        ((w)a.a).b(d.c(a));
        a.l();
    }
}
