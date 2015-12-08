// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            b, e

class c extends Handler
{

    final String a;
    final e b;
    final String c;
    final String d;
    final b e;

    c(b b1, String s, e e1, String s1, String s2)
    {
        e = b1;
        a = s;
        b = e1;
        c = s1;
        d = s2;
        super();
    }

    public void handleMessage(Message message)
    {
        message = (Drawable)message.obj;
        com.gtp.go.weather.sharephoto.photo.b.a(e).put(a, new SoftReference(message));
        b.a(message, a, c, d);
    }
}
