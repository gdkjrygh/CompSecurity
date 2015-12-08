// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            zzpd

class eApiClient extends c
{

    final zzpd zzaHC;
    final Moment zzaHH;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zze)ent);
    }

    protected void zza(zze zze1)
    {
        zze1.zza(this, zzaHH);
    }

    eApiClient(zzpd zzpd1, GoogleApiClient googleapiclient, Moment moment)
    {
        zzaHC = zzpd1;
        zzaHH = moment;
        super(googleapiclient, null);
    }
}
