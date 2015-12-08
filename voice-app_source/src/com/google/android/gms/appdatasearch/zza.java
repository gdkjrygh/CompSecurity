// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziv;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzk

public final class zza
{

    public static final com.google.android.gms.common.api.Api.ClientKey zzMO;
    private static final com.google.android.gms.common.api.Api.zza zzMP;
    public static final Api zzMQ;
    public static final zzk zzMR = new zziv();

    static 
    {
        zzMO = new com.google.android.gms.common.api.Api.ClientKey();
        zzMP = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzit zza(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzit(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        zzMQ = new Api("AppDataSearch.LIGHTWEIGHT_API", zzMP, zzMO, new Scope[0]);
    }
}
