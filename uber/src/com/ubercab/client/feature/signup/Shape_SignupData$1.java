// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_SignupData, SignupData

final class 
    implements android.os.nup.Shape_SignupData._cls1
{

    private static SignupData a(Parcel parcel)
    {
        return new Shape_SignupData(parcel, (byte)0);
    }

    private static SignupData[] a(int i)
    {
        return new SignupData[i];
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
