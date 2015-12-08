// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ShelfRefinementEvent;
import com.walmart.android.service.MessageBus;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter, ShopFilterManager

protected class this._cls0
    implements er
{

    final ShelfPresenter this$0;

    public void onFilterChanged()
    {
        reloadData();
        ArrayList arraylist = mFilterManager.getRefinements();
        String s = mFilterManager.getStoreID();
        if (arraylist != null)
        {
            ShelfRefinementEvent shelfrefinementevent = new ShelfRefinementEvent();
            com.walmart.android.data.ner ner;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); shelfrefinementevent.addRefinement(ner.inement(), ner.inement()))
            {
                ner = (com.walmart.android.data.inement)iterator.next();
                GoogleAnalytics.trackEvent("Shelf", "Filter", ner.inement());
            }

            MessageBus.getBus().post(shelfrefinementevent.build());
        }
        if (arraylist == null || arraylist.isEmpty() || s == null)
        {
            GoogleAnalytics.trackEvent("Shelf", "Filter", "No Filter");
        }
        if (s != null)
        {
            GoogleAnalytics.trackEvent("Shelf", "Filter", "Store");
        }
    }

    protected er()
    {
        this$0 = ShelfPresenter.this;
        super();
    }
}
