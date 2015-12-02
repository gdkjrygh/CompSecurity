// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.body.payment.TokenData;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_CreatePaymentProfileBody

public abstract class CreatePaymentProfileBody
{

    public static final String PAYMENT_TYPE_AIRTEL_MONEY = "airtel_money";
    public static final String PAYMENT_TYPE_ALIPAY = "alipay";
    public static final String PAYMENT_TYPE_BAIDU_WALLET = "baidu_wallet";
    public static final String PAYMENT_TYPE_BANK_CARD = "bank_card";
    public static final String PAYMENT_TYPE_CASH = "cash";
    public static final String PAYMENT_TYPE_LIANLIAN = "lianlian";
    public static final String PAYMENT_TYPE_PAYPAL = "paypal";
    public static final String PAYMENT_TYPE_PAYTM = "paytm";

    public CreatePaymentProfileBody()
    {
    }

    public static CreatePaymentProfileBody create(String s, TokenData tokendata)
    {
        return (new Shape_CreatePaymentProfileBody()).setTokenType(s).setTokenData(tokendata);
    }

    public static CreatePaymentProfileBody createCash()
    {
        return (new Shape_CreatePaymentProfileBody()).setTokenType("cash");
    }

    public abstract TokenData getTokenData();

    public abstract String getTokenType();

    abstract CreatePaymentProfileBody setTokenData(TokenData tokendata);

    abstract CreatePaymentProfileBody setTokenType(String s);
}
