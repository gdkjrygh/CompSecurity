// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelCreateAccountRequest

public abstract class AirtelCreateAccountRequest
{

    public AirtelCreateAccountRequest()
    {
    }

    public static AirtelCreateAccountRequest create(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8)
    {
        return (new Shape_AirtelCreateAccountRequest()).setMobilePhoneNumber(s).setDevice(s1).setDeviceId(s2).setEncryptedMpin(s3).setAirtelMoneyToken(s4).setFirstName(s5).setLastName(s6).setDateOfBirth(s7).setEmail(s8);
    }

    public abstract String getAirtelMoneyToken();

    public abstract String getDateOfBirth();

    public abstract String getDevice();

    public abstract String getDeviceId();

    public abstract String getEmail();

    public abstract String getEncryptedMpin();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getMobilePhoneNumber();

    abstract AirtelCreateAccountRequest setAirtelMoneyToken(String s);

    abstract AirtelCreateAccountRequest setDateOfBirth(String s);

    abstract AirtelCreateAccountRequest setDevice(String s);

    abstract AirtelCreateAccountRequest setDeviceId(String s);

    abstract AirtelCreateAccountRequest setEmail(String s);

    abstract AirtelCreateAccountRequest setEncryptedMpin(String s);

    abstract AirtelCreateAccountRequest setFirstName(String s);

    abstract AirtelCreateAccountRequest setLastName(String s);

    abstract AirtelCreateAccountRequest setMobilePhoneNumber(String s);
}
