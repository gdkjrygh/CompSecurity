// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelLinkAccountRequest

public abstract class AirtelLinkAccountRequest
{

    public AirtelLinkAccountRequest()
    {
    }

    public static AirtelLinkAccountRequest create()
    {
        return new Shape_AirtelLinkAccountRequest();
    }

    public static AirtelLinkAccountRequest create(String s, String s1, String s2, String s3, String s4)
    {
        return (new Shape_AirtelLinkAccountRequest()).setMobilePhoneNumber(s).setDevice(s1).setDeviceId(s2).setEncryptedMpin(s3).setAirtelMoneyToken(s4);
    }

    public abstract String getAirtelMoneyToken();

    public abstract String getDevice();

    public abstract String getDeviceId();

    public abstract String getEncryptedMpin();

    public abstract String getMobilePhoneNumber();

    abstract AirtelLinkAccountRequest setAirtelMoneyToken(String s);

    abstract AirtelLinkAccountRequest setDevice(String s);

    abstract AirtelLinkAccountRequest setDeviceId(String s);

    abstract AirtelLinkAccountRequest setEncryptedMpin(String s);

    abstract AirtelLinkAccountRequest setMobilePhoneNumber(String s);
}
