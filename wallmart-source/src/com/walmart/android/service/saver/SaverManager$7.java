// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, StatusResponse

class 
    implements sultCallback
{

    final SaverManager this$0;
    final AsyncCallbackOnThread val$eReceiptCallback;
    final String val$localDate;
    final EReceipt val$receipt;
    final AsyncCallbackOnThread val$saverCallback;
    final String val$source;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$900(SaverManager.this, val$receipt, val$localDate, val$source, false, true, new AsyncCallbackOnThread(SaverManager.access$800(SaverManager.this)) {

                final SaverManager._cls7 this$1;

                public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
                {
                    if (eReceiptCallback != null)
                    {
                        eReceiptCallback.onSuccess(receipt);
                    }
                    saverCallback.onFailure(integer, statusresponse);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (StatusResponse)obj1);
                }

                public void onSuccessSameThread(StatusResponse statusresponse)
                {
                    if (eReceiptCallback != null)
                    {
                        eReceiptCallback.onSuccess(receipt);
                    }
                    saverCallback.onSuccess(statusresponse);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((StatusResponse)obj);
                }

            
            {
                this$1 = SaverManager._cls7.this;
                super(handler);
            }
            });
            return;
        }
        if (val$eReceiptCallback != null)
        {
            val$eReceiptCallback.onSuccess(val$receipt);
        }
        val$saverCallback.onFailure(Integer.valueOf(0x15f91), null);
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    ()
    {
        this$0 = final_savermanager;
        val$receipt = ereceipt;
        val$localDate = s;
        val$source = s1;
        val$eReceiptCallback = asynccallbackonthread;
        val$saverCallback = AsyncCallbackOnThread.this;
        super();
    }
}
