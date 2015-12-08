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

        final FullWalletRequest zzaIl;

        public FullWalletRequest build()
        {
            return zzaIl;
        }

        public Builder setCart(Cart cart)
        {
            zzaIl.zzaIk = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaIl.zzaHZ = s;
            return this;
        }

        private Builder()
        {
            zzaIl = FullWalletRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    String zzaHZ;
    String zzaIa;
    Cart zzaIk;
    private final int zzzH;

    FullWalletRequest()
    {
        zzzH = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        zzzH = i;
        zzaHZ = s;
        zzaIa = s1;
        zzaIk = cart;
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

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

}
