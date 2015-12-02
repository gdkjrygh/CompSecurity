// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network.model;


// Referenced classes of package com.ubercab.payment.internal.network.model:
//            Shape_CreateThirdPartyPaymentProfileRequest

public abstract class CreateThirdPartyPaymentProfileRequest
{

    public CreateThirdPartyPaymentProfileRequest()
    {
    }

    public static CreateThirdPartyPaymentProfileRequest create(String s, Object obj)
    {
        return (new Shape_CreateThirdPartyPaymentProfileRequest()).setTokenData(obj).setTokenType(s);
    }

    public abstract Object getTokenData();

    public abstract String getTokenType();

    abstract CreateThirdPartyPaymentProfileRequest setTokenData(Object obj);

    abstract CreateThirdPartyPaymentProfileRequest setTokenType(String s);
}
