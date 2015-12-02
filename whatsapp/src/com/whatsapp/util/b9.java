// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.util.concurrent.Callable;

// Referenced classes of package com.whatsapp.util:
//            ao

class b9
    implements Callable
{

    final ao a;

    b9(ao ao1)
    {
        a = ao1;
        super();
    }

    public Void a()
    {
label0:
        {
            synchronized (a)
            {
                if (ao.f(a) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        ao.d(a);
        if (ao.e(a))
        {
            ao.a(a);
            ao.a(a, 0);
        }
        ao1;
        JVM INSTR monitorexit ;
        return null;
        exception;
        ao1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
    {
        return a();
    }
}
