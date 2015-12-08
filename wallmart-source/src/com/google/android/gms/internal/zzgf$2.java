// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzn;

// Referenced classes of package com.google.android.gms.internal:
//            zzgf, zzlh, zzie

class zzDd
    implements Runnable
{

    final zzgf zzDb;
    final zzie zzDc;
    final String zzDd;

    public void run()
    {
        zzDc.zzf(zzgf.zza(zzDb).zzbq().get(zzDd));
    }

    (zzgf zzgf1, zzie zzie1, String s)
    {
        zzDb = zzgf1;
        zzDc = zzie1;
        zzDd = s;
        super();
    }
}
