// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.mapbar.android.location:
//            b

final class c extends Handler
{

    private b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 37
    //                   1 46
    //                   2 55
    //                   3 64;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        b.a(a, 0);
        return;
_L3:
        b.a(a, 1);
        return;
_L4:
        b.a(a, 2);
        return;
_L5:
        if (b.a(a) != null)
        {
            a.a(b.a(a));
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
