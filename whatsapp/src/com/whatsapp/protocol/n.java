// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, c_

class n extends c
{

    final cu a;
    final ci b;
    final Runnable c;

    n(cu cu, Runnable runnable, ci ci1)
    {
        a = cu;
        c = runnable;
        b = ci1;
        super();
    }

    public void a(int i)
    {
        if (b != null)
        {
            b.a(i);
        }
    }

    public void a(c_ c_, String s)
    {
        if (c != null)
        {
            c.run();
        }
    }
}
