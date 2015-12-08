// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.orderhistory.OrderDetailsResult;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.order:
//            OrderDetailsPresenter

class this._cls0 extends CallbackSameThread
{

    final OrderDetailsPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        OrderDetailsPresenter.access$100(OrderDetailsPresenter.this).remove(request);
        if (isPopped())
        {
            return;
        }
        if (result.successful() && result.hasData())
        {
            OrderDetailsPresenter.access$200(OrderDetailsPresenter.this).findViewById(0x7f1002f0).setVisibility(8);
            OrderDetailsPresenter.access$200(OrderDetailsPresenter.this).findViewById(0x7f1002df).setVisibility(0);
            OrderDetailsPresenter.access$300(OrderDetailsPresenter.this, (OrderDetailsResult)result.getData());
            return;
        } else
        {
            WLog.w(OrderDetailsPresenter.access$400(), "Failure while requesting order details.");
            OrderDetailsPresenter.access$500(OrderDetailsPresenter.this, AsyncCallbackWrapper.translateError(result).intValue());
            return;
        }
    }

    esult(Context context)
    {
        this$0 = OrderDetailsPresenter.this;
        super(context);
    }
}
