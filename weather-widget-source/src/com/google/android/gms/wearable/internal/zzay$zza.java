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
//            zzh, zzay, zzbn

private static final class Listener extends zzh
{

    private com.google.android.gms.wearable.i.MessageListener zzbaI;
    private IntentFilter zzbal[];

    protected volatile void zza(com.google.android.gms.common.api.ay.zza zza1)
        throws RemoteException
    {
        zza((zzbn)zza1);
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzbaI, zzbal);
        zzbaI = null;
        zzbal = null;
    }

    public Result zzb(Status status)
    {
        return zzd(status);
    }

    public Status zzd(Status status)
    {
        zzbaI = null;
        zzbal = null;
        return status;
    }

    private Listener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        super(googleapiclient);
        zzbaI = messagelistener;
        zzbal = aintentfilter;
    }

    Listener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.i.MessageListener messagelistener, IntentFilter aintentfilter[], Listener listener)
    {
        this(googleapiclient, messagelistener, aintentfilter);
    }
}
