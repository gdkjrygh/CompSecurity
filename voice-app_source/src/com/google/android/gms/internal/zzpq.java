// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.signin.internal.zzg;
import com.google.android.gms.signin.internal.zzh;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzpr, zzpt

public final class zzpq
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    public static final com.google.android.gms.common.api.Api.zza zzNY;
    static final com.google.android.gms.common.api.Api.zza zzaJO;
    public static final zzpr zzaJP = new zzg();
    public static final Api zzada;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajz;

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzajz = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (zzpt)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzh zza(Context context, Looper looper, zze zze, zzpt zzpt1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (zzpt1 == null)
                {
                    zzpt1 = zzpt.zzaJQ;
                }
                return new zzh(context, looper, true, zze, zzpt1, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        zzaJO = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzv(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzh zzv(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzh(context, looper, false, zze, zzpt.zzaJQ, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        API = new Api("SignIn.API", zzNY, zzNX, new Scope[0]);
        zzada = new Api("SignIn.INTERNAL_API", zzaJO, zzajz, new Scope[0]);
    }
}
