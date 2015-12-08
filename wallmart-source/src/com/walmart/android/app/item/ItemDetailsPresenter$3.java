// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import com.walmart.android.analytics.GoogleAnalytics;

// Referenced classes of package com.walmart.android.app.item:
//            ItemDetailsPresenter

class this._cls0
    implements android.view.ailsPresenter._cls3
{

    final ItemDetailsPresenter this$0;

    public void onClick(View view)
    {
        ItemDetailsPresenter.access$1200(ItemDetailsPresenter.this);
        GoogleAnalytics.trackEvent("Item Details", "Reviews", "Header");
    }

    _cls9()
    {
        this$0 = ItemDetailsPresenter.this;
        super();
    }
}
