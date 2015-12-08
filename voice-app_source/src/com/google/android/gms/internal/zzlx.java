// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.Fitness;

// Referenced classes of package com.google.android.gms.internal:
//            zzlw, zzmi

public class zzlx extends zzlw
{
    static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(Fitness.zzajw, googleapiclient);
        }
    }

    public static class zzb
        implements com.google.android.gms.common.api.Api.zza
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzh(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzlx zzh(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzlx(context, looper, zze, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzb()
        {
        }
    }

    static abstract class zzc extends zza
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzV(flag);
            return status;
        }

        zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzlx(Context context, Looper looper, zze zze, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 59, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.fitness.BleApi";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbi(ibinder);
    }

    protected zzmi zzbi(IBinder ibinder)
    {
        return zzmi.zza.zzbt(ibinder);
    }
}
