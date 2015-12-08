// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.os.Parcel;

public abstract class AddItemBase
{

    public String price;
    public int quantity;
    public final int storeId;

    public AddItemBase(int i, String s)
    {
        quantity = 1;
        storeId = 7;
        quantity = i;
        price = s;
    }

    public AddItemBase(Parcel parcel)
    {
        quantity = 1;
        storeId = 7;
        quantity = parcel.readInt();
        price = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(quantity);
        parcel.writeString(price);
    }
}
