// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzu, zzk, zza, zzn, 
//            zzan, zzaf, zzr, zzl, 
//            zzag, zzb, zzj, zzah, 
//            zzi, zzv, zzai, zzf

public class zzg
{

    private final Context zzJR;
    private final Context zzqw;

    public zzg(Context context)
    {
        zzu.zzu(context);
        context = context.getApplicationContext();
        zzu.zzb(context, "Application context can't be null");
        zzqw = context;
        zzJR = context;
    }

    public Context getApplicationContext()
    {
        return zzqw;
    }

    protected zzns zzW(Context context)
    {
        return zzns.zzaB(context);
    }

    protected com.google.android.gms.analytics.internal.zzu zza(zzf zzf1)
    {
        return new com.google.android.gms.analytics.internal.zzu(zzf1);
    }

    protected zzk zzb(zzf zzf1)
    {
        return new zzk(zzf1);
    }

    protected zza zzc(zzf zzf1)
    {
        return new zza(zzf1);
    }

    protected zzn zzd(zzf zzf1)
    {
        return new zzn(zzf1);
    }

    protected zzan zze(zzf zzf1)
    {
        return new zzan(zzf1);
    }

    protected zzaf zzf(zzf zzf1)
    {
        return new zzaf(zzf1);
    }

    protected zzr zzg(zzf zzf1)
    {
        return new zzr(zzf1);
    }

    protected zzlb zzh(zzf zzf1)
    {
        return zzld.zzoQ();
    }

    protected GoogleAnalytics zzi(zzf zzf1)
    {
        return new GoogleAnalytics(zzf1);
    }

    public Context zzic()
    {
        return zzJR;
    }

    zzl zzj(zzf zzf1)
    {
        return new zzl(zzf1, this);
    }

    zzag zzk(zzf zzf1)
    {
        return new zzag(zzf1);
    }

    protected zzb zzl(zzf zzf1)
    {
        return new zzb(zzf1, this);
    }

    public zzj zzm(zzf zzf1)
    {
        return new zzj(zzf1);
    }

    public zzah zzn(zzf zzf1)
    {
        return new zzah(zzf1);
    }

    public zzi zzo(zzf zzf1)
    {
        return new zzi(zzf1);
    }

    public zzv zzp(zzf zzf1)
    {
        return new zzv(zzf1);
    }

    public zzai zzq(zzf zzf1)
    {
        return new zzai(zzf1);
    }
}
