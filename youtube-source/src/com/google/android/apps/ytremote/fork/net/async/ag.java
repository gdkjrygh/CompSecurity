// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;


// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            c, d, b, ah

public final class ag
    implements c
{

    private final d a;
    private b b;

    public ag(d d1)
    {
        b = null;
        if (d1 == null)
        {
            throw new NullPointerException("alarmRegistry cannot be null");
        } else
        {
            a = d1;
            return;
        }
    }

    public final void a(long l, ah ah1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            throw new IllegalStateException("setExpiration() is called but a previous alarm has not expired yet");
        }
        break MISSING_BLOCK_LABEL_24;
        ah1;
        this;
        JVM INSTR monitorexit ;
        throw ah1;
        b = a.a(l, ah1, this);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 != b)
        {
            throw new IllegalStateException((new StringBuilder("Unknown alarm expired: ")).append(b1).toString());
        }
        break MISSING_BLOCK_LABEL_39;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        b = null;
        this;
        JVM INSTR monitorexit ;
        ((ah)b1.c()).a(this);
        return;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        String s = "ResettableAlarm[No alarm]";
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = (new StringBuilder("ResettableAlarm[")).append(b.toString()).append("]").toString();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
