// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import com.walmart.android.data.FastPickupOrder;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupService, FastPickupManager

class mStartId extends AsyncCallbackOnThread
{

    private final int mStartId;
    final FastPickupService this$0;

    public void onCancelledSameThread()
    {
        FastPickupService.access$200(FastPickupService.this);
        FastPickupService.access$300(FastPickupService.this, mStartId);
    }

    public void onFailureSameThread(Integer integer, FastPickupOrder fastpickuporder)
    {
        WLog.d(FastPickupService.access$100(), (new StringBuilder()).append("Callback.onFailureSameThread() error=").append(integer).append(", data:").append(fastpickuporder).toString());
        Services.get().getFastPickupManager().updateServerState(fastpickuporder, integer.intValue());
        FastPickupService.access$200(FastPickupService.this);
        FastPickupService.access$300(FastPickupService.this, mStartId);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (FastPickupOrder)obj1);
    }

    public void onSuccessSameThread(FastPickupOrder fastpickuporder)
    {
        WLog.d(FastPickupService.access$100(), "Callback.onSuccessSameThread()");
        Services.get().getFastPickupManager().updateServerState(fastpickuporder, 0);
        FastPickupService.access$200(FastPickupService.this);
        FastPickupService.access$300(FastPickupService.this, mStartId);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((FastPickupOrder)obj);
    }

    public I(int i)
    {
        this$0 = FastPickupService.this;
        super(FastPickupService.access$000(FastPickupService.this));
        mStartId = i;
    }
}
