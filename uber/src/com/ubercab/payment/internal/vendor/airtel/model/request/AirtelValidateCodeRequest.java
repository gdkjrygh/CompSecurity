// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.request;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.request:
//            Shape_AirtelValidateCodeRequest

public abstract class AirtelValidateCodeRequest
{

    public AirtelValidateCodeRequest()
    {
    }

    public static AirtelValidateCodeRequest create(String s, String s1, String s2, String s3, String s4)
    {
        return (new Shape_AirtelValidateCodeRequest()).setDevice(s).setDeviceId(s1).setMobilePhoneNumber(s2).setOtpCode(s3).setOtpRequestToken(s4);
    }

    public abstract String getDevice();

    public abstract String getDeviceId();

    public abstract String getMobilePhoneNumber();

    public abstract String getOtpCode();

    public abstract String getOtpRequestToken();

    abstract AirtelValidateCodeRequest setDevice(String s);

    abstract AirtelValidateCodeRequest setDeviceId(String s);

    abstract AirtelValidateCodeRequest setMobilePhoneNumber(String s);

    abstract AirtelValidateCodeRequest setOtpCode(String s);

    abstract AirtelValidateCodeRequest setOtpRequestToken(String s);
}
