// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import java.util.Comparator;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfAdapter

class this._cls0
    implements Comparator
{

    final BundlesShelfAdapter this$0;

    public int compare(com.walmart.android.service.item.n n, com.walmart.android.service.item.n n1)
    {
        boolean flag = n.isAvailable();
        boolean flag1 = n1.isAvailable();
        if (!flag || flag1)
        {
            if (!flag && flag1)
            {
                return 1;
            }
            if (n.getPriceModifierInCents() >= n1.getPriceModifierInCents())
            {
                if (n.getPriceModifierInCents() == n1.getPriceModifierInCents())
                {
                    return n.getRanking() - n1.getRanking();
                } else
                {
                    return 1;
                }
            }
        }
        return -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((com.walmart.android.service.item.n)obj, (com.walmart.android.service.item.n)obj1);
    }

    ption()
    {
        this$0 = BundlesShelfAdapter.this;
        super();
    }
}
