// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.view.View;

// Referenced classes of package com.walmart.android.app.order:
//            OrderListPresenter, OrderListAdapter

class this._cls0
    implements ener
{

    final OrderListPresenter this$0;

    public void onChanged()
    {
        OrderListPresenter.access$100(OrderListPresenter.this).setVisibility(8);
        if (OrderListPresenter.access$200(OrderListPresenter.this).getCount() == 0)
        {
            OrderListPresenter.access$300(OrderListPresenter.this);
        } else
        if (!OrderListPresenter.access$400(OrderListPresenter.this))
        {
            OrderListPresenter.access$500(OrderListPresenter.this);
            return;
        }
    }

    public void onError(int i)
    {
        OrderListPresenter.access$000(OrderListPresenter.this, i);
        OrderListPresenter.access$100(OrderListPresenter.this).setVisibility(8);
    }

    ener()
    {
        this$0 = OrderListPresenter.this;
        super();
    }
}
