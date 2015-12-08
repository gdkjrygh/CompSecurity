// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzk

class zzFA
    implements Runnable
{

    final Runnable zzFA;
    final zzb zzFx;
    final String zzFz;

    public void run()
    {
        zzb.zza(zzFx).zzaN(zzFz);
        if (zzFA != null)
        {
            zzFA.run();
        }
    }

    (zzb zzb1, String s, Runnable runnable)
    {
        zzFx = zzb1;
        zzFz = s;
        zzFA = runnable;
        super();
    }
}
