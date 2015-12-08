// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class zzoQ
    implements Runnable
{

    final String zzoN;
    final zzaa zzoP;
    final String zzoQ;

    public void run()
    {
        zzaa.zza(zzoP).zzb(zzoN, zzoQ);
    }

    (zzaa zzaa1, String s, String s1)
    {
        zzoP = zzaa1;
        zzoN = s;
        zzoQ = s1;
        super();
    }
}
