// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.support.v7.widget.SearchView;

// Referenced classes of package com.walmart.android.app.main:
//            SearchActionController

class this._cls0
    implements com.walmart.android.app.shop.search.nRefinementListener
{

    final SearchActionController this$0;

    public void refinement(String s)
    {
        if (SearchActionController.access$000(SearchActionController.this) != null)
        {
            SearchActionController.access$000(SearchActionController.this).setQuery(s, false);
        }
    }

    apter.OnRefinementListener()
    {
        this$0 = SearchActionController.this;
        super();
    }
}
