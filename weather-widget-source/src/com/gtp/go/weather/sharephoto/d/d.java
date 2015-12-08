// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.os.Handler;

// Referenced classes of package com.gtp.go.weather.sharephoto.d:
//            c, h, e, b, 
//            k

class d extends Thread
{

    final String a;
    final b b;
    final k c;
    final String d;
    final c e;

    d(c c1, String s, b b1, k k, String s1)
    {
        e = c1;
        a = s;
        b = b1;
        c = k;
        d = s1;
        super();
    }

    public void run()
    {
        android.graphics.Bitmap bitmap = h.a(com.gtp.go.weather.sharephoto.d.c.a(e), a, b);
        com.gtp.go.weather.sharephoto.d.c.b(e).post(new e(this, bitmap));
    }
}
