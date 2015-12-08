// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wallet:
//            zzp

public final class PaymentMethodTokenizationParameters
    implements SafeParcelable
{
    public final class Builder
    {

        final PaymentMethodTokenizationParameters zzaJs;

        public Builder addParameter(String s, String s1)
        {
            zzv.zzh(s, "Tokenization parameter name must not be empty");
            zzv.zzh(s1, "Tokenization parameter value must not be empty");
            zzaJs.zzavQ.putString(s, s1);
            return this;
        }

        public PaymentMethodTokenizationParameters build()
        {
            return zzaJs;
        }

        public Builder setPaymentMethodTokenizationType(int i)
        {
            zzaJs.zzaJp = i;
            return this;
        }

        private Builder()
        {
            zzaJs = PaymentMethodTokenizationParameters.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    int zzaJp;
    Bundle zzavQ;
    private final int zzzH;

    private PaymentMethodTokenizationParameters()
    {
        zzavQ = new Bundle();
        zzzH = 1;
    }

    PaymentMethodTokenizationParameters(int i, int j, Bundle bundle)
    {
        zzavQ = new Bundle();
        zzzH = i;
        zzaJp = j;
        zzavQ = bundle;
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

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

}
