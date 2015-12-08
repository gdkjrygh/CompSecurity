// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.wearable.internal.zzay;
import com.google.android.gms.wearable.internal.zzba;
import com.google.android.gms.wearable.internal.zzbl;
import com.google.android.gms.wearable.internal.zzbn;
import com.google.android.gms.wearable.internal.zzbp;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzf;
import com.google.android.gms.wearable.internal.zzi;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzv;
import com.google.android.gms.wearable.internal.zzw;

// Referenced classes of package com.google.android.gms.wearable:
//            CapabilityApi, ChannelApi, DataApi, MessageApi, 
//            NodeApi, zzc, zza, zzf, 
//            zzi, zzk

public class Wearable
{
    public static final class WearableOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private WearableOptions(Builder builder)
        {
        }

    }

    public static class WearableOptions.Builder
    {

        public WearableOptions build()
        {
            return new WearableOptions(this);
        }

        public WearableOptions.Builder()
        {
        }
    }


    public static final Api API;
    public static final CapabilityApi CapabilityApi = new zzi();
    public static final ChannelApi ChannelApi = new zzk();
    public static final DataApi DataApi = new zzw();
    public static final MessageApi MessageApi = new zzay();
    public static final NodeApi NodeApi = new zzba();
    public static final com.google.android.gms.common.api.Api.zzc zzQf;
    private static final com.google.android.gms.common.api.Api.zza zzQg;
    public static final zzc zzaYX = new zzf();
    public static final zza zzaYY = new zzd();
    public static final com.google.android.gms.wearable.zzf zzaYZ = new zzv();
    public static final com.google.android.gms.wearable.zzi zzaZa = new zzbl();
    public static final com.google.android.gms.wearable.zzk zzaZb = new zzbp();

    private Wearable()
    {
    }

    static 
    {
        zzQf = new com.google.android.gms.common.api.Api.zzc();
        zzQg = new com.google.android.gms.common.api.Api.zza() {

            public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf1, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzbn zza(Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (wearableoptions == null)
                {
                    new WearableOptions(new WearableOptions.Builder());
                }
                return new zzbn(context, looper, connectioncallbacks, onconnectionfailedlistener, zzf1);
            }

        };
        API = new Api("Wearable.API", zzQg, zzQf);
    }
}
