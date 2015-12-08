// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a;

import com.gau.a.a.f.b;

// Referenced classes of package com.gau.a.a:
//            b

class d
    implements Runnable
{

    final com.gau.a.a.b a;

    d(com.gau.a.a.b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        synchronized (b.a(a))
        {
            b.a("testBattery, Begin HttpConnectScheduler tick", null);
            com.gau.a.a.b.b(a);
            b.a("testBattery, end HttpConnectScheduler tick", null);
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
