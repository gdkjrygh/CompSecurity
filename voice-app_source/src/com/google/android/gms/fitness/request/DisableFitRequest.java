// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzl

public class DisableFitRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;

    DisableFitRequest(int i, IBinder ibinder, String s)
    {
        zzCY = i;
        zzalN = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        zzMZ = s;
    }

    public DisableFitRequest(zzmu zzmu1, String s)
    {
        zzCY = 1;
        zzalN = zzmu1;
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
        return String.format("DisableFitRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzalN.asBinder();
    }

}
