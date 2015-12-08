// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.mapbar.android.location:
//            b, g, k

final class a extends Handler
{

    private a a;

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 29
    //                   2 101;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (b.e(a.a) && g.b)
        {
            try
            {
                b.a(a.a, b.c(a.a), 0);
                b.a(a.a, b.c(a.a), 1);
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.f(a.a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b.e(a.a) && k.a(b.b(a.a)).b())
        {
            b.g(a.a);
            b.a((short)1000);
        } else
        {
            b.a((short)10000);
        }
        message = b.h(a.a);
        message = b.a(a.a, message);
        if (!"".equals(message) && !message.equals(b.i(a.a)))
        {
            b.b(a.a, message);
            k.a(b.b(a.a)).c();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    ( )
    {
        a = ;
        super();
    }
}
