// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import com.facebook.ads.AdView;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            m

class o
    implements Runnable
{

    final AdView a;
    final m b;

    o(m m, AdView adview)
    {
        b = m;
        a = adview;
        super();
    }

    public void run()
    {
        a.loadAd();
    }
}
