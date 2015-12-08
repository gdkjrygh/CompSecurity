// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, ReceiptsSummaryResponse, SaverService

class this._cls2 extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$2;

    public void onFailureSameThread(Integer integer, ReceiptsSummaryResponse receiptssummaryresponse)
    {
        if (!ncelled())
        {
            SaverManager.access$1602(_fld0, new ask(_fld0, integer, null));
            SaverManager.access$1600(_fld0).execute((ArrayList[])null);
            MessageBus.getBus().post(produceSaverSummaryUpdateEvent());
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (ReceiptsSummaryResponse)obj1);
    }

    public void onSuccessSameThread(ReceiptsSummaryResponse receiptssummaryresponse)
    {
        if (receiptssummaryresponse == null || receiptssummaryresponse.payload == null || receiptssummaryresponse.payload.overallSavingsSummary == null || receiptssummaryresponse.payload.receiptSummaries == null)
        {
            WLog.e(SaverManager.access$1200(), "Saver receipt summary call is missing vital data, no saver data will be available.");
            onFailureSameThread(Integer.valueOf(0x15f90), receiptssummaryresponse);
        } else
        if (!ncelled())
        {
            setSaverSummary(receiptssummaryresponse.payload.overallSavingsSummary, true);
            SaverManager.access$1602(_fld0, new ask(_fld0, null, null));
            SaverManager.access$1600(_fld0).execute(new ArrayList[] {
                receiptssummaryresponse.payload.receiptSummaries
            });
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((ReceiptsSummaryResponse)obj);
    }

    is._cls1(Handler handler)
    {
        this$2 = this._cls2.this;
        super(handler);
    }

    // Unreferenced inner class com/walmart/android/service/saver/SaverManager$SyncAllTask$2

/* anonymous class */
    class SaverManager.SyncAllTask._cls2
        implements SaverManager.ResultCallback
    {

        final SaverManager.SyncAllTask this$1;

        public void onResult(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                SaverManager.access$400(this$0).getReceiptsSummary(new SaverManager.SyncAllTask._cls2._cls1(SaverManager.access$800(this$0)));
                return;
            } else
            {
                WLog.w(SaverManager.access$1200(), "Saver not ready to sync");
                SaverManager.MismatchedReceiptsTask.access$1800(SaverManager.access$1400(this$0), Integer.valueOf(0x15f91));
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

            
            {
                this$1 = SaverManager.SyncAllTask.this;
                super();
            }
    }

}
