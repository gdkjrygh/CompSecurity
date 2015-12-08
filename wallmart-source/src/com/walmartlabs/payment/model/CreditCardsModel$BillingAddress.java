// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;


// Referenced classes of package com.walmartlabs.payment.model:
//            CreditCardsModel, CreditCard

public static class postalCode
{

    public final String addressLineOne;
    public final String addressLineTwo;
    public final String city;
    public final String postalCode;
    public final String state;

    public boolean isSameBillingAddress(CreditCard creditcard)
    {
        return addressLineOne.equalsIgnoreCase(creditcard.getAddressLineOne()) && addressLineTwo.equalsIgnoreCase(creditcard.getAddressLineTwo()) && city.equalsIgnoreCase(creditcard.getCity()) && state.equalsIgnoreCase(creditcard.getState()) && postalCode.equalsIgnoreCase(creditcard.getPostalCode());
    }

    public (CreditCard creditcard)
    {
        addressLineOne = creditcard.getAddressLineOne();
        addressLineTwo = creditcard.getAddressLineTwo();
        city = creditcard.getCity();
        state = creditcard.getState();
        postalCode = creditcard.getPostalCode();
    }
}
