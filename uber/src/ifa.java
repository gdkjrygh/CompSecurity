// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class ifa extends AtomicLong
    implements ich
{

    private static final long serialVersionUID = 0xef25a88f94f52b91L;
    final ifb a;

    public ifa(ifb ifb1)
    {
        a = ifb1;
    }

    public final long a(int i)
    {
        return addAndGet(-i);
    }

    public final void a(long l)
    {
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (get() != 0x7fffffffffffffffL) goto _L4; else goto _L3
_L3:
        return;
_L4:
        idq.a(this, l);
        a.f();
        return;
_L2:
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
