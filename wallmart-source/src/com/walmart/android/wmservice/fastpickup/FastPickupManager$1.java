// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.os.Handler;
import com.walmart.android.data.FastPickupUserStatus;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupManager

class val.storeId extends AsyncCallbackOnThread
{

    final FastPickupManager this$0;
    final String val$storeId;
    final AsyncCallback val$uiCallback;

    public void onFailureSameThread(Integer integer, FastPickupUserStatus fastpickupuserstatus)
    {
        WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("onFailureSameThread error=").append(integer).append(" data=").append(fastpickupuserstatus).toString());
        if (val$uiCallback != null)
        {
            val$uiCallback.onFailure(integer, null);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (FastPickupUserStatus)obj1);
    }

    public void onSuccessSameThread(FastPickupUserStatus fastpickupuserstatus)
    {
        WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("onSuccessSameThread data=").append(fastpickupuserstatus).toString());
        if (fastpickupuserstatus != null && fastpickupuserstatus.status == 0 && fastpickupuserstatus.data != null)
        {
            FastPickupManager.access$200(FastPickupManager.this).setCustomerStatus(val$storeId, fastpickupuserstatus.data.getUserStatus());
            WLog.d(FastPickupManager.access$100(), (new StringBuilder()).append("onSuccessSameThread() store:").append(val$storeId).append(" status=").append(0).toString());
            FastPickupManager.access$300(FastPickupManager.this, val$uiCallback);
            return;
        }
        int i;
        if (fastpickupuserstatus != null)
        {
            i = fastpickupuserstatus.status;
        } else
        {
            i = 0x15f91;
        }
        onFailureSameThread(Integer.valueOf(i), fastpickupuserstatus);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((FastPickupUserStatus)obj);
    }

    del(String s)
    {
        this$0 = final_fastpickupmanager;
        val$uiCallback = AsyncCallback.this;
        val$storeId = s;
        super(final_handler);
    }
}
