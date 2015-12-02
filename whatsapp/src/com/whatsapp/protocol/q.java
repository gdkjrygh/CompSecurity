// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cj, bs, 
//            cu, c_

class q extends c
{

    final cj a;
    final String b;
    final cu c;
    final ci d;
    final bs e;

    q(cu cu, cj cj1, String s, ci ci1, bs bs1)
    {
        c = cu;
        a = cj1;
        b = s;
        d = ci1;
        e = bs1;
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
        if (a != null)
        {
            a.a(b);
        }
    }

    public void a(Exception exception)
    {
        if (e != null)
        {
            e.a(exception);
        }
    }
}
