// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverReceiptResponse, SaverManager, SaverReceipt, SaverService

class nit> extends AsyncCallbackOnThread
{

    final se this$1;

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
            (new tDetailsTask(_fld0, callback)).execute(new se.Payload[] {
                saverreceiptresponse.payload
            });
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((SaverReceiptResponse)obj);
    }

    l.callback(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$10

/* anonymous class */
    class SaverManager._cls10
        implements SaverManager.ResultCallback
    {

        final SaverManager this$0;
        final AsyncCallbackOnThread val$callback;
        final SaverReceipt val$receipt;

        public void onResult(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                SaverManager.access$400(SaverManager.this).getReceipt(receipt.tcNumber, receipt.serverState, new SaverManager._cls10._cls1(SaverManager.access$800(SaverManager.this)));
                return;
            } else
            {
                callback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$0 = final_savermanager;
                receipt = saverreceipt;
                callback = AsyncCallbackOnThread.this;
                super();
            }
    }

}
