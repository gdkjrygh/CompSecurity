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

            final LocationSettingsRequest zzaDe;
            final String zzaDf;
            final zzo zzaDg;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
                throws RemoteException
            {
                zza((zzj)zzb1);
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

            
            {
                zzaDg = zzo.this;
                zzaDe = locationsettingsrequest;
                zzaDf = s;
                super(googleapiclient);
            }
        });
    }
}
