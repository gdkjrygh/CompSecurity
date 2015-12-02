// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            Shape_SignupData_PromoCode

final class 
    implements android.os.SignupData_PromoCode._cls1
{

    private static  a(Parcel parcel)
    {
        return new Shape_SignupData_PromoCode(parcel, (byte)0);
    }

    private static nit>[] a(int i)
    {
        return new nit>[i];
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
