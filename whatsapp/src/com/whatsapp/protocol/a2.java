// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, c8, 
//            bs, c_

class a2 extends c
{

    final cu a;
    final String b;
    final ci c;
    final bs d;
    final Runnable e;

    a2(cu cu1, Runnable runnable, ci ci1, String s, bs bs1)
    {
        a = cu1;
        e = runnable;
        c = ci1;
        b = s;
        d = bs1;
        super();
    }

    public void a(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
        a.b.a(i, b);
    }

    public void a(c_ c_, String s)
    {
        if (e != null)
        {
            e.run();
        }
    }

    public void a(Exception exception)
    {
        if (d != null)
        {
            d.a(exception);
        }
    }
}
