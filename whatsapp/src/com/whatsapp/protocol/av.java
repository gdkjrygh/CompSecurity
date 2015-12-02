// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, bs, cu, 
//            c_

class av extends c
{

    final cu a;
    final bs b;
    final Runnable c;
    final ci d;

    av(cu cu, Runnable runnable, ci ci1, bs bs1)
    {
        a = cu;
        c = runnable;
        d = ci1;
        b = bs1;
        super();
    }

    public void a(int i)
    {
        if (d != null)
        {
            d.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        if (c != null)
        {
            c.run();
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
