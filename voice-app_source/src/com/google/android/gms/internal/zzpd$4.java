// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzpd

class eApiClient extends b
{

    final zzpd zzaHC;
    final String zzaHI;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zze)ent);
    }

    protected void zza(zze zze1)
    {
        zze1.zzdX(zzaHI);
        setResult(Status.zzXP);
    }

    eApiClient(zzpd zzpd1, GoogleApiClient googleapiclient, String s)
    {
        zzaHC = zzpd1;
        zzaHI = s;
        super(googleapiclient, null);
    }
}
