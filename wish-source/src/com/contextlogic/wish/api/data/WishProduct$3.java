// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.util.Comparator;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct

class val.sortAsNumbers
    implements Comparator
{

    final WishProduct this$0;
    final boolean val$sortAsNumbers;

    public int compare(shProductSize shproductsize, shProductSize shproductsize1)
    {
        if (val$sortAsNumbers)
        {
            return shproductsize.orderingValue.compareTo(shproductsize1.orderingValue);
        } else
        {
            return shproductsize.ordering.compareTo(shproductsize1.ordering);
        }
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((shProductSize)obj, (shProductSize)obj1);
    }

    shProductSize()
    {
        this$0 = final_wishproduct;
        val$sortAsNumbers = Z.this;
        super();
    }
}
