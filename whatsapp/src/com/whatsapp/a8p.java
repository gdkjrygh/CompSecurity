// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            ov, aoz, q7

class a8p extends Handler
{

    final aoz a;

    a8p(aoz aoz1)
    {
        a = aoz1;
        super();
    }

    public void handleMessage(Message message)
    {
        c4 c4_1;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = ov.e;
        c4_1 = (c4)message.obj;
        message.what;
        JVM INSTR lookupswitch 3: default 56
    //                   2: 57
    //                   10: 90
    //                   11: 74;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        a.d(c4_1, message.arg1);
        if (!flag1) goto _L1; else goto _L4
_L4:
        aoz.c(a).c(c4_1);
        if (!flag1) goto _L1; else goto _L3
_L3:
        q7 q7_1 = aoz.c(a);
        if (message.arg1 != 1)
        {
            flag = false;
        }
        q7_1.a(c4_1, flag);
        return;
    }
}
