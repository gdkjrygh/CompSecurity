// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;

// Referenced classes of package com.walmartlabs.android.photo.service.order:
//            OrderService

public class this._cls0 extends BroadcastReceiver
{

    final OrderService this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (PhotoUtils.hasDataConnectivity(OrderService.this))
        {
            PhotoLogger.get().d(OrderService.access$300(), "onReceive(): Connectivity OK, will wake up if in backoff");
            synchronized (OrderService.access$400(OrderService.this))
            {
                OrderService.access$400(OrderService.this).notifyAll();
            }
            return;
        } else
        {
            return;
        }
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public ()
    {
        this$0 = OrderService.this;
        super();
    }
}
