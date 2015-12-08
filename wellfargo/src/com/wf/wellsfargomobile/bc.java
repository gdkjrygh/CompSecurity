// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            ba, BaseWebViewActivity

class bc
    implements Runnable
{

    final long a;
    final int b;
    final Runnable c;
    final ba d;

    bc(ba ba1, long l, int i, Runnable runnable)
    {
        d = ba1;
        a = l;
        b = i;
        c = runnable;
        super();
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        wait(a);
        this;
        JVM INSTR monitorexit ;
_L2:
        if (ba.a(d).e() == b)
        {
            ba.a(d).runOnUiThread(c);
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception) { }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
