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

        public abstract ScheduledExecutorService zzAC();
    }


    private boolean mClosed;
    private final Context mContext;
    private final String zzaOS;
    private String zzaPp;
    private zzbf zzaRo;
    private zzs zzaRp;
    private final ScheduledExecutorService zzaRr;
    private final zza zzaRs;
    private ScheduledFuture zzaRt;

    public zzcm(Context context, String s, zzs zzs)
    {
        this(context, s, zzs, null, null);
    }

    zzcm(Context context, String s, zzs zzs, zzb zzb1, zza zza1)
    {
        zzaRp = zzs;
        mContext = context;
        zzaOS = s;
        context = zzb1;
        if (zzb1 == null)
        {
            context = new zzb() {

                final zzcm zzaRu;

                public ScheduledExecutorService zzAC()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                zzaRu = zzcm.this;
                super();
            }
            };
        }
        zzaRr = context.zzAC();
        if (zza1 == null)
        {
            zzaRs = new zza() {

                final zzcm zzaRu;

                public zzcl zza(zzs zzs1)
                {
                    return new zzcl(zzcm.zza(zzaRu), zzcm.zzb(zzaRu), zzs1);
                }

            
            {
                zzaRu = zzcm.this;
                super();
            }
            };
            return;
        } else
        {
            zzaRs = zza1;
            return;
        }
    }

    private void zzAB()
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

    static Context zza(zzcm zzcm1)
    {
        return zzcm1.mContext;
    }

    static String zzb(zzcm zzcm1)
    {
        return zzcm1.zzaOS;
    }

    private zzcl zzeR(String s)
    {
        zzcl zzcl1 = zzaRs.zza(zzaRp);
        zzcl1.zza(zzaRo);
        zzcl1.zzeB(zzaPp);
        zzcl1.zzeQ(s);
        return zzcl1;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzAB();
        if (zzaRt != null)
        {
            zzaRt.cancel(false);
        }
        zzaRr.shutdown();
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
        zzAB();
        zzaRo = zzbf;
        this;
        JVM INSTR monitorexit ;
        return;
        zzbf;
        throw zzbf;
    }

    public void zzeB(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzAB();
        zzaPp = s;
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
        zzbg.v((new StringBuilder()).append("loadAfterDelay: containerId=").append(zzaOS).append(" delay=").append(l).toString());
        zzAB();
        if (zzaRo == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (zzaRt != null)
        {
            zzaRt.cancel(false);
        }
        zzaRt = zzaRr.schedule(zzeR(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }
}
