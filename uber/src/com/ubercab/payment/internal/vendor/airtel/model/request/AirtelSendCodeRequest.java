// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelSendCodeRequest

public abstract class AirtelSendCodeRequest
{

    public AirtelSendCodeRequest()
    {
    }

    public static AirtelSendCodeRequest create(String s, String s1)
    {
        return (new Shape_AirtelSendCodeRequest()).setDevice(s).setMobilePhoneNumber(s1);
    }

    public abstract String getDevice();

    public abstract String getMobilePhoneNumber();

    abstract AirtelSendCodeRequest setDevice(String s);

    abstract AirtelSendCodeRequest setMobilePhoneNumber(String s);
}
