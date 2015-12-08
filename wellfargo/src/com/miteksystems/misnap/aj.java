// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;

// Referenced classes of package com.miteksystems.misnap:
//            t

final class aj
    implements Runnable
{

    final t a;

    aj(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        long l = System.currentTimeMillis() - t.r(a);
        t.m(a).postDelayed(t.s(a), 70L);
        t.t(a);
        float f = Math.abs((float)Math.abs(300L - l) / 300F);
        if (l < 600L)
        {
            t.a(a, t.a(a, t.u(a), 1.0F - (1.0F - f) * 0.1F));
            a.postInvalidate();
            return;
        } else
        {
            t.m(a).removeCallbacks(t.s(a));
            t.a(a, t.a(a, t.u(a), 1.0F));
            a.postInvalidate();
            t.v(a);
            return;
        }
    }
}
