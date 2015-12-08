// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.service.saver:
//            StatusResponse, SaverManager

class init> extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;

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

    l.saverCallback(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$7

/* anonymous class */
    class SaverManager._cls7
        implements SaverManager.ResultCallback
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
                SaverManager.access$900(SaverManager.this, receipt, localDate, source, false, true, new SaverManager._cls7._cls1(SaverManager.access$800(SaverManager.this)));
                return;
            }
            if (eReceiptCallback != null)
            {
                eReceiptCallback.onSuccess(receipt);
            }
            saverCallback.onFailure(Integer.valueOf(0x15f91), null);
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$0 = final_savermanager;
                receipt = ereceipt;
                localDate = s;
                source = s1;
                eReceiptCallback = asynccallbackonthread;
                saverCallback = AsyncCallbackOnThread.this;
                super();
            }
    }

}
