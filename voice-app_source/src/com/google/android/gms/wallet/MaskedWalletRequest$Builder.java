// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart, PaymentMethodTokenizationParameters

public final class <init>
{

    final MaskedWalletRequest zzaRv;

    public <init> addAllowedCardNetwork(int i)
    {
        if (zzaRv.zzaRu == null)
        {
            zzaRv.zzaRu = new ArrayList();
        }
        zzaRv.zzaRu.add(Integer.valueOf(i));
        return this;
    }

    public zzaRv addAllowedCardNetworks(Collection collection)
    {
        if (collection != null)
        {
            if (zzaRv.zzaRu == null)
            {
                zzaRv.zzaRu = new ArrayList();
            }
            zzaRv.zzaRu.addAll(collection);
        }
        return this;
    }

    public fication addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
    {
        if (zzaRv.zzaRs == null)
        {
            zzaRv.zzaRs = new ArrayList();
        }
        zzaRv.zzaRs.add(countryspecification);
        return this;
    }

    public zzaRv addAllowedCountrySpecificationsForShipping(Collection collection)
    {
        if (collection != null)
        {
            if (zzaRv.zzaRs == null)
            {
                zzaRv.zzaRs = new ArrayList();
            }
            zzaRv.zzaRs.addAll(collection);
        }
        return this;
    }

    public MaskedWalletRequest build()
    {
        return zzaRv;
    }

    public zzaRv setAllowDebitCard(boolean flag)
    {
        zzaRv.zzaRr = flag;
        return this;
    }

    public zzaRv setAllowPrepaidCard(boolean flag)
    {
        zzaRv.zzaRq = flag;
        return this;
    }

    public zzaRv setCart(Cart cart)
    {
        zzaRv.zzaQx = cart;
        return this;
    }

    public zzaRv setCurrencyCode(String s)
    {
        zzaRv.zzaQg = s;
        return this;
    }

    public zzaRv setEstimatedTotalPrice(String s)
    {
        zzaRv.zzaRl = s;
        return this;
    }

    public zzaRv setIsBillingAgreement(boolean flag)
    {
        zzaRv.zzaRo = flag;
        return this;
    }

    public zzaRv setMerchantName(String s)
    {
        zzaRv.zzaRm = s;
        return this;
    }

    public zzaRv setMerchantTransactionId(String s)
    {
        zzaRv.zzaQn = s;
        return this;
    }

    public ameters setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzaRv.zzaRt = paymentmethodtokenizationparameters;
        return this;
    }

    public zzaRv setPhoneNumberRequired(boolean flag)
    {
        zzaRv.zzaRi = flag;
        return this;
    }

    public zzaRv setShippingAddressRequired(boolean flag)
    {
        zzaRv.zzaRj = flag;
        return this;
    }

    public zzaRv setShouldRetrieveWalletObjects(boolean flag)
    {
        zzaRv.zzaRn = flag;
        return this;
    }

    public zzaRv setUseMinimalBillingAddress(boolean flag)
    {
        zzaRv.zzaRk = flag;
        return this;
    }

    private ameters(MaskedWalletRequest maskedwalletrequest)
    {
        zzaRv = maskedwalletrequest;
        super();
    }

    zzaRv(MaskedWalletRequest maskedwalletrequest, zzaRv zzarv)
    {
        this(maskedwalletrequest);
    }
}
