// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.wishlist:
//            GiverItemListPresenter, GiverItemsAdapter

class val.order extends CallbackSameThread
{

    final GiverItemListPresenter this$0;
    final String val$filter;
    final String val$order;
    final String val$sort;

    public void onResultSameThread(Request request, Result result)
    {
        GiverItemListPresenter.access$102(GiverItemListPresenter.this, null);
        GiverItemListPresenter.access$202(GiverItemListPresenter.this, false);
        GiverItemListPresenter.access$300(GiverItemListPresenter.this, false);
        if (result.successful() && result.hasData())
        {
            GiverItemListPresenter.access$402(GiverItemListPresenter.this, val$filter);
            GiverItemListPresenter.access$502(GiverItemListPresenter.this, val$sort);
            GiverItemListPresenter.access$602(GiverItemListPresenter.this, val$order);
            GiverItemListPresenter.access$700(GiverItemListPresenter.this).setItems((List)result.getData());
            GiverItemListPresenter.access$800(GiverItemListPresenter.this);
            GiverItemListPresenter.access$900(GiverItemListPresenter.this);
            return;
        } else
        {
            GiverItemListPresenter.access$1000(GiverItemListPresenter.this, result);
            return;
        }
    }

    (String s2)
    {
        this$0 = final_giveritemlistpresenter;
        val$filter = s;
        val$sort = String.this;
        val$order = s2;
        super(final_context);
    }
}
