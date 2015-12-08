// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.b;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.jiubang.playsdk.b:
//            b

public class a extends Thread
{

    private static final AtomicInteger a = new AtomicInteger();
    private static final AtomicInteger b = new AtomicInteger();

    public a(Runnable runnable)
    {
        this(runnable, "SDKThread");
    }

    public a(Runnable runnable, String s)
    {
        super(runnable, (new StringBuilder()).append(s).append("-").append(a.incrementAndGet()).toString());
        setUncaughtExceptionHandler(new b(this));
    }

    public void run()
    {
        b.incrementAndGet();
        super.run();
        b.decrementAndGet();
        return;
        Exception exception;
        exception;
        b.decrementAndGet();
        throw exception;
    }

}
