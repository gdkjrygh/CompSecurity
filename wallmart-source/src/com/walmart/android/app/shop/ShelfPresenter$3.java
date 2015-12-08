// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ShelfSortEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter

class this._cls0
    implements com.walmart.android.app.item.nSortChangedListener
{

    final ShelfPresenter this$0;

    public volatile void onSortChanged(Object obj)
    {
        onSortChanged((String)obj);
    }

    public void onSortChanged(String s)
    {
        TextView textview = (TextView)mListContainer.findViewById(0x7f1002dd);
        if (textview != null)
        {
            textview.setSelected(true);
        }
        reloadData();
        GoogleAnalytics.trackEvent("Shelf", "Sort", s);
        MessageBus.getBus().post(new ShelfSortEvent(s));
    }

    Event()
    {
        this$0 = ShelfPresenter.this;
        super();
    }
}
