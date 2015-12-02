// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class igc extends AtomicBoolean
    implements icl
{

    private static final long serialVersionUID = 0x36e5888d681586eL;
    final ifz a;
    final igm b;

    public igc(ifz ifz1, igm igm1)
    {
        a = ifz1;
        b = igm1;
    }

    public final void b()
    {
        if (compareAndSet(false, true))
        {
            b.b(a);
        }
    }

    public final boolean c()
    {
        return a.c();
    }
}
