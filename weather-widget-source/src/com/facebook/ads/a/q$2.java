// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

// Referenced classes of package com.facebook.ads.a:
//            q, z, l, y, 
//            k

class 
    implements 
{

    final q a;

    public void a(AdError aderror)
    {
        q.e(a).c();
        if (q.f(a) != null)
        {
            q.f(a).onError(q.d(a), aderror);
        }
    }

    public void a(l l1)
    {
        e e;
        q.e(a).c();
        e = l1.d();
        if (e == null || !(e instanceof y)) goto _L2; else goto _L1
_L1:
        q.e(a).a((y)e);
        q.a(a, (y)e);
        if (q.f(a) != null)
        {
            q.f(a).onAdLoaded(q.d(a));
        }
        q.a(a, l1.c());
_L4:
        return;
_L2:
        if (e != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (q.f(a) != null)
        {
            AdListener adlistener = q.f(a);
            com.facebook.ads.AdView adview = q.d(a);
            if (l1.e() != null)
            {
                l1 = l1.e();
            } else
            {
                l1 = AdError.INTERNAL_ERROR;
            }
            adlistener.onError(adview, l1);
        }
        if (q.b(a) != null)
        {
            q.b(a).a("on no fill");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (q.f(a) != null)
        {
            q.f(a).onError(q.d(a), AdError.INTERNAL_ERROR);
        }
        if (q.b(a) != null)
        {
            q.b(a).a("on internal error");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    r(q q1)
    {
        a = q1;
        super();
    }
}
