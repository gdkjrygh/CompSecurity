// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import java.math.BigInteger;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CardResponse

public static class 
{

    public static final String TYPE_CREDIT_CARD = "creditCard";
    public static final String TYPE_GIFT_CARD = "giftCard";
    public String addressLineOne;
    public String addressLineTwo;
    public float balance;
    public BigInteger billingNumber;
    public String cardExpiryDate;
    public String cardType;
    public String city;
    public String currency;
    public String firstName;
    public String id;
    public boolean isDefault;
    public String label;
    public String lastFour;
    public String lastName;
    public String phone;
    public String postalCode;
    public String state;
    public String type;

    public ()
    {
    }
}
