// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.service.BaseResponse;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CardResponse extends BaseResponse
{
    public static class Card
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

        public Card()
        {
        }
    }

    public static class Data
    {

        public Card items[];

        public Data()
        {
        }
    }


    public Data data;

    public CardResponse()
    {
    }

    public List getCreditCards()
    {
        ArrayList arraylist = new ArrayList();
        if (data != null && data.items != null && data.items.length > 0)
        {
            Card acard[] = data.items;
            int j = acard.length;
            for (int i = 0; i < j; i++)
            {
                Card card = acard[i];
                if (card.type.equals("creditCard"))
                {
                    com.walmartlabs.payment.model.CreditCard.Builder builder = new com.walmartlabs.payment.model.CreditCard.Builder();
                    builder.setId(card.id).setFirstName(card.firstName).setLastName(card.lastName).setLabel(card.label).setCardType(card.cardType).setLastFour(card.lastFour).setCardExpiryDate(card.cardExpiryDate).setAddressLineOne(card.addressLineOne).setAddressLineTwo(card.addressLineTwo).setCity(card.city).setState(card.state).setPostalCode(card.postalCode).setPhone(card.phone).setIsDefault(card.isDefault);
                    arraylist.add(builder.build());
                }
            }

        }
        return arraylist;
    }

    public List getGiftCards()
    {
        ArrayList arraylist = new ArrayList();
        if (data != null && data.items != null && data.items.length > 0)
        {
            Card acard[] = data.items;
            int j = acard.length;
            for (int i = 0; i < j; i++)
            {
                Card card = acard[i];
                if (card.type.equals("giftCard"))
                {
                    GiftCard giftcard = new GiftCard();
                    giftcard.id = card.id;
                    giftcard.lastFour = card.lastFour;
                    giftcard.currency = card.currency;
                    giftcard.billingNumber = card.billingNumber;
                    giftcard.balance = card.balance;
                    giftcard.label = card.label;
                    arraylist.add(giftcard);
                }
            }

        }
        return arraylist;
    }
}
