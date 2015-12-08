// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzj

public class zze extends zzj
{

    final int zzDw;

    public zze(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, looper, 8, zzf.zzaj(context), connectioncallbacks, onconnectionfailedlistener);
        zzDw = i;
    }

    protected com.google.android.gms.ads.internal.request.zzj zzU(IBinder ibinder)
    {
        return zzj.zza.zzW(ibinder);
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzU(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public com.google.android.gms.ads.internal.request.zzj zzfC()
        throws DeadObjectException
    {
        return (com.google.android.gms.ads.internal.request.zzj)super.zzoA();
    }
}
