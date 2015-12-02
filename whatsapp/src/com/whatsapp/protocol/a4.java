// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, c8, 
//            c_

class a4 extends c
{

    final cu a;
    final Runnable b;
    final ci c;

    a4(cu cu1, Runnable runnable, ci ci1)
    {
        a = cu1;
        b = runnable;
        c = ci1;
        super();
    }

    public void a(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
        a.b.f(i);
    }

    public void a(c_ c_, String s)
    {
        if (b != null)
        {
            b.run();
        }
    }
}
