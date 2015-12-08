// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.os.Handler;
import com.jiubang.core.c.a.a;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            c, h, g, k

class f extends Thread
{

    final a a;
    final k b;
    final c c;

    f(c c1, a a1, k k)
    {
        c = c1;
        a = a1;
        b = k;
        super();
    }

    public void run()
    {
        android.graphics.Bitmap bitmap = com.gtp.go.weather.sharephoto.d.h.a(com.gtp.go.weather.sharephoto.d.c.a(c), a.a());
        com.gtp.go.weather.sharephoto.d.c.b(c).post(new g(this, bitmap));
    }
}
