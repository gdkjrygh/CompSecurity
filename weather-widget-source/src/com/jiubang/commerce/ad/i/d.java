// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.s;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            e, c, b

class d
    implements Runnable
{

    final int a;
    final m b;
    final Context c;
    final String d[];
    final f e;
    final String f;
    final b g;
    final c h;

    d(c c1, int i, m m, Context context, String as[], f f1, String s1, 
            b b1)
    {
        h = c1;
        a = i;
        b = m;
        c = context;
        d = as;
        e = f1;
        f = s1;
        g = b1;
        super();
    }

    public void run()
    {
        s s1;
        Handler handler;
        try
        {
            Looper.prepare();
        }
        catch (Exception exception)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]loadFaceBookAdInfo:looper error:").append(exception.getMessage()).toString());
        }
        s1 = new s();
        s1.a(60000L, new e(this));
        handler = new Handler(Looper.myLooper());
        com.jiubang.commerce.ad.i.c.a(h, c, d, -1, e, new a(), f, handler, s1, g, b);
        try
        {
            Looper.loop();
            return;
        }
        catch (Exception exception1)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]loadFaceBookAdInfo:Looper.loop() error:").append(exception1.getMessage()).toString());
        }
    }
}
