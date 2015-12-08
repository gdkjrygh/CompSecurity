// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, zzl

class zzLt
    implements Runnable
{

    final zzb zzLs;
    final boolean zzLt;

    public void run()
    {
        zzb.zza(zzLs).zzI(zzLt);
    }

    (zzb zzb1, boolean flag)
    {
        zzLs = zzb1;
        zzLt = flag;
        super();
    }
}
