// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;


public class CreditCardRequest
{

    public String addressLineOne;
    public String addressLineTwo;
    public String cardType;
    public String city;
    public String encryptedCvv;
    public String encryptedPan;
    public int expiryMonth;
    public int expiryYear;
    public String firstName;
    public String integrityCheck;
    public boolean isDefault;
    public String keyId;
    public String label;
    public String lastName;
    public String phase;
    public String phone;
    public String postalCode;
    public String state;

    public CreditCardRequest()
    {
    }
}
