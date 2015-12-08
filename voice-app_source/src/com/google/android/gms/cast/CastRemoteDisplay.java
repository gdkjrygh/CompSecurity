// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.view.Display;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkb;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayApi, CastDevice

public final class CastRemoteDisplay
{
    public static final class CastRemoteDisplayOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        final CastDevice zzQE;
        final CastRemoteDisplaySessionCallbacks zzQU;

        private CastRemoteDisplayOptions(Builder builder)
        {
            zzQE = builder.zzQH;
            zzQU = builder.zzQV;
        }

    }

    public static final class CastRemoteDisplayOptions.Builder
    {

        CastDevice zzQH;
        CastRemoteDisplaySessionCallbacks zzQV;

        public CastRemoteDisplayOptions build()
        {
            return new CastRemoteDisplayOptions(this);
        }

        public CastRemoteDisplayOptions.Builder(CastDevice castdevice, CastRemoteDisplaySessionCallbacks castremotedisplaysessioncallbacks)
        {
            zzu.zzb(castdevice, "CastDevice parameter cannot be null");
            zzQH = castdevice;
            zzQV = castremotedisplaysessioncallbacks;
        }
    }

    public static interface CastRemoteDisplaySessionCallbacks
    {

        public abstract void onRemoteDisplayEnded(Status status);
    }

    public static interface CastRemoteDisplaySessionResult
        extends Result
    {

        public abstract Display getPresentationDisplay();
    }


    public static final Api API;
    public static final CastRemoteDisplayApi CastRemoteDisplayApi;
    private static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    private CastRemoteDisplay()
    {
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (CastRemoteDisplayOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzkb zza(Context context, Looper looper, zze zze, CastRemoteDisplayOptions castremotedisplayoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzkb(context, looper, castremotedisplayoptions.zzQE, castremotedisplayoptions.zzQU, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api("CastRemoteDisplay.API", zzNY, zzNX, new Scope[0]);
        CastRemoteDisplayApi = new zzka(zzNX);
    }
}
