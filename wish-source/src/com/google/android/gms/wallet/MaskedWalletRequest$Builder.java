// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart, PaymentMethodTokenizationParameters

public final class <init>
{

    final MaskedWalletRequest zzaJk;

    public MaskedWalletRequest build()
    {
        return zzaJk;
    }

    public zzaJk setCart(Cart cart)
    {
        zzaJk.zzaIk = cart;
        return this;
    }

    public zzaJk setCurrencyCode(String s)
    {
        zzaJk.zzaHT = s;
        return this;
    }

    public zzaJk setEstimatedTotalPrice(String s)
    {
        zzaJk.zzaJb = s;
        return this;
    }

    public zzaJk setIsBillingAgreement(boolean flag)
    {
        zzaJk.zzaJe = flag;
        return this;
    }

    public zzaJk setMerchantName(String s)
    {
        zzaJk.zzaJc = s;
        return this;
    }

    public ameters setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzaJk.zzaJj = paymentmethodtokenizationparameters;
        return this;
    }

    public zzaJk setPhoneNumberRequired(boolean flag)
    {
        zzaJk.zzaIY = flag;
        return this;
    }

    public zzaJk setShippingAddressRequired(boolean flag)
    {
        zzaJk.zzaIZ = flag;
        return this;
    }

    private ameters(MaskedWalletRequest maskedwalletrequest)
    {
        zzaJk = maskedwalletrequest;
        super();
    }

    zzaJk(MaskedWalletRequest maskedwalletrequest, zzaJk zzajk)
    {
        this(maskedwalletrequest);
    }
}
