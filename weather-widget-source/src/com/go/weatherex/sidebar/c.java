// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.sidebar:
//            b

class c extends Handler
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 105;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (message.arg1 == 1)
        {
            b.a(a, b.a(a));
            b.a(a, b.a(a), 1);
            return;
        }
        if (message.arg1 == 2)
        {
            b.a(a, b.b(a));
            b.a(a, b.b(a), 2);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (message.arg1 == 1)
        {
            b.a(a, 1);
            return;
        }
        if (message.arg1 == 2)
        {
            b.a(a, 2);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
