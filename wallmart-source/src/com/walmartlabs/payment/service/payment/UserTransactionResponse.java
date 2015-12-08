// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import com.walmartlabs.payment.service.BaseResponse;

public class UserTransactionResponse extends BaseResponse
{
    public static class Authorization
    {

        public float amount;
        public String cardType;
        public String lastFour;
        public String type;

        public Authorization()
        {
        }
    }

    public static class Data
    {

        public String id;
        public boolean isAssociate;
        public Related related;
        public String type;

        public Data()
        {
        }
    }

    public static class Item
    {

        public String addressLineOne;
        public float amount;
        public Authorization authorizations[];
        public boolean clientSeen;
        public String currency;
        public String id;
        public int storeId;
        public String tc;
        public String transactionDate;
        public String transactionTime;

        public Item()
        {
        }
    }

    public static class Related
    {

        public Transactions transactions;

        public Related()
        {
        }
    }

    public static class Transactions
    {

        public Item items[];

        public Transactions()
        {
        }
    }


    public static final String TYPE_CREDIT_CARD = "creditCard";
    public static final String TYPE_GIFT_CARD = "giftCard";
    public Data data;

    public UserTransactionResponse()
    {
    }
}
