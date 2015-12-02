// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class igh
    implements ThreadFactory
{

    static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(igh, "b");
    final String a;
    volatile long b;

    public igh(String s)
    {
        a = s;
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, (new StringBuilder()).append(a).append(c.incrementAndGet(this)).toString());
        runnable.setDaemon(true);
        return runnable;
    }

}
