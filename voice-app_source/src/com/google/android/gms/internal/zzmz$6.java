// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzmz, zzlx, zzmi

class eApiClient extends a
{

    final zzmz zzakY;

    protected Result createFailedResult(Status status)
    {
        return zzB(status);
    }

    protected BleDevicesResult zzB(Status status)
    {
        return BleDevicesResult.zzJ(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzlx)ent);
    }

    protected void zza(zzlx zzlx1)
        throws RemoteException
    {
        a a = new a(this, null);
        String s = zzlx1.getContext().getPackageName();
        ((zzmi)zzlx1.zznM()).zza(new ListClaimedBleDevicesRequest(a, s));
    }

    eApiClient(zzmz zzmz1, GoogleApiClient googleapiclient)
    {
        zzakY = zzmz1;
        super(googleapiclient);
    }
}
