// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class igb extends AtomicBoolean
    implements icl
{

    private static final long serialVersionUID = 0x36e5888d681586eL;
    final ifz a;
    final iiy b;

    public igb(ifz ifz1, iiy iiy1)
    {
        a = ifz1;
        b = iiy1;
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
