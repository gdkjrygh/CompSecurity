// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import com.walmart.android.app.item.ShopSortManager;
import com.walmart.android.app.shop.ShopFilterManager;
import com.walmart.android.service.browse.BrowseSearchService;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            StoreQueryItemLoader

public class SearchItemLoader extends StoreQueryItemLoader
{

    private String mSearchDepartment;
    private String mSearchQuery;

    public SearchItemLoader(String s, String s1, ShopSortManager shopsortmanager, ShopFilterManager shopfiltermanager, int i)
    {
        super(shopsortmanager, shopfiltermanager, i);
        mSearchQuery = s;
        mSearchDepartment = s1;
    }

    protected StoreQueryItemLoader.StoreQueryResultCallback load(int i, int j, String s, String s1, String as[])
    {
        StoreQueryItemLoader.StoreQueryResultCallback storequeryresultcallback = new StoreQueryItemLoader.StoreQueryResultCallback(this);
        if (s1 != null && s1.length() > 0)
        {
            Services.get().getBrowseSearchService().searchItemsWithStore(mSearchQuery, mSearchDepartment, "Store", s, i, j, s1, as, storequeryresultcallback);
            return storequeryresultcallback;
        } else
        {
            Services.get().getBrowseSearchService().searchItems(mSearchQuery, mSearchDepartment, "All", s, i, j, as, storequeryresultcallback);
            return storequeryresultcallback;
        }
    }
}
