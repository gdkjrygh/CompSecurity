// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.payment.service.BaseResponse;
import java.math.BigInteger;

public class GiftCard extends BaseResponse
    implements Parcelable
{
    public static class Builder
    {

        public float balance;
        public BigInteger billingNumber;
        public String currency;
        public String id;
        public String label;
        public String lastFour;
        public boolean optOut;

        public GiftCard build()
        {
            return new GiftCard(this);
        }

        public Builder()
        {
        }

        public Builder(Parcel parcel)
        {
            boolean flag = true;
            super();
            id = parcel.readString();
            label = parcel.readString();
            lastFour = parcel.readString();
            billingNumber = new BigInteger(parcel.readString());
            balance = parcel.readFloat();
            currency = parcel.readString();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            optOut = flag;
        }

        public Builder(GiftCard giftcard)
        {
            id = giftcard.id;
            label = giftcard.label;
            lastFour = giftcard.lastFour;
            billingNumber = giftcard.billingNumber;
            balance = giftcard.balance;
            currency = giftcard.currency;
            optOut = giftcard.optOut;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public GiftCard createFromParcel(Parcel parcel)
        {
            return new GiftCard(new Builder(parcel));
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GiftCard[] newArray(int i)
        {
            return new GiftCard[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public float balance;
    public BigInteger billingNumber;
    public String currency;
    public String id;
    public String label;
    public String lastFour;
    public boolean optOut;

    public GiftCard()
    {
    }

    private GiftCard(Builder builder)
    {
        id = builder.id;
        label = builder.label;
        lastFour = builder.lastFour;
        billingNumber = builder.billingNumber;
        balance = builder.balance;
        currency = builder.currency;
        optOut = builder.optOut;
    }


    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(label);
        parcel.writeString(lastFour);
        parcel.writeString(billingNumber.toString());
        parcel.writeFloat(balance);
        parcel.writeString(currency);
        if (optOut)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
