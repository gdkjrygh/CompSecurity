// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.weather.dal2.system:
//            TwcBus

private static final class <init>
    implements ThreadFactory
{

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable, "BusEvent");
        runnable.setDaemon(true);
        return runnable;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
