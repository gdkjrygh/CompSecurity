// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.go.weatherex.ad.c:
//            a, d

class b extends AdListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onAdClosed()
    {
        if (a.b != null)
        {
            a.b.d(a);
        }
    }

    public void onAdFailedToLoad(int i)
    {
        if (a.b != null)
        {
            a.b.a(a);
        }
    }

    public void onAdLoaded()
    {
        if (a.b != null)
        {
            a.b.b(a);
        }
    }

    public void onAdOpened()
    {
        if (a.b != null)
        {
            a.b.c(a);
        }
    }
}
