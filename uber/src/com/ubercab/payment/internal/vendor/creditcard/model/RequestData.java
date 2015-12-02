// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.creditcard.model;

import com.ubercab.payment.internal.model.GatewayInfo;
import com.ubercab.payment.internal.model.TokenData;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.ubercab.payment.internal.vendor.creditcard.model:
//            Shape_RequestData

public abstract class RequestData
{

    private static final String PARAMETER_BRAINTREE = "braintree";
    private static final String PARAMETER_CARD_CODE = "card_code";
    private static final String PARAMETER_CARD_EXPIRATION_MONTH = "card_expiration_month";
    private static final String PARAMETER_CARD_EXPIRATION_YEAR = "card_expiration_year";
    private static final String PARAMETER_CARD_IO = "cardio";
    private static final String PARAMETER_CARD_NUMBER = "card_number";
    private static final String PARAMETER_COUNTRY_ISO2 = "billing_country_iso2";
    private static final String PARAMETER_TOKEN_DATA = "token_data";
    private static final String PARAMETER_USE_CASE = "use_case";
    private static final String PARAMETER_ZAAKPAY = "zaakpay";
    private static final String PARAMETER_ZIP = "billing_zip";

    public RequestData()
    {
    }

    public static RequestData create(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9, boolean flag, String s10)
    {
        s2 = TokenData.create(GatewayInfo.create(s2, s3, s4, s5), GatewayInfo.create(s6, s7, s8, s9));
        return (new Shape_RequestData()).setBillingCountryIso2(s).setBillingZip(s1).setCardio(flag).setUseCase(s10).setTokenData(s2);
    }

    public Map generateDataCollectionParameters()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("billing_country_iso2", getBillingCountryIso2());
        hashmap.put("billing_zip", getBillingZip());
        hashmap.put("cardio", Boolean.valueOf(getCardio()));
        hashmap.put("use_case", getUseCase());
        HashMap hashmap1 = new HashMap();
        hashmap1.put("card_code", getTokenData().getBraintree().getCardCode());
        hashmap1.put("card_number", getTokenData().getBraintree().getCardNumber());
        hashmap1.put("card_expiration_month", getTokenData().getBraintree().getCardExpirationMonth());
        hashmap1.put("card_expiration_year", getTokenData().getBraintree().getCardExpirationYear());
        HashMap hashmap2 = new HashMap();
        hashmap2.put("card_code", getTokenData().getZaakpay().getCardCode());
        hashmap2.put("card_number", getTokenData().getZaakpay().getCardNumber());
        hashmap2.put("card_expiration_month", getTokenData().getZaakpay().getCardExpirationMonth());
        hashmap2.put("card_expiration_year", getTokenData().getZaakpay().getCardExpirationYear());
        HashMap hashmap3 = new HashMap();
        hashmap3.put("braintree", hashmap1);
        hashmap3.put("zaakpay", hashmap2);
        hashmap.put("token_data", hashmap3);
        return hashmap;
    }

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract boolean getCardio();

    public abstract TokenData getTokenData();

    public abstract String getUseCase();

    abstract RequestData setBillingCountryIso2(String s);

    public abstract RequestData setBillingZip(String s);

    public abstract RequestData setCardio(boolean flag);

    public abstract RequestData setTokenData(TokenData tokendata);

    public abstract RequestData setUseCase(String s);
}
