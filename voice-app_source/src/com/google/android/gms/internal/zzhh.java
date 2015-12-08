// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk

public abstract class zzhh
{

    private volatile Thread zzFZ;
    private final Runnable zzx = new Runnable() {

        final zzhh zzGa;

        public final void run()
        {
            zzhh.zza(zzGa, Thread.currentThread());
            zzGa.zzdP();
        }

            
            {
                zzGa = zzhh.this;
                super();
            }
    };

    public zzhh()
    {
    }

    static Thread zza(zzhh zzhh1, Thread thread)
    {
        zzhh1.zzFZ = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (zzFZ != null)
        {
            zzFZ.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzdP();

    public final Future zzgi()
    {
        return zzhk.zza(zzx);
    }

    public final void zzgj()
    {
        zzhk.zza(1, zzx);
    }
}
