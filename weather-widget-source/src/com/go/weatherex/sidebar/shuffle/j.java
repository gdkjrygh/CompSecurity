// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import com.facebook.ads.NativeAd;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            g

class j
    implements Runnable
{

    final NativeAd a;
    final g b;

    j(g g1, NativeAd nativead)
    {
        b = g1;
        a = nativead;
        super();
    }

    public void run()
    {
        g.a(b, System.currentTimeMillis());
        a.loadAd();
    }
}
