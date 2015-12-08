// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;


// Referenced classes of package com.walmartlabs.payment.service.payment:
//            Transaction

public static class ineOne
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

    public ineOne setAddressLineOne(String s)
    {
        addressLineOne = s;
        return this;
    }

    public addressLineOne setClientSeen(boolean flag)
    {
        mClientSeen = flag;
        return this;
    }

    public mClientSeen setCreditCardAmount(float f)
    {
        creditCardAmount = f;
        return this;
    }

    public creditCardAmount setCreditCardType(String s)
    {
        creditCardType = s;
        return this;
    }

    public creditCardType setDate(String s)
    {
        date = s;
        return this;
    }

    public date setGiftCardAmount(float f)
    {
        giftCardAmount = f;
        return this;
    }

    public giftCardAmount setId(String s)
    {
        id = s;
        return this;
    }

    public id setLastFour(String s)
    {
        lastFour = s;
        return this;
    }

    public lastFour setStoreId(String s)
    {
        storeId = s;
        return this;
    }

    public storeId setTc(String s)
    {
        tc = s;
        return this;
    }

    public tc setTransactionTotal(float f)
    {
        transactionTotal = f;
        return this;
    }

    public A()
    {
    }

    public A(Transaction transaction)
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
