// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.app.order:
//            OrderListPresenter, OrderListAdapter, OrderDetailsPresenter

class this._cls0
    implements android.widget.ckListener
{

    final OrderListPresenter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!OrderListPresenter.access$600(OrderListPresenter.this))
        {
            adapterview = OrderListPresenter.access$200(OrderListPresenter.this).getOrderItem(i);
            adapterview = new OrderDetailsPresenter(OrderListPresenter.access$700(OrderListPresenter.this), adapterview);
            OrderListPresenter.access$800(OrderListPresenter.this, adapterview);
            OrderListPresenter.access$602(OrderListPresenter.this, true);
        }
    }

    ()
    {
        this$0 = OrderListPresenter.this;
        super();
    }
}
