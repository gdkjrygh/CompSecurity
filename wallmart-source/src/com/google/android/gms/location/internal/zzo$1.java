// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzo, zzj

class nt extends com.google.android.gms.location.onServices.zza
{

    final LocationSettingsRequest zzaDe;
    final String zzaDf;
    final zzo zzaDg;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzaDe, this, zzaDf);
    }

    public LocationSettingsResult zzaL(Status status)
    {
        return new LocationSettingsResult(status);
    }

    public Result zzb(Status status)
    {
        return zzaL(status);
    }

    nt(zzo zzo1, GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        zzaDg = zzo1;
        zzaDe = locationsettingsrequest;
        zzaDf = s;
        super(googleapiclient);
    }
}
