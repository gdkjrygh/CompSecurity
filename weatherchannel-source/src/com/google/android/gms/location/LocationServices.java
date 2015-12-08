// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{
    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(LocationServices.zzum(), googleapiclient);
        }
    }


    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi = new zzd();
    public static final GeofencingApi GeofencingApi = new zze();
    public static final SettingsApi SettingsApi = new zzo();
    private static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

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
        zzu.zzb(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (zzj)googleapiclient.zza(zzNX);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.ClientKey zzum()
    {
        return zzNX;
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzo(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzj zzo(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzj(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices", zze1);
            }

        };
        API = new Api("LocationServices.API", zzNY, zzNX, new Scope[0]);
    }
}
