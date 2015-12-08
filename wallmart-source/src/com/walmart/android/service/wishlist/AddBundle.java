// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AddBundle
    implements Parcelable
{
    public static class GroupComponent
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public GroupComponent createFromParcel(Parcel parcel)
            {
                return new GroupComponent(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public GroupComponent[] newArray(int i)
            {
                return new GroupComponent[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public final String offerId;
        public final int quantity;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(offerId);
            parcel.writeInt(quantity);
        }


        public GroupComponent(Parcel parcel)
        {
            offerId = parcel.readString();
            quantity = parcel.readInt();
        }

        public GroupComponent(String s, int i)
        {
            offerId = s;
            quantity = i;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AddBundle createFromParcel(Parcel parcel)
        {
            return new AddBundle(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public AddBundle[] newArray(int i)
        {
            return new AddBundle[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public final List groupComponents;
    public final String groupId;
    public final int quantity;
    public final int storeId;

    protected AddBundle(Parcel parcel)
    {
        storeId = 7;
        groupId = parcel.readString();
        quantity = parcel.readInt();
        groupComponents = parcel.createTypedArrayList(GroupComponent.CREATOR);
    }

    public AddBundle(String s, int i, List list)
    {
        storeId = 7;
        groupId = s;
        quantity = i;
        groupComponents = Collections.unmodifiableList(list);
    }

    public static List convertItems(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        com.walmart.android.service.cart.CartService.OfferConfiguration offerconfiguration;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new GroupComponent(offerconfiguration.offerId, offerconfiguration.quantity)))
        {
            offerconfiguration = (com.walmart.android.service.cart.CartService.OfferConfiguration)list.next();
        }

        return arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(groupId);
        parcel.writeInt(quantity);
        parcel.writeTypedList(groupComponents);
    }

}
