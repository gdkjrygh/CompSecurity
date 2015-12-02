// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model:
//            Shape_AirtelDepositErrorObject

public abstract class AirtelDepositErrorObject
{

    public AirtelDepositErrorObject()
    {
    }

    public static AirtelDepositErrorObject create(String s, String s1, String s2, String s3, String s4)
    {
        return (new Shape_AirtelDepositErrorObject()).setCardFirstDigits(s).setCardLastDigits(s1).setPayload(s2).setResponseUrl(s3).setWebAuthUrl(s4);
    }

    public abstract String getCardFirstDigits();

    public abstract String getCardLastDigits();

    public abstract String getPayload();

    public abstract String getResponseUrl();

    public abstract String getWebAuthUrl();

    abstract AirtelDepositErrorObject setCardFirstDigits(String s);

    abstract AirtelDepositErrorObject setCardLastDigits(String s);

    abstract AirtelDepositErrorObject setPayload(String s);

    abstract AirtelDepositErrorObject setResponseUrl(String s);

    abstract AirtelDepositErrorObject setWebAuthUrl(String s);
}
