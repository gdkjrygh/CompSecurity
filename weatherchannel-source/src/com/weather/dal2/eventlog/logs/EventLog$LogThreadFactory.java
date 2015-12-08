// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            EventLog

private static class <init>
    implements ThreadFactory
{

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, "EventLog");
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
