// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.c.a;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            al, an, ao

class am
    implements Runnable
{

    final ao a;
    final al b;

    am(al al1, ao ao)
    {
        b = al1;
        a = ao;
        super();
    }

    public void run()
    {
        if (!com.jiubang.commerce.ad.e.al.a(b))
        {
            al.b(b);
        }
        if (al.c(b) && com.jiubang.commerce.ad.e.al.a(b, al.d(b)))
        {
            com.jiubang.commerce.ad.e.al.a(b, al.e(b));
        }
        com.jiubang.commerce.c.a.a(new an(this));
    }
}
