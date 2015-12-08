// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.e;
import com.jiubang.commerce.ad.h.a;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            l, af, ah

class ai
    implements l
{

    final a a;
    final ah b;

    ai(ah ah1, a a1)
    {
        b = ah1;
        a = a1;
        super();
    }

    public void a(e e1)
    {
        if (e1 == null || e1.a() != 1)
        {
            a.p.a(0);
            return;
        } else
        {
            b b1 = new b();
            b1.a(com.jiubang.commerce.ad.e.ah.a(b), e1);
            a.p.a(false, b1);
            return;
        }
    }
}
