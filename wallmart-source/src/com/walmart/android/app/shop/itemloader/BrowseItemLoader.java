// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.text.TextUtils;
import com.walmart.android.app.item.ShopSortManager;
import com.walmart.android.app.shop.ShopFilterManager;
import com.walmart.android.service.browse.BrowseSearchService;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            StoreQueryItemLoader

public class BrowseItemLoader extends StoreQueryItemLoader
{

    private String mBrowseToken;

    public BrowseItemLoader(String s, ShopSortManager shopsortmanager, ShopFilterManager shopfiltermanager, int i)
    {
        super(shopsortmanager, shopfiltermanager, i);
        mBrowseToken = s;
    }

    protected StoreQueryItemLoader.StoreQueryResultCallback load(int i, int j, String s, String s1, String as[])
    {
        StoreQueryItemLoader.StoreQueryResultCallback storequeryresultcallback = new StoreQueryItemLoader.StoreQueryResultCallback(this);
        if (!TextUtils.isEmpty(s1))
        {
            Services.get().getBrowseSearchService().browseItemsWithStore(mBrowseToken, "Store", s, i, j, s1, as, storequeryresultcallback);
            return storequeryresultcallback;
        } else
        {
            Services.get().getBrowseSearchService().browseItems(mBrowseToken, "All", s, i, j, as, storequeryresultcallback);
            return storequeryresultcallback;
        }
    }
}
