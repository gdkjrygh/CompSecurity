// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body.payment;


// Referenced classes of package com.ubercab.rider.realtime.request.body.payment:
//            TokenData, Shape_TokenDataBankCard, BankCard

public abstract class TokenDataBankCard
    implements TokenData
{

    public static final String USE_CASE_BUSINESS = "business";
    public static final String USE_CASE_PERSONAL = "personal";

    public TokenDataBankCard()
    {
    }

    public static TokenDataBankCard create(String s, String s1, String s2)
    {
        return (new Shape_TokenDataBankCard()).setBillingCountryIso2(s).setBillingZip(s1).setUseCase(s2);
    }

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract BankCard getBraintree();

    public abstract String getUseCase();

    public abstract BankCard getZaakpay();

    abstract TokenDataBankCard setBillingCountryIso2(String s);

    abstract TokenDataBankCard setBillingZip(String s);

    public abstract TokenDataBankCard setBraintree(BankCard bankcard);

    abstract TokenDataBankCard setUseCase(String s);

    public abstract TokenDataBankCard setZaakpay(BankCard bankcard);
}
