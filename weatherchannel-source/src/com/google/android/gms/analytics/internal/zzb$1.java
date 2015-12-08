// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzJr
    implements Runnable
{

    final int zzJr;
    final zzb zzJs;

    public void run()
    {
        zzb.zza(zzJs).zzs((long)zzJr * 1000L);
    }

    (zzb zzb1, int i)
    {
        zzJs = zzb1;
        zzJr = i;
        super();
    }
}
