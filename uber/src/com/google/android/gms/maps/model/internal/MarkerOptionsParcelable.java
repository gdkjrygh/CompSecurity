// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import azi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements SafeParcelable
{

    public static final azi CREATOR = new azi();
    private final int a;
    private BitmapDescriptorParcelable b;

    public MarkerOptionsParcelable()
    {
        a = 1;
    }

    public MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        a = i;
        b = bitmapdescriptorparcelable;
    }

    public final int a()
    {
        return a;
    }

    public final BitmapDescriptorParcelable b()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azi.a(this, parcel, i);
    }

}
