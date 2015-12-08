// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzl, Cart, CountrySpecification, PaymentMethodTokenizationParameters

public final class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final MaskedWalletRequest zzaJk;

        public MaskedWalletRequest build()
        {
            return zzaJk;
        }

        public Builder setCart(Cart cart)
        {
            zzaJk.zzaIk = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaJk.zzaHT = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            zzaJk.zzaJb = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            zzaJk.zzaJe = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            zzaJk.zzaJc = s;
            return this;
        }

        public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
        {
            zzaJk.zzaJj = paymentmethodtokenizationparameters;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            zzaJk.zzaIY = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            zzaJk.zzaIZ = flag;
            return this;
        }

        private Builder()
        {
            zzaJk = MaskedWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    String zzaHT;
    boolean zzaIY;
    boolean zzaIZ;
    String zzaIa;
    Cart zzaIk;
    boolean zzaJa;
    String zzaJb;
    String zzaJc;
    boolean zzaJd;
    boolean zzaJe;
    CountrySpecification zzaJf[];
    boolean zzaJg;
    boolean zzaJh;
    ArrayList zzaJi;
    PaymentMethodTokenizationParameters zzaJj;
    private final int zzzH;

    MaskedWalletRequest()
    {
        zzzH = 3;
        zzaJg = true;
        zzaJh = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist, PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzzH = i;
        zzaIa = s;
        zzaIY = flag;
        zzaIZ = flag1;
        zzaJa = flag2;
        zzaJb = s1;
        zzaHT = s2;
        zzaJc = s3;
        zzaIk = cart;
        zzaJd = flag3;
        zzaJe = flag4;
        zzaJf = acountryspecification;
        zzaJg = flag5;
        zzaJh = flag6;
        zzaJi = arraylist;
        zzaJj = paymentmethodtokenizationparameters;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

}
