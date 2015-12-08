// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api
{
    public static interface ApiOptions
    {
    }

    public static interface ApiOptions.HasOptions
        extends ApiOptions
    {
    }

    public static final class ApiOptions.NoOptions
        implements ApiOptions.NotRequiredOptions
    {

        private ApiOptions.NoOptions()
        {
        }
    }

    public static interface ApiOptions.NotRequiredOptions
        extends ApiOptions
    {
    }

    public static interface ApiOptions.Optional
        extends ApiOptions.HasOptions, ApiOptions.NotRequiredOptions
    {
    }

    public static abstract class zza
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public abstract zzb zza(Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, Object obj, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener);

        public List zzl(Object obj)
        {
            return Collections.emptyList();
        }

        public zza()
        {
        }
    }

    public static interface zzb
    {

        public abstract void disconnect();

        public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

        public abstract boolean isConnected();

        public abstract void zza(GoogleApiClient.zza zza1);

        public abstract void zza(zzp zzp);

        public abstract void zza(zzp zzp, Set set);

        public abstract boolean zzlm();
    }

    public static final class zzc
    {

        public zzc()
        {
        }
    }

    public static interface zzd
    {

        public abstract IInterface zzV(IBinder ibinder);

        public abstract void zza(int i, IInterface iinterface);

        public abstract String zzfA();

        public abstract String zzfB();
    }

    public static interface zze
    {

        public abstract zzd zzm(Object obj);

        public abstract int zznf();
    }

    public static final class zzf
    {
    }


    private final String mName;
    private final zzc zzXW;
    private final zza zzYL;
    private final zze zzYM = null;
    private final zzf zzYN = null;

    public Api(String s, zza zza1, zzc zzc1)
    {
        zzx.zzb(zza1, "Cannot construct an Api with a null ClientBuilder");
        zzx.zzb(zzc1, "Cannot construct an Api with a null ClientKey");
        mName = s;
        zzYL = zza1;
        zzXW = zzc1;
    }

    public String getName()
    {
        return mName;
    }

    public zza zznb()
    {
        boolean flag;
        if (zzYL != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return zzYL;
    }

    public zze zznc()
    {
        boolean flag;
        if (zzYM != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return zzYM;
    }

    public zzc zznd()
    {
        boolean flag;
        if (zzXW != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return zzXW;
    }

    public boolean zzne()
    {
        return zzYN != null;
    }
}
