// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzc, BitmapDescriptorParcelable

public final class GroundOverlayOptionsParcelable
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    private final int zzCY;
    private BitmapDescriptorParcelable zzaDP;

    public GroundOverlayOptionsParcelable()
    {
        zzCY = 1;
    }

    GroundOverlayOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        zzCY = i;
        zzaDP = bitmapdescriptorparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public BitmapDescriptorParcelable zzvM()
    {
        return zzaDP;
    }

}
