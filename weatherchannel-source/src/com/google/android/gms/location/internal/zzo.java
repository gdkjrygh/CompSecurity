// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zzo
    implements SettingsApi
{

    public zzo()
    {
    }

    public PendingResult checkLocationSettings(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest)
    {
        return zza(googleapiclient, locationsettingsrequest, null);
    }

    public PendingResult zza(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        return googleapiclient.zza(new com.google.android.gms.location.LocationServices.zza(googleapiclient, locationsettingsrequest, s) {

            final LocationSettingsRequest zzazk;
            final String zzazl;
            final zzo zzazm;

            public Result createFailedResult(Status status)
            {
                return zzaE(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
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

            
            {
                zzazm = zzo.this;
                zzazk = locationsettingsrequest;
                zzazl = s;
                super(googleapiclient);
            }
        });
    }
}
