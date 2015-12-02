// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c_

class e extends c
{

    final Runnable a;
    final cu b;

    e(cu cu1, Runnable runnable)
    {
        b = cu1;
        a = runnable;
        super();
    }

    public void a(c_ c_)
    {
        cu.d(b).f();
    }

    public void a(c_ c_, String s)
    {
        cu.d(b).f();
        if (a != null)
        {
            a.run();
        }
    }
}
