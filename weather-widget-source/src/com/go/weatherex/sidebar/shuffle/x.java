// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.graphics.Bitmap;
import com.facebook.ads.NativeAd;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            w, ShuffleLoadingActivity

class x
    implements Runnable
{

    final NativeAd a;
    final Bitmap b;
    final Bitmap c;
    final w d;

    x(w w1, NativeAd nativead, Bitmap bitmap, Bitmap bitmap1)
    {
        d = w1;
        a = nativead;
        b = bitmap;
        c = bitmap1;
        super();
    }

    public void run()
    {
        ShuffleLoadingActivity.a(d.a, a, b, c);
    }
}
