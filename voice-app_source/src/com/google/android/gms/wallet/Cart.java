// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.wallet:
//            zzb, LineItem

public final class Cart
    implements SafeParcelable
{
    public final class Builder
    {

        final Cart zzaQi;

        public Builder addLineItem(LineItem lineitem)
        {
            zzaQi.zzaQh.add(lineitem);
            return this;
        }

        public Cart build()
        {
            return zzaQi;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaQi.zzaQg = s;
            return this;
        }

        public Builder setLineItems(List list)
        {
            zzaQi.zzaQh.clear();
            zzaQi.zzaQh.addAll(list);
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            zzaQi.zzaQf = s;
            return this;
        }

        private Builder()
        {
            zzaQi = Cart.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int zzCY;
    String zzaQf;
    String zzaQg;
    ArrayList zzaQh;

    Cart()
    {
        zzCY = 1;
        zzaQh = new ArrayList();
    }

    Cart(int i, String s, String s1, ArrayList arraylist)
    {
        zzCY = i;
        zzaQf = s;
        zzaQg = s1;
        zzaQh = arraylist;
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

    public String getCurrencyCode()
    {
        return zzaQg;
    }

    public ArrayList getLineItems()
    {
        return zzaQh;
    }

    public String getTotalPrice()
    {
        return zzaQf;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
