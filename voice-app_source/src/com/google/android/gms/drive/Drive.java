// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.drive.internal.zzaa;
import com.google.android.gms.drive.internal.zzq;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.internal.zzv;
import com.google.android.gms.drive.internal.zzy;

// Referenced classes of package com.google.android.gms.drive:
//            DriveApi, DrivePreferencesApi, zzc, zzf

public final class Drive
{
    public static abstract class zza
        implements com.google.android.gms.common.api.Api.zza
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        protected abstract Bundle zza(com.google.android.gms.common.api.Api.ApiOptions apioptions);

        public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zza(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzs zza(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions apioptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzs(context, looper, zze, connectioncallbacks, onconnectionfailedlistener, zza(apioptions));
        }

        public zza()
        {
        }
    }

    public static class zzb
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        private final Bundle zzNW;

        public Bundle zzpd()
        {
            return zzNW;
        }

        private zzb()
        {
            this(new Bundle());
        }

        private zzb(Bundle bundle)
        {
            zzNW = bundle;
        }
    }


    public static final Api API;
    public static final DriveApi DriveApi = new zzq();
    public static final DrivePreferencesApi DrivePreferencesApi = new zzy();
    public static final Scope SCOPE_APPFOLDER = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope SCOPE_FILE = new Scope("https://www.googleapis.com/auth/drive.file");
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    public static final Scope zzacY = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope zzacZ = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final Api zzada;
    public static final zzc zzadb = new zzv();
    public static final zzf zzadc = new zzaa();

    private Drive()
    {
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        API = new Api("Drive.API", new zza() {

            protected Bundle zza(com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions)
            {
                return new Bundle();
            }

            protected volatile Bundle zza(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return zza((com.google.android.gms.common.api.Api.ApiOptions.NoOptions)apioptions);
            }

        }, zzNX, new Scope[0]);
        zzada = new Api("Drive.INTERNAL_API", new zza() {

            protected volatile Bundle zza(com.google.android.gms.common.api.Api.ApiOptions apioptions)
            {
                return zza((zzb)apioptions);
            }

            protected Bundle zza(zzb zzb1)
            {
                if (zzb1 == null)
                {
                    return new Bundle();
                } else
                {
                    return zzb1.zzpd();
                }
            }

        }, zzNX, new Scope[0]);
    }
}
