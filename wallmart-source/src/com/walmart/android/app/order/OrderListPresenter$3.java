// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.view.View;

// Referenced classes of package com.walmart.android.app.order:
//            OrderListPresenter, OrderListAdapter

class this._cls0
    implements com.walmart.android.wmservice.llback
{

    final OrderListPresenter this$0;

    public void onFailure(int i)
    {
        OrderListPresenter.access$900(OrderListPresenter.this, 0x15f93);
        OrderListPresenter.access$100(OrderListPresenter.this).setVisibility(8);
    }

    public void onSuccess()
    {
        OrderListPresenter.access$200(OrderListPresenter.this).loadItems();
    }

    llback()
    {
        this$0 = OrderListPresenter.this;
        super();
    }
}
