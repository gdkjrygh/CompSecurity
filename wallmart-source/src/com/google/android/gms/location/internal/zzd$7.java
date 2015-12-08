// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzd, zzj

class nt extends a
{

    final LocationListener zzaCB;
    final zzd zzaCC;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzaCB);
        zza(((com.google.android.gms.common.api.Result) (Status.zzaaD)));
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        zzaCC = zzd1;
        zzaCB = locationlistener;
        super(googleapiclient);
    }
}
