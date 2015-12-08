// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.events.TrackOrderEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.order:
//            OrderDetailsPresenter

class val.trackUrl extends OnSingleClickListener
{

    final OrderDetailsPresenter this$0;
    final String val$trackUrl;

    public void onSingleClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(val$trackUrl));
        if (view.resolveActivity(OrderDetailsPresenter.access$000(OrderDetailsPresenter.this).getPackageManager()) != null)
        {
            OrderDetailsPresenter.access$000(OrderDetailsPresenter.this).startActivity(view);
            MessageBus.getBus().post(new TrackOrderEvent());
        }
    }

    (String s)
    {
        this$0 = final_orderdetailspresenter;
        val$trackUrl = s;
        super(Presenter.this);
    }
}
