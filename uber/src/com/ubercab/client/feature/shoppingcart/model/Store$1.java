// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import com.ubercab.client.core.model.ShoppingRequestedItem;
import gjv;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Store, Item

class this._cls0
    implements gjv
{

    final Store this$0;

    public ShoppingRequestedItem apply(Item item)
    {
        return ShoppingRequestedItem.create(item.getItemId(), item.getCount().intValue());
    }

    public volatile Object apply(Object obj)
    {
        return apply((Item)obj);
    }

    ()
    {
        this$0 = Store.this;
        super();
    }
}
