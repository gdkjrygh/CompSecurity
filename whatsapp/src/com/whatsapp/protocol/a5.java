// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, cu, cp, 
//            c_

class a5 extends c
{

    final cu a;
    final Runnable b;
    final ci c;

    a5(cu cu1, Runnable runnable, ci ci1)
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
    }

    public void a(c_ c_, String s)
    {
        s = new Vector();
        cu.a(a, c_, s);
        cu.a(a).a();
        if (b != null)
        {
            b.run();
        }
    }
}
