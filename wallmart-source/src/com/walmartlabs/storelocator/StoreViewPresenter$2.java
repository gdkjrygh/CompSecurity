// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.walmart.android.search.SearchData;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter

class this._cls0
    implements com.walmart.android.search.hExecutedListener
{

    final StoreViewPresenter this$0;

    public void onSearchExecuted(SearchData searchdata)
    {
        executeLocationSearch(searchdata.getSearchText().toString());
    }

    public volatile void onSearchExecuted(Object obj)
    {
        onSearchExecuted((SearchData)obj);
    }

    xecutedListener()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
