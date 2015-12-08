// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzcy;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zze, zzl, zzac

public class zzk
{

    private static final Object zzoW = new Object();
    private static zzk zzss;
    private final zza zzst = new zza();
    private final zze zzsu = new zze();
    private final zzl zzsv = new zzl();
    private final zzac zzsw = new zzac();
    private final zzcy zzsx = new zzcy();
    private final zzf zzsy = new zzf();

    protected zzk()
    {
    }

    protected static void zza(zzk zzk1)
    {
        synchronized (zzoW)
        {
            zzss = zzk1;
        }
        return;
        zzk1;
        obj;
        JVM INSTR monitorexit ;
        throw zzk1;
    }

    public static zza zzcA()
    {
        return zzcz().zzst;
    }

    public static zze zzcB()
    {
        return zzcz().zzsu;
    }

    public static zzl zzcC()
    {
        return zzcz().zzsv;
    }

    public static zzac zzcD()
    {
        return zzcz().zzsw;
    }

    public static zzcy zzcE()
    {
        return zzcz().zzsx;
    }

    public static zzf zzcF()
    {
        return zzcz().zzsy;
    }

    private static zzk zzcz()
    {
        zzk zzk1;
        synchronized (zzoW)
        {
            zzk1 = zzss;
        }
        return zzk1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        zza(new zzk());
    }
}
