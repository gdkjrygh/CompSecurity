// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.contextlogic.wish.http:
//            WishHttpClient

static class priority
    implements ThreadFactory
{

    private priority pool;
    private int priority;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setName((new StringBuilder()).append(pool.pool()).append(runnable.getId()).toString());
        Process.setThreadPriority(priority);
        return runnable;
    }

    public ( )
    {
        pool = ;
        if ( == )
        {
            priority = 9;
            return;
        }
        if ( == priority)
        {
            priority = 8;
            return;
        }
        if ( == priority)
        {
            priority = 7;
            return;
        }
        if ( == priority)
        {
            priority = 6;
            return;
        } else
        {
            priority = 10;
            return;
        }
    }
}
