// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class dcq
{

    private int a;
    private final int b;

    protected dcq()
    {
        this((byte)0);
    }

    private dcq(byte byte0)
    {
        a = 0;
        b = 0x7fffffff;
    }

    protected abstract void a();

    protected abstract void b();

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = a;
        a = i + 1;
        if (i != 0) goto _L2; else goto _L1
_L1:
        a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a <= b) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException("ConnectionManager can not have connection count that exceeds the max.");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = a - 1;
        a = i;
        if (i != 0) goto _L2; else goto _L1
_L1:
        b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a >= 0) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException("ConnectionManager can not have a negative connection count.");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
