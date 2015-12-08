// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzt, zzj, zza, zzm, 
//            zzam, zzae, zzq, zzk, 
//            zzaf, zzb, zzi, zzag, 
//            zzh, zzu, zzah, zze

public class zzf
{

    private final Context zzFV;
    private final Context zzoh;

    public zzf(Context context)
    {
        zzv.zzr(context);
        context = context.getApplicationContext();
        zzv.zzb(context, "Application context can't be null");
        zzoh = context;
        zzFV = context;
    }

    public Context getApplicationContext()
    {
        return zzoh;
    }

    protected zzkk zzK(Context context)
    {
        return zzkk.zzak(context);
    }

    protected zzt zza(zze zze1)
    {
        return new zzt(zze1);
    }

    protected zzj zzb(zze zze1)
    {
        return new zzj(zze1);
    }

    protected zza zzc(zze zze1)
    {
        return new zza(zze1);
    }

    protected zzm zzd(zze zze1)
    {
        return new zzm(zze1);
    }

    protected zzam zze(zze zze1)
    {
        return new zzam(zze1);
    }

    protected zzae zzf(zze zze1)
    {
        return new zzae(zze1);
    }

    protected zzq zzg(zze zze1)
    {
        return new zzq(zze1);
    }

    public Context zzgT()
    {
        return zzFV;
    }

    protected zzht zzh(zze zze1)
    {
        return zzhv.zznc();
    }

    protected GoogleAnalytics zzi(zze zze1)
    {
        return new GoogleAnalytics(zze1);
    }

    zzk zzj(zze zze1)
    {
        return new zzk(zze1, this);
    }

    zzaf zzk(zze zze1)
    {
        return new zzaf(zze1);
    }

    protected zzb zzl(zze zze1)
    {
        return new zzb(zze1, this);
    }

    public zzi zzm(zze zze1)
    {
        return new zzi(zze1);
    }

    public zzag zzn(zze zze1)
    {
        return new zzag(zze1);
    }

    public zzh zzo(zze zze1)
    {
        return new zzh(zze1);
    }

    public zzu zzp(zze zze1)
    {
        return new zzu(zze1);
    }

    public zzah zzq(zze zze1)
    {
        return new zzah(zze1);
    }
}
