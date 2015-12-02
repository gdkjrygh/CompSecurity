// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, bs, cu, 
//            c_

class ag extends c
{

    final bs a;
    final Runnable b;
    final ci c;
    final cu d;

    ag(cu cu, Runnable runnable, ci ci1, bs bs1)
    {
        d = cu;
        b = runnable;
        c = ci1;
        a = bs1;
        super();
    }

    public void a(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        if (b != null)
        {
            b.run();
        }
    }

    public void a(Exception exception)
    {
        if (a != null)
        {
            a.a(exception);
        }
    }
}
