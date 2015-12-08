// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.graphics.Bitmap;
import com.jiubang.core.c.a.a;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            f, k

class g
    implements Runnable
{

    final Bitmap a;
    final f b;

    g(f f1, Bitmap bitmap)
    {
        b = f1;
        a = bitmap;
        super();
    }

    public void run()
    {
        b.b.a(true, b.a.a, a, "");
    }
}
