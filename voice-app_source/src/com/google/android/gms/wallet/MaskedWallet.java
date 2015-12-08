// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            zzk, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWallet zzaRh;

        public MaskedWallet build()
        {
            return zzaRh;
        }

        public Builder setBillingAddress(Address address)
        {
            zzaRh.zzaQq = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            zzaRh.zzaQt = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            zzaRh.zzaQu = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            zzaRh.zzaQp = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaRh.zzaQm = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            zzaRh.zzaQv = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            zzaRh.zzaRf = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaRh.zzaQn = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            zzaRh.zzaRg = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            zzaRh.zzaQs = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            zzaRh.zzaQr = address;
            return this;
        }

        private Builder()
        {
            zzaRh = MaskedWallet.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    private final int zzCY;
    String zzaQm;
    String zzaQn;
    String zzaQp;
    Address zzaQq;
    Address zzaQr;
    String zzaQs[];
    UserAddress zzaQt;
    UserAddress zzaQu;
    InstrumentInfo zzaQv[];
    LoyaltyWalletObject zzaRf[];
    OfferWalletObject zzaRg[];

    private MaskedWallet()
    {
        zzCY = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        zzCY = i;
        zzaQm = s;
        zzaQn = s1;
        zzaQs = as;
        zzaQp = s2;
        zzaQq = address;
        zzaQr = address1;
        zzaRf = aloyaltywalletobject;
        zzaRg = aofferwalletobject;
        zzaQt = useraddress;
        zzaQu = useraddress1;
        zzaQv = ainstrumentinfo;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        zzu.zzu(maskedwallet);
        return zzAJ().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public static Builder zzAJ()
    {
        MaskedWallet maskedwallet = new MaskedWallet();
        maskedwallet.getClass();
        return maskedwallet. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return zzaQq;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return zzaQt;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return zzaQu;
    }

    public String getEmail()
    {
        return zzaQp;
    }

    public String getGoogleTransactionId()
    {
        return zzaQm;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return zzaQv;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return zzaRf;
    }

    public String getMerchantTransactionId()
    {
        return zzaQn;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return zzaRg;
    }

    public String[] getPaymentDescriptions()
    {
        return zzaQs;
    }

    public Address getShippingAddress()
    {
        return zzaQr;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
