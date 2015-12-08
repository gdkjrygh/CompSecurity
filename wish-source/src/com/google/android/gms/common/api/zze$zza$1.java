// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            zze

class zzQk
    implements Runnable
{

    final zze zzQj;
    final ConnectionResult zzQk;
    final lt zzQl;

    public void run()
    {
        zze.zzc(zzQj, zzQk);
    }

    lt(lt lt, zze zze1, ConnectionResult connectionresult)
    {
        zzQl = lt;
        zzQj = zze1;
        zzQk = connectionresult;
        super();
    }
}
