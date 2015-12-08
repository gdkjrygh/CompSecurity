// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf, zzqe

public class zzqg
{
    public static interface zza
    {

        public abstract void zzbo();
    }


    private static zzqg zzaTp;
    private Context mContext;
    private boolean mStarted;
    private final Set zzaTq = new HashSet();
    private TagManager zzaTr;
    private zzqf zzpo;

    zzqg(Context context, TagManager tagmanager)
    {
        zzaTr = null;
        mContext = context;
        zzaTr = tagmanager;
    }

    static Context zza(zzqg zzqg1)
    {
        return zzqg1.mContext;
    }

    static zzqf zza(zzqg zzqg1, zzqf zzqf1)
    {
        zzqg1.zzpo = zzqf1;
        return zzqf1;
    }

    public static zzqg zzaR(Context context)
    {
        zzx.zzv(context);
        if (zzaTp != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzqg;
        JVM INSTR monitorenter ;
        if (zzaTp == null)
        {
            zzaTp = new zzqg(context, TagManager.getInstance(context.getApplicationContext()));
        }
        com/google/android/gms/internal/zzqg;
        JVM INSTR monitorexit ;
_L2:
        return zzaTp;
        context;
        com/google/android/gms/internal/zzqg;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(zzqg zzqg1)
    {
        zzqg1.zzgK();
    }

    private void zzgK()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaTq.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzbo()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void start()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Method start() has already been called");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzpo == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        mStarted = true;
        zzaTr.zzc(zzpo.zzBj(), -1, "admob").setResultCallback(new ResultCallback() {

            final zzqg zzaTs;

            public void onResult(Result result)
            {
                zza((ContainerHolder)result);
            }

            public void zza(ContainerHolder containerholder)
            {
                if (containerholder.getStatus().isSuccess())
                {
                    containerholder = containerholder.getContainer();
                } else
                {
                    containerholder = null;
                }
                containerholder = new zzqe(zzqg.zza(zzaTs), containerholder, zzaTs.zzBn());
                zzqg.zza(zzaTs, containerholder.zzBh());
                zzqg.zzb(zzaTs);
            }

            
            {
                zzaTs = zzqg.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }

    public zzqf zzBn()
    {
        this;
        JVM INSTR monitorenter ;
        zzqf zzqf1 = zzpo;
        this;
        JVM INSTR monitorexit ;
        return zzqf1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzqf zzqf1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        zzqf1;
        this;
        JVM INSTR monitorexit ;
        throw zzqf1;
        zzpo = zzqf1;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaTq.add(zza1);
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        this;
        JVM INSTR monitorexit ;
        throw zza1;
    }
}
