// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GiftCardState
{

    private final Map mOptOutState = new HashMap();

    public GiftCardState()
    {
    }

    public List getGiftCards()
    {
        Object obj = GiftCardsModel.get().getAllGiftCards();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (GiftCard)((Iterator) (obj)).next();
            Boolean boolean1 = (Boolean)mOptOutState.get(((GiftCard) (obj1)).id);
            if (boolean1 != null && boolean1.booleanValue() != ((GiftCard) (obj1)).optOut)
            {
                obj1 = new com.walmartlabs.payment.model.GiftCard.Builder(((GiftCard) (obj1)));
                obj1.optOut = boolean1.booleanValue();
                arraylist.add(((com.walmartlabs.payment.model.GiftCard.Builder) (obj1)).build());
            } else
            {
                arraylist.add(obj1);
            }
        }

        return arraylist;
    }

    public float getTotalBalance()
    {
        Object obj = GiftCardsModel.get().getAllGiftCards();
        float f1 = 0.0F;
        float f = 0.0F;
        if (((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                f1 = f;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                GiftCard giftcard = (GiftCard)((Iterator) (obj)).next();
                Boolean boolean1 = (Boolean)mOptOutState.get(giftcard.id);
                if (boolean1 != null && !boolean1.booleanValue() || boolean1 == null && !giftcard.optOut)
                {
                    f += giftcard.balance;
                }
            } while (true);
        }
        return f1;
    }

    public boolean hasChanged()
    {
        return mOptOutState.size() > 0;
    }

    public void optOut(GiftCard giftcard, boolean flag)
    {
        if (giftcard.optOut != flag)
        {
            mOptOutState.put(giftcard.id, Boolean.valueOf(flag));
            return;
        } else
        {
            mOptOutState.remove(giftcard.id);
            return;
        }
    }

    public void setOptOutState(Map map)
    {
        if (!mOptOutState.isEmpty())
        {
            mOptOutState.clear();
        }
        mOptOutState.putAll(map);
    }
}
