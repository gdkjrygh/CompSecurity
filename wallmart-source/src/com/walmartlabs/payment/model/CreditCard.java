// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.payment.service.BaseResponse;

public class CreditCard extends BaseResponse
    implements Parcelable
{
    public static class Builder
    {

        private String addressLineOne;
        private String addressLineTwo;
        private String cardExpiryDate;
        private String cardType;
        private String city;
        private String firstName;
        private String id;
        private boolean isDefault;
        private String label;
        private String lastFour;
        private String lastName;
        private String phone;
        private String postalCode;
        private String state;

        public CreditCard build()
        {
            return new CreditCard(this);
        }

        public Builder setAddressLineOne(String s)
        {
            addressLineOne = s;
            return this;
        }

        public Builder setAddressLineTwo(String s)
        {
            addressLineTwo = s;
            return this;
        }

        public Builder setCardExpiryDate(String s)
        {
            cardExpiryDate = s;
            return this;
        }

        public Builder setCardType(String s)
        {
            cardType = s;
            return this;
        }

        public Builder setCity(String s)
        {
            city = s;
            return this;
        }

        public Builder setFirstName(String s)
        {
            firstName = s;
            return this;
        }

        public Builder setId(String s)
        {
            id = s;
            return this;
        }

        public Builder setIsDefault(boolean flag)
        {
            isDefault = flag;
            return this;
        }

        public Builder setLabel(String s)
        {
            label = s;
            return this;
        }

        public Builder setLastFour(String s)
        {
            lastFour = s;
            return this;
        }

        public Builder setLastName(String s)
        {
            lastName = s;
            return this;
        }

        public Builder setPhone(String s)
        {
            phone = s;
            return this;
        }

        public Builder setPostalCode(String s)
        {
            postalCode = s;
            return this;
        }

        public Builder setState(String s)
        {
            state = s;
            return this;
        }















        public Builder()
        {
        }

        public Builder(Parcel parcel)
        {
            boolean flag = true;
            super();
            id = parcel.readString();
            firstName = parcel.readString();
            lastName = parcel.readString();
            label = parcel.readString();
            cardType = parcel.readString();
            lastFour = parcel.readString();
            cardExpiryDate = parcel.readString();
            addressLineOne = parcel.readString();
            addressLineTwo = parcel.readString();
            city = parcel.readString();
            state = parcel.readString();
            postalCode = parcel.readString();
            phone = parcel.readString();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            isDefault = flag;
        }
    }


    public static final String AMEX = "AMEX";
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CreditCard createFromParcel(Parcel parcel)
        {
            return new CreditCard(new Builder(parcel));
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CreditCard[] newArray(int i)
        {
            return new CreditCard[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String DISCOVER = "DISCOVER";
    public static final String MASTER_CARD = "MASTERCARD";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String VISA = "VISA";
    public static final String WMMASTERCARD = "WMMASTERCARD";
    public static final String WMUSGESTORECARD = "WMUSGESTORECARD";
    public String addressLineOne;
    public String addressLineTwo;
    public String cardExpiryDate;
    public String cardType;
    public String city;
    public String firstName;
    public String id;
    public boolean isDefault;
    public String label;
    public String lastFour;
    public String lastName;
    public String phone;
    public String postalCode;
    public String state;

    public CreditCard()
    {
    }

    private CreditCard(Builder builder)
    {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        label = builder.label;
        cardType = builder.cardType;
        lastFour = builder.lastFour;
        cardExpiryDate = builder.cardExpiryDate;
        addressLineOne = builder.addressLineOne;
        addressLineTwo = builder.addressLineTwo;
        city = builder.city;
        state = builder.state;
        postalCode = builder.postalCode;
        phone = builder.phone;
        isDefault = builder.isDefault;
    }


    public int describeContents()
    {
        return 0;
    }

    public String getAddressLineOne()
    {
        return addressLineOne;
    }

    public String getAddressLineTwo()
    {
        return addressLineTwo;
    }

    public String getCardExpiryDate()
    {
        return cardExpiryDate;
    }

    public String getCardType()
    {
        return cardType;
    }

    public String getCity()
    {
        return city;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public String getLastFour()
    {
        return lastFour;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getState()
    {
        return state;
    }

    public boolean isDefault()
    {
        return isDefault;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CreditCard [id=").append(id).append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", label=").append(label).append(", cardType=").append(cardType).append(", lastFour=").append(lastFour).append(", addressLineOne=").append(addressLineOne).append(", addressLineTwo=").append(addressLineTwo).append(", city=").append(city).append(", state=").append(state).append(", postalCode=").append(postalCode).append(", phone=").append(phone).append(", isDefault=").append(isDefault).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(label);
        parcel.writeString(cardType);
        parcel.writeString(lastFour);
        parcel.writeString(cardExpiryDate);
        parcel.writeString(addressLineOne);
        parcel.writeString(addressLineTwo);
        parcel.writeString(city);
        parcel.writeString(state);
        parcel.writeString(postalCode);
        parcel.writeString(phone);
        if (isDefault)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
