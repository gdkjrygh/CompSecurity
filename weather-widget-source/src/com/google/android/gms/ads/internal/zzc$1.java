// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzhj;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc

class zzoA
    implements Runnable
{

    final com.google.android.gms.internal.za zzoA;
    final zzc zzoB;

    public void run()
    {
        zzoB.zzb(new zzhj(zzoA, null, null, null, null, null, null));
    }

    (zzc zzc1, com.google.android.gms.internal.za za)
    {
        zzoB = zzc1;
        zzoA = za;
        super();
    }
}
