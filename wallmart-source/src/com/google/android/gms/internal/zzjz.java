// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzjw, zzjy, zzkb

abstract class zzjz extends com.google.android.gms.common.api.zzc.zza
{

    public zzjz(GoogleApiClient googleapiclient)
    {
        super(Auth.zzQL, googleapiclient);
    }

    protected abstract void zza(Context context, zzjy zzjy1)
        throws RemoteException;

    protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb1)
        throws RemoteException
    {
        zza((zzjw)zzb1);
    }

    protected final void zza(zzjw zzjw1)
        throws RemoteException
    {
        zza(zzjw1.getContext(), (zzjy)zzjw1.zzoA());
    }

    protected Result zzb(Status status)
    {
        return zzo(status);
    }

    protected com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult zzo(Status status)
    {
        return new zzkb(status);
    }
}
