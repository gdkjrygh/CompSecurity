// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import com.walmart.android.analytics.AnalyticsHelper;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter

class this._cls0
    implements android.view.ListPresenter._cls5
{

    final ShelfListPresenter this$0;

    public void onClick(View view)
    {
        if (mMode == 1)
        {
            AnalyticsHelper.post(AnalyticsHelper.prepareSearchSortPageViewEvent());
        }
        ShelfListPresenter.access$400(ShelfListPresenter.this, 1);
    }

    ()
    {
        this$0 = ShelfListPresenter.this;
        super();
    }
}
