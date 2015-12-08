// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.order;

import android.content.Context;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.orderhistory.OrderHistoryResult;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.order:
//            OrderListAdapter

class > extends CallbackSameThread
{

    final OrderListAdapter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        if (!result.successful() || !result.hasData()) goto _L2; else goto _L1
_L1:
        WLog.d(OrderListAdapter.access$000(), ((OrderHistoryResult)result.getData()).toString());
        request = ((OrderHistoryResult)result.getData()).getOrders();
        if (request == null) goto _L4; else goto _L3
_L3:
        int k = request.length;
        for (int i = 0; i < k; i++)
        {
            result = request[i];
            OrderListAdapter.access$100(OrderListAdapter.this).add(result);
        }

        notifyDataSetChanged();
        if (OrderListAdapter.access$200(OrderListAdapter.this) != null)
        {
            OrderListAdapter.access$200(OrderListAdapter.this).onChanged();
        }
_L6:
        return;
_L4:
        WLog.w(OrderListAdapter.access$000(), "Failure while requesting order history");
        if (OrderListAdapter.access$200(OrderListAdapter.this) != null)
        {
            OrderListAdapter.access$200(OrderListAdapter.this).onError(0x15f91);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int j = AsyncCallbackWrapper.translateError(result).intValue();
        WLog.w(OrderListAdapter.access$000(), (new StringBuilder()).append("Failure while requesting order history: ").append(j).toString());
        if (OrderListAdapter.access$200(OrderListAdapter.this) != null)
        {
            OrderListAdapter.access$200(OrderListAdapter.this).onError(j);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    stener(Context context)
    {
        this$0 = OrderListAdapter.this;
        super(context);
    }
}
