// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

static final class zzCq
    implements ThreadFactory
{

    private final AtomicInteger zzCp = new AtomicInteger(1);
    final String zzCq;

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzCq).append(") #").append(zzCp.getAndIncrement()).toString());
    }

    er(String s)
    {
        zzCq = s;
        super();
    }
}
