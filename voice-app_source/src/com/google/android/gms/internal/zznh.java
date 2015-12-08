// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzmw

public class zznh
    implements BleApi
{

    private static final Status zzalH = new Status(5007);

    public zznh()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return new zzmw(zzalH);
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return new zzmw(zzalH);
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return new zzmw(BleDevicesResult.zzJ(zzalH));
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return new zzmw(zzalH);
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return new zzmw(zzalH);
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return new zzmw(zzalH);
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return new zzmw(zzalH);
    }

}
