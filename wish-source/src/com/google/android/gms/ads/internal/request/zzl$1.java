// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzcf;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class zzyR
    implements Runnable
{

    final com.google.android.gms.internal.za zzyR;
    final zzl zzzV;

    public void run()
    {
        zzl.zza(zzzV).zza(zzyR);
        if (zzl.zzb(zzzV) != null)
        {
            zzl.zzeu().zzb(zzl.zzb(zzzV));
            zzl.zza(zzzV, null);
        }
    }

    a(zzl zzl1, com.google.android.gms.internal.za za)
    {
        zzzV = zzl1;
        zzyR = za;
        super();
    }
}
