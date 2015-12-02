// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.whatsapp.util:
//            i

public final class x
{

    private static final ThreadPoolExecutor a;
    private static final BlockingQueue b;
    private static final ThreadFactory c;

    public static void a(Runnable runnable)
    {
        a.execute(runnable);
    }

    static 
    {
        b = new LinkedBlockingQueue(2048);
        c = new i();
        a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, c);
    }
}
