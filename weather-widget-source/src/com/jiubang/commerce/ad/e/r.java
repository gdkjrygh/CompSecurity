// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.database.a.a;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            q

class r
    implements Runnable
{

    final int a;
    final String b;
    final q c;

    r(q q1, int i, String s)
    {
        c = q1;
        a = i;
        b = s;
        super();
    }

    public void run()
    {
        a a1 = new a();
        a1.a(a);
        a1.a(b);
        a1.a(System.currentTimeMillis());
        com.jiubang.commerce.database.b.a.a(com.jiubang.commerce.ad.e.q.a(c)).a(a1);
    }
}
