// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceipt, EReceiptService, EReceiptProvider, GcmRegistration, 
//            EReceiptRecentSearchProvider, StoreItemService, WalletRegisteredEvent, EReceiptsContractUtil, 
//            EReceiptIO, EReceiptsResponse, WalletStatus, WalletRegisterStatus

public class EReceiptManager
{
    private class AssociateLocalEReceiptTask extends AsyncTask
    {

        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((EReceiptsResponse.Receipt[])aobj);
        }

        protected transient Void doInBackground(EReceiptsResponse.Receipt areceipt[])
        {
            String as[] = new String[areceipt.length];
            for (int i = 0; i < areceipt.length; i++)
            {
                as[i] = areceipt[i].uuid;
            }

            mEReceiptProvider.associate(mProviderCustomerId, as);
            return null;
        }

        private AssociateLocalEReceiptTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class AssociateReceiptsTask extends AsyncTask
    {

        final EReceiptManager this$0;

        private void associateNext(Iterator iterator)
        {
            EReceipt ereceipt = (EReceipt)iterator.next();
            mEReceiptService.getReceipt(mServiceCustomerId, ereceipt.uuid, mDeviceId, (new Handler()). new AsyncCallbackOnThread(iterator) {

                final AssociateReceiptsTask this$1;
                final Iterator val$iterator;

                public void onFailureSameThread(Integer integer, EReceiptsResponse.Receipt receipt)
                {
                    WLog.w(EReceiptManager.TAG, "Failed to associate ereceipt.");
                    onSuccessSameThread(((EReceiptsResponse.Receipt) (null)));
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (EReceiptsResponse.Receipt)obj1);
                }

                public void onSuccessSameThread(EReceiptsResponse.Receipt receipt)
                {
                    if (receipt != null)
                    {
                        (new AssociateLocalEReceiptTask()).execute(new EReceiptsResponse.Receipt[] {
                            receipt
                        });
                    }
                    if (iterator.hasNext())
                    {
                        associateNext(iterator);
                        return;
                    } else
                    {
                        postUpdate();
                        return;
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((EReceiptsResponse.Receipt)obj);
                }

            
            {
                this$1 = final_associatereceiptstask;
                iterator = iterator1;
                super(Handler.this);
            }
            });
        }

        private void postUpdate()
        {
            MessageBus.getBus().post(new EReceiptsUpdatedEvent());
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient Iterator doInBackground(String as[])
        {
            Object obj;
            obj = new ArrayList();
            as = mEReceiptProvider.getAllReceipts(null);
_L2:
            if (as == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!as.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            ((List) (obj)).add(EReceiptsContractUtil.populateEReceipt(as, new EReceipt()));
            if (true) goto _L2; else goto _L1
            obj;
            if (as != null)
            {
                as.close();
            }
            throw obj;
_L1:
            if (as != null)
            {
                as.close();
            }
            return ((List) (obj)).iterator();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Iterator)obj);
        }

        protected void onPostExecute(Iterator iterator)
        {
            if (iterator.hasNext())
            {
                associateNext(iterator);
                return;
            } else
            {
                postUpdate();
                return;
            }
        }



        private AssociateReceiptsTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class CleanupReceiptsMarkedForDeletion extends AsyncTask
    {

        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient HashMap doInBackground(Void avoid[])
        {
            Cursor cursor;
            HashMap hashmap;
            WLog.d(EReceiptManager.TAG, "CleanupReceiptsMarkedForDeletion");
            cursor = mEReceiptProvider.getReceiptsMarkedForDeletion();
            hashmap = new HashMap();
_L2:
            if (cursor == null)
            {
                break; /* Loop/switch isn't completed */
            }
            List list;
            EReceipt ereceipt;
            if (!cursor.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            ereceipt = EReceiptsContractUtil.populateEReceipt(cursor, new EReceipt());
            list = (List)hashmap.get(ereceipt.customerId);
            avoid = list;
            if (list != null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            avoid = new ArrayList();
            hashmap.put(ereceipt.customerId, avoid);
            avoid.add(ereceipt);
            if (true) goto _L2; else goto _L1
            avoid;
            if (cursor != null)
            {
                cursor.close();
            }
            throw avoid;
_L1:
            if (cursor != null)
            {
                cursor.close();
            }
            return hashmap;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((HashMap)obj);
        }

        protected void onPostExecute(HashMap hashmap)
        {
            List list;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); deleteReceipts((EReceipt[])list.toArray(new EReceipt[list.size()])))
            {
                String s = (String)iterator.next();
                list = (List)hashmap.get(s);
                WLog.d(EReceiptManager.TAG, String.format("need to delete %d receipts for customer %s", new Object[] {
                    Integer.valueOf(list.size()), s
                }));
            }

        }

        private CleanupReceiptsMarkedForDeletion()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class ClearLocalEReceiptsTask extends AsyncTask
    {

        private final ResultCallback mCallback;
        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient Void doInBackground(String as[])
        {
            as = as[0];
            if (as != null)
            {
                mEReceiptProvider.deleteAll(as);
            } else
            {
                mEReceiptProvider.clearAll();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            MessageBus.getBus().post(new EReceiptsUpdatedEvent());
            if (mCallback != null)
            {
                mCallback.onResult(Boolean.valueOf(true));
            }
        }

        private ClearLocalEReceiptsTask(ResultCallback resultcallback)
        {
            this$0 = EReceiptManager.this;
            super();
            mCallback = resultcallback;
        }

    }

    private class ClearSearchHistoryTask extends AsyncTask
    {

        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            getEReceiptRecentSearchProvider().clearSearchHistory();
            return null;
        }

        private ClearSearchHistoryTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class DeleteReceiptsMarkedForDeletionTask extends AsyncTask
    {

        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((EReceipt[])aobj);
        }

        protected transient Void doInBackground(EReceipt aereceipt[])
        {
            mEReceiptProvider.delete(aereceipt);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            MessageBus.getBus().post(new EReceiptsUpdatedEvent());
        }

        private DeleteReceiptsMarkedForDeletionTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class MarkReceiptsForDeletetionTask extends AsyncTask
    {

        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((EReceipt[])aobj);
        }

        protected transient Void doInBackground(EReceipt aereceipt[])
        {
            int j = aereceipt.length;
            for (int i = 0; i < j; i++)
            {
                EReceipt ereceipt = aereceipt[i];
                mEReceiptProvider.markForDeletion(new String[] {
                    ereceipt.uuid
                });
            }

            return null;
        }

        private MarkReceiptsForDeletetionTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class MigrateEReceiptsTask extends AsyncTask
    {

        private SyncJob mSyncJob;
        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            avoid = new EReceiptIO(mContext);
            Map map = avoid.readAll();
            if (map != null && !map.isEmpty())
            {
                for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
                {
                    Object obj = (String)iterator.next();
                    List list = (List)map.get(obj);
                    mEReceiptProvider.insertReceipts(((String) (obj)), (EReceiptsResponse.Receipt[])list.toArray(new EReceiptsResponse.Receipt[list.size()]));
                    obj = list.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        EReceiptsResponse.Receipt receipt = (EReceiptsResponse.Receipt)((Iterator) (obj)).next();
                        if (receipt.deleted)
                        {
                            mEReceiptProvider.markForDeletion(new String[] {
                                receipt.uuid
                            });
                        }
                    }
                }

                avoid.clearAll();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            mMigrationTask = null;
            if (mSyncJob != null)
            {
                mSyncJob.start();
            }
            (new CleanupReceiptsMarkedForDeletion()).execute(new Void[0]);
        }


/*
        static SyncJob access$402(MigrateEReceiptsTask migrateereceiptstask, SyncJob syncjob)
        {
            migrateereceiptstask.mSyncJob = syncjob;
            return syncjob;
        }

*/

        private MigrateEReceiptsTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class ReadLocalEReceiptsTask extends AsyncTask
    {

        private final SyncJob mSyncJob;
        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient List doInBackground(String as[])
        {
            Object obj;
            obj = new ArrayList();
            as = mEReceiptProvider.getAllReceipts(as[0]);
_L2:
            if (as == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!as.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            ((List) (obj)).add(EReceiptsContractUtil.populateEReceipt(as, new EReceipt()));
            if (true) goto _L2; else goto _L1
            obj;
            if (as != null)
            {
                as.close();
            }
            throw obj;
_L1:
            if (as != null)
            {
                as.close();
            }
            return ((List) (obj));
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            mSyncJob.handleLocalReceipts(list.iterator());
        }

        public ReadLocalEReceiptsTask(SyncJob syncjob)
        {
            this$0 = EReceiptManager.this;
            super();
            mSyncJob = syncjob;
        }
    }

    public static interface RegisteredPhoneNumberCallback
    {

        public abstract void onResult(RegisteredPhoneNumberResult registeredphonenumberresult);
    }

    public static final class RegisteredPhoneNumberResult extends Enum
    {

        private static final RegisteredPhoneNumberResult $VALUES[];
        public static final RegisteredPhoneNumberResult NO;
        public static final RegisteredPhoneNumberResult UNKNOWN;
        public static final RegisteredPhoneNumberResult YES;

        public static RegisteredPhoneNumberResult valueOf(String s)
        {
            return (RegisteredPhoneNumberResult)Enum.valueOf(com/walmartlabs/ereceipt/service/EReceiptManager$RegisteredPhoneNumberResult, s);
        }

        public static RegisteredPhoneNumberResult[] values()
        {
            return (RegisteredPhoneNumberResult[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new RegisteredPhoneNumberResult("UNKNOWN", 0);
            NO = new RegisteredPhoneNumberResult("NO", 1);
            YES = new RegisteredPhoneNumberResult("YES", 2);
            $VALUES = (new RegisteredPhoneNumberResult[] {
                UNKNOWN, NO, YES
            });
        }

        private RegisteredPhoneNumberResult(String s, int i)
        {
            super(s, i);
        }
    }

    private class RegistrationRunnable
        implements Runnable
    {

        private long mDelayMillis;
        final EReceiptManager this$0;

        private void setDelayMillis(long l)
        {
            mDelayMillis = l;
        }

        public void run()
        {
            walletRegisteredStatus(new RegisteredPhoneNumberCallback() {

                final RegistrationRunnable this$1;

                public void onResult(RegisteredPhoneNumberResult registeredphonenumberresult)
                {
                    if (registeredphonenumberresult == RegisteredPhoneNumberResult.UNKNOWN)
                    {
                        long l1 = mDelayMillis;
                        long l = l1;
                        if (l1 > 0L)
                        {
                            l = l1;
                            if (l1 < 0x3a9800L)
                            {
                                l = l1 * 2L;
                            }
                        }
                        l1 = l;
                        if (l <= 0L)
                        {
                            l1 = 60000L;
                        }
                        WLog.d(EReceiptManager.TAG, (new StringBuilder()).append("walletRegisteredStatus failed. Will try again in ").append(l1).append(" ms.").toString());
                        checkRegistrationStatus(l1);
                    }
                }

            
            {
                this$1 = RegistrationRunnable.this;
                super();
            }
            });
        }



        private RegistrationRunnable()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    private class RemoveLocalEReceiptsTask extends AsyncTask
    {

        final EReceiptManager this$0;

        protected transient EReceiptsResponse doInBackground(EReceiptsResponse aereceiptsresponse[])
        {
            aereceiptsresponse = aereceiptsresponse[0];
            mEReceiptProvider.delete(((EReceiptsResponse) (aereceiptsresponse)).deleteReceipts);
            return aereceiptsresponse;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((EReceiptsResponse[])aobj);
        }

        protected void onPostExecute(EReceiptsResponse ereceiptsresponse)
        {
            mSyncJob.handleRemoteNewReceipts(ereceiptsresponse);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((EReceiptsResponse)obj);
        }

        private RemoveLocalEReceiptsTask()
        {
            this$0 = EReceiptManager.this;
            super();
        }

    }

    public static interface ResultCallback
    {

        public abstract void onResult(Object obj);
    }

    private class SyncJob
    {

        private final Set mAddedReceiptUuids = new HashSet();
        private int mBatchCount;
        private volatile boolean mCancelled;
        private final Handler mHandler = new Handler();
        private final AsyncCallbackOnThread mSyncCallback;
        private SyncListener mSyncListener;
        private final long mSyncStartTime = System.currentTimeMillis();
        private final List mSyncedReceiptIds = new ArrayList();
        final EReceiptManager this$0;

        private void cleanUp()
        {
            mSyncListener = null;
            mSyncedReceiptIds.clear();
            if (mSyncJob == this)
            {
                mSyncJob = null;
            }
        }

        private void continueSync()
        {
            if (TextUtils.isEmpty(mServiceCustomerId) || mCancelled)
            {
                finishSync(Integer.valueOf(-1));
                return;
            } else
            {
                mBatchCount = mBatchCount + 1;
                mEReceiptService.syncReceipts(mServiceCustomerId, mSyncedReceiptIds, mDeviceId, true, mSyncBatchSize, mSyncCallback);
                return;
            }
        }

        private void finishSync(Integer integer)
        {
            if (!mCancelled && mSyncListener != null)
            {
                mSyncListener.onSyncFinished(integer);
            }
            updateWithStoreItems(mAddedReceiptUuids);
            if (mCancelled)
            {
                WLog.d(EReceiptManager.TAG, "SyncJob was cancelled");
            } else
            {
                WLog.d(EReceiptManager.TAG, (new StringBuilder()).append("Receipts SyncJob completed in ").append(mBatchCount).append(" batches after ").append(System.currentTimeMillis() - mSyncStartTime).append(" ms. Receipt count ").append(mSyncedReceiptIds.size()).toString());
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
                WLog.d(EReceiptManager.TAG, (new StringBuilder()).append("SyncJob found ").append(arraylist.size()).append(" local eReceipts").toString());
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
            (new RemoveLocalEReceiptsTask()).execute(new EReceiptsResponse[] {
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
                if (((EReceiptsResponse.Receipt) (obj)).customerReceiptId != 0)
                {
                    mSyncedReceiptIds.add(Integer.toString(((EReceiptsResponse.Receipt) (obj)).customerReceiptId));
                }
                mAddedReceiptUuids.add(((EReceiptsResponse.Receipt) (obj)).uuid);
            }

            mSyncListener.onNewReceipts(ereceiptsresponse);
            continueSync();
            (new WriteLocalEReceiptsTask(true, false)).execute(ereceiptsresponse);
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
                (new ReadLocalEReceiptsTask(this)).execute(new String[] {
                    mProviderCustomerId
                });
                return;
            }
        }






        public SyncJob(SyncListener synclistener)
        {
            this$0 = EReceiptManager.this;
            super();
            mSyncListener = synclistener;
            mSyncCallback = mHandler. new _cls1(EReceiptManager.this);
        }
    }

    public static interface SyncListener
    {

        public abstract void onDeletedReceipts(int ai[]);

        public abstract void onNewReceipts(EReceipt aereceipt[]);

        public abstract void onSyncFinished(Integer integer);
    }

    private class UpdateStoreItemTask extends AsyncTask
    {

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
            Cursor cursor = mEReceiptProvider.getStoreLookup(mLookupLimit, mRowIds);
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
            if (mStoreItemService != null && !isCancelled())
            {
                if (!set.isEmpty())
                {
                    mStoreItemService.lookupItems((String[])set.toArray(new String[set.size()]), mHandler. new AsyncCallbackOnThread(set) {

                        final UpdateStoreItemTask this$1;
                        final Set val$upcs;

                        public void onFailureSameThread(Integer integer, StoreItemService.StoreItem astoreitem[])
                        {
                            WLog.w(EReceiptManager.TAG, (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
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
                                (new UpdateStoreItemTask.UpdateWriteStoreItems(upcs)).execute(astoreitem);
                            }
                        }

            
            {
                this$1 = final_updatestoreitemtask;
                upcs = set;
                super(Handler.this);
            }
                    });
                    return;
                }
                if (mNextBatch != null)
                {
                    mUpdateStoreItemTask = new UpdateStoreItemTask(mNextBatch);
                    mUpdateStoreItemTask.execute(new Void[0]);
                    return;
                } else
                {
                    mUpdateStoreItemTask = null;
                    return;
                }
            } else
            {
                mUpdateStoreItemTask = null;
                return;
            }
        }




/*
        static boolean access$1802(UpdateStoreItemTask updatestoreitemtask, boolean flag)
        {
            updatestoreitemtask.mDone = flag;
            return flag;
        }

*/



        private UpdateStoreItemTask(String as[])
        {
            this$0 = EReceiptManager.this;
            super();
            mRowIds = as;
            if (mStoreItemService != null)
            {
                mLookupLimit = mStoreItemService.getLookupLimit();
                return;
            } else
            {
                mLookupLimit = 0;
                return;
            }
        }

    }

    private class UpdateStoreItemTask.UpdateWriteStoreItems extends WriteStoreItems
    {

        final UpdateStoreItemTask this$1;

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            mDone = true;
            if (!isCancelled())
            {
                mUpdateStoreItemTask = new UpdateStoreItemTask((String[])ArrayUtils.addAll(mRowIds, mNextBatch));
                mUpdateStoreItemTask.execute(new Void[0]);
            }
        }

        public UpdateStoreItemTask.UpdateWriteStoreItems(Set set)
        {
            this$1 = UpdateStoreItemTask.this;
            super(set);
        }
    }

    private class WriteLocalEReceiptsTask extends AsyncTask
    {

        private final boolean mPostUpdate;
        private final boolean mUpdateStoreItems;
        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((EReceiptsResponse.Receipt[])aobj);
        }

        protected transient EReceiptsResponse.Receipt[] doInBackground(EReceiptsResponse.Receipt areceipt[])
        {
            mEReceiptProvider.insertReceipts(mProviderCustomerId, areceipt);
            return areceipt;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((EReceiptsResponse.Receipt[])obj);
        }

        protected transient void onPostExecute(EReceiptsResponse.Receipt areceipt[])
        {
            if (mUpdateStoreItems)
            {
                updateWithStoreItems(areceipt);
            }
            if (mPostUpdate)
            {
                MessageBus.getBus().post(new EReceiptsUpdatedEvent());
            }
        }

        public WriteLocalEReceiptsTask(boolean flag, boolean flag1)
        {
            this$0 = EReceiptManager.this;
            super();
            mPostUpdate = flag;
            mUpdateStoreItems = flag1;
        }
    }

    private class WriteStoreItems extends AsyncTask
    {

        private final Set mUpcs;
        final EReceiptManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((StoreItemService.StoreItem[])aobj);
        }

        protected transient Void doInBackground(StoreItemService.StoreItem astoreitem[])
        {
            int j = astoreitem.length;
            for (int i = 0; i < j; i++)
            {
                StoreItemService.StoreItem storeitem = astoreitem[i];
                mUpcs.remove(storeitem.normalizedUpc);
            }

            mEReceiptProvider.updateStoreLookup(astoreitem);
            if (!mUpcs.isEmpty())
            {
                astoreitem = new HashSet();
                for (Iterator iterator = mUpcs.iterator(); iterator.hasNext(); astoreitem.add(new StoreItemService.StoreItem((String)iterator.next(), null, null, null))) { }
                mEReceiptProvider.updateStoreLookup((StoreItemService.StoreItem[])astoreitem.toArray(new StoreItemService.StoreItem[astoreitem.size()]));
            }
            return null;
        }

        public WriteStoreItems(Set set)
        {
            this$0 = EReceiptManager.this;
            super();
            mUpcs = new HashSet(set);
        }
    }


    private static final String KEY_PENDING_RECEIPT_REGISTRATIIONS = "pending_registrations";
    private static final long MAX_DELAY_BACKOFF = 0x3a9800L;
    private static final int NO_ERROR = -1;
    private static final long ONE_MINUTE = 60000L;
    private static final String SHARED_PREF = "ereceipt_pref";
    private static final boolean SYNC_RECEIPTS_WITHOUT_IMAGES = true;
    private static final String TAG = com/walmartlabs/ereceipt/service/EReceiptManager.getSimpleName();
    private static EReceiptManager sInstance;
    private final Context mContext;
    private String mDeviceId;
    private final EReceiptProvider mEReceiptProvider;
    private EReceiptService mEReceiptService;
    private GcmRegistration mGcmRegistration;
    private final Handler mHandler = new Handler();
    private MigrateEReceiptsTask mMigrationTask;
    private String mProviderCustomerId;
    private RegisteredPhoneNumberResult mRegistered;
    private final RegistrationRunnable mRegistrationRunnable = new RegistrationRunnable();
    private String mServiceCustomerId;
    private StoreItemService mStoreItemService;
    private int mSyncBatchSize;
    private SyncJob mSyncJob;
    private UpdateStoreItemTask mUpdateStoreItemTask;

    private EReceiptManager(Context context, EReceiptProvider ereceiptprovider)
    {
        mSyncBatchSize = 0;
        mRegistered = RegisteredPhoneNumberResult.UNKNOWN;
        mContext = context;
        mEReceiptProvider = ereceiptprovider;
    }

    private void checkRegistrationStatus(long l)
    {
        mRegistrationRunnable.setDelayMillis(l);
        mHandler.removeCallbacks(mRegistrationRunnable);
        mHandler.postDelayed(mRegistrationRunnable, l);
    }

    private void cleanupPreferences()
    {
        SharedPreferences sharedpreferences = mContext.getSharedPreferences("ereceipt_pref", 0);
        if (sharedpreferences.getString("pending_registrations", null) != null)
        {
            sharedpreferences.edit().remove("pending_registrations").apply();
        }
    }

    public static EReceiptManager create(Context context, EReceiptProvider ereceiptprovider)
    {
        if (sInstance == null)
        {
            sInstance = new EReceiptManager(context.getApplicationContext(), ereceiptprovider);
            sInstance.init();
        }
        return sInstance;
    }

    private transient void deleteReceipts(EReceipt aereceipt[])
    {
        int ai[] = new int[aereceipt.length];
        int k = aereceipt.length;
        int j = 0;
        for (int i = 0; j < k; i++)
        {
            ai[i] = aereceipt[j].customerReceiptId;
            j++;
        }

        mEReceiptService.deleteReceipts(mServiceCustomerId, ai, mDeviceId, new AsyncCallbackOnThread(aereceipt) {

            final EReceiptManager this$0;
            final EReceipt val$receipts[];

            public void onFailureSameThread(Integer integer, Boolean boolean1)
            {
                WLog.d(EReceiptManager.TAG, (new StringBuilder()).append("failed to delete receipt: ").append(integer).toString());
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Boolean)obj1);
            }

            public void onSuccessSameThread(Boolean boolean1)
            {
                WLog.d(EReceiptManager.TAG, "Successfully deleted receipts. Removing from local storage");
                (new DeleteReceiptsMarkedForDeletionTask()).execute(receipts);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Boolean)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                receipts = aereceipt;
                super(final_handler);
            }
        });
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            sInstance.innerDestroy();
            sInstance = null;
        }
    }

    public static EReceiptManager get()
    {
        return sInstance;
    }

    private void init()
    {
        MessageBus.getBus().register(this);
        mMigrationTask = new MigrateEReceiptsTask();
        mMigrationTask.execute(new Void[0]);
        cleanupPreferences();
    }

    private void innerDestroy()
    {
        if (mUpdateStoreItemTask != null)
        {
            mUpdateStoreItemTask.cancel(true);
        }
        mEReceiptProvider.close();
        MessageBus.getBus().unregister(this);
    }

    private void setRegistered(RegisteredPhoneNumberResult registeredphonenumberresult)
    {
        if (mRegistered != registeredphonenumberresult)
        {
            mRegistered = registeredphonenumberresult;
            MessageBus.getBus().post(produceWalletRegisteredEvent());
        }
    }

    private void updateConfiguration(String s)
    {
        mEReceiptService.updatePhoneConfiguration(mServiceCustomerId, mDeviceId, mGcmRegistration.getGcmRegistrationId(), s, new AsyncCallbackOnThread(new Handler()) {

            final EReceiptManager this$0;

            public void onFailureSameThread(Integer integer, Boolean boolean1)
            {
                WLog.w(EReceiptManager.TAG, "Could not update phone configuration");
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (Boolean)obj1);
            }

            public void onSuccessSameThread(Boolean boolean1)
            {
                WLog.d(EReceiptManager.TAG, "updatePhoneConfiguration");
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((Boolean)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                super(handler);
            }
        });
    }

    private void updateWithStoreItems(Set set)
    {
label0:
        {
            if (set != null && !set.isEmpty())
            {
                if (mUpdateStoreItemTask == null || mUpdateStoreItemTask.isDone())
                {
                    break label0;
                }
                mUpdateStoreItemTask.addReceipts((String[])set.toArray(new String[set.size()]));
            }
            return;
        }
        mUpdateStoreItemTask = new UpdateStoreItemTask((String[])set.toArray(new String[set.size()]));
        mUpdateStoreItemTask.execute(new Void[0]);
    }

    private void updateWithStoreItems(EReceiptsResponse.Receipt areceipt[])
    {
        if (areceipt != null && areceipt.length > 0)
        {
            HashSet hashset = new HashSet(areceipt.length);
            int j = areceipt.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(areceipt[i].uuid);
            }

            updateWithStoreItems(((Set) (hashset)));
        }
    }

