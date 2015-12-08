// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import com.sessionm.net.RequestQueue;
import java.util.List;

// Referenced classes of package com.sessionm.core:
//            i

class >
    implements Runnable
{

    final i fv;
    final String fw[];

    public void run()
    {
        i j = fv;
        j;
        JVM INSTR monitorenter ;
        String as[];
        int l;
        i.a(fv).start();
        as = fw;
        l = as.length;
        int k = 0;
_L2:
        String s;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        s = as[k];
        if (i.b(fv).contains(s) && !i.c(fv).contains(s))
        {
            i.a(fv, s);
        }
        break MISSING_BLOCK_LABEL_92;
        j;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        j;
        JVM INSTR monitorexit ;
        throw exception;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    stQueue(i j, String as[])
    {
        fv = j;
        fw = as;
        super();
    }
}
