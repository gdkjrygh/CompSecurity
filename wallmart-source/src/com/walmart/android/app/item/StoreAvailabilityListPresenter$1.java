// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.search.SearchData;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListPresenter

class this._cls0
    implements com.walmart.android.search.tener
{

    final StoreAvailabilityListPresenter this$0;

    public void onSearchExecuted(SearchData searchdata)
    {
        StoreAvailabilityListPresenter.access$002(StoreAvailabilityListPresenter.this, searchdata.getSearchText().toString());
        StoreAvailabilityListPresenter.access$100(StoreAvailabilityListPresenter.this, StoreAvailabilityListPresenter.access$000(StoreAvailabilityListPresenter.this));
    }

    public volatile void onSearchExecuted(Object obj)
    {
        onSearchExecuted((SearchData)obj);
    }

    ner()
    {
        this$0 = StoreAvailabilityListPresenter.this;
        super();
    }
}
