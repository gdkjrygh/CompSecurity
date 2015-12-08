// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.gau.a.a.b:
//            d

class j
    implements Runnable
{

    final d a;

    j(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
_L2:
        if (d.d(a))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = d.e(a);
        obj;
        JVM INSTR monitorenter ;
        if (!d.f(a).isEmpty())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        long l = d.g(a);
        d.c(a).postDelayed(d.h(a), l);
        Exception exception;
        try
        {
            d.e(a).wait();
        }
        catch (InterruptedException interruptedexception) { }
        d.i(a);
        if (true) goto _L2; else goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        d.a(a, null);
        return;
    }
}
