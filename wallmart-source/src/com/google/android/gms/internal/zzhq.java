// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

public abstract class zzhq
{

    private volatile Thread zzHt;
    private final Runnable zzx = new Runnable() {

        final zzhq zzHu;

        public final void run()
        {
            zzhq.zza(zzHu, Thread.currentThread());
            zzHu.zzdG();
        }

            
            {
                zzHu = zzhq.this;
                super();
            }
    };

    public zzhq()
    {
    }

    static Thread zza(zzhq zzhq1, Thread thread)
    {
        zzhq1.zzHt = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (zzHt != null)
        {
            zzHt.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzdG();

    public final Future zzgn()
    {
        return zzht.zza(zzx);
    }

    public final void zzgo()
    {
        zzht.zza(1, zzx);
    }
}
