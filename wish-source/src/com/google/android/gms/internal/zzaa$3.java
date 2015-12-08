// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class zzoR
    implements Runnable
{

    final zzaa zzoP;
    final String zzoR;

    public void run()
    {
        zzaa.zza(zzoP).loadData(zzoR, "text/html", "UTF-8");
    }

    (zzaa zzaa1, String s)
    {
        zzoP = zzaa1;
        zzoR = s;
        super();
    }
}
