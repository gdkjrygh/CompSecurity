// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.z;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            w, LocationSettingsStates

public final class LocationSettingsResult
    implements z, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    private final int a;
    private final Status b;
    private final LocationSettingsStates c;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        a = i;
        b = status;
        c = locationsettingsstates;
    }

    public Status a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }

    public LocationSettingsStates c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}
