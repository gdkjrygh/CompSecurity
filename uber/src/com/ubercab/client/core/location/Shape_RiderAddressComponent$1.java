// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.location:
//            Shape_RiderAddressComponent, RiderAddressComponent

final class 
    implements android.os.derAddressComponent._cls1
{

    private static RiderAddressComponent a(Parcel parcel)
    {
        return new Shape_RiderAddressComponent(parcel, (byte)0);
    }

    private static RiderAddressComponent[] a(int i)
    {
        return new RiderAddressComponent[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
