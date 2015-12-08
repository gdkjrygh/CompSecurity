// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import com.jiubang.commerce.ad.a.b;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            c, a

class d
    implements Runnable
{

    final b a;
    final c b;

    d(c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }

    public void run()
    {
        com.jiubang.commerce.ad.j.a.a(b.a, false);
        com.jiubang.commerce.ad.j.a.a(b.a, a);
    }
}
