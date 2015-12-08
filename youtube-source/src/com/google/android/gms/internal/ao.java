// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            am, al

final class ao
    implements Runnable
{

    final al a;
    final am b;

    ao(am am1, al al1)
    {
        b = am1;
        a = al1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (am.a(b))
            {
                if (am.b(b) == -2)
                {
                    break label0;
                }
            }
            return;
        }
        am.a(b, am.c(b));
        if (am.d(b) != null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        b.a(4);
        obj;
        JVM INSTR monitorexit ;
        return;
        a.a(b);
        am.a(b, a);
        obj;
        JVM INSTR monitorexit ;
    }
}
