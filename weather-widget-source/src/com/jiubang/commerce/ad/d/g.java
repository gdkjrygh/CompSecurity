// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import com.jiubang.commerce.utils.b;
import java.util.TimerTask;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            e, h, f

class g extends TimerTask
{

    final e a;

    private g(e e1)
    {
        a = e1;
        super();
    }

    g(e e1, f f)
    {
        this(e1);
    }

    public void run()
    {
        boolean flag;
        e.a(a, System.currentTimeMillis());
        flag = b.e(e.a(a), "com.android.vending");
        if (com.jiubang.commerce.ad.d.e.b(a) || !flag) goto _L2; else goto _L1
_L1:
        e.c(a).b();
_L4:
        e.a(a, flag);
        return;
_L2:
        if (com.jiubang.commerce.ad.d.e.b(a) && !flag)
        {
            e.c(a).c();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
