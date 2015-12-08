// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzns

private static class <init>
    implements ThreadFactory
{

    private static final AtomicInteger zzaEp = new AtomicInteger();

    public Thread newThread(Runnable runnable)
    {
        return new <init>(runnable, (new StringBuilder()).append("measurement-").append(zzaEp.incrementAndGet()).toString());
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
