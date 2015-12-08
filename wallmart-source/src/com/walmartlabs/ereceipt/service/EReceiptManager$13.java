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

class nit> extends AsyncCallbackOnThread
{

    final EReceiptManager this$0;
    final AsyncCallback val$callback;
    final HashSet val$upcs;

    public void onFailureSameThread(Integer integer, oreItem aoreitem[])
    {
        WLog.w(EReceiptManager.access$600(), (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
        val$callback.onFailure(integer, Boolean.valueOf(false));
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (oreItem[])obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((oreItem[])obj);
    }

    public void onSuccessSameThread(oreItem aoreitem[])
    {
        (new EReceiptManager.WriteStoreItems(val$upcs) {

            final EReceiptManager._cls13 this$1;

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Void)obj);
            }

            protected void onPostExecute(Void void1)
            {
                callback.onSuccess(Boolean.valueOf(true));
            }

            
            {
                this$1 = EReceiptManager._cls13.this;
                super(this$0, set);
            }
        }).execute(aoreitem);
    }

    this._cls0(HashSet hashset)
    {
        this$0 = final_ereceiptmanager;
        val$callback = AsyncCallback.this;
        val$upcs = hashset;
        super(final_handler);
    }
}
