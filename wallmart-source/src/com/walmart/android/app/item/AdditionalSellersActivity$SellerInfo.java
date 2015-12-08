// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.walmart.android.app.item:
//            AdditionalSellersActivity

private static class submap
    implements Parcelable
{

    public static final android.os.tivity.SellerInfo.submap CREATOR = new android.os.Parcelable.Creator() {

        public AdditionalSellersActivity.SellerInfo createFromParcel(Parcel parcel)
        {
            return new AdditionalSellersActivity.SellerInfo(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AdditionalSellersActivity.SellerInfo[] newArray(int i)
        {
            return new AdditionalSellersActivity.SellerInfo[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    final String id;
    final String name;
    final String price;
    final boolean submap;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeString(price);
        parcel.writeString(id);
        if (submap)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    protected _cls1(Parcel parcel)
    {
        name = parcel.readString();
        price = parcel.readString();
        id = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        submap = flag;
    }

    submap(String s, String s1, String s2, boolean flag)
    {
        name = s;
        price = s1;
        id = s2;
        submap = flag;
    }
}
