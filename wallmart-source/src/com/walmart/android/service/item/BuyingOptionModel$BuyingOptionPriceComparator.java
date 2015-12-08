// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Comparator;

// Referenced classes of package com.walmart.android.service.item:
//            BuyingOptionModel, ItemPrice

public static class 
    implements Comparator
{

    public int compare(BuyingOptionModel buyingoptionmodel, BuyingOptionModel buyingoptionmodel1)
    {
        int i = buyingoptionmodel.getPrice().getPriceInCents();
        int j = buyingoptionmodel1.getPrice().getPriceInCents();
        if (i == 0)
        {
            return 1;
        }
        if (j == 0)
        {
            return -1;
        } else
        {
            return i - j;
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((BuyingOptionModel)obj, (BuyingOptionModel)obj1);
    }

    public ()
    {
    }
}
