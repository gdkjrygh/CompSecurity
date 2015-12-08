// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

// Referenced classes of package com.facebook.ads.a:
//            ac, l, aa, k

class a
    implements a
{

    final ac a;

    public void a(AdError aderror)
    {
        if (ac.access$000(a) != null)
        {
            ac.access$000(a).onError(a, aderror);
        }
    }

    public void a(l l1)
    {
        if (l1.d() != null && !(l1.d() instanceof aa))
        {
            if (ac.access$000(a) != null)
            {
                ac.access$000(a).onError(a, AdError.INTERNAL_ERROR);
            }
            if (ac.access$100(a) != null)
            {
                ac.access$100(a).a("on internal error");
            }
        } else
        {
            aa aa1 = (aa)l1.d();
            if (aa1 != null)
            {
                ac.access$202(a, aa1);
                ac.access$300(a);
                if (ac.access$000(a) != null)
                {
                    ac.access$000(a).onAdLoaded(a);
                }
                ac.access$402(a, l1.c());
                return;
            }
            if (ac.access$000(a) != null)
            {
                AdListener adlistener = ac.access$000(a);
                ac ac1 = a;
                if (l1.e() != null)
                {
                    l1 = l1.e();
                } else
                {
                    l1 = AdError.INTERNAL_ERROR;
                }
                adlistener.onError(ac1, l1);
            }
            if (ac.access$100(a) != null)
            {
                ac.access$100(a).a("on no fill");
                return;
            }
        }
    }

    (ac ac1)
    {
        a = ac1;
        super();
    }
}
