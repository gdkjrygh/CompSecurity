// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

static final class zzHD
    implements ThreadFactory
{

    private final AtomicInteger zzHC = new AtomicInteger(1);
    final String zzHD;

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AdWorker(").append(zzHD).append(") #").append(zzHC.getAndIncrement()).toString());
    }

    er(String s)
    {
        zzHD = s;
        super();
    }
}