    public void cancelSyncReceipts()
    {
        if (mSyncJob != null)
        {
            WLog.d(TAG, "cancelSyncReceipts()");
            mSyncJob.cancel();
        }
    }

    public void clearAllReceipts(ResultCallback resultcallback)
    {
        (new ClearLocalEReceiptsTask(resultcallback)).execute(new String[] {
            (String)null
        });
    }

    public void clearCurrentCustomersReceipts()
    {
        if (!TextUtils.isEmpty(mProviderCustomerId))
        {
            (new ClearLocalEReceiptsTask(null)).execute(new String[] {
                mProviderCustomerId
            });
        }
    }

    public void deleteReceipt(EReceipt ereceipt)
    {
        (new MarkReceiptsForDeletetionTask()).execute(new EReceipt[] {
            ereceipt
        });
        deleteReceipts(new EReceipt[] {
            ereceipt
        });
    }

    public void filterReceipts(String s, final ResultCallback resultCallback)
    {
        if (s != null)
        {
            s = s.split("\\s+");
            (new AsyncTask() {

                final EReceiptManager this$0;
                final ResultCallback val$resultCallback;

                protected transient Cursor doInBackground(String as[])
                {
                    return mEReceiptProvider.getFilteredReceipts(mProviderCustomerId, as);
                }

                protected volatile Object doInBackground(Object aobj[])
                {
                    return doInBackground((String[])aobj);
                }

                protected void onPostExecute(Cursor cursor)
                {
                    resultCallback.onResult(cursor);
                }

                protected volatile void onPostExecute(Object obj)
                {
                    onPostExecute((Cursor)obj);
                }

            
            {
                this$0 = EReceiptManager.this;
                resultCallback = resultcallback;
                super();
            }
            }).execute(s);
            return;
        } else
        {
            resultCallback.onResult(null);
            return;
        }
    }

