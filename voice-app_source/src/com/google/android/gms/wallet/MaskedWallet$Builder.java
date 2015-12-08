// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWallet, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class <init>
{

    final MaskedWallet zzaRh;

    public MaskedWallet build()
    {
        return zzaRh;
    }

    public zzaRh setBillingAddress(Address address)
    {
        zzaRh.zzaQq = address;
        return this;
    }

    public ddress setBuyerBillingAddress(UserAddress useraddress)
    {
        zzaRh.zzaQt = useraddress;
        return this;
    }

    public ddress setBuyerShippingAddress(UserAddress useraddress)
    {
        zzaRh.zzaQu = useraddress;
        return this;
    }

    public zzaRh setEmail(String s)
    {
        zzaRh.zzaQp = s;
        return this;
    }

    public zzaRh setGoogleTransactionId(String s)
    {
        zzaRh.zzaQm = s;
        return this;
    }

    public zzaRh setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
    {
        zzaRh.zzaQv = ainstrumentinfo;
        return this;
    }

    public zzaRh setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
    {
        zzaRh.zzaRf = aloyaltywalletobject;
        return this;
    }

    public zzaRh setMerchantTransactionId(String s)
    {
        zzaRh.zzaQn = s;
        return this;
    }

    public zzaRh setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
    {
        zzaRh.zzaRg = aofferwalletobject;
        return this;
    }

    public zzaRh setPaymentDescriptions(String as[])
    {
        zzaRh.zzaQs = as;
        return this;
    }

    public zzaRh setShippingAddress(Address address)
    {
        zzaRh.zzaQr = address;
        return this;
    }

    private ddress(MaskedWallet maskedwallet)
    {
        zzaRh = maskedwallet;
        super();
    }

    zzaRh(MaskedWallet maskedwallet, zzaRh zzarh)
    {
        this(maskedwallet);
    }
}
