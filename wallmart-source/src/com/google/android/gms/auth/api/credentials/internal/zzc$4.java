// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zzd, zzc, zzh

class nit> extends zzd
{

    final zzc zzRz;

    protected void zza(Context context, zzh zzh1)
        throws RemoteException
    {
        zzh1.zza(new a(this));
    }

    protected Result zzb(Status status)
    {
        return zzd(status);
    }

    protected Status zzd(Status status)
    {
        return status;
    }

    a(zzc zzc1, GoogleApiClient googleapiclient)
    {
        zzRz = zzc1;
        super(googleapiclient);
    }
}
