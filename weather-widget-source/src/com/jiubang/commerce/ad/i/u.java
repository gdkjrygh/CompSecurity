// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            c

public class u
    implements AdListener
{

    private boolean a;
    final c n;

    public u(c c)
    {
        n = c;
        super();
        a = false;
    }

    protected boolean a()
    {
        return a;
    }

    protected void b()
    {
        a = true;
    }

    public void onAdClicked(Ad ad)
    {
    }

    public void onAdLoaded(Ad ad)
    {
    }

    public void onError(Ad ad, AdError aderror)
    {
    }
}
