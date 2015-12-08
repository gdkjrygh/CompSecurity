// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzf;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzp, zzd

class zzaEW extends com.google.android.gms.location.places.a
{

    final int zzaEV;
    final int zzaEW;
    final zzp zzaEX;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzd)b);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzf(this), zzp.zza(zzaEX), zzaEV, zzaEW, zzp.zzb(zzaEX));
    }

    (zzp zzp1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, int i, int j)
    {
        zzaEX = zzp1;
        zzaEV = i;
        zzaEW = j;
        super(c, googleapiclient);
    }
}
