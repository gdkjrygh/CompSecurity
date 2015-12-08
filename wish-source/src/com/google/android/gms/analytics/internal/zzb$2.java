// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzk

class zzFy
    implements Runnable
{

    final zzb zzFx;
    final boolean zzFy;

    public void run()
    {
        zzb.zza(zzFx).zzG(zzFy);
    }

    (zzb zzb1, boolean flag)
    {
        zzFx = zzb1;
        zzFy = flag;
        super();
    }
}
