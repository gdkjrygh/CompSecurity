// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            g

class h extends Handler
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (g.a(a) && (message.obj instanceof Context))
        {
            a.d((Context)message.obj);
            if (a.b && !a.a)
            {
                a.a((Context)message.obj);
                return;
            }
            if (!a.b && a.a)
            {
                a.b((Context)message.obj);
                return;
            }
            if (a.b && a.a)
            {
                a.c();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
