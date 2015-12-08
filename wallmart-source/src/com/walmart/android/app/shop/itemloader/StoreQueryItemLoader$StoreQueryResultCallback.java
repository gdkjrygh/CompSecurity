// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.itemloader;

import com.walmart.android.data.StoreQueryResult;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.itemloader:
//            StoreQueryItemLoader

protected class this._cls0 extends this._cls0
{

    final StoreQueryItemLoader this$0;

    public void onFailed(Integer integer, StoreQueryResult storequeryresult)
    {
        WLog.w(StoreQueryItemLoader.TAG, (new StringBuilder()).append("Failed to load shelf items. ErrorCode: ").append(integer).toString());
        StoreQueryItemLoader storequeryitemloader = StoreQueryItemLoader.this;
        if (integer.intValue() == 0x15f92)
        {
            storequeryresult = this._fld0;
        } else
        {
            storequeryresult = this._fld0;
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
            notifyError(onFailed);
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

    public ()
    {
        this$0 = StoreQueryItemLoader.this;
        super(StoreQueryItemLoader.this, getHandler());
    }
}
