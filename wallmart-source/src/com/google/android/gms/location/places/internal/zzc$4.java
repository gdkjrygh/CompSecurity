// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.zzf;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaEi extends com.google.android.gms.location.places.b
{

    final zzc zzaEe;
    final String zzaEi;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzd)b);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzf(this), zzaEi);
    }

    (zzc zzc1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, String s)
    {
        zzaEe = zzc1;
        zzaEi = s;
        super(c, googleapiclient);
    }
}
