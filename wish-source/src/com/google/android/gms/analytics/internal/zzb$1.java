// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzk

class zzFw
    implements Runnable
{

    final int zzFw;
    final zzb zzFx;

    public void run()
    {
        zzb.zza(zzFx).zzq((long)zzFw * 1000L);
    }

    (zzb zzb1, int i)
    {
        zzFx = zzb1;
        zzFw = i;
        super();
    }
}
