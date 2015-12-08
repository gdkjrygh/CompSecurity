// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzLv
    implements Runnable
{

    final zzb zzLs;
    final String zzLu;
    final Runnable zzLv;

    public void run()
    {
        zzb.zza(zzLs).zzbg(zzLu);
        if (zzLv != null)
        {
            zzLv.run();
        }
    }

    (zzb zzb1, String s, Runnable runnable)
    {
        zzLs = zzb1;
        zzLu = s;
        zzLv = runnable;
        super();
    }
}
