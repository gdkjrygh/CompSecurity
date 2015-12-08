// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            zzh, LocationSettingsStates

public final class LocationSettingsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final int zzCY;
    private final Status zzOt;
    private final LocationSettingsStates zzayf;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        zzCY = i;
        zzOt = status;
        zzayf = locationsettingsstates;
    }

    public LocationSettingsResult(Status status)
    {
        this(1, status, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public LocationSettingsStates getLocationSettingsStates()
    {
        return zzayf;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

}