    public EReceiptRecentSearchProvider getEReceiptRecentSearchProvider()
    {
        return EReceiptRecentSearchProvider.getInstance(mContext);
    }

    public void getImage(String s, AsyncCallbackOnThread asynccallbackonthread)
    {
        mEReceiptService.getImage(s, asynccallbackonthread);
    }

    public void getReceipt(String s, final ResultCallback callback)
    {
        (new AsyncTask() {

            final EReceiptManager this$0;
            final ResultCallback val$callback;

            protected transient EReceipt doInBackground(String as[])
            {
                EReceipt ereceipt;
                Cursor cursor;
                cursor = null;
                Object obj = null;
                ereceipt = cursor;
                if (as == null)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                ereceipt = cursor;
                if (as.length <= 0)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                cursor = mEReceiptProvider.getReceipt(as[0]);
                as = obj;
                if (cursor == null)
                {
                    break MISSING_BLOCK_LABEL_69;
                }
                as = obj;
                if (cursor.moveToNext())
                {
                    as = EReceiptsContractUtil.populateEReceipt(cursor, new EReceipt());
                }
                ereceipt = as;
                if (cursor != null)
                {
                    cursor.close();
                    ereceipt = as;
                }
                return ereceipt;
                as;
                if (cursor != null)
                {
                    cursor.close();
                }
                throw as;
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((String[])aobj);
            }

            protected void onPostExecute(EReceipt ereceipt)
            {
                callback.onResult(ereceipt);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((EReceipt)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new String[] {
            s
        });
    }

    public void getReceiptImage(String s, AsyncCallbackOnThread asynccallbackonthread)
    {
        mEReceiptService.getReceiptImage(s, asynccallbackonthread);
    }

    public void getReceiptImage(String s, final ResultCallback callback)
    {
        (new AsyncTask() {

            final EReceiptManager this$0;
            final ResultCallback val$callback;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((String[])aobj);
            }

            protected transient String doInBackground(String as[])
            {
                String s1;
                Cursor cursor;
                cursor = null;
                Object obj = null;
                s1 = cursor;
                if (as == null)
                {
                    break MISSING_BLOCK_LABEL_81;
                }
                s1 = cursor;
                if (as.length <= 0)
                {
                    break MISSING_BLOCK_LABEL_81;
                }
                cursor = mEReceiptProvider.getReceiptImage(as[0]);
                as = obj;
                if (cursor == null)
                {
                    break MISSING_BLOCK_LABEL_65;
                }
                as = obj;
                if (cursor.moveToNext())
                {
                    as = cursor.getString(0);
                }
                s1 = as;
                if (cursor != null)
                {
                    cursor.close();
                    s1 = as;
                }
                return s1;
                as;
                if (cursor != null)
                {
                    cursor.close();
                }
                throw as;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((String)obj);
            }

            protected void onPostExecute(String s1)
            {
                callback.onResult(s1);
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new String[] {
            s
        });
    }

    public String getReceiptImageUrl(String s)
    {
        return mEReceiptService.getReceiptImageUrl(s);
    }

    public void getReceiptItems(long l, final ResultCallback callback)
    {
        (new AsyncTask() {

            final EReceiptManager this$0;
            final ResultCallback val$callback;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Long[])aobj);
            }

            protected transient List doInBackground(Long along[])
            {
                Object obj;
                obj = new ArrayList();
                along = mEReceiptProvider.getReceiptItems(along[0].longValue());
_L2:
                if (along == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (!along.moveToNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                ((List) (obj)).add(EReceiptsContractUtil.populateEReceiptItem(along, new EReceipt.Item()));
                if (true) goto _L2; else goto _L1
                obj;
                if (along != null)
                {
                    along.close();
                }
                throw obj;
_L1:
                if (along != null)
                {
                    along.close();
                }
                return ((List) (obj));
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((List)obj);
            }

            protected void onPostExecute(List list)
            {
                if (callback != null)
                {
                    callback.onResult(list);
                }
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Long[] {
            Long.valueOf(l)
        });
    }

    public void getReceiptTax(long l, final ResultCallback callback)
    {
        (new AsyncTask() {

            final EReceiptManager this$0;
            final ResultCallback val$callback;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Long[])aobj);
            }

            protected transient List doInBackground(Long along[])
            {
                Object obj;
                obj = new ArrayList();
                along = mEReceiptProvider.getReceiptTax(along[0].longValue());
_L2:
                if (along == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (!along.moveToNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                ((List) (obj)).add(EReceiptsContractUtil.populateEReceiptTax(along, new EReceipt.Tax()));
                if (true) goto _L2; else goto _L1
                obj;
                if (along != null)
                {
                    along.close();
                }
                throw obj;
_L1:
                if (along != null)
                {
                    along.close();
                }
                return ((List) (obj));
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((List)obj);
            }

            protected void onPostExecute(List list)
            {
                if (callback != null)
                {
                    callback.onResult(list);
                }
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Long[] {
            Long.valueOf(l)
        });
    }

    public void getReceiptTender(long l, final ResultCallback callback)
    {
        (new AsyncTask() {

            final EReceiptManager this$0;
            final ResultCallback val$callback;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Long[])aobj);
            }

            protected transient List doInBackground(Long along[])
            {
                Object obj;
                obj = new ArrayList();
                along = mEReceiptProvider.getReceiptTender(along[0].longValue());
_L2:
                if (along == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (!along.moveToNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                ((List) (obj)).add(EReceiptsContractUtil.populateEReceiptTender(along, new EReceipt.Tender()));
                if (true) goto _L2; else goto _L1
                obj;
                if (along != null)
                {
                    along.close();
                }
                throw obj;
_L1:
                if (along != null)
                {
                    along.close();
                }
                return ((List) (obj));
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((List)obj);
            }

            protected void onPostExecute(List list)
            {
                if (callback != null)
                {
                    callback.onResult(list);
                }
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Long[] {
            Long.valueOf(l)
        });
    }

    public void lookupStoreItems(List list, AsyncCallback asynccallback)
    {
        if (mStoreItemService == null)
        {
            asynccallback.onFailure(Integer.valueOf(0x15f91), Boolean.valueOf(false));
            return;
        }
        if (list != null && !list.isEmpty())
        {
            HashSet hashset = new HashSet();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                EReceipt.Item item = (EReceipt.Item)list.next();
                if (!item.storeItemLookup)
                {
                    hashset.add(item.normalizedUpc);
                }
            } while (true);
            if (!hashset.isEmpty())
            {
                mStoreItemService.lookupItems((String[])hashset.toArray(new String[hashset.size()]), new AsyncCallbackOnThread(hashset) {

                    final EReceiptManager this$0;
                    final AsyncCallback val$callback;
                    final HashSet val$upcs;

                    public void onFailureSameThread(Integer integer, StoreItemService.StoreItem astoreitem[])
                    {
                        WLog.w(EReceiptManager.TAG, (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
                        callback.onFailure(integer, Boolean.valueOf(false));
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
                        (new WriteStoreItems(upcs) {

                            final _cls13 this$1;

                            protected volatile void onPostExecute(Object obj)
                            {
                                onPostExecute((Void)obj);
                            }

                            protected void onPostExecute(Void void1)
                            {
                                callback.onSuccess(Boolean.valueOf(true));
                            }

            
            {
                this$1 = _cls13.this;
                super(set);
            }
                        }).execute(astoreitem);
                    }

            
            {
                this$0 = EReceiptManager.this;
                callback = asynccallback;
                upcs = hashset;
                super(final_handler);
            }
                });
                return;
            } else
            {
                asynccallback.onSuccess(Boolean.valueOf(false));
                return;
            }
        } else
        {
            asynccallback.onSuccess(Boolean.valueOf(false));
            return;
        }
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (authenticationstatusevent.loggedIn && authenticationstatusevent.hasCredentials && !TextUtils.isEmpty(authenticationstatusevent.customerId))
        {
            WLog.d(TAG, "onAuthStatusChanged signed in");
            mProviderCustomerId = authenticationstatusevent.customerId;
            mServiceCustomerId = authenticationstatusevent.customerId;
            (new AssociateReceiptsTask()).execute(new String[] {
                mProviderCustomerId
            });
            checkRegistrationStatus(0L);
            updateConfiguration(authenticationstatusevent.email);
            return;
        }
        WLog.d(TAG, "onAuthStatusChanged");
        if (!authenticationstatusevent.loggedIn && !authenticationstatusevent.hasCredentials)
        {
            WLog.d(TAG, "onAuthStatusChanged signed out");
            cancelSyncReceipts();
            clearCurrentCustomersReceipts();
            (new ClearSearchHistoryTask()).execute(new Void[0]);
        }
        mProviderCustomerId = authenticationstatusevent.customerId;
        mServiceCustomerId = null;
        setRegistered(RegisteredPhoneNumberResult.UNKNOWN);
    }

    public WalletRegisteredEvent produceWalletRegisteredEvent()
    {
        return new WalletRegisteredEvent(mRegistered);
    }

    public void retrieveReceipt(String s, AsyncCallbackOnThread asynccallbackonthread)
    {
        asynccallbackonthread = new AsyncCallbackOnThread(asynccallbackonthread) {

            final EReceiptManager this$0;
            final AsyncCallbackOnThread val$callback;

            public void onFailureSameThread(Integer integer, EReceiptsResponse.Receipt receipt)
            {
                callback.onFailureSameThread(integer, receipt);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(EReceiptsResponse.Receipt receipt)
            {
                callback.onSuccessSameThread(receipt);
                (new WriteLocalEReceiptsTask(true, true)).execute(new EReceiptsResponse.Receipt[] {
                    receipt
                });
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
        };
        mEReceiptService.getReceipt(mServiceCustomerId, s, mDeviceId, asynccallbackonthread);
    }

    public void retrieveReceiptByTc(String s, String s1, AsyncCallbackOnThread asynccallbackonthread)
    {
        asynccallbackonthread = new AsyncCallbackOnThread(asynccallbackonthread) {

            final EReceiptManager this$0;
            final AsyncCallbackOnThread val$callback;

            public void onFailureSameThread(Integer integer, EReceiptsResponse.Receipt receipt)
            {
                callback.onFailureSameThread(integer, receipt);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(EReceiptsResponse.Receipt receipt)
            {
                callback.onSuccessSameThread(receipt);
                (new WriteLocalEReceiptsTask(true, true)).execute(new EReceiptsResponse.Receipt[] {
                    receipt
                });
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
        };
        mEReceiptService.getReceiptByTc(mServiceCustomerId, s, s1, mDeviceId, asynccallbackonthread);
    }

    public void setDeviceId(String s)
    {
        mDeviceId = s;
    }

    public void setEReceiptService(EReceiptService ereceiptservice)
    {
        WLog.d(TAG, "eReceipt service changed");
        mEReceiptService = ereceiptservice;
    }

    public void setGcmRegistration(GcmRegistration gcmregistration)
    {
        mGcmRegistration = gcmregistration;
    }

    public void setStoreItemService(StoreItemService storeitemservice)
    {
        mStoreItemService = storeitemservice;
    }

    public void setSyncBatchSize(int i)
    {
        mSyncBatchSize = i;
    }

    public void syncReceipts(SyncListener synclistener)
    {
        WLog.d(TAG, "syncReceipts()");
        cancelSyncReceipts();
        mSyncJob = new SyncJob(synclistener);
        if (mMigrationTask != null)
        {
            mMigrationTask.mSyncJob = mSyncJob;
            return;
        } else
        {
            mSyncJob.start();
            return;
        }
    }

    public void walletRegister(String s, AsyncCallback asynccallback)
    {
        mEReceiptService.walletRegister(mServiceCustomerId, mDeviceId, s, asynccallback);
    }

    public void walletRegisterVerify(String s, String s1, AsyncCallback asynccallback)
    {
        mEReceiptService.walletRegisterVerify(mServiceCustomerId, mDeviceId, s, s1, new AsyncCallbackOnThread(asynccallback) {

            final EReceiptManager this$0;
            final AsyncCallback val$asyncCallback;

            public void onFailureSameThread(Integer integer, WalletStatus walletstatus)
            {
                asyncCallback.onFailure(integer, walletstatus);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (WalletStatus)obj1);
            }

            public void onSuccessSameThread(WalletStatus walletstatus)
            {
                setRegistered(RegisteredPhoneNumberResult.YES);
                asyncCallback.onSuccess(walletstatus);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((WalletStatus)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                asyncCallback = asynccallback;
                super(final_handler);
            }
        });
    }

    public void walletRegisteredStatus(RegisteredPhoneNumberCallback registeredphonenumbercallback)
    {
        mEReceiptService.walletRegisteredStatus(mServiceCustomerId, mDeviceId, new AsyncCallbackOnThread(registeredphonenumbercallback) {

            final EReceiptManager this$0;
            final RegisteredPhoneNumberCallback val$callback;

            public void onFailureSameThread(Integer integer, WalletRegisterStatus walletregisterstatus)
            {
                WLog.d(EReceiptManager.TAG, (new StringBuilder()).append("walletRegisteredStatus failed: ").append(integer).toString());
                setRegistered(RegisteredPhoneNumberResult.UNKNOWN);
                if (callback != null)
                {
                    callback.onResult(RegisteredPhoneNumberResult.UNKNOWN);
                }
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (WalletRegisterStatus)obj1);
            }

            public void onSuccessSameThread(WalletRegisterStatus walletregisterstatus)
            {
                String s1 = EReceiptManager.TAG;
                StringBuilder stringbuilder = (new StringBuilder()).append("walletRegisteredStatus: is");
                String s;
                if (walletregisterstatus.isRegistered)
                {
                    s = "";
                } else
                {
                    s = " not";
                }
                WLog.d(s1, stringbuilder.append(s).append(" registered").toString());
                if (walletregisterstatus.isRegistered)
                {
                    walletregisterstatus = RegisteredPhoneNumberResult.YES;
                } else
                {
                    walletregisterstatus = RegisteredPhoneNumberResult.NO;
                }
                setRegistered(walletregisterstatus);
                if (callback != null)
                {
                    callback.onResult(walletregisterstatus);
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((WalletRegisterStatus)obj);
            }

            
            {
                this$0 = EReceiptManager.this;
                callback = registeredphonenumbercallback;
                super(final_handler);
            }
        });
    }







/*
    static UpdateStoreItemTask access$1902(EReceiptManager ereceiptmanager, UpdateStoreItemTask updatestoreitemtask)
    {
        ereceiptmanager.mUpdateStoreItemTask = updatestoreitemtask;
        return updatestoreitemtask;
    }

*/










/*
    static MigrateEReceiptsTask access$3202(EReceiptManager ereceiptmanager, MigrateEReceiptsTask migrateereceiptstask)
    {
        ereceiptmanager.mMigrationTask = migrateereceiptstask;
        return migrateereceiptstask;
    }

*/




/*
    static SyncJob access$3602(EReceiptManager ereceiptmanager, SyncJob syncjob)
    {
        ereceiptmanager.mSyncJob = syncjob;
        return syncjob;
    }

*/




    // Unreferenced inner class com/walmartlabs/ereceipt/service/EReceiptManager$SyncJob$1

/* anonymous class */
    class SyncJob._cls1 extends AsyncCallbackOnThread
    {

        final SyncJob this$1;
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
                this$1 = final_syncjob;
                this$0 = ereceiptmanager;
                super(Handler.this);
            }
    }

}
