// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.signin.internal.zzh;
import com.google.android.gms.signin.internal.zzi;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            zzc, zze

public final class zzb
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.zzc zzQf;
    public static final com.google.android.gms.common.api.Api.zza zzQg;
    static final com.google.android.gms.common.api.Api.zza zzaNZ;
    public static final Scope zzaOa = new Scope("profile");
    public static final Scope zzaOb = new Scope("email");
    public static final zzc zzaOc = new zzh();
    public static final Api zzagz;
    public static final com.google.android.gms.common.api.Api.zzc zzanf;

    static 
    {
        zzQf = new com.google.android.gms.common.api.Api.zzc();
        zzanf = new com.google.android.gms.common.api.Api.zzc();
        zzQg = new com.google.android.gms.common.api.Api.zza() {

            public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf, (zze)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzi zza(Context context, Looper looper, zzf zzf, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzi(context, looper, true, zzf, zze1, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

            public List zza(zze zze1)
            {
                return Arrays.asList(new Scope[] {
                    zzb.zzaOa, zzb.zzaOb
                });
            }

            public List zzl(Object obj)
            {
                return zza((zze)obj);
            }

        };
        zzaNZ = new com.google.android.gms.common.api.Api.zza() {

            public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzt(context, looper, zzf, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzi zzt(Context context, Looper looper, zzf zzf, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzi(context, looper, false, zzf, zze.zzaOd, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        API = new Api("SignIn.API", zzQg, zzQf);
        zzagz = new Api("SignIn.INTERNAL_API", zzaNZ, zzanf);
    }
}
