// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class is._cls0 extends StoreItems
{

    final l.callback this$1;

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        callback.onSuccess(Boolean.valueOf(true));
    }

    t>(Set set)
    {
        this$1 = this._cls1.this;
        super(_fld0, set);
    }

    // Unreferenced inner class com/walmartlabs/ereceipt/service/EReceiptManager$13

/* anonymous class */
    class EReceiptManager._cls13 extends AsyncCallbackOnThread
    {

        final EReceiptManager this$0;
        final AsyncCallback val$callback;
        final HashSet val$upcs;

        public void onFailureSameThread(Integer integer, StoreItemService.StoreItem astoreitem[])
        {
            WLog.w(EReceiptManager.access$600(), (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
            callback.onFailure(integer, Boolean.valueOf(false));
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (StoreItemService.StoreItem[])obj1);
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StoreItemService.StoreItem[])obj);
        }

        public void onSuccessSameThread(StoreItemService.StoreItem astoreitem[])
        {
            (new EReceiptManager._cls13._cls1(upcs)).execute(astoreitem);
        }

            
            {
                this$0 = final_ereceiptmanager;
                callback = AsyncCallback.this;
                upcs = hashset;
                super(final_handler);
            }
    }

}
