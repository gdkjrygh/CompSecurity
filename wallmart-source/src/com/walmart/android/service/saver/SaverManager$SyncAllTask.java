// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverService, ReceiptsSummaryResponse

private class mSuppressMismatchedChecks extends AsyncTask
{

    private final boolean mSuppressMismatchedChecks;
    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        if (isCancelled())
        {
            return;
        }
        setSaverSummary(null, false);
        SaverManager.access$1402(SaverManager.this, new ceiptsTask(SaverManager.this, mSuppressMismatchedChecks));
        EReceiptManager.get().syncReceipts(new com.walmartlabs.ereceipt.service.EReceiptManager.SyncListener() {

            final SaverManager.SyncAllTask this$1;

            public void onDeletedReceipts(int ai[])
            {
            }

            public void onNewReceipts(EReceipt aereceipt[])
            {
            }

            public void onSyncFinished(Integer integer)
            {
                if (SaverManager.access$1400(this$0) != null && !isCancelled())
                {
                    SaverManager.MismatchedReceiptsTask.access$1500(SaverManager.access$1400(this$0), integer);
                }
            }

            
            {
                this$1 = SaverManager.SyncAllTask.this;
                super();
            }
        });
        if (Services.get().getAuthentication().hasCredentials())
        {
            SaverManager.access$1900(SaverManager.this, new SaverManager.ResultCallback() {

                final SaverManager.SyncAllTask this$1;

                public void onResult(Boolean boolean1)
                {
                    if (boolean1.booleanValue())
                    {
                        SaverManager.access$400(this$0).getReceiptsSummary(new AsyncCallbackOnThread(SaverManager.access$800(this$0)) {

                            final _cls2 this$2;

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
                this$2 = _cls2.this;
                super(handler);
            }
                        });
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
            });
            return;
        } else
        {
            ceiptsTask.access._mth1800(SaverManager.access$1400(SaverManager.this), Integer.valueOf(4));
            return;
        }
    }

    public _cls2.this._cls1(boolean flag)
    {
        this$0 = SaverManager.this;
        super();
        mSuppressMismatchedChecks = flag;
    }
}
