// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.os.Parcel;

// Referenced classes of package com.walmart.android.service.wishlist:
//            AddItemBase

public class AddItemOfferId extends AddItemBase
{

    public String offerId;

    public AddItemOfferId(int i, String s, String s1)
    {
        super(i, s);
        offerId = s1;
    }

    public AddItemOfferId(Parcel parcel)
    {
        super(parcel);
        offerId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(offerId);
    }
}
