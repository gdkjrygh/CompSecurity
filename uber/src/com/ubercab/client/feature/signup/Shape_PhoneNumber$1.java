// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_PhoneNumber, PhoneNumber

final class 
    implements android.os.up.Shape_PhoneNumber._cls1
{

    private static PhoneNumber a(Parcel parcel)
    {
        return new Shape_PhoneNumber(parcel, (byte)0);
    }

    private static PhoneNumber[] a(int i)
    {
        return new PhoneNumber[i];
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
