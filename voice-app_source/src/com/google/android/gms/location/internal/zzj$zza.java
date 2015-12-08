// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

private final class zzayT extends com.google.android.gms.common.internal.a
{

    private final int zzTS;
    private final String zzayT[];
    final zzj zzayU;

    protected void zza(com.google.android.gms.location. )
    {
        if ( != null)
        {
            .zza(zzTS, zzayT);
        }
    }

    protected void zznP()
    {
    }

    protected void zzr(Object obj)
    {
        zza((com.google.android.gms.location..zza)obj);
    }

    public es(zzj zzj1, com.google.android.gms.location..zzj zzj2, int i, String as[])
    {
        zzayU = zzj1;
        super(zzj1, zzj2);
        zzTS = LocationStatusCodes.zzgA(i);
        zzayT = as;
    }
}
