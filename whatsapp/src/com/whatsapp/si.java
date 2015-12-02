// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;

// Referenced classes of package com.whatsapp:
//            App, dc, akd

class si extends Handler
{

    final dc a;

    si(dc dc1)
    {
        a = dc1;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        message.what;
        JVM INSTR tableswitch 1 5: default 44
    //                   1 85
    //                   2 157
    //                   3 45
    //                   4 74
    //                   5 63;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L4:
        dc.a(a, (Runnable)message.obj);
        if (i == 0) goto _L1; else goto _L6
_L6:
        dc.b(a);
        if (i == 0) goto _L1; else goto _L5
_L5:
        dc.b(a);
        if (i == 0) goto _L1; else goto _L2
_L2:
        dc.a(a, (akd)((Pair)message.obj).first);
        dc.a(a, 1);
        message = (Runnable)((Pair)message.obj).second;
        if (message != null)
        {
            message.run();
        }
        removeMessages(5);
        sendEmptyMessageDelayed(5, 60000L);
        if (i == 0) goto _L1; else goto _L3
_L3:
        dc.a(a, null);
        dc.a(a, 2);
        return;
    }
}
