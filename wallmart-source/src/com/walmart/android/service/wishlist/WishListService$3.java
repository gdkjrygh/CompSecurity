// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmartlabs.kangaroo.service.Transformer;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListService, ListItem

class this._cls0
    implements Transformer
{

    final WishListService this$0;

    public ListItemModel transform(ListItem listitem)
    {
        return new ListItemModel(listitem);
    }

    public volatile Object transform(Object obj)
    {
        return transform((ListItem)obj);
    }

    el()
    {
        this$0 = WishListService.this;
        super();
    }
}
