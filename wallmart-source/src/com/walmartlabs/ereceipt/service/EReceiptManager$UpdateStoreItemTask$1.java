// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class val.upcs extends AsyncCallbackOnThread
{

    final dateWriteStoreItems.execute this$1;
    final Set val$upcs;

    public void onFailureSameThread(Integer integer, val.upcs aupcs[])
    {
        WLog.w(EReceiptManager.access$600(), (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
        cess._mth1802(this._cls1.this, true);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (onFailureSameThread[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((onSuccessSameThread[])obj);
    }

    public void onSuccessSameThread(onSuccessSameThread aonsuccesssamethread[])
    {
        if (!Cancelled())
        {
            (new dateWriteStoreItems(this._cls1.this, val$upcs)).execute(aonsuccesssamethread);
        }
    }

    dateWriteStoreItems(Set set)
    {
        this$1 = final_datewritestoreitems;
        val$upcs = set;
        super(Handler.this);
    }
}
