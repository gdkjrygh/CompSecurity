// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import android.text.TextUtils;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptService, EReceipt, EReceiptsResponse

private class _cls1.onSuccessSameThread
{

    private final Set mAddedReceiptUuids = new HashSet();
    private int mBatchCount;
    private volatile boolean mCancelled;
    private final Handler mHandler = new Handler();
    private final AsyncCallbackOnThread mSyncCallback;
    private ener mSyncListener;
    private final long mSyncStartTime = System.currentTimeMillis();
    private final List mSyncedReceiptIds = new ArrayList();
    final EReceiptManager this$0;

    private void cleanUp()
    {
        mSyncListener = null;
        mSyncedReceiptIds.clear();
        if (EReceiptManager.access$3600(EReceiptManager.this) == this)
        {
            EReceiptManager.access$3602(EReceiptManager.this, null);
        }
    }

    private void continueSync()
    {
        if (TextUtils.isEmpty(EReceiptManager.access$2400(EReceiptManager.this)) || mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        } else
        {
            mBatchCount = mBatchCount + 1;
            EReceiptManager.access$2900(EReceiptManager.this).syncReceipts(EReceiptManager.access$2400(EReceiptManager.this), mSyncedReceiptIds, EReceiptManager.access$2500(EReceiptManager.this), true, EReceiptManager.access$4100(EReceiptManager.this), mSyncCallback);
            return;
        }
    }

    private void finishSync(Integer integer)
    {
        if (!mCancelled && mSyncListener != null)
        {
            mSyncListener.onSyncFinished(integer);
        }
        EReceiptManager.access$4200(EReceiptManager.this, mAddedReceiptUuids);
        if (mCancelled)
        {
            WLog.d(EReceiptManager.access$600(), "SyncJob was cancelled");
        } else
        {
            WLog.d(EReceiptManager.access$600(), (new StringBuilder()).append("Receipts SyncJob completed in ").append(mBatchCount).append(" batches after ").append(System.currentTimeMillis() - mSyncStartTime).append(" ms. Receipt count ").append(mSyncedReceiptIds.size()).toString());
        }
        cleanUp();
    }

    private void handleLocalReceipts(Iterator iterator)
    {
        if (mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        }
        if (iterator.hasNext())
        {
            ArrayList arraylist = new ArrayList();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                EReceipt ereceipt = (EReceipt)iterator.next();
                if (ereceipt.customerReceiptId != 0)
                {
                    mSyncedReceiptIds.add(Integer.toString(ereceipt.customerReceiptId));
                }
                if (!ereceipt.deleted)
                {
                    arraylist.add(ereceipt);
                }
            } while (true);
            WLog.d(EReceiptManager.access$600(), (new StringBuilder()).append("SyncJob found ").append(arraylist.size()).append(" local eReceipts").toString());
            mSyncListener.onNewReceipts((EReceipt[])arraylist.toArray(new EReceipt[arraylist.size()]));
        }
        continueSync();
    }

    private void handleRemoteDeletedReceipts(EReceiptsResponse ereceiptsresponse)
    {
        if (mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        }
        int ai[] = ereceiptsresponse.deleteReceipts;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            mSyncedReceiptIds.remove(String.valueOf(k));
        }

        mSyncListener.onDeletedReceipts(ai);
        (new calEReceiptsTask(EReceiptManager.this, null)).execute(new EReceiptsResponse[] {
            ereceiptsresponse
        });
    }

    private void handleRemoteNewReceipts(EReceiptsResponse ereceiptsresponse)
    {
        if (mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        }
        ereceiptsresponse = ereceiptsresponse.receipts;
        int j = ereceiptsresponse.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = ereceiptsresponse[i];
            if (((t) (obj)).customerReceiptId != 0)
            {
                mSyncedReceiptIds.add(Integer.toString(((t) (obj)).customerReceiptId));
            }
            mAddedReceiptUuids.add(((t) (obj)).uuid);
        }

        mSyncListener.onNewReceipts(ereceiptsresponse);
        continueSync();
        (new alEReceiptsTask(EReceiptManager.this, true, false)).execute(ereceiptsresponse);
    }

    private void handleRemoteReceipts(EReceiptsResponse ereceiptsresponse)
    {
        if (mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        }
        if (ereceiptsresponse != null && ereceiptsresponse.deleteReceipts != null && ereceiptsresponse.deleteReceipts.length > 0)
        {
            handleRemoteDeletedReceipts(ereceiptsresponse);
            return;
        }
        if (ereceiptsresponse != null && ereceiptsresponse.receipts != null && ereceiptsresponse.receipts.length > 0)
        {
            handleRemoteNewReceipts(ereceiptsresponse);
            return;
        } else
        {
            finishSync(Integer.valueOf(-1));
            return;
        }
    }

    public void cancel()
    {
        mCancelled = true;
    }

    public void start()
    {
        if (mCancelled)
        {
            finishSync(Integer.valueOf(-1));
            return;
        } else
        {
            (new lEReceiptsTask(EReceiptManager.this, this)).execute(new String[] {
                EReceiptManager.access$200(EReceiptManager.this)
            });
            return;
        }
    }






    public ener(ener ener)
    {
        this$0 = EReceiptManager.this;
        super();
        mSyncListener = ener;
        mSyncCallback = new AsyncCallbackOnThread(EReceiptManager.this) {

            final EReceiptManager.SyncJob this$1;
            final EReceiptManager val$this$0;

            public void onFailureSameThread(Integer integer, EReceiptsResponse ereceiptsresponse)
            {
                finishSync(integer);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (EReceiptsResponse)obj1);
            }

            public void onSuccessSameThread(EReceiptsResponse ereceiptsresponse)
            {
                if (mCancelled)
                {
                    finishSync(Integer.valueOf(-1));
                    return;
                }
                if (ereceiptsresponse == null || ereceiptsresponse.receipts == null)
                {
                    finishSync(Integer.valueOf(0x15f91));
                    return;
                } else
                {
                    handleRemoteReceipts(ereceiptsresponse);
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((EReceiptsResponse)obj);
            }

            
            {
                this$1 = EReceiptManager.SyncJob.this;
                this$0 = ereceiptmanager;
                super(final_handler);
            }
        };
    }
}
