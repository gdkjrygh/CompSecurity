// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.location:
//            zzi

public final class LocationSettingsStates
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final int zzCY;
    private final boolean zzayg;
    private final boolean zzayh;
    private final boolean zzayi;
    private final boolean zzayj;
    private final boolean zzayk;
    private final boolean zzayl;
    private final boolean zzaym;

    LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        zzCY = i;
        zzayg = flag;
        zzayh = flag1;
        zzayi = flag2;
        zzayj = flag3;
        zzayk = flag4;
        zzayl = flag5;
        zzaym = flag6;
    }

    public static LocationSettingsStates fromIntent(Intent intent)
    {
        return (LocationSettingsStates)zzc.zza(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean isBlePresent()
    {
        return zzayl;
    }

    public boolean isBleUsable()
    {
        return zzayi;
    }

    public boolean isGpsPresent()
    {
        return zzayj;
    }

    public boolean isGpsUsable()
    {
        return zzayg;
    }

    public boolean isLocationPresent()
    {
        return zzayj || zzayk;
    }

    public boolean isLocationUsable()
    {
        return zzayg || zzayh;
    }

    public boolean isNetworkLocationPresent()
    {
        return zzayk;
    }

    public boolean isNetworkLocationUsable()
    {
        return zzayh;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public boolean zzus()
    {
        return zzaym;
    }

}
