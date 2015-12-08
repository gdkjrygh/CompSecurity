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
//            zzqy, zzqn, zzqx

public class zzqz
{

    private boolean mClosed;
    private String zzaPw;
    private final ScheduledExecutorService zzaRr;
    private ScheduledFuture zzaRt;

    public zzqz()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzqz(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        zzaPw = s;
    }

    zzqz(ScheduledExecutorService scheduledexecutorservice)
    {
        zzaRt = null;
        zzaPw = null;
        zzaRr = scheduledexecutorservice;
        mClosed = false;
    }

    public void zza(Context context, zzqn zzqn, long l, zzqx zzqx)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.v("ResourceLoaderScheduler: Loading new resource.");
        if (zzaRt == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zzaPw == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = new zzqy(context, zzqn, zzqx, zzaPw);
_L1:
        zzaRt = zzaRr.schedule(context, l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new zzqy(context, zzqn, zzqx);
          goto _L1
    }
}
