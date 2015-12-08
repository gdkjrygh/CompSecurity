// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmartlabs.kangaroo.service.Transformer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListService, ListItem

class this._cls0
    implements Transformer
{

    final WishListService this$0;

    public volatile Object transform(Object obj)
    {
        return transform((ListItem[])obj);
    }

    public List transform(ListItem alistitem[])
    {
        ArrayList arraylist = new ArrayList(alistitem.length);
        int j = alistitem.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new ListItemModel(alistitem[i]));
        }

        return arraylist;
    }

    el()
    {
        this$0 = WishListService.this;
        super();
    }
}
