// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;


// Referenced classes of package com.ubercab.payment.model:
//            Shape_PaymentProfile_Builder, PaymentProfile

public abstract class ilder
{

    static ilder create()
    {
        return new Shape_PaymentProfile_Builder();
    }

    public PaymentProfile build()
    {
        return PaymentProfile.access$000().setAccountName(getAccountName()).setCardExpirationEpoch(getCardExpirationEpoch()).setBillingCountryIso2(getBillingCountryIso2()).setBillingZip(getBillingZip()).setCardNumber(getCardNumber()).setCardType(getCardType()).setTokenDisplayName(getTokenDisplayName()).setTokenType(getTokenType()).setUseCase(getUseCase()).setUuid(getUuid()).setStatus(getStatus());
    }

    public abstract String getAccountName();

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract long getCardExpirationEpoch();

    public abstract String getCardNumber();

    public abstract String getCardType();

    public abstract String getStatus();

    public abstract String getTokenDisplayName();

    public abstract String getTokenType();

    public abstract String getUseCase();

    public abstract String getUuid();

    public abstract getStatus setAccountName(String s);

    public abstract getStatus setBillingCountryIso2(String s);

    public abstract getStatus setBillingZip(String s);

    public abstract getStatus setCardExpirationEpoch(long l);

    public abstract getStatus setCardNumber(String s);

    public abstract getStatus setCardType(String s);

    public abstract getStatus setStatus(String s);

    public abstract getStatus setTokenDisplayName(String s);

    public abstract getStatus setTokenType(String s);

    public abstract getStatus setUseCase(String s);

    public abstract getStatus setUuid(String s);

    public ilder()
    {
    }
}
