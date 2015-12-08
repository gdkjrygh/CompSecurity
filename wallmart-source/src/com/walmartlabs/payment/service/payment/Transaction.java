// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import android.os.Parcel;
import android.os.Parcelable;

public class Transaction
    implements Parcelable
{
    public static class Builder
    {

        public String addressLineOne;
        public float creditCardAmount;
        public String creditCardType;
        public String date;
        public float giftCardAmount;
        public String id;
        public String lastFour;
        public boolean mClientSeen;
        public String storeId;
        public String tc;
        public float transactionTotal;

        public Transaction build()
        {
            return new Transaction(this);
        }

        public Builder setAddressLineOne(String s)
        {
            addressLineOne = s;
            return this;
        }

        public Builder setClientSeen(boolean flag)
        {
            mClientSeen = flag;
            return this;
        }

        public Builder setCreditCardAmount(float f)
        {
            creditCardAmount = f;
            return this;
        }

        public Builder setCreditCardType(String s)
        {
            creditCardType = s;
            return this;
        }

        public Builder setDate(String s)
        {
            date = s;
            return this;
        }

        public Builder setGiftCardAmount(float f)
        {
            giftCardAmount = f;
            return this;
        }

        public Builder setId(String s)
        {
            id = s;
            return this;
        }

        public Builder setLastFour(String s)
        {
            lastFour = s;
            return this;
        }

        public Builder setStoreId(String s)
        {
            storeId = s;
            return this;
        }

        public Builder setTc(String s)
        {
            tc = s;
            return this;
        }

        public Builder setTransactionTotal(float f)
        {
            transactionTotal = f;
            return this;
        }

        public Builder()
        {
        }

        public Builder(Transaction transaction)
        {
            transactionTotal = transaction.transactionTotal;
            date = transaction.date;
            storeId = transaction.storeId;
            giftCardAmount = transaction.giftCardAmount;
            creditCardAmount = transaction.creditCardAmount;
            creditCardType = transaction.creditCardType;
            lastFour = transaction.lastFour;
            id = transaction.id;
            tc = transaction.tc;
            mClientSeen = transaction.clientSeen;
            addressLineOne = transaction.addressLineOne;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Transaction createFromParcel(Parcel parcel)
        {
            return new Transaction(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Transaction[] newArray(int i)
        {
            return new Transaction[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String FAKE_STORE_ID = "9999";
    public final String addressLineOne;
    public final boolean clientSeen;
    public final float creditCardAmount;
    public final String creditCardType;
    public final String date;
    public final float giftCardAmount;
    public final String id;
    public final String lastFour;
    public final String storeId;
    public final String tc;
    public final float transactionTotal;

    public Transaction(Parcel parcel)
    {
        transactionTotal = parcel.readFloat();
        date = parcel.readString();
        storeId = parcel.readString();
        giftCardAmount = parcel.readFloat();
        creditCardAmount = parcel.readFloat();
        creditCardType = parcel.readString();
        lastFour = parcel.readString();
        id = parcel.readString();
        tc = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        clientSeen = flag;
        addressLineOne = parcel.readString();
    }

    public Transaction(Builder builder)
    {
        transactionTotal = builder.transactionTotal;
        date = builder.date;
        storeId = builder.storeId;
        giftCardAmount = builder.giftCardAmount;
        creditCardAmount = builder.creditCardAmount;
        creditCardType = builder.creditCardType;
        lastFour = builder.lastFour;
        id = builder.id;
        tc = builder.tc;
        clientSeen = builder.mClientSeen;
        addressLineOne = builder.addressLineOne;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("transactionTotal = ").append(transactionTotal).append(", gift card amount = ").append(giftCardAmount).append(", credit card amount = ").append(creditCardAmount).append(", credit card type = ").append(creditCardType).append(", last four = ").append(lastFour).append(", date = ").append(date).append(", id = ").append(id).append(", tc = ").append(tc).append(", clientSeen = ").append(clientSeen).append(", address = ").append(addressLineOne).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(transactionTotal);
        parcel.writeString(date);
        parcel.writeString(storeId);
        parcel.writeFloat(giftCardAmount);
        parcel.writeFloat(creditCardAmount);
        parcel.writeString(creditCardType);
        parcel.writeString(lastFour);
        parcel.writeString(id);
        parcel.writeString(tc);
        if (clientSeen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(addressLineOne);
    }

}
