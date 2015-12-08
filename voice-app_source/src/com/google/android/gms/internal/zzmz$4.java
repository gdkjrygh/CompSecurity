// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzmz, zzlx, zzng, zzmi

class eApiClient extends c
{

    final zzmz zzakY;
    final BleDevice zzalb;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzlx)ent);
    }

    protected void zza(zzlx zzlx1)
        throws RemoteException
    {
        zzng zzng1 = new zzng(this);
        String s = zzlx1.getContext().getPackageName();
        ((zzmi)zzlx1.zznM()).zza(new ClaimBleDeviceRequest(zzalb.getAddress(), zzalb, zzng1, s));
    }

    eApiClient(zzmz zzmz1, GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        zzakY = zzmz1;
        zzalb = bledevice;
        super(googleapiclient);
    }
}
