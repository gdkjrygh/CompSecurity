// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import com.walmart.android.app.item.ShopSortManager;
import com.walmart.android.app.shop.ShopFilterManager;
import com.walmart.android.data.StoreQueryResult;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public abstract class StoreQueryItemLoader extends ItemLoader
{
    protected class StoreQueryResultCallback extends ItemLoader.LoaderRequest
    {

        final StoreQueryItemLoader this$0;

        public void onFailed(Integer integer, StoreQueryResult storequeryresult)
        {
            WLog.w(StoreQueryItemLoader.TAG, (new StringBuilder()).append("Failed to load shelf items. ErrorCode: ").append(integer).toString());
            StoreQueryItemLoader storequeryitemloader = StoreQueryItemLoader.this;
            if (integer.intValue() == 0x15f92)
            {
                storequeryresult = ItemLoader.PageLoadError.NO_NETWORK;
            } else
            {
                storequeryresult = ItemLoader.PageLoadError.OTHER;
            }
            storequeryitemloader.notifyError(storequeryresult, integer.intValue());
        }

        public volatile void onFailed(Integer integer, Object obj)
        {
            onFailed(integer, (StoreQueryResult)obj);
        }

        public void onResponse(StoreQueryResult storequeryresult)
        {
            if (storequeryresult.getTotalCount() == 0)
            {
                setAllItemsLoaded();
                notifyError(ItemLoader.PageLoadError.NO_RESULTS);
                return;
            }
            List list = storequeryresult.getFilteredItems();
            if (list.isEmpty())
            {
                setAllItemsLoaded();
            }
            if (isFirstPage())
            {
                notifyFirstPageLoaded(list, storequeryresult.getTotalCount());
                return;
            } else
            {
                notifyPageLoaded(list);
                return;
            }
        }

        public volatile void onResponse(Object obj)
        {
            onResponse((StoreQueryResult)obj);
        }

        public StoreQueryResultCallback()
        {
            this$0 = StoreQueryItemLoader.this;
            super(StoreQueryItemLoader.this, getHandler());
        }
    }


    public static final String TAG = com/walmart/android/app/shop/itemloader/StoreQueryItemLoader.getSimpleName();
    private ShopFilterManager mFilterManager;
    private ShopSortManager mSortManager;

    public StoreQueryItemLoader(ShopSortManager shopsortmanager, ShopFilterManager shopfiltermanager, int i)
    {
        super(i);
        mSortManager = shopsortmanager;
        mFilterManager = shopfiltermanager;
    }

    public final ItemLoader.LoaderRequest load(int i, int j)
    {
        String s = mFilterManager.getStoreID();
        String as1[] = mFilterManager.getRefinementBrowseTokens();
        String as[] = as1;
        if (as1 == null)
        {
            as = new String[0];
        }
        return load(i, j, (String)mSortManager.getSelectedSortParam(), s, as);
    }

    protected abstract StoreQueryResultCallback load(int i, int j, String s, String s1, String as[]);

}
