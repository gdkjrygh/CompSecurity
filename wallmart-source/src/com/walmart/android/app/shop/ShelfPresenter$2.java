// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.BuyFromFullSiteTapEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter

class 
    implements com.walmart.android.wmservice.logListener
{

    final ShelfPresenter this$0;
    final com.walmart.android.data.Item val$clickedItem;

    public void onClicked(int i, int j, Object aobj[])
    {
        if (val$clickedItem.hasUrl() && i == 7)
        {
            aobj = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://www.walmart.com/msharbor%s?adid=1500000000000033643520&veh=mappa", new Object[] {
                val$clickedItem.getUrl().replace("http://www.walmart.com", "")
            })));
            if (((Intent) (aobj)).resolveActivity(mActivity.getPackageManager()) != null)
            {
                mActivity.startActivity(((Intent) (aobj)));
                MessageBus.getBus().post(new BuyFromFullSiteTapEvent(val$clickedItem.getiD()));
            }
        }
    }

    ()
    {
        this$0 = final_shelfpresenter;
        val$clickedItem = com.walmart.android.data.Item.this;
        super();
    }
}
