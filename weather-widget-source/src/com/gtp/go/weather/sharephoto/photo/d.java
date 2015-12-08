// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            b

class d extends Thread
{

    final boolean a;
    final Context b;
    final String c;
    final Handler d;
    final b e;

    d(b b1, boolean flag, Context context, String s, Handler handler)
    {
        e = b1;
        a = flag;
        b = context;
        c = s;
        d = handler;
        super();
    }

    public void run()
    {
        Object obj;
        if (a)
        {
            obj = com.gtp.go.weather.sharephoto.photo.b.b(b, c, com.gtp.go.weather.sharephoto.photo.b.b(e));
        } else
        {
            obj = com.gtp.go.weather.sharephoto.photo.b.a(b, c, com.gtp.go.weather.sharephoto.photo.b.b(e));
        }
        obj = d.obtainMessage(0, obj);
        d.sendMessage(((android.os.Message) (obj)));
    }
}
