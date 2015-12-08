// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.walmart.android.search.SearchData;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreSearchManager

class this._cls0
    implements com.walmart.android.search.hRequestedListener
{

    final StoreSearchManager this$0;

    public SearchData onSearchRequested(String s)
    {
        return new SearchData(s);
    }

    public volatile Object onSearchRequested(String s)
    {
        return onSearchRequested(s);
    }

    equestedListener()
    {
        this$0 = StoreSearchManager.this;
        super();
    }
}
