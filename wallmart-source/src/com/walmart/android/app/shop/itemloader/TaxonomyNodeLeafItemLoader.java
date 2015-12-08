// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import android.os.Handler;
import com.walmart.android.service.browsepersonalization.BrowsePersonalizationService;
import com.walmart.android.service.browsepersonalization.LeafItems;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            ItemLoader

public class TaxonomyNodeLeafItemLoader extends ItemLoader
{
    public class GetTaxonomyNodeLeafItemsCallback extends ItemLoader.LoaderRequest
    {

        private int mPageSize;
        final TaxonomyNodeLeafItemLoader this$0;

        public volatile void onFailed(Integer integer, Object obj)
        {
            onFailed(integer, (LeafItems[])obj);
        }

        public void onFailed(Integer integer, LeafItems aleafitems[])
        {
            WLog.w(TaxonomyNodeLeafItemLoader.TAG, (new StringBuilder()).append("Failed to load taxonomy node leaf items. ErrorCode: ").append(integer).toString());
            TaxonomyNodeLeafItemLoader taxonomynodeleafitemloader = TaxonomyNodeLeafItemLoader.this;
            if (integer.intValue() == 0x15f92)
            {
                aleafitems = ItemLoader.PageLoadError.NO_NETWORK;
            } else
            {
                aleafitems = ItemLoader.PageLoadError.OTHER;
            }
            taxonomynodeleafitemloader.notifyError(aleafitems, integer.intValue());
        }

        public volatile void onResponse(Object obj)
        {
            onResponse((LeafItems[])obj);
        }

        public void onResponse(LeafItems aleafitems[])
        {
            aleafitems = new com.walmart.android.service.browsepersonalization.LeafItems.LeafItemIterator(aleafitems);
            ArrayList arraylist = new ArrayList(mPageSize);
            for (; aleafitems.hasNext(); arraylist.add(aleafitems.next())) { }
            if (arraylist.isEmpty())
            {
                setAllItemsLoaded();
            }
            if (isFirstPage())
            {
                notifyFirstPageLoaded(arraylist, -1);
                return;
            } else
            {
                notifyPageLoaded(arraylist);
                return;
            }
        }

        public GetTaxonomyNodeLeafItemsCallback(Handler handler, int i)
        {
            this$0 = TaxonomyNodeLeafItemLoader.this;
            super(TaxonomyNodeLeafItemLoader.this, handler);
            mPageSize = i;
        }
    }


    private static final String TAG = com/walmart/android/app/shop/itemloader/TaxonomyNodeLeafItemLoader.getSimpleName();
    private String mNodeId;

    public TaxonomyNodeLeafItemLoader(String s, int i)
    {
        super(i);
        mNodeId = s;
    }

    protected ItemLoader.LoaderRequest load(int i, int j)
    {
        GetTaxonomyNodeLeafItemsCallback gettaxonomynodeleafitemscallback = new GetTaxonomyNodeLeafItemsCallback(getHandler(), j);
        Services.get().getBrowsePersonalizationService().getLeafItems(mNodeId, "All", "RELEVANCE", i, j, gettaxonomynodeleafitemscallback);
        return gettaxonomynodeleafitemscallback;
    }


}
