// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            ov, aoz, q7, t0

class lh extends Handler
{

    final aoz a;

    lh(aoz aoz1)
    {
        a = aoz1;
        super();
    }

    public void handleMessage(Message message)
    {
        c4 c4_1;
        boolean flag;
        flag = ov.e;
        c4_1 = (c4)message.obj;
        message.what;
        JVM INSTR tableswitch 3 7: default 52
    //                   3 53
    //                   4 68
    //                   5 104
    //                   6 140
    //                   7 162;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        aoz.c(a).a(c4_1);
        if (!flag) goto _L1; else goto _L3
_L3:
        aoz.b(a).c(c4_1.y.a);
        aoz.c(a).b(c4_1, message.arg1);
        if (!flag) goto _L1; else goto _L4
_L4:
        aoz.c(a).b(c4_1, message.arg1);
        aoz.b(a).d(c4_1.y.a);
        if (!flag) goto _L1; else goto _L5
_L5:
        aoz.b(a).a(c4_1.y.a, false);
        if (!flag) goto _L1; else goto _L6
_L6:
        aoz.c(a).a();
        return;
    }
}
