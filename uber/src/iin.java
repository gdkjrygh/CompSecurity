// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iin
    implements idd
{

    private final idd a;
    private final icj b;
    private final long c;

    public iin(idd idd1, icj icj1, long l)
    {
        a = idd1;
        b = icj1;
        c = l;
    }

    public final void a()
    {
        if (!b.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (c <= icj.a())
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = c - icj.a();
        if (l <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedexception);
        }
        if (b.c()) goto _L1; else goto _L3
_L3:
        a.a();
        return;
    }
}
