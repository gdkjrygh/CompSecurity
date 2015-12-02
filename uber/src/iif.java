// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;

final class iif extends ify
{

    private long c;

    iif(ThreadFactory threadfactory)
    {
        super(threadfactory);
        c = 0L;
    }

    public final void a(long l)
    {
        c = l;
    }

    public final long e()
    {
        return c;
    }
}
