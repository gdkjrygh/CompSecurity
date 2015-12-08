// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public class StaticItemLoader extends ItemLoader
{

    private List mItems;

    public StaticItemLoader(com.walmart.android.data.StoreQueryResult.Item aitem[])
    {
        super(0);
        mItems = Arrays.asList(aitem);
    }

    protected ItemLoader.LoaderRequest load(int i, int j)
    {
        setAllItemsLoaded();
        notifyFirstPageLoaded(mItems, mItems.size());
        return null;
    }
}
