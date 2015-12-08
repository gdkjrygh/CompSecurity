// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            ak, ai

public class aj
{

    private List a;
    private List b;

    private aj()
    {
        a = Collections.synchronizedList(new ArrayList());
        b = Collections.synchronizedList(new ArrayList());
    }

    aj(byte byte0)
    {
        this();
    }

    public static aj a()
    {
        return ak.a();
    }

    private void b()
    {
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b.isEmpty())
        {
            ai ai1 = (ai)b.get(0);
            b.remove(0);
            a.add(ai1);
            (new Thread(ai1)).start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(ai ai1)
    {
        b.add(ai1);
        if (a.size() < 3)
        {
            b();
        }
    }

    public final void b(ai ai1)
    {
        a.remove(ai1);
        b();
    }

    static 
    {
        com/paypal/android/sdk/onetouch/core/aj.getSimpleName();
    }
}
