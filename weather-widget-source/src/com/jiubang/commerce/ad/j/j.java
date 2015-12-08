// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            g

class j extends Thread
{

    final g a;
    private Context b;
    private Handler c;

    public j(g g1, Context context, Handler handler)
    {
        a = g1;
        super();
        b = context;
        c = handler;
    }

    public void run()
    {
        setName("CheckGooglePlayThread");
        a.b = a.e(b);
        if (g.a(a))
        {
            Message message = new Message();
            message.what = 1;
            message.obj = b;
            c.sendMessageDelayed(message, 1000L);
        }
    }
}
