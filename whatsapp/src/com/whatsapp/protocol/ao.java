// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, cp, 
//            c_

class ao extends c
{

    final Runnable a;
    final ci b;
    final cu c;

    ao(cu cu1, Runnable runnable, ci ci1)
    {
        c = cu1;
        a = runnable;
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
        cu.a(c).a(s);
        if (a != null)
        {
            a.run();
        }
    }
}
