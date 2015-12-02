// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.zaakpay.model;

import com.ubercab.payment.internal.model.GatewayInfo;
import com.ubercab.payment.internal.model.TokenData;
import com.ubercab.payment.model.PaymentProfile;

// Referenced classes of package com.ubercab.payment.internal.vendor.zaakpay.model:
//            Shape_ChargeBillRequestData

public abstract class ChargeBillRequestData
{

    public ChargeBillRequestData()
    {
    }

    public static ChargeBillRequestData create(PaymentProfile paymentprofile, GatewayInfo gatewayinfo)
    {
        return (new Shape_ChargeBillRequestData()).setPaymentProfileUUID(paymentprofile.getUuid()).setBillingZip(paymentprofile.getBillingZip()).setBillingCountryIso2(paymentprofile.getBillingCountryIso2()).setUseCase("Personal").setCardio(false).setTokenData(TokenData.create(null, gatewayinfo));
    }

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract boolean getCardio();

    public abstract String getPaymentProfileUUID();

    public abstract TokenData getTokenData();

    public abstract String getUseCase();

    public abstract ChargeBillRequestData setBillingCountryIso2(String s);

    public abstract ChargeBillRequestData setBillingZip(String s);

    public abstract ChargeBillRequestData setCardio(boolean flag);

    public abstract ChargeBillRequestData setPaymentProfileUUID(String s);

    public abstract ChargeBillRequestData setTokenData(TokenData tokendata);

    public abstract ChargeBillRequestData setUseCase(String s);
}
