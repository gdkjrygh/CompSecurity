// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hzt
{

    static hzs a;
    static long b;

    private hzt()
    {
    }

    static hzs a()
    {
        hzt;
        JVM INSTR monitorenter ;
        hzs hzs1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        hzs1 = a;
        a = hzs1.f;
        hzs1.f = null;
        b -= 2048L;
        hzt;
        JVM INSTR monitorexit ;
        return hzs1;
        hzt;
        JVM INSTR monitorexit ;
        return new hzs();
        Exception exception;
        exception;
        hzt;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(hzs hzs1)
    {
        if (hzs1.f != null || hzs1.g != null)
        {
            throw new IllegalArgumentException();
        }
        if (hzs1.d)
        {
            return;
        }
        hzt;
        JVM INSTR monitorenter ;
        if (b + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        hzt;
        JVM INSTR monitorexit ;
        return;
        hzs1;
        hzt;
        JVM INSTR monitorexit ;
        throw hzs1;
        b += 2048L;
        hzs1.f = a;
        hzs1.c = 0;
        hzs1.b = 0;
        a = hzs1;
        hzt;
        JVM INSTR monitorexit ;
    }
}
