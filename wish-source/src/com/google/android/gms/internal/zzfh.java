// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

public abstract class zzfh
{

    private volatile Thread zzCg;
    private final Runnable zznB = new Runnable() {

        final zzfh zzCh;

        public final void run()
        {
            zzfh.zza(zzCh, Thread.currentThread());
            zzCh.zzcX();
        }

            
            {
                zzCh = zzfh.this;
                super();
            }
    };

    public zzfh()
    {
    }

    static Thread zza(zzfh zzfh1, Thread thread)
    {
        zzfh1.zzCg = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (zzCg != null)
        {
            zzCg.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzcX();

    public final Future zzeW()
    {
        return zzfk.zza(zznB);
    }

    public final void zzeX()
    {
        zzfk.zza(1, zznB);
    }
}
