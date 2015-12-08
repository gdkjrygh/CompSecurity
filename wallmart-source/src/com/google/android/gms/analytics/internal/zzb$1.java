// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzLr
    implements Runnable
{

    final int zzLr;
    final zzb zzLs;

    public void run()
    {
        zzb.zza(zzLs).zzs((long)zzLr * 1000L);
    }

    (zzb zzb1, int i)
    {
        zzLs = zzb1;
        zzLr = i;
        super();
    }
}
