// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzgl, zzlb, zzbz, zzbv, 
//            zzgk

private class zzEJ
{

    public final long zzEI = zzo.zzbz().currentTimeMillis();
    public final zzgk zzEJ;
    final zzgl zzEK;

    public boolean hasExpired()
    {
        long l = zzEI;
        return ((Long)zzbz.zzuw.get()).longValue() + l < zzo.zzbz().currentTimeMillis();
    }

    public (zzgl zzgl1, zzgk zzgk)
    {
        zzEK = zzgl1;
        super();
        zzEJ = zzgk;
    }
}
