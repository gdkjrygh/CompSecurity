// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.internal.zzc;
import com.google.android.gms.auth.api.credentials.internal.zze;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import com.google.android.gms.internal.zzjs;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzka;

public final class Auth
{
    public static final class AuthCredentialsOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private final String zzQX;
        private final PasswordSpecification zzQY;

        public Bundle zzli()
        {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", zzQX);
            bundle.putParcelable("password_specification", zzQY);
            return bundle;
        }
    }

    public static class AuthCredentialsOptions.Builder
    {

        private PasswordSpecification zzQY;

        public AuthCredentialsOptions.Builder()
        {
            zzQY = PasswordSpecification.zzRo;
        }
    }

    public static final class zza
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private final Bundle zzQZ;

        public Bundle zzlq()
        {
            return new Bundle(zzQZ);
        }
    }


    public static final Api CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi = new zzc();
    public static final Api PROXY_API;
    public static final ProxyApi ProxyApi = new zzka();
    public static final com.google.android.gms.common.api.Api.zzc zzQL;
    public static final com.google.android.gms.common.api.Api.zzc zzQM;
    public static final com.google.android.gms.common.api.Api.zzc zzQN;
    public static final com.google.android.gms.common.api.Api.zzc zzQO;
    private static final com.google.android.gms.common.api.Api.zza zzQP;
    private static final com.google.android.gms.common.api.Api.zza zzQQ;
    private static final com.google.android.gms.common.api.Api.zza zzQR;
    private static final com.google.android.gms.common.api.Api.zza zzQS;
    public static final Api zzQT;
    public static final Api zzQU;
    public static final zzjq zzQV = new zzjr();
    public static final zzd zzQW = new com.google.android.gms.auth.api.signin.internal.zzc();

    private Auth()
    {
    }

    static 
    {
        zzQL = new com.google.android.gms.common.api.Api.zzc();
        zzQM = new com.google.android.gms.common.api.Api.zzc();
        zzQN = new com.google.android.gms.common.api.Api.zzc();
        zzQO = new com.google.android.gms.common.api.Api.zzc();
        zzQP = new com.google.android.gms.common.api.Api.zza() {

            public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf, (zza)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzjw zza(Context context, Looper looper, zzf zzf, zza zza1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzjw(context, looper, zzf, zza1, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        zzQQ = new com.google.android.gms.common.api.Api.zza() {

            public zze zza(Context context, Looper looper, zzf zzf, AuthCredentialsOptions authcredentialsoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zze(context, looper, zzf, authcredentialsoptions, connectioncallbacks, onconnectionfailedlistener);
            }

            public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf, (AuthCredentialsOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        zzQR = new com.google.android.gms.common.api.Api.zza() {

            public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzd(context, looper, zzf, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzjs zzd(Context context, Looper looper, zzf zzf, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzjs(context, looper, zzf, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        zzQS = new com.google.android.gms.common.api.Api.zza() {

            public com.google.android.gms.auth.api.signin.internal.zzd zza(Context context, Looper looper, zzf zzf, com.google.android.gms.auth.api.signin.zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new com.google.android.gms.auth.api.signin.internal.zzd(context, looper, zzf, zze1, connectioncallbacks, onconnectionfailedlistener);
            }

            public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf, (com.google.android.gms.auth.api.signin.zze)obj, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        PROXY_API = new Api("Auth.PROXY_API", zzQP, zzQL);
        CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzQQ, zzQM);
        zzQT = new Api("Auth.SIGN_IN_API", zzQS, zzQO);
        zzQU = new Api("Auth.ACCOUNT_STATUS_API", zzQR, zzQN);
    }
}
