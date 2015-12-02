// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.os.Handler;

// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase

class i
    implements Runnable
{

    final ImageViewTouchBase a;
    final Runnable b;
    final float c;
    final float d;
    final float e;
    final long f;
    final float g;
    final float h;

    i(ImageViewTouchBase imageviewtouchbase, float f1, long l, float f2, float f3, float f4, 
            float f5, Runnable runnable)
    {
        a = imageviewtouchbase;
        g = f1;
        f = l;
        c = f2;
        e = f3;
        h = f4;
        d = f5;
        b = runnable;
        super();
    }

    public void run()
    {
        long l = System.currentTimeMillis();
        float f1 = Math.min(g, l - f);
        float f2 = c;
        float f3 = e;
        a.a(f2 + f3 * f1, h, d);
        if (b != null)
        {
            b.run();
        }
        if (f1 < g)
        {
            a.i.post(this);
        }
    }
}
