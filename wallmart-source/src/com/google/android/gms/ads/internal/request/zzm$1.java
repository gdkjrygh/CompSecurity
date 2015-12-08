// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

class zzoA
    implements Runnable
{

    final zzm zzEB;
    final com.google.android.gms.internal.za zzoA;

    public void run()
    {
        zzm.zza(zzEB).zza(zzoA);
        if (zzm.zzb(zzEB) != null)
        {
            zzm.zzb(zzEB).release();
            zzm.zza(zzEB, null);
        }
    }

    a(zzm zzm1, com.google.android.gms.internal.za za)
    {
        zzEB = zzm1;
        zzoA = za;
        super();
    }
}
