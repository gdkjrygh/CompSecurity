// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzlx, zzng, zzmi

public class zzmz
    implements BleApi
{
    private static class zza extends zzni.zza
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(BleDevicesResult bledevicesresult)
        {
            zzOs.zzm(bledevicesresult);
        }

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzOs = zzb;
        }

    }


    public zzmz()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return googleapiclient.zzb(new zzlx.zzc(googleapiclient, bledevice) {

            final zzmz zzakY;
            final BleDevice zzalb;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new ClaimBleDeviceRequest(zzalb.getAddress(), zzalb, zzng1, s));
            }

            
            {
                zzakY = zzmz.this;
                zzalb = bledevice;
                super(googleapiclient);
            }
        });
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzlx.zzc(googleapiclient, s) {

            final zzmz zzakY;
            final String zzala;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s1 = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new ClaimBleDeviceRequest(zzala, null, zzng1, s1));
            }

            
            {
                zzakY = zzmz.this;
                zzala = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzlx.zza(googleapiclient) {

            final zzmz zzakY;

            protected Result createFailedResult(Status status)
            {
                return zzB(status);
            }

            protected BleDevicesResult zzB(Status status)
            {
                return BleDevicesResult.zzJ(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new ListClaimedBleDevicesRequest(zza1, s));
            }

            
            {
                zzakY = zzmz.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return googleapiclient.zza(new zzlx.zzc(googleapiclient, startblescanrequest) {

            final StartBleScanRequest zzakX;
            final zzmz zzakY;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new StartBleScanRequest(zzakX, zzng1, s));
            }

            
            {
                zzakY = zzmz.this;
                zzakX = startblescanrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return googleapiclient.zza(new zzlx.zzc(googleapiclient, blescancallback) {

            final zzmz zzakY;
            final BleScanCallback zzakZ;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new StopBleScanRequest(zzakZ, zzng1, s));
            }

            
            {
                zzakY = zzmz.this;
                zzakZ = blescancallback;
                super(googleapiclient);
            }
        });
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return unclaimBleDevice(googleapiclient, bledevice.getAddress());
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzlx.zzc(googleapiclient, s) {

            final zzmz zzakY;
            final String zzala;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzlx)client);
            }

            protected void zza(zzlx zzlx1)
                throws RemoteException
            {
                zzng zzng1 = new zzng(this);
                String s1 = zzlx1.getContext().getPackageName();
                ((zzmi)zzlx1.zznM()).zza(new UnclaimBleDeviceRequest(zzala, zzng1, s1));
            }

            
            {
                zzakY = zzmz.this;
                zzala = s;
                super(googleapiclient);
            }
        });
    }
}
