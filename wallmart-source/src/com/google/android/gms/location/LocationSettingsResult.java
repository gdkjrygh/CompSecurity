// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            zzg, LocationSettingsStates

public final class LocationSettingsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final int mVersionCode;
    private final Status zzQA;
    private final LocationSettingsStates zzaCh;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        mVersionCode = i;
        zzQA = status;
        zzaCh = locationsettingsstates;
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
        return zzaCh;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
