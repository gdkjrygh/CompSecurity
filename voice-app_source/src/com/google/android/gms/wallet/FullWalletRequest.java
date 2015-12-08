// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzf, Cart

public final class FullWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final FullWalletRequest zzaQy;

        public FullWalletRequest build()
        {
            return zzaQy;
        }

        public Builder setCart(Cart cart)
        {
            zzaQy.zzaQx = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaQy.zzaQm = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaQy.zzaQn = s;
            return this;
        }

        private Builder()
        {
            zzaQy = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final int zzCY;
    String zzaQm;
    String zzaQn;
    Cart zzaQx;

    FullWalletRequest()
    {
        zzCY = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        zzCY = i;
        zzaQm = s;
        zzaQn = s1;
        zzaQx = cart;
    }

    public static Builder newBuilder()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return fullwalletrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Cart getCart()
    {
        return zzaQx;
    }

    public String getGoogleTransactionId()
    {
        return zzaQm;
    }

    public String getMerchantTransactionId()
    {
        return zzaQn;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

}
