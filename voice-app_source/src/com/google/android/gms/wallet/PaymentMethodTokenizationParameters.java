// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wallet:
//            zzp

public final class PaymentMethodTokenizationParameters
    implements SafeParcelable
{
    public final class Builder
    {

        final PaymentMethodTokenizationParameters zzaRA;

        public Builder addParameter(String s, String s1)
        {
            zzu.zzh(s, "Tokenization parameter name must not be empty");
            zzu.zzh(s1, "Tokenization parameter value must not be empty");
            zzaRA.zzaDN.putString(s, s1);
            return this;
        }

        public PaymentMethodTokenizationParameters build()
        {
            return zzaRA;
        }

        public Builder setPaymentMethodTokenizationType(int i)
        {
            zzaRA.zzaRz = i;
            return this;
        }

        private Builder()
        {
            zzaRA = PaymentMethodTokenizationParameters.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    private final int zzCY;
    Bundle zzaDN;
    int zzaRz;

    private PaymentMethodTokenizationParameters()
    {
        zzaDN = new Bundle();
        zzCY = 1;
    }

    PaymentMethodTokenizationParameters(int i, int j, Bundle bundle)
    {
        zzaDN = new Bundle();
        zzCY = i;
        zzaRz = j;
        zzaDN = bundle;
    }

    public static Builder newBuilder()
    {
        PaymentMethodTokenizationParameters paymentmethodtokenizationparameters = new PaymentMethodTokenizationParameters();
        paymentmethodtokenizationparameters.getClass();
        return paymentmethodtokenizationparameters. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Bundle getParameters()
    {
        return new Bundle(zzaDN);
    }

    public int getPaymentMethodTokenizationType()
    {
        return zzaRz;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

}
