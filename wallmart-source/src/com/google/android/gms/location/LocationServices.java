// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{
    public static abstract class zza extends com.google.android.gms.common.api.zzc.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(LocationServices.zzvG(), googleapiclient);
        }
    }


    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi = new zzd();
    public static final GeofencingApi GeofencingApi = new zze();
    public static final SettingsApi SettingsApi = new zzo();
    private static final com.google.android.gms.common.api.Api.zzc zzQf;
    private static final com.google.android.gms.common.api.Api.zza zzQg;

    private LocationServices()
    {
    }

    public static zzj zze(GoogleApiClient googleapiclient)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (zzj)googleapiclient.zza(zzQf);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.zzc zzvG()
    {
        return zzQf;
    }

    static 
    {
        zzQf = new com.google.android.gms.common.api.Api.zzc();
        zzQg = new com.google.android.gms.common.api.Api.zza() {

            public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzm(context, looper, zzf, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzj zzm(Context context, Looper looper, zzf zzf, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzj(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices", zzf);
            }

        };
        API = new Api("LocationServices.API", zzQg, zzQf);
    }
}
