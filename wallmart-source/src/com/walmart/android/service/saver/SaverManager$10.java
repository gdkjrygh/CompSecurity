// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverReceipt, SaverService, SaverReceiptResponse

class val.callback
    implements ultCallback
{

    final SaverManager this$0;
    final AsyncCallbackOnThread val$callback;
    final SaverReceipt val$receipt;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$400(SaverManager.this).getReceipt(val$receipt.tcNumber, val$receipt.serverState, new AsyncCallbackOnThread(SaverManager.access$800(SaverManager.this)) {

                final SaverManager._cls10 this$1;

                public void onFailureSameThread(Integer integer, SaverReceiptResponse saverreceiptresponse)
                {
                    callback.onFailureSameThread(integer, null);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (SaverReceiptResponse)obj1);
                }

                public void onSuccessSameThread(SaverReceiptResponse saverreceiptresponse)
                {
                    if (saverreceiptresponse == null || saverreceiptresponse.payload == null || saverreceiptresponse.payload.processedDetails == null)
                    {
                        onFailureSameThread(Integer.valueOf(0x15f90), saverreceiptresponse);
                        return;
                    } else
                    {
                        (new SaverManager.InsertDetailsTask(this$0, callback)).execute(new SaverReceiptResponse.Payload[] {
                            saverreceiptresponse.payload
                        });
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((SaverReceiptResponse)obj);
                }

            
            {
                this$1 = SaverManager._cls10.this;
                super(handler);
            }
            });
            return;
        } else
        {
            val$callback.onFailure(Integer.valueOf(0x15f91), null);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    <init>()
    {
        this$0 = final_savermanager;
        val$receipt = saverreceipt;
        val$callback = AsyncCallbackOnThread.this;
        super();
    }
}
