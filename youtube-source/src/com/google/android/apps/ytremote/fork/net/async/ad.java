// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ah, ag, ae, d

public final class ad
    implements ah
{

    private final ag a;
    private long b;
    private ae c;

    public ad(d d)
    {
        b = -1L;
        c = null;
        a = new ag(d);
    }

    public final void a(long l, ae ae1)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid period for PeriodicAlarm (must be positive): ")).append(l).toString());
        }
        this;
        JVM INSTR monitorenter ;
        if (b > 0L)
        {
            throw new IllegalStateException("switchOn() is called when a PeriodicAlarm is already on");
        }
        break MISSING_BLOCK_LABEL_56;
        ae1;
        this;
        JVM INSTR monitorexit ;
        throw ae1;
        b = l;
        c = ae1;
        a.a(b, this);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(ag ag1)
    {
        if (ag1 != a)
        {
            throw new IllegalStateException((new StringBuilder("Unknown ResettableAlarm expired:")).append(ag1).toString());
        }
        c.b();
        this;
        JVM INSTR monitorenter ;
        if (b > 0L)
        {
            a.a(b, this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ag1;
        this;
        JVM INSTR monitorexit ;
        throw ag1;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        if (b <= 0L) goto _L2; else goto _L1
_L1:
        String s = (new StringBuilder("PeriodicAlarm is on with ")).append(a).toString();
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = "PeriodicAlarm is off";
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
