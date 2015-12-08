// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.walmart.android.service.wishlist:
//            AddItemOfferId, AddItemUsItemId, AddItemBase

public class AddItemFactory
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AddItemFactory createFromParcel(Parcel parcel)
        {
            return new AddItemFactory(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AddItemFactory[] newArray(int i)
        {
            return new AddItemFactory[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final AddItemBase mItem;

    protected AddItemFactory(Parcel parcel)
    {
        String s = parcel.readString();
        if (com/walmart/android/service/wishlist/AddItemOfferId.getSimpleName().equals(s))
        {
            mItem = new AddItemOfferId(parcel);
            return;
        }
        if (com/walmart/android/service/wishlist/AddItemUsItemId.getSimpleName().equals(s))
        {
            mItem = new AddItemUsItemId(parcel);
            return;
        } else
        {
            mItem = null;
            return;
        }
    }

    public AddItemFactory(AddItemBase additembase)
    {
        mItem = additembase;
    }

    public int describeContents()
    {
        return 0;
    }

    public AddItemBase getItem()
    {
        return mItem;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mItem.getClass().getSimpleName());
        mItem.writeToParcel(parcel, i);
    }

}
