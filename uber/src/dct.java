// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dct
    implements Runnable
{

    final dcs a;
    private final cis b;

    public dct(dcs dcs1, cis cis1)
    {
        a = dcs1;
        super();
        b = cis1;
    }

    public final void run()
    {
label0:
        {
            synchronized (dcs.h(a))
            {
                if (dcs.i(a) != null)
                {
                    break label0;
                }
            }
            return;
        }
        dcs.j(a);
        obj = b.a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        dcs.k(a).c(new ciz());
_L1:
        handler;
        JVM INSTR monitorexit ;
        return;
        obj;
        handler;
        JVM INSTR monitorexit ;
        throw obj;
        a.a(((com.ubercab.android.location.UberLocation) (obj)));
          goto _L1
    }
}
