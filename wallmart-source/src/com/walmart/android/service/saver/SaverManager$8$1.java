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
        saverCallback.onFailure(integer, statusresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
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

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$8

/* anonymous class */
    class SaverManager._cls8
        implements SaverManager.ResultCallback
    {

        final SaverManager this$0;
        final String val$localDate;
        final AsyncCallbackOnThread val$saverCallback;
        final String val$source;
        final String val$tcNumber;

        public void onResult(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                boolean1 = new EReceipt();
                boolean1.tcNumber = tcNumber;
                SaverManager.access$900(SaverManager.this, boolean1, localDate, source, true, true, new SaverManager._cls8._cls1(SaverManager.access$800(SaverManager.this)));
                return;
            } else
            {
                saverCallback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$0 = final_savermanager;
                tcNumber = s;
                localDate = s1;
                source = s2;
                saverCallback = AsyncCallbackOnThread.this;
                super();
            }
    }

}
