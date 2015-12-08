// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import com.facebook.ads.NativeAd;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            g

class k
    implements Runnable
{

    final NativeAd a;
    final g b;

    k(g g, NativeAd nativead)
    {
        b = g;
        a = nativead;
        super();
    }

    public void run()
    {
        if (a != null)
        {
            a.destroy();
        }
    }
}
