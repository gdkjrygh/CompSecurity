// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zze

class zzXg
    implements Runnable
{

    final zze zzXf;
    final ConnectionResult zzXg;
    final lt zzXh;

    public void run()
    {
        zze.zzc(zzXf, zzXg);
    }

    lt(lt lt, zze zze1, ConnectionResult connectionresult)
    {
        zzXh = lt;
        zzXf = zze1;
        zzXg = connectionresult;
        super();
    }
}
