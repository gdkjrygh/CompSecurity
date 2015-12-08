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

    final LocationSettingsRequest zzazk;
    final String zzazl;
    final zzo zzazm;

    public Result createFailedResult(Status status)
    {
        return zzaE(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzazk, this, zzazl);
    }

    public LocationSettingsResult zzaE(Status status)
    {
        return new LocationSettingsResult(status);
    }

    nt(zzo zzo1, GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        zzazm = zzo1;
        zzazk = locationsettingsrequest;
        zzazl = s;
        super(googleapiclient);
    }
}
