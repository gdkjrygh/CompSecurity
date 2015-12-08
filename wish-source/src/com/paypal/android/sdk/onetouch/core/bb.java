// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bc, cl, bd

public class bb
{

    private static final String a = com/paypal/android/sdk/onetouch/core/bb.getSimpleName();
    private final List b = new ArrayList();

    public bb()
    {
    }

    public final void a(bd bd1)
    {
label0:
        {
            synchronized (b)
            {
                Iterator iterator = b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((bc)iterator.next()).a != bd1);
                (new StringBuilder("Ignoring attempt to re-register listener ")).append(bd1);
            }
            return;
        }
        b.add(new bc(this, bd1));
        list;
        JVM INSTR monitorexit ;
        return;
        bd1;
        list;
        JVM INSTR monitorexit ;
        throw bd1;
    }

    public final void a(cl cl1, long l)
    {
        (new StringBuilder("dispatching ")).append(cl1.n());
        if (cl1.o() >= 0L) goto _L2; else goto _L1
_L1:
        (new StringBuilder("discarding ")).append(cl1.n());
_L4:
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        List list = b;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); arraylist.add(0, (bc)iterator1.next())) { }
        break MISSING_BLOCK_LABEL_110;
        cl1;
        list;
        JVM INSTR monitorexit ;
        throw cl1;
        list;
        JVM INSTR monitorexit ;
        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()) 
        {
            ((bc)iterator.next()).a.a(cl1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
