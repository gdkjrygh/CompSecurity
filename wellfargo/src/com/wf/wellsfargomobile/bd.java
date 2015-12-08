// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import java.util.concurrent.ExecutorService;

// Referenced classes of package com.wf.wellsfargomobile:
//            ba

class bd
    implements Runnable
{

    final Runnable a;
    final ba b;

    bd(ba ba1, Runnable runnable)
    {
        b = ba1;
        a = runnable;
        super();
    }

    public void run()
    {
        ba.b(b).execute(a);
    }
}
