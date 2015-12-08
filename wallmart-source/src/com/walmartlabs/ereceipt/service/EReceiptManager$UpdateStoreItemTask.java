// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, StoreItemService, EReceiptProvider

private class <init> extends AsyncTask
{
    private class UpdateWriteStoreItems extends EReceiptManager.WriteStoreItems
    {

        final EReceiptManager.UpdateStoreItemTask this$1;

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            mDone = true;
            if (!isCancelled())
            {
                EReceiptManager.access$1902(this$0, new EReceiptManager.UpdateStoreItemTask((String[])ArrayUtils.addAll(mRowIds, mNextBatch), null));
                EReceiptManager.access$1900(this$0).execute(new Void[0]);
            }
        }

        public UpdateWriteStoreItems(Set set)
        {
            this$1 = EReceiptManager.UpdateStoreItemTask.this;
            super(this$0, set);
        }
    }


    private boolean mDone;
    private final int mLookupLimit;
    private String mNextBatch[];
    private final String mRowIds[];
    final EReceiptManager this$0;

    private void addReceipts(String as[])
    {
        mNextBatch = (String[])ArrayUtils.addAll(mNextBatch, as);
    }

    private boolean isDone()
    {
        return isCancelled() || mDone;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Set doInBackground(Void avoid[])
    {
        avoid = new HashSet();
        Cursor cursor = EReceiptManager.access$300(EReceiptManager.this).getStoreLookup(mLookupLimit, mRowIds);
        if (cursor != null)
        {
            for (; cursor.moveToNext(); avoid.add(cursor.getString(0))) { }
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Set)obj);
    }

    protected void onPostExecute(Set set)
    {
        if (EReceiptManager.access$1600(EReceiptManager.this) != null && !isCancelled())
        {
            if (!set.isEmpty())
            {
                EReceiptManager.access$1600(EReceiptManager.this).lookupItems((String[])set.toArray(new String[set.size()]), new AsyncCallbackOnThread(set) {

                    final EReceiptManager.UpdateStoreItemTask this$1;
                    final Set val$upcs;

                    public void onFailureSameThread(Integer integer, StoreItemService.StoreItem astoreitem[])
                    {
                        WLog.w(EReceiptManager.access$600(), (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
                        mDone = true;
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (StoreItemService.StoreItem[])obj1);
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((StoreItemService.StoreItem[])obj);
                    }

                    public void onSuccessSameThread(StoreItemService.StoreItem astoreitem[])
                    {
                        if (!isCancelled())
                        {
                            (new UpdateWriteStoreItems(upcs)).execute(astoreitem);
                        }
                    }

            
            {
                this$1 = EReceiptManager.UpdateStoreItemTask.this;
                upcs = set;
                super(final_handler);
            }
                });
                return;
            }
            if (mNextBatch != null)
            {
                EReceiptManager.access$1902(EReceiptManager.this, new <init>(mNextBatch));
                EReceiptManager.access$1900(EReceiptManager.this).execute(new Void[0]);
                return;
            } else
            {
                EReceiptManager.access$1902(EReceiptManager.this, null);
                return;
            }
        } else
        {
            EReceiptManager.access$1902(EReceiptManager.this, null);
            return;
        }
    }




/*
    static boolean access$1802(UpdateWriteStoreItems updatewritestoreitems, boolean flag)
    {
        updatewritestoreitems.mDone = flag;
        return flag;
    }

*/



    private _cls1.val.upcs(String as[])
    {
        this$0 = EReceiptManager.this;
        super();
        mRowIds = as;
        if (EReceiptManager.access$1600(EReceiptManager.this) != null)
        {
            mLookupLimit = EReceiptManager.access$1600(EReceiptManager.this).getLookupLimit();
            return;
        } else
        {
            mLookupLimit = 0;
            return;
        }
    }

    mLookupLimit(String as[], mLookupLimit mlookuplimit)
    {
        this(as);
    }
}
