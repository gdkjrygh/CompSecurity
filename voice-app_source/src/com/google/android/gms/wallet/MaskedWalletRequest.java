// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.wallet:
//            zzl, Cart, CountrySpecification, PaymentMethodTokenizationParameters

public final class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWalletRequest zzaRv;

        public Builder addAllowedCardNetwork(int i)
        {
            if (zzaRv.zzaRu == null)
            {
                zzaRv.zzaRu = new ArrayList();
            }
            zzaRv.zzaRu.add(Integer.valueOf(i));
            return this;
        }

        public Builder addAllowedCardNetworks(Collection collection)
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

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if (zzaRv.zzaRs == null)
            {
                zzaRv.zzaRs = new ArrayList();
            }
            zzaRv.zzaRs.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
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

        public Builder setAllowDebitCard(boolean flag)
        {
            zzaRv.zzaRr = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            zzaRv.zzaRq = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            zzaRv.zzaQx = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaRv.zzaQg = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            zzaRv.zzaRl = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            zzaRv.zzaRo = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            zzaRv.zzaRm = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaRv.zzaQn = s;
            return this;
        }

        public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
        {
            zzaRv.zzaRt = paymentmethodtokenizationparameters;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            zzaRv.zzaRi = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            zzaRv.zzaRj = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            zzaRv.zzaRn = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            zzaRv.zzaRk = flag;
            return this;
        }

        private Builder()
        {
            zzaRv = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final int zzCY;
    String zzaQg;
    String zzaQn;
    Cart zzaQx;
    boolean zzaRi;
    boolean zzaRj;
    boolean zzaRk;
    String zzaRl;
    String zzaRm;
    boolean zzaRn;
    boolean zzaRo;
    com.google.android.gms.wallet.CountrySpecification zzaRp[];
    boolean zzaRq;
    boolean zzaRr;
    ArrayList zzaRs;
    PaymentMethodTokenizationParameters zzaRt;
    ArrayList zzaRu;

    MaskedWalletRequest()
    {
        zzCY = 3;
        zzaRq = true;
        zzaRr = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist, PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, ArrayList arraylist1)
    {
        zzCY = i;
        zzaQn = s;
        zzaRi = flag;
        zzaRj = flag1;
        zzaRk = flag2;
        zzaRl = s1;
        zzaQg = s2;
        zzaRm = s3;
        zzaQx = cart;
        zzaRn = flag3;
        zzaRo = flag4;
        zzaRp = acountryspecification;
        zzaRq = flag5;
        zzaRr = flag6;
        zzaRs = arraylist;
        zzaRt = paymentmethodtokenizationparameters;
        zzaRu = arraylist1;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return zzaRr;
    }

    public boolean allowPrepaidCard()
    {
        return zzaRq;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCardNetworks()
    {
        return zzaRu;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return zzaRs;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return zzaRp;
    }

    public Cart getCart()
    {
        return zzaQx;
    }

    public String getCurrencyCode()
    {
        return zzaQg;
    }

    public String getEstimatedTotalPrice()
    {
        return zzaRl;
    }

    public String getMerchantName()
    {
        return zzaRm;
    }

    public String getMerchantTransactionId()
    {
        return zzaQn;
    }

    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters()
    {
        return zzaRt;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean isBillingAgreement()
    {
        return zzaRo;
    }

    public boolean isPhoneNumberRequired()
    {
        return zzaRi;
    }

    public boolean isShippingAddressRequired()
    {
        return zzaRj;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return zzaRn;
    }

    public boolean useMinimalBillingAddress()
    {
        return zzaRk;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

}
