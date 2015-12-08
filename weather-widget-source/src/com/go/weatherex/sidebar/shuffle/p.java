// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import com.facebook.ads.NativeAd;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            e, ShuffleLoadingActivity

class p
    implements e
{

    final NativeAd a;
    final ShuffleLoadingActivity b;

    p(ShuffleLoadingActivity shuffleloadingactivity, NativeAd nativead)
    {
        b = shuffleloadingactivity;
        a = nativead;
        super();
    }

    public void a()
    {
        b.finish();
        a.destroy();
    }
}
