// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzni;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzo

public class ListClaimedBleDevicesRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    private final int zzCY;
    private final String zzMZ;
    private final zzni zzamm;

    ListClaimedBleDevicesRequest(int i, IBinder ibinder, String s)
    {
        zzCY = i;
        zzamm = com.google.android.gms.internal.zzni.zza.zzbH(ibinder);
        zzMZ = s;
    }

    public ListClaimedBleDevicesRequest(zzni zzni1, String s)
    {
        zzCY = 1;
        zzamm = zzni1;
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
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
        return String.format("ListClaimedBleDevicesRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzamm.asBinder();
    }

}
