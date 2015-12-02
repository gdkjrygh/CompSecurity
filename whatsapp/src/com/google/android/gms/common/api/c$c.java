// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, c

class Kn extends Handler
{

    final c Kn;

    public void handleMessage(Message message)
    {
        int i = Api.a;
        message.what;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 61
    //                   2 72;
           goto _L1 _L2 _L3
_L1:
        Log.w("GoogleApiClientImpl", (new StringBuilder()).append("Unknown message id: ").append(message.what).toString());
_L4:
        return;
_L2:
        c.i(Kn);
        if (i == 0) goto _L4; else goto _L3
_L3:
        c.j(Kn);
        if (i == 0) goto _L4; else goto _L1
    }

    (c c1, Looper looper)
    {
        Kn = c1;
        super(looper);
    }
}
