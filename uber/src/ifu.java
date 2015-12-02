// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class ifu extends ici
{

    static final int a;
    private static final igh c;
    final ifw b = new ifw();

    public ifu()
    {
    }

    static igh c()
    {
        return c;
    }

    public final icj a()
    {
        return new ifv(b.a());
    }

    public final icl a(idd idd)
    {
        return b.a().b(idd, -1L, TimeUnit.NANOSECONDS);
    }

    static 
    {
        int i;
label0:
        {
            c = new igh("RxComputationThreadPool-");
            int j = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
            int k = Runtime.getRuntime().availableProcessors();
            if (j > 0)
            {
                i = j;
                if (j <= k)
                {
                    break label0;
                }
            }
            i = k;
        }
        a = i;
    }
}
