// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.service.BaseResponse;
import java.util.ArrayList;
import java.util.List;

public class UserCardsResponse extends BaseResponse
{
    public static class Cards
    {

        public UserCard items[];

        public Cards()
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

    public static class Related
    {

        public Cards cards;

        public Related()
        {
        }
    }

    public static class UserCard extends com.walmartlabs.payment.service.customer.CardResponse.Card
    {

        public boolean optOut;

        public UserCard()
        {
        }
    }


    public Data data;

    public UserCardsResponse()
    {
    }

    public List getCreditCards()
    {
        ArrayList arraylist = new ArrayList();
        if (data != null && data.related != null && data.related.cards != null && data.related.cards.items != null && data.related.cards.items.length > 0)
        {
            UserCard ausercard[] = data.related.cards.items;
            int j = ausercard.length;
            for (int i = 0; i < j; i++)
            {
                UserCard usercard = ausercard[i];
                if (usercard.type.equals("creditCard"))
                {
                    com.walmartlabs.payment.model.CreditCard.Builder builder = new com.walmartlabs.payment.model.CreditCard.Builder();
                    builder.setId(usercard.id).setFirstName(usercard.firstName).setLastName(usercard.lastName).setLabel(usercard.label).setCardType(usercard.cardType).setLastFour(usercard.lastFour).setCardExpiryDate(usercard.cardExpiryDate).setAddressLineOne(usercard.addressLineOne).setAddressLineTwo(usercard.addressLineTwo).setCity(usercard.city).setState(usercard.state).setPostalCode(usercard.postalCode).setPhone(usercard.phone).setIsDefault(usercard.isDefault);
                    arraylist.add(builder.build());
                }
            }

        }
        return arraylist;
    }

    public List getGiftCards()
    {
        ArrayList arraylist = new ArrayList();
        if (data != null && data.related != null && data.related.cards != null && data.related.cards.items != null && data.related.cards.items.length > 0)
        {
            UserCard ausercard[] = data.related.cards.items;
            int j = ausercard.length;
            for (int i = 0; i < j; i++)
            {
                UserCard usercard = ausercard[i];
                if (usercard.type.equals("giftCard"))
                {
                    GiftCard giftcard = new GiftCard();
                    giftcard.id = usercard.id;
                    giftcard.lastFour = usercard.lastFour;
                    giftcard.currency = usercard.currency;
                    giftcard.billingNumber = usercard.billingNumber;
                    giftcard.balance = usercard.balance;
                    giftcard.label = usercard.label;
                    giftcard.optOut = usercard.optOut;
                    arraylist.add(giftcard);
                }
            }

        }
        return arraylist;
    }
}
