// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;

final class iga
    implements icl
{

    final ifz a;
    private final Future b;

    private iga(ifz ifz1, Future future)
    {
        a = ifz1;
        super();
        b = future;
    }

    iga(ifz ifz1, Future future, byte byte0)
    {
        this(ifz1, future);
    }

    public final void b()
    {
        if (a.get() != Thread.currentThread())
        {
            b.cancel(true);
            return;
        } else
        {
            b.cancel(false);
            return;
        }
    }

    public final boolean c()
    {
        return b.isCancelled();
    }
}
