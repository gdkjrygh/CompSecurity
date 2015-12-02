// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, bs, cu, 
//            c_

class p extends c
{

    final ci a;
    final bs b;
    final cu c;
    final Runnable d;

    p(cu cu, Runnable runnable, ci ci1, bs bs1)
    {
        c = cu;
        d = runnable;
        a = ci1;
        b = bs1;
        super();
    }

    public void a(int i)
    {
        if (a != null)
        {
            a.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        if (d != null)
        {
            d.run();
        }
    }

    public void a(Exception exception)
    {
        if (b != null)
        {
            b.a(exception);
        }
    }
}
