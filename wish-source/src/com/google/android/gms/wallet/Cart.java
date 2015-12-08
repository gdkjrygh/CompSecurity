// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzb

public final class Cart
    implements SafeParcelable
{
    public final class Builder
    {

        final Cart zzaHV;

        public Cart build()
        {
            return zzaHV;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaHV.zzaHT = s;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            zzaHV.zzaHS = s;
            return this;
        }

        private Builder()
        {
            zzaHV = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    String zzaHS;
    String zzaHT;
    ArrayList zzaHU;
    private final int zzzH;

    Cart()
    {
        zzzH = 1;
        zzaHU = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        zzzH = i;
        zzaHS = s;
        zzaHT = s1;
        zzaHU = arraylist;
    }

    public static Builder newBuilder()
    {
        Cart cart = new Cart();
        cart.getClass();
        return cart. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getTotalPrice()
    {
        return zzaHS;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
