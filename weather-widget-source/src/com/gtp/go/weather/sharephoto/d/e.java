// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.graphics.Bitmap;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            d, k

class e
    implements Runnable
{

    final Bitmap a;
    final d b;

    e(d d1, Bitmap bitmap)
    {
        b = d1;
        a = bitmap;
        super();
    }

    public void run()
    {
        k k1 = b.c;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1.a(flag, b.d, a, "");
    }
}
