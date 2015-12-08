// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import android.os.Parcel;

// Referenced classes of package com.walmartlabs.payment.model:
//            CreditCard

public static class isDefault
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
        return new CreditCard(this, null);
    }

    public isDefault setAddressLineOne(String s)
    {
        addressLineOne = s;
        return this;
    }

    public addressLineOne setAddressLineTwo(String s)
    {
        addressLineTwo = s;
        return this;
    }

    public addressLineTwo setCardExpiryDate(String s)
    {
        cardExpiryDate = s;
        return this;
    }

    public cardExpiryDate setCardType(String s)
    {
        cardType = s;
        return this;
    }

    public cardType setCity(String s)
    {
        city = s;
        return this;
    }

    public city setFirstName(String s)
    {
        firstName = s;
        return this;
    }

    public firstName setId(String s)
    {
        id = s;
        return this;
    }

    public id setIsDefault(boolean flag)
    {
        isDefault = flag;
        return this;
    }

    public isDefault setLabel(String s)
    {
        label = s;
        return this;
    }

    public label setLastFour(String s)
    {
        lastFour = s;
        return this;
    }

    public lastFour setLastName(String s)
    {
        lastName = s;
        return this;
    }

    public lastName setPhone(String s)
    {
        phone = s;
        return this;
    }

    public phone setPostalCode(String s)
    {
        postalCode = s;
        return this;
    }

    public postalCode setState(String s)
    {
        state = s;
        return this;
    }















    public ()
    {
    }

    public (Parcel parcel)
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
