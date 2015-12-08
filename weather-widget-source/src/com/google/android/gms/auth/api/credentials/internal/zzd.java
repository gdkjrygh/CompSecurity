// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zze, zzh

abstract class zzd extends com.google.android.gms.common.api.zzc.zza
{

    zzd(GoogleApiClient googleapiclient)
    {
        super(Auth.zzQM, googleapiclient);
    }

    protected abstract void zza(Context context, zzh zzh1)
        throws DeadObjectException, RemoteException;

    protected final void zza(zze zze1)
        throws DeadObjectException, RemoteException
    {
        zza(zze1.getContext(), (zzh)zze1.zzoA());
    }

    protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        zza((zze)zzb);
    }
}
