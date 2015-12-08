// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;


// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

class zzCh
    implements Runnable
{

    final com.google.android.gms.internal.za zzCh;
    final zzl zzDm;

    public void run()
    {
        zzl.zza(zzDm).zza(zzCh);
        if (zzl.zzb(zzDm) != null)
        {
            zzl.zzb(zzDm).release();
            zzl.zza(zzDm, null);
        }
    }

    a(zzl zzl1, com.google.android.gms.internal.za za)
    {
        zzDm = zzl1;
        zzCh = za;
        super();
    }
}
