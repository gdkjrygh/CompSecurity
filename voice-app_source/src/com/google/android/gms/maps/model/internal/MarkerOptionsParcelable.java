// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzm, BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements SafeParcelable
{

    public static final zzm CREATOR = new zzm();
    private final int zzCY;
    private BitmapDescriptorParcelable zzaDQ;

    public MarkerOptionsParcelable()
    {
        zzCY = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        zzCY = i;
        zzaDQ = bitmapdescriptorparcelable;
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
        zzm.zza(this, parcel, i);
    }

    public BitmapDescriptorParcelable zzvO()
    {
        return zzaDQ;
    }

}
