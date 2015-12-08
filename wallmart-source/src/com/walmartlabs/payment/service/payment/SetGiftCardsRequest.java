// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import com.walmartlabs.payment.model.GiftCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetGiftCardsRequest
{
    public static class GiftCardData
    {

        public final String id;
        public final boolean optOut;

        public GiftCardData(String s, boolean flag)
        {
            id = s;
            optOut = flag;
        }
    }


    public SetGiftCardsRequest()
    {
    }

    public static GiftCardData[] makeRequestData(List list)
    {
        ArrayList arraylist = new ArrayList();
        GiftCard giftcard;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new GiftCardData(giftcard.id, giftcard.optOut)))
        {
            giftcard = (GiftCard)list.next();
        }

        if (arraylist.size() > 0)
        {
            return (GiftCardData[])arraylist.toArray(new GiftCardData[arraylist.size()]);
        } else
        {
            return null;
        }
    }

    public static GiftCardData[] makeRequestData(List list, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new GiftCardData(((GiftCard)list.next()).id, flag))) { }
        if (arraylist.size() > 0)
        {
            return (GiftCardData[])arraylist.toArray(new GiftCardData[arraylist.size()]);
        } else
        {
            return null;
        }
    }
}
