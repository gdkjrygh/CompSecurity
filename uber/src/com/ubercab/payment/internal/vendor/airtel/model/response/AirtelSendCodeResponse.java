// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel.model.response;


// Referenced classes of package com.ubercab.payment.internal.vendor.airtel.model.response:
//            Shape_AirtelSendCodeResponse

public abstract class AirtelSendCodeResponse
{

    public AirtelSendCodeResponse()
    {
    }

    public static AirtelSendCodeResponse create(String s)
    {
        return (new Shape_AirtelSendCodeResponse()).setOtpRequestToken(s);
    }

    public abstract String getOtpRequestToken();

    abstract AirtelSendCodeResponse setOtpRequestToken(String s);
}
