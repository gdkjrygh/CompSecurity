// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;

// Referenced classes of package com.google.android.gms.location:
//            zzh

public final class LocationSettingsStates
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final int mVersionCode;
    private final boolean zzaCi;
    private final boolean zzaCj;
    private final boolean zzaCk;
    private final boolean zzaCl;
    private final boolean zzaCm;
    private final boolean zzaCn;
    private final boolean zzaCo;

    LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        mVersionCode = i;
        zzaCi = flag;
        zzaCj = flag1;
        zzaCk = flag2;
        zzaCl = flag3;
        zzaCm = flag4;
        zzaCn = flag5;
        zzaCo = flag6;
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
        return mVersionCode;
    }

    public boolean isBlePresent()
    {
        return zzaCn;
    }

    public boolean isBleUsable()
    {
        return zzaCk;
    }

    public boolean isGpsPresent()
    {
        return zzaCl;
    }

    public boolean isGpsUsable()
    {
        return zzaCi;
    }

    public boolean isLocationPresent()
    {
        return zzaCl || zzaCm;
    }

    public boolean isLocationUsable()
    {
        return zzaCi || zzaCj;
    }

    public boolean isNetworkLocationPresent()
    {
        return zzaCm;
    }

    public boolean isNetworkLocationUsable()
    {
        return zzaCj;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public boolean zzvM()
    {
        return zzaCo;
    }

}
