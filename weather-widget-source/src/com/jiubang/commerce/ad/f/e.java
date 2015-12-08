// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.f;

import com.jiubang.commerce.b.c;

// Referenced classes of package com.jiubang.commerce.ad.f:
//            d, f

class e
    implements Runnable
{

    final int a;
    final Integer b;
    final d c;

    e(d d1, int i, Integer integer)
    {
        c = d1;
        a = i;
        b = integer;
        super();
    }

    public void run()
    {
        int i;
        if (-1 == a)
        {
            i = 0;
        } else
        {
            i = a;
        }
        if (b != null)
        {
            com.jiubang.commerce.b.c.a(d.a(c), d.a[i], b.intValue());
        }
        i;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 81
    //                   1 104
    //                   2 127
    //                   3 150;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        if (d.b(c) != null)
        {
            d.b(c).b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (d.b(c) != null)
        {
            d.b(c).c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (d.b(c) != null)
        {
            d.b(c).d();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (d.b(c) != null)
        {
            d.b(c).e();
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
