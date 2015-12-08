// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import com.walmart.android.analytics.AnalyticsHelper;

// Referenced classes of package com.walmart.android.app.shop:
//            SearchResultPresenter

class this._cls0
    implements android.view.sultPresenter._cls1
{

    final SearchResultPresenter this$0;

    public void onClick(View view)
    {
        if (getSelectedPresenterPosition() != 0)
        {
            AnalyticsHelper.post(AnalyticsHelper.prepareSearchResultsPageViewEvent());
        }
        toggleOnline();
    }

    ()
    {
        this$0 = SearchResultPresenter.this;
        super();
    }
}
