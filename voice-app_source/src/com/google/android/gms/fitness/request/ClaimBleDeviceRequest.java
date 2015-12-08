// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzb

public class ClaimBleDeviceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int zzCY;
    private final String zzMZ;
    private final String zzalL;
    private final BleDevice zzalM;
    private final zzmu zzalN;

    ClaimBleDeviceRequest(int i, String s, BleDevice bledevice, IBinder ibinder, String s1)
    {
        zzCY = i;
        zzalL = s;
        zzalM = bledevice;
        if (ibinder == null)
        {
            s = null;
        } else
        {
            s = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = s;
        zzMZ = s1;
    }

    public ClaimBleDeviceRequest(String s, BleDevice bledevice, zzmu zzmu1, String s1)
    {
        zzCY = 3;
        zzalL = s;
        zzalM = bledevice;
        zzalN = zzmu1;
        zzMZ = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDeviceAddress()
    {
        return zzalL;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[] {
            zzalL, zzalM
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public BleDevice zzqT()
    {
        return zzalM;
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

}
