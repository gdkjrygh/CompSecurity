// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzs

class zzcm
    implements zzp.zze
{
    static interface zza
    {
    }

    static interface zzb
    {

        public abstract ScheduledExecutorService zzxq();
    }


    private boolean mClosed;
    private final Context mContext;
    private String zzaCH;
    private final String zzaCk;
    private zzs zzaEH;
    private final ScheduledExecutorService zzaEJ;
    private final zza zzaEK;
    private ScheduledFuture zzaEL;

    public zzcm(Context context, String s, zzs zzs)
    {
        this(context, s, zzs, null, null);
    }

    zzcm(Context context, String s, zzs zzs, zzb zzb1, zza zza1)
    {
        zzaEH = zzs;
        mContext = context;
        zzaCk = s;
        context = zzb1;
        if (zzb1 == null)
        {
            context = new zzb() {

                final zzcm zzaEM;

                public ScheduledExecutorService zzxq()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                zzaEM = zzcm.this;
                super();
            }
            };
        }
        zzaEJ = context.zzxq();
        if (zza1 == null)
        {
            zzaEK = new zza() {

                final zzcm zzaEM;

            
            {
                zzaEM = zzcm.this;
                super();
            }
            };
            return;
        } else
        {
            zzaEK = zza1;
            return;
        }
    }

    private void zzxp()
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
        zzxp();
        if (zzaEL != null)
        {
            zzaEL.cancel(false);
        }
        zzaEJ.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzdE(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzxp();
        zzaCH = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
