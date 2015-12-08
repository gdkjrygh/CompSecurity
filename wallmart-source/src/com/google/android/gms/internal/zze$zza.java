// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zze, zzk, zzm

private class zzx
    implements Runnable
{

    final zze zzu;
    private final zzk zzv;
    private final zzm zzw;
    private final Runnable zzx;

    public void run()
    {
        if (zzv.isCanceled())
        {
            zzv.zzd("canceled-at-delivery");
        } else
        {
            if (zzw.isSuccess())
            {
                zzv.zza(zzw.result);
            } else
            {
                zzv.zzc(zzw.zzah);
            }
            if (zzw.zzai)
            {
                zzv.zzc("intermediate-response");
            } else
            {
                zzv.zzd("done");
            }
            if (zzx != null)
            {
                zzx.run();
                return;
            }
        }
    }

    public (zze zze1, zzk zzk1, zzm zzm1, Runnable runnable)
    {
        zzu = zze1;
        super();
        zzv = zzk1;
        zzw = zzm1;
        zzx = runnable;
    }
}
