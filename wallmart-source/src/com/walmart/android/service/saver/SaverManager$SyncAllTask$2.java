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
//            SaverManager, SaverService, ReceiptsSummaryResponse

class this._cls1
    implements 
{

    final onResult this$1;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$400(_fld0).getReceiptsSummary(new AsyncCallbackOnThread(SaverManager.access$800(_fld0)) {

                final SaverManager.SyncAllTask._cls2 this$2;

                public void onFailureSameThread(Integer integer, ReceiptsSummaryResponse receiptssummaryresponse)
                {
                    if (!isCancelled())
                    {
                        SaverManager.access$1602(this$0, new SaverManager.InsertSummariesTask(this$0, integer, null));
                        SaverManager.access$1600(this$0).execute((ArrayList[])null);
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
                    if (!isCancelled())
                    {
                        setSaverSummary(receiptssummaryresponse.payload.overallSavingsSummary, true);
                        SaverManager.access$1602(this$0, new SaverManager.InsertSummariesTask(this$0, null, null));
                        SaverManager.access$1600(this$0).execute(new ArrayList[] {
                            receiptssummaryresponse.payload.receiptSummaries
                        });
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((ReceiptsSummaryResponse)obj);
                }

            
            {
                this$2 = SaverManager.SyncAllTask._cls2.this;
                super(handler);
            }
            });
            return;
        } else
        {
            WLog.w(SaverManager.access$1200(), "Saver not ready to sync");
            iptsTask.access._mth1800(SaverManager.access$1400(_fld0), Integer.valueOf(0x15f91));
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    _cls1.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
