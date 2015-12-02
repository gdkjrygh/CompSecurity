// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, bs, cu, 
//            c_

class aj extends c
{

    final bs a;
    final cu b;
    final ci c;

    aj(cu cu, ci ci1, bs bs1)
    {
        b = cu;
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
    }

    public void a(Exception exception)
    {
        if (a != null)
        {
            a.a(exception);
        }
    }
}
