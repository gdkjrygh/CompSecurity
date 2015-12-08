// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzgs, zzlm, zzby, zzbu, 
//            zzgr

private class zzFZ
{

    public final long zzFY = zzp.zzbB().currentTimeMillis();
    public final zzgr zzFZ;
    final zzgs zzGa;

    public boolean hasExpired()
    {
        return zzFY + ((Long)zzby.zzuY.get()).longValue() < zzp.zzbB().currentTimeMillis();
    }

    public (zzgs zzgs1, zzgr zzgr)
    {
        zzGa = zzgs1;
        super();
        zzFZ = zzgr;
    }
}
