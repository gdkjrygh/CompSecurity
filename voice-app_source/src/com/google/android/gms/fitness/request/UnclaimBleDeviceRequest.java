// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzad

public class UnclaimBleDeviceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzad();
    private final int zzCY;
    private final String zzMZ;
    private final String zzalL;
    private final zzmu zzalN;

    UnclaimBleDeviceRequest(int i, String s, IBinder ibinder, String s1)
    {
        zzCY = i;
        zzalL = s;
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

    public UnclaimBleDeviceRequest(String s, zzmu zzmu1, String s1)
    {
        zzCY = 4;
        zzalL = s;
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
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[] {
            zzalL
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
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
