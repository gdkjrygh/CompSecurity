// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzqo, zzqd, zzqn

public class zzqp
{

    private boolean mClosed;
    private String zzaLc;
    private final ScheduledExecutorService zzaMX;
    private ScheduledFuture zzaMZ;

    public zzqp()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzqp(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        zzaLc = s;
    }

    zzqp(ScheduledExecutorService scheduledexecutorservice)
    {
        zzaMZ = null;
        zzaLc = null;
        zzaMX = scheduledexecutorservice;
        mClosed = false;
    }

    public void zza(Context context, zzqd zzqd, long l, zzqn zzqn)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.zzaB("ResourceLoaderScheduler: Loading new resource.");
        if (zzaMZ == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zzaLc == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = new zzqo(context, zzqd, zzqn, zzaLc);
_L1:
        zzaMZ = zzaMX.schedule(context, l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new zzqo(context, zzqd, zzqn);
          goto _L1
    }
}
