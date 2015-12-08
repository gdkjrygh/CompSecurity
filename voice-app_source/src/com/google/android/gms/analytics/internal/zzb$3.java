// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzJv
    implements Runnable
{

    final zzb zzJs;
    final String zzJu;
    final Runnable zzJv;

    public void run()
    {
        zzb.zza(zzJs).zzbb(zzJu);
        if (zzJv != null)
        {
            zzJv.run();
        }
    }

    (zzb zzb1, String s, Runnable runnable)
    {
        zzJs = zzb1;
        zzJu = s;
        zzJv = runnable;
        super();
    }
}
