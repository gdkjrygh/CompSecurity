// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcl, zzbg, zzbf, zzs

class zzcm
    implements zzp.zze
{
    static interface zza
    {

        public abstract zzcl zza(zzs zzs);
    }

    static interface zzb
    {

        public abstract ScheduledExecutorService zzzm();
    }


    private boolean mClosed;
    private final Context mContext;
    private String zzaKV;
    private final String zzaKy;
    private zzbf zzaMU;
    private zzs zzaMV;
    private final ScheduledExecutorService zzaMX;
    private final zza zzaMY;
    private ScheduledFuture zzaMZ;

    public zzcm(Context context, String s, zzs zzs)
    {
        this(context, s, zzs, null, null);
    }

    zzcm(Context context, String s, zzs zzs, zzb zzb1, zza zza1)
    {
        zzaMV = zzs;
        mContext = context;
        zzaKy = s;
        context = zzb1;
        if (zzb1 == null)
        {
            context = new zzb() {

                final zzcm zzaNa;

                public ScheduledExecutorService zzzm()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                zzaNa = zzcm.this;
                super();
            }
            };
        }
        zzaMX = context.zzzm();
        if (zza1 == null)
        {
            zzaMY = new zza() {

                final zzcm zzaNa;

                public zzcl zza(zzs zzs1)
                {
                    return new zzcl(zzcm.zza(zzaNa), zzcm.zzb(zzaNa), zzs1);
                }

            
            {
                zzaNa = zzcm.this;
                super();
            }
            };
            return;
        } else
        {
            zzaMY = zza1;
            return;
        }
    }

    static Context zza(zzcm zzcm1)
    {
        return zzcm1.mContext;
    }

    static String zzb(zzcm zzcm1)
    {
        return zzcm1.zzaKy;
    }

    private zzcl zzeC(String s)
    {
        zzcl zzcl1 = zzaMY.zza(zzaMV);
        zzcl1.zza(zzaMU);
        zzcl1.zzem(zzaKV);
        zzcl1.zzeB(s);
        return zzcl1;
    }

    private void zzzl()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed)
        {
            throw new IllegalStateException("called method after closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzzl();
        if (zzaMZ != null)
        {
            zzaMZ.cancel(false);
        }
        zzaMX.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zza(zzbf zzbf)
    {
        this;
        JVM INSTR monitorenter ;
        zzzl();
        zzaMU = zzbf;
        this;
        JVM INSTR monitorexit ;
        return;
        zzbf;
        throw zzbf;
    }

    public void zzem(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzzl();
        zzaKV = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void zzf(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.zzaB((new StringBuilder()).append("loadAfterDelay: containerId=").append(zzaKy).append(" delay=").append(l).toString());
        zzzl();
        if (zzaMU == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (zzaMZ != null)
        {
            zzaMZ.cancel(false);
        }
        zzaMZ = zzaMX.schedule(zzeC(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }
}
