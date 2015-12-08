// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.model:
//            GiftCard

public class GiftCardsModel
{

    private static GiftCardsModel sInstance = new GiftCardsModel();
    private final List mGiftCards = new ArrayList();
    private boolean mHasMobilePayData;

    private GiftCardsModel()
    {
    }

    public static GiftCardsModel get()
    {
        return sInstance;
    }

    public void deleteGiftCard(String s)
    {
        int i = 0;
        do
        {
            if (i >= mGiftCards.size() || ((GiftCard)mGiftCards.get(i)).id.equals(s))
            {
                if (i < mGiftCards.size())
                {
                    mGiftCards.remove(i);
                }
                return;
            }
            i++;
        } while (true);
    }

    public List getAllGiftCards()
    {
        return mGiftCards;
    }

    public float getTotalAvailable()
    {
        float f2 = 0.0F;
        float f = 0.0F;
        float f1 = f2;
        if (mGiftCards != null)
        {
            f1 = f2;
            if (mGiftCards.size() > 0)
            {
                Iterator iterator = mGiftCards.iterator();
                do
                {
                    f1 = f;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    f += ((GiftCard)iterator.next()).balance;
                } while (true);
            }
        }
        return f1;
    }

    public float getTotalBalance()
    {
        float f2 = 0.0F;
        float f = 0.0F;
        float f1 = f2;
        if (mGiftCards != null)
        {
            f1 = f2;
            if (mGiftCards.size() > 0)
            {
                Iterator iterator = mGiftCards.iterator();
                do
                {
                    f1 = f;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    GiftCard giftcard = (GiftCard)iterator.next();
                    if (!giftcard.optOut)
                    {
                        f += giftcard.balance;
                    }
                } while (true);
            }
        }
        return f1;
    }

    public boolean hasEnabledGiftCards()
    {
        if (hasGiftCards())
        {
            Iterator iterator = mGiftCards.iterator();
            while (iterator.hasNext()) 
            {
                if (!((GiftCard)iterator.next()).optOut)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasGiftCards()
    {
        return mGiftCards.size() > 0;
    }

    public boolean hasMobilePayData()
    {
        return mHasMobilePayData;
    }

    public void setGiftCards(Collection collection)
    {
        setGiftCards(false, collection);
    }

    public void setGiftCards(boolean flag, Collection collection)
    {
        mHasMobilePayData = flag;
        mGiftCards.clear();
        if (collection != null && !collection.isEmpty())
        {
            mGiftCards.addAll(collection);
        }
    }

    public void updateGiftCard(GiftCard giftcard)
    {
        int i = 0;
        do
        {
            if (i >= mGiftCards.size() || ((GiftCard)mGiftCards.get(i)).id.equals(giftcard.id))
            {
                if (i < mGiftCards.size())
                {
                    mGiftCards.remove(i);
                    mGiftCards.add(i, giftcard);
                    return;
                } else
                {
                    mGiftCards.add(giftcard);
                    return;
                }
            }
            i++;
        } while (true);
    }

}
