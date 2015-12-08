// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzlw, zzml

public class zzma extends zzlw
{
    public static class zza
        implements com.google.android.gms.common.api.Api.zza
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzk(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzma zzk(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzma(context, looper, zze, connectioncallbacks, onconnectionfailedlistener);
        }

        public zza()
        {
        }
    }


    public zzma(Context context, Looper looper, zze zze, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 61, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.fitness.InternalApi";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbl(ibinder);
    }

    protected zzml zzbl(IBinder ibinder)
    {
        return zzml.zza.zzbw(ibinder);
    }
}
