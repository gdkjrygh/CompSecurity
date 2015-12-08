// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.os.Parcel;

// Referenced classes of package com.walmart.android.service.wishlist:
//            AddItemBase

public class AddItemUsItemId extends AddItemBase
{

    public String itemId;
    public String productName;
    public String sellerId;

    public AddItemUsItemId(int i, String s, String s1, String s2, String s3)
    {
        super(i, s);
        itemId = s1;
        sellerId = s2;
        productName = s3;
    }

    public AddItemUsItemId(Parcel parcel)
    {
        super(parcel);
        itemId = parcel.readString();
        sellerId = parcel.readString();
        productName = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(itemId);
        parcel.writeString(sellerId);
        parcel.writeString(productName);
    }
}
