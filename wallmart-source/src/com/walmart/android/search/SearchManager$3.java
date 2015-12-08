// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.widget.AbsListView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.search:
//            SearchManager

class this._cls0
    implements android.widget.rollListener
{

    final SearchManager this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && SearchManager.access$100(SearchManager.this))
        {
            SearchManager.access$002(SearchManager.this, true);
            ViewUtil.hideKeyboard(mRootLayout);
        }
    }

    ()
    {
        this$0 = SearchManager.this;
        super();
    }
}
