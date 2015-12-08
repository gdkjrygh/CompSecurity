// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzav, zzbk

private static final class Listener extends zzf
{

    private com.google.android.gms.wearable.i.MessageListener zzaUF;
    private IntentFilter zzaUk[];

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zzbk)t);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaUF, zzaUk);
        zzaUF = null;
        zzaUk = null;
    }

    public Status zzb(Status status)
    {
        zzaUF = null;
        zzaUk = null;
        return status;
    }

    private Listener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        zzaUF = messagelistener;
        zzaUk = aintentfilter;
    }

    Listener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, IntentFilter aintentfilter[], Listener listener)
    {
        this(googleapiclient, messagelistener, aintentfilter);
    }
}
