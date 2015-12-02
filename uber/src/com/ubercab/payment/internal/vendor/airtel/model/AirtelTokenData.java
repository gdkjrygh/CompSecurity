// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model:
//            Shape_AirtelTokenData

public abstract class AirtelTokenData
    implements Parcelable
{

    public AirtelTokenData()
    {
    }

    public static AirtelTokenData create(String s, String s1, String s2)
    {
        return (new Shape_AirtelTokenData()).setAirtelMoneyToken(s).setMobilePhoneNumber(s1).setPaymentReferenceNo(s2);
    }

    public abstract String getAirtelMoneyToken();

    public abstract String getMobilePhoneNumber();

    public abstract String getPaymentReferenceNo();

    abstract AirtelTokenData setAirtelMoneyToken(String s);

    abstract AirtelTokenData setMobilePhoneNumber(String s);

    abstract AirtelTokenData setPaymentReferenceNo(String s);
}
