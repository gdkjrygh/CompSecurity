// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import com.walmart.android.app.item.ShopSortManager;
import com.walmart.android.app.shop.ShopFilterManager;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            BrowseItemLoader, SearchItemLoader, ManualShelfItemLoader, StaticItemLoader, 
//            TaxonomyNodeLeafItemLoader, ItemLoader

public class ItemLoaderFactory
{

    public ItemLoaderFactory()
    {
    }

    public static ItemLoader createForBrowse(String s, ShopSortManager shopsortmanager, ShopFilterManager shopfiltermanager, int i)
    {
        return new BrowseItemLoader(s, shopsortmanager, shopfiltermanager, i);
    }

    public static ItemLoader createForSearch(String s, String s1, ShopSortManager shopsortmanager, ShopFilterManager shopfiltermanager, int i)
    {
        return new SearchItemLoader(s, s1, shopsortmanager, shopfiltermanager, i);
    }

    public static ItemLoader createForShelf(String s, int i)
    {
        return new ManualShelfItemLoader(s, i);
    }

    public static ItemLoader createForStaticItems(com.walmart.android.data.StoreQueryResult.Item aitem[])
    {
        return new StaticItemLoader(aitem);
    }

    public static ItemLoader createForTaxonomyNode(String s, int i)
    {
        return new TaxonomyNodeLeafItemLoader(s, i);
    }
}
