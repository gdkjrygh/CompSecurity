// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.squareup.otto.Bus;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.analytics.AniviaAnalytics;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.AppForegroundEvent;
import com.walmart.android.events.SaverDetailsUpdateEvent;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.utils.WLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmart.android.service.saver:
//            AddRequest, SaverService, SaverProvider, SaverReceipt, 
//            SaverContractUtil, FeedbackRequest, StatusResponse, RegisterRequest, 
//            ReceiptsSummaryResponse, SaverReceiptResponse, CompetitorsResponse, RedeemResponse, 
//            RedeemRequest

public class SaverManager
{
    private class DecorateReceiptTask extends AsyncTask
    {

        private final AsyncCallbackOnThread mCallback;
        private final StatusResponse mData;
        private final Integer mError;
        private final boolean mNotificationShown;
        private final boolean mSubmitConfirmed;
        private final String mTcNbr;
        private final String mVisitDate;
        final SaverManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((SaverContract.SaverRejectedReasons[])aobj);
        }

        protected transient Void doInBackground(SaverContract.SaverRejectedReasons asaverrejectedreasons[])
        {
            mSaverProvider.decorateEReceipt(mTcNbr, mVisitDate, false, mSubmitConfirmed, mNotificationShown, asaverrejectedreasons[0]);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
label0:
            {
                if (mCallback != null)
                {
                    if (mError == null)
                    {
                        break label0;
                    }
                    mCallback.onFailure(mError, mData);
                }
                return;
            }
            mCallback.onSuccess(mData);
        }

        public DecorateReceiptTask(AsyncCallbackOnThread asynccallbackonthread, Integer integer, StatusResponse statusresponse, String s, String s1, boolean flag, 
                boolean flag1)
        {
            this$0 = SaverManager.this;
            super();
            mCallback = asynccallbackonthread;
            mError = integer;
            mData = statusresponse;
            mTcNbr = s;
            mVisitDate = s1;
            mSubmitConfirmed = flag;
            mNotificationShown = flag1;
        }
    }

    private class InsertDetailsTask extends AsyncTask
    {

        private final AsyncCallbackOnThread mCallback;
        final SaverManager this$0;

        protected transient SaverReceiptResponse.Payload doInBackground(SaverReceiptResponse.Payload apayload[])
        {
            apayload = apayload[0];
            mSaverProvider.insertDetails(((SaverReceiptResponse.Payload) (apayload)).tcNbr, ((SaverReceiptResponse.Payload) (apayload)).localDate, ((SaverReceiptResponse.Payload) (apayload)).processedDetails);
            return apayload;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((SaverReceiptResponse.Payload[])aobj);
        }

        protected void onPostExecute(SaverReceiptResponse.Payload payload)
        {
            mCallback.onSuccessSameThread(payload);
            MessageBus.getBus().post(new SaverDetailsUpdateEvent(payload.tcNbr, payload.processedDetails));
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((SaverReceiptResponse.Payload)obj);
        }

        public InsertDetailsTask(AsyncCallbackOnThread asynccallbackonthread)
        {
            this$0 = SaverManager.this;
            super();
            mCallback = asynccallbackonthread;
        }
    }

    private class InsertSummariesTask extends AsyncTask
    {

        private final Integer mError;
        final SaverManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((ArrayList[])aobj);
        }

        protected transient Void doInBackground(ArrayList aarraylist[])
        {
            if (!isCancelled())
            {
                mSaverProvider.resetSaverData();
                if (aarraylist != null && aarraylist[0] != null)
                {
                    mSaverProvider.insertSummaries(aarraylist[0]);
                }
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            if (!isCancelled() && mMismatchedReceiptsTask != null)
            {
                mMismatchedReceiptsTask.setSaverSummariesDone(mError);
            }
        }

        private InsertSummariesTask(Integer integer)
        {
            this$0 = SaverManager.this;
            super();
            mError = integer;
        }

    }

    private class MarkMissingReceiptTask extends AsyncTask
    {

        final SaverManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient Void doInBackground(String as[])
        {
            Cursor cursor;
            cursor = mSaverProvider.getSaverReceipt(as[0], as[1]);
            if (cursor == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            if (cursor.moveToFirst())
            {
                SaverReceipt saverreceipt = SaverContractUtil.populateSaverReceipt(cursor, new SaverReceipt());
                if (SaverContract.SaverState.isProcessed(saverreceipt.state) || saverreceipt.state == SaverContract.SaverState.Invalid.getState())
                {
                    mSaverProvider.updateMissingReceipt(as[0], as[1], true);
                }
            }
            if (cursor != null)
            {
                cursor.close();
            }
            return null;
            as;
            if (cursor != null)
            {
                cursor.close();
            }
            throw as;
        }

        private MarkMissingReceiptTask()
        {
            this$0 = SaverManager.this;
            super();
        }

    }

    private class MismatchedReceiptsTask extends AsyncTask
    {

        private Integer eReceiptError;
        private boolean eReceiptSyncDone;
        private final boolean mSuppressMismatchedChecks;
        private Integer saverError;
        private boolean saverSummariesDone;
        final SaverManager this$0;

        private void setEReceiptSyncDone(Integer integer)
        {
            eReceiptSyncDone = true;
            eReceiptError = integer;
            updated();
        }

        private void setSaverSummariesDone(Integer integer)
        {
            saverSummariesDone = true;
            saverError = integer;
            updated();
        }

        private void updated()
        {
            while (isCancelled() || !eReceiptSyncDone || !saverSummariesDone || getStatus() != android.os.AsyncTask.Status.PENDING) 
            {
                return;
            }
            if (eReceiptError != null && eReceiptError.intValue() > 0)
            {
                syncDone(eReceiptError);
                return;
            }
            if (saverError != null && saverError.intValue() > 0)
            {
                syncDone(saverError);
                return;
            }
            if (mSuppressMismatchedChecks)
            {
                syncDone(null);
                return;
            } else
            {
                execute(new Void[0]);
                return;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient List doInBackground(Void avoid[])
        {
            Object obj;
            obj = new ArrayList();
            mUnconfirmedReceipts.clear();
            processMissingAndUnconfirmedSaverReceipts(((List) (obj)), mUnconfirmedReceipts);
            avoid = mSaverProvider.findMissingEReceipts();
_L2:
            if (avoid == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!avoid.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            ((List) (obj)).add(SaverContractUtil.populateSaverReceipt(avoid, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(avoid, new SaverReceipt())));
            if (true) goto _L2; else goto _L1
            obj;
            if (avoid != null)
            {
                avoid.close();
            }
            throw obj;
_L1:
            if (avoid != null)
            {
                avoid.close();
            }
            return ((List) (obj));
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            if (!isCancelled())
            {
                AsyncCallbackOnThread asynccallbackonthread = mHandler. new AsyncCallbackOnThread(list) {

                    private int size;
                    final MismatchedReceiptsTask this$1;
                    final List val$saverReceipts;

                    private void checkIfDone()
                    {
                        int i = size - 1;
                        size = i;
                        if (i <= 0 && !isCancelled())
                        {
                            syncDone(null);
                        }
                    }

                    public void onFailureSameThread(Integer integer, Object obj)
                    {
                        checkIfDone();
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, obj1);
                    }

                    public void onSuccessSameThread(Object obj)
                    {
                        checkIfDone();
                    }

            
            {
                this$1 = final_mismatchedreceiptstask;
                saverReceipts = list;
                super(Handler.this);
                size = saverReceipts.size();
            }
                };
                WLog.i(SaverManager.TAG, (new StringBuilder()).append("Found ").append(list.size()).append(" receipts missing either from Saver or from eReceipt").toString());
                for (Iterator iterator = list.iterator(); iterator.hasNext();)
                {
                    final SaverReceipt receipt = (SaverReceipt)iterator.next();
                    if (TextUtils.isEmpty(receipt.uuid))
                    {
                        String s = receipt.tcNumber;
                        String s1 = receipt.localDate;
                        EReceiptManager.get().retrieveReceiptByTc(receipt.tcNumber, receipt.localDate, s1. new AsyncCallbackOnThread(asynccallbackonthread) {

                            final MismatchedReceiptsTask this$1;
                            final AsyncCallbackOnThread val$callback;
                            final String val$localDate;
                            final String val$tcNumber;

                            public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
                            {
                                if (404 == integer.intValue())
                                {
                                    (new MarkMissingReceiptTask()).execute(new String[] {
                                        tcNumber, localDate
                                    });
                                }
                                callback.onFailure(integer, receipt);
                            }

                            public volatile void onFailureSameThread(Object obj, Object obj1)
                            {
                                onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj1);
                            }

                            public void onSuccessSameThread(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
                            {
                                callback.onSuccessSameThread(receipt);
                            }

                            public volatile void onSuccessSameThread(Object obj)
                            {
                                onSuccessSameThread((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj);
                            }

            
            {
                this$1 = final_mismatchedreceiptstask;
                tcNumber = s;
                localDate = String.this;
                callback = asynccallbackonthread;
                super(final_handler);
            }
                        });
                    } else
                    {
                        checkRegistration(asynccallbackonthread. new ResultCallback() {

                            final MismatchedReceiptsTask this$1;
                            final AsyncCallbackOnThread val$callback;
                            final SaverReceipt val$receipt;

                            public void onResult(Boolean boolean1)
                            {
                                if (boolean1.booleanValue())
                                {
                                    addReceipt(receipt, receipt.localDate, "existing", false, receipt.submitConfirmed, callback);
                                    return;
                                } else
                                {
                                    callback.onFailure(Integer.valueOf(1), null);
                                    return;
                                }
                            }

                            public volatile void onResult(Object obj)
                            {
                                onResult((Boolean)obj);
                            }

            
            {
                this$1 = final_mismatchedreceiptstask;
                receipt = saverreceipt;
                callback = AsyncCallbackOnThread.this;
                super();
            }
                        });
                    }
                }

                if (list.isEmpty())
                {
                    syncDone(null);
                    return;
                }
            }
        }



        public MismatchedReceiptsTask(boolean flag)
        {
            this$0 = SaverManager.this;
            super();
            mSuppressMismatchedChecks = flag;
        }
    }

    private class RegistrationRunnable
        implements Runnable
    {

        private long mDelayMillis;
        private boolean mHasTriedOnce;
        private Set mRegistrationListeners;
        final SaverManager this$0;

        private void setDelayMillis(long l)
        {
            mDelayMillis = l;
        }

        private void setTriedOnce(boolean flag)
        {
            mHasTriedOnce = flag;
            if (flag)
            {
                Object obj;
                String s;
                StringBuilder stringbuilder;
                if (mCustomerEmail != null && mCustomerEmail.equals(mRegisteredUser))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                s = SaverManager.TAG;
                stringbuilder = (new StringBuilder()).append("Registration has run once. Saver is");
                if (flag)
                {
                    obj = "";
                } else
                {
                    obj = " not";
                }
                WLog.v(s, stringbuilder.append(((String) (obj))).append(" ready.").toString());
                for (obj = mRegistrationListeners.iterator(); ((Iterator) (obj)).hasNext(); ((ResultCallback)((Iterator) (obj)).next()).onResult(Boolean.valueOf(flag))) { }
                mRegistrationListeners.clear();
            }
        }

        public void checkRegistration(ResultCallback resultcallback)
        {
            if (mHasTriedOnce)
            {
                boolean flag;
                if (mCustomerEmail != null && mCustomerEmail.equals(mRegisteredUser))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                resultcallback.onResult(Boolean.valueOf(flag));
                return;
            } else
            {
                WLog.v(SaverManager.TAG, "Registration hasn't run once yet. Waiting for result");
                mRegistrationListeners.add(resultcallback);
                return;
            }
        }

        public void run()
        {
            if (mCustomerEmail != null)
            {
                String s = mContext.getSharedPreferences("saver_pref", 0).getString("registered_user", null);
                if (!mCustomerEmail.equals(s))
                {
                    String s1 = mCustomerEmail;
                    RegisterRequest registerrequest = new RegisterRequest();
                    registerrequest.username = s1;
                    mSaverService.register(registerrequest, mHandler. new AsyncCallbackOnThread(s1) {

                        final RegistrationRunnable this$1;
                        final String val$customerEmail;

                        public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
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
                            WLog.d(SaverManager.TAG, (new StringBuilder()).append("Saver registration failed. Will try again in ").append(l1).append(" ms.").toString());
                            setTriedOnce(true);
                            doRegistration(l1);
                        }

                        public volatile void onFailureSameThread(Object obj, Object obj1)
                        {
                            onFailureSameThread((Integer)obj, (StatusResponse)obj1);
                        }

                        public void onSuccessSameThread(StatusResponse statusresponse)
                        {
                            mContext.getSharedPreferences("saver_pref", 0).edit().putString("registered_user", customerEmail).apply();
                            mRegisteredUser = customerEmail;
                            setTriedOnce(true);
                        }

                        public volatile void onSuccessSameThread(Object obj)
                        {
                            onSuccessSameThread((StatusResponse)obj);
                        }

            
            {
                this$1 = final_registrationrunnable;
                customerEmail = s;
                super(Handler.this);
            }
                    });
                    return;
                } else
                {
                    mRegisteredUser = mCustomerEmail;
                    setTriedOnce(true);
                    return;
                }
            } else
            {
                setTriedOnce(true);
                return;
            }
        }




        private RegistrationRunnable()
        {
            this$0 = SaverManager.this;
            super();
            mRegistrationListeners = new HashSet();
        }

    }

    private class ResetSaverDataTask extends AsyncTask
    {

        final SaverManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            if (!isCancelled())
            {
                mSaverProvider.resetSaverData();
            }
            return null;
        }

        private ResetSaverDataTask()
        {
            this$0 = SaverManager.this;
            super();
        }

    }

    public static interface ResultCallback
    {

        public abstract void onResult(Object obj);
    }

    public static class SavingsComparator
        implements Comparator
    {

        private final boolean mSortByPrice;

        public int compare(SaverReceipt.Item item, SaverReceipt.Item item1)
        {
            int i;
            int j;
            byte byte0;
            byte0 = -1;
            if (!mSortByPrice)
            {
                break MISSING_BLOCK_LABEL_211;
            }
            j = 0;
            i = j;
            if (item.unitPriceCents != null)
            {
                i = j;
                if (item.competitor != null)
                {
                    i = item.unitPriceCents.intValue() - item.competitor.competitorUnitPrice;
                }
            }
            boolean flag = false;
            j = ((flag) ? 1 : 0);
            if (item1.unitPriceCents != null)
            {
                j = ((flag) ? 1 : 0);
                if (item1.competitor != null)
                {
                    j = item1.unitPriceCents.intValue() - item1.competitor.competitorUnitPrice;
                }
            }
            if (i == j) goto _L2; else goto _L1
_L1:
            if (i <= 0 || j <= 0) goto _L4; else goto _L3
_L3:
            int k = j - i;
_L6:
            return k;
_L4:
            if (i <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = byte0;
            if (j < 0) goto _L6; else goto _L5
_L5:
            if (i == 0 && j != 0)
            {
                return 1;
            }
            if (i == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = byte0;
            if (j == 0) goto _L6; else goto _L7
_L7:
            if (i < 0 && j > 0)
            {
                return 1;
            }
            if (i < 0 && j < 0)
            {
                return i - j;
            }
            break MISSING_BLOCK_LABEL_211;
_L2:
            if (item.competitor == null)
            {
                break; /* Loop/switch isn't completed */
            }
            k = byte0;
            if (item1.competitor == null) goto _L6; else goto _L8
_L8:
            if (item.competitor == null && item1.competitor != null)
            {
                return 1;
            }
            return item.originalOrder - item1.originalOrder;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((SaverReceipt.Item)obj, (SaverReceipt.Item)obj1);
        }

        private SavingsComparator(boolean flag)
        {
            mSortByPrice = flag;
        }

    }

    private class SyncAllTask extends AsyncTask
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
            mMismatchedReceiptsTask = new MismatchedReceiptsTask(mSuppressMismatchedChecks);
            EReceiptManager.get().syncReceipts(new com.walmartlabs.ereceipt.service.EReceiptManager.SyncListener() {

                final SyncAllTask this$1;

                public void onDeletedReceipts(int ai[])
                {
                }

                public void onNewReceipts(EReceipt aereceipt[])
                {
                }

                public void onSyncFinished(Integer integer)
                {
                    if (mMismatchedReceiptsTask != null && !isCancelled())
                    {
                        mMismatchedReceiptsTask.setEReceiptSyncDone(integer);
                    }
                }

            
            {
                this$1 = SyncAllTask.this;
                super();
            }
            });
            if (Services.get().getAuthentication().hasCredentials())
            {
                checkRegistration(new ResultCallback() {

                    final SyncAllTask this$1;

                    public void onResult(Boolean boolean1)
                    {
                        if (boolean1.booleanValue())
                        {
                            mSaverService.getReceiptsSummary(new AsyncCallbackOnThread(mHandler) {

                                final SyncAllTask._cls2 this$2;

                                public void onFailureSameThread(Integer integer, ReceiptsSummaryResponse receiptssummaryresponse)
                                {
                                    if (!isCancelled())
                                    {
                                        insertSummariesTask = new InsertSummariesTask(integer);
                                        insertSummariesTask.execute((ArrayList[])null);
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
                                        WLog.e(SaverManager.TAG, "Saver receipt summary call is missing vital data, no saver data will be available.");
                                        onFailureSameThread(Integer.valueOf(0x15f90), receiptssummaryresponse);
                                    } else
                                    if (!isCancelled())
                                    {
                                        setSaverSummary(receiptssummaryresponse.payload.overallSavingsSummary, true);
                                        insertSummariesTask = new InsertSummariesTask(null);
                                        insertSummariesTask.execute(new ArrayList[] {
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
                this$2 = SyncAllTask._cls2.this;
                super(handler);
            }
                            });
                            return;
                        } else
                        {
                            WLog.w(SaverManager.TAG, "Saver not ready to sync");
                            mMismatchedReceiptsTask.setSaverSummariesDone(Integer.valueOf(0x15f91));
                            return;
                        }
                    }

                    public volatile void onResult(Object obj)
                    {
                        onResult((Boolean)obj);
                    }

            
            {
                this$1 = SyncAllTask.this;
                super();
            }
                });
                return;
            } else
            {
                mMismatchedReceiptsTask.setSaverSummariesDone(Integer.valueOf(4));
                return;
            }
        }

        public SyncAllTask(boolean flag)
        {
            this$0 = SaverManager.this;
            super();
            mSuppressMismatchedChecks = flag;
        }
    }

    private class UnconfirmedReceipts extends AsyncTask
    {

        final SaverManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            mUnconfirmedReceipts.clear();
            processMissingAndUnconfirmedSaverReceipts(null, mUnconfirmedReceipts);
            return null;
        }

        private UnconfirmedReceipts()
        {
            this$0 = SaverManager.this;
            super();
        }

    }


    private static final String KEY_REGISTERED_USER = "registered_user";
    private static final long MAX_DELAY_BACKOFF = 0x3a9800L;
    private static final long ONE_MINUTE = 60000L;
    public static final int RESULT_SYNC_CANCELLED = -1;
    private static final String SHARED_PREF = "saver_pref";
    public static final String SOURCE_EXISTING = "existing";
    public static final String SOURCE_MANUAL_TC = "tc-manual";
    public static final String SOURCE_SCAN_QR = "qr-scan";
    public static final String SOURCE_SCAN_TC = "tc-scan";
    private static final String TAG = com/walmart/android/service/saver/SaverManager.getSimpleName();
    private static SaverManager sInstance;
    private InsertSummariesTask insertSummariesTask;
    private final Context mContext;
    private String mCustomerEmail;
    private String mCustomerId;
    private final Handler mHandler = new Handler();
    private MismatchedReceiptsTask mMismatchedReceiptsTask;
    private ReceiptsSummaryResponse.OverallSavingsSummary mOverallSavingSummary;
    private String mRegisteredUser;
    private final RegistrationRunnable mRegistrationRunnable = new RegistrationRunnable();
    private final SaverProvider mSaverProvider;
    private final SaverService mSaverService;
    private SyncAllTask mSyncAllTask;
    private final Set mSyncListeners = new HashSet();
    private boolean mSyncing;
    private final Map mUnconfirmedReceipts = Collections.synchronizedMap(new HashMap());

    private SaverManager(Context context, SaverService saverservice, SaverProvider saverprovider)
    {
        mContext = context;
        mSaverService = saverservice;
        mSaverProvider = saverprovider;
    }

    private void addReceipt(final EReceipt receipt, final String localDate, final String source, final AsyncCallbackOnThread eReceiptCallback, final AsyncCallbackOnThread saverCallback)
    {
        checkRegistration(new ResultCallback() {

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
                    addReceipt(receipt, localDate, source, false, true, new AsyncCallbackOnThread(mHandler) {

                        final _cls7 this$1;

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

            
            {
                this$1 = _cls7.this;
                super(handler);
            }
                    });
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
                this$0 = SaverManager.this;
                receipt = ereceipt;
                localDate = s;
                source = s1;
                eReceiptCallback = asynccallbackonthread;
                saverCallback = asynccallbackonthread1;
                super();
            }
        });
    }

    private void addReceipt(EReceipt ereceipt, String s, String s1, boolean flag, boolean flag1, AsyncCallbackOnThread asynccallbackonthread)
    {
        AddRequest addrequest = new AddRequest();
        addrequest.tcNbr = ereceipt.tcNumber;
        addrequest.localDate = s;
        addrequest.receiptCaptureSource = s1;
        mSaverService.addReceipt(addrequest, new AsyncCallbackOnThread(s1) {

            final SaverManager this$0;
            final AsyncCallbackOnThread val$callback;
            final boolean val$eReceiptMissing;
            final String val$localDate;
            final boolean val$manualSubmit;
            final EReceipt val$receipt;
            final String val$source;

            public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
            {
                SaverContract.SaverRejectedReasons saverrejectedreasons;
                SaverContract.SaverRejectedReasons saverrejectedreasons1;
                saverrejectedreasons1 = SaverContract.SaverRejectedReasons.UNKNOWN;
                saverrejectedreasons = saverrejectedreasons1;
                if (statusresponse == null) goto _L2; else goto _L1
_L1:
                saverrejectedreasons = saverrejectedreasons1;
                statusresponse.getErrorCode();
                JVM INSTR tableswitch 1117 1124: default 64
            //                           1117 150
            //                           1118 150
            //                           1119 67
            //                           1120 67
            //                           1121 143
            //                           1122 124
            //                           1123 117
            //                           1124 117;
                   goto _L3 _L4 _L4 _L5 _L5 _L6 _L7 _L8 _L8
_L5:
                break; /* Loop/switch isn't completed */
_L3:
                saverrejectedreasons = saverrejectedreasons1;
_L2:
                if (saverrejectedreasons != null)
                {
                    (new DecorateReceiptTask(callback, integer, statusresponse, receipt.tcNumber, localDate, manualSubmit, false)).execute(new SaverContract.SaverRejectedReasons[] {
                        saverrejectedreasons
                    });
                }
                return;
_L8:
                saverrejectedreasons = SaverContract.SaverRejectedReasons.LIMIT_REACHED;
                continue; /* Loop/switch isn't completed */
_L7:
                if (eReceiptMissing)
                {
                    saverrejectedreasons = null;
                } else
                {
                    saverrejectedreasons = SaverContract.SaverRejectedReasons.PRE_PROGRAM;
                }
                continue; /* Loop/switch isn't completed */
_L6:
                saverrejectedreasons = SaverContract.SaverRejectedReasons.TOO_OLD;
                continue; /* Loop/switch isn't completed */
_L4:
                saverrejectedreasons = SaverContract.SaverRejectedReasons.ALREADY_SUBMITTED;
                if (true) goto _L2; else goto _L9
_L9:
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StatusResponse)obj1);
            }

            public void onSuccessSameThread(StatusResponse statusresponse)
            {
                postReceiptAddedEvent(receipt, source);
                (new DecorateReceiptTask(callback, null, statusresponse, receipt.tcNumber, localDate, manualSubmit, false)).execute(new SaverContract.SaverRejectedReasons[] {
                    SaverContract.SaverRejectedReasons.NONE
                });
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StatusResponse)obj);
            }

            
            {
                this$0 = SaverManager.this;
                eReceiptMissing = flag;
                callback = asynccallbackonthread;
                receipt = ereceipt;
                localDate = s;
                manualSubmit = flag1;
                source = s1;
                super(final_handler);
            }
        });
    }

    private void cancelSyncAllInternal()
    {
        if (mSyncAllTask != null)
        {
            mSyncAllTask.cancel(true);
        }
        if (insertSummariesTask != null)
        {
            insertSummariesTask.cancel(true);
        }
        if (mMismatchedReceiptsTask != null)
        {
            mMismatchedReceiptsTask.cancel(true);
        }
        EReceiptManager.get().cancelSyncReceipts();
        setSyncing(false);
    }

    private void checkRegistration(ResultCallback resultcallback)
    {
        mRegistrationRunnable.checkRegistration(resultcallback);
    }

    public static SaverManager create(Context context, SaverService saverservice, SaverProvider saverprovider)
    {
        if (sInstance == null)
        {
            sInstance = new SaverManager(context.getApplicationContext(), saverservice, saverprovider);
            sInstance.init();
        }
        return sInstance;
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            sInstance.innerDestroy();
            sInstance = null;
        }
    }

    private void doRegistration(long l)
    {
        mRegistrationRunnable.setDelayMillis(l);
        mHandler.removeCallbacks(mRegistrationRunnable);
        mHandler.postDelayed(mRegistrationRunnable, l);
    }

    public static SaverManager get()
    {
        return sInstance;
    }

    private void init()
    {
        MessageBus.getBus().register(this);
    }

    private void innerDestroy()
    {
        mSaverProvider.close();
        MessageBus.getBus().unregister(this);
    }

    private void postReceiptAddedEvent(EReceipt ereceipt, String s)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("saverRecSubmitted");
        String s1 = ereceipt.getTotalForAnalytics();
        if (!TextUtils.isEmpty(s1))
        {
            builder.putString("total", s1);
        }
        if (ereceipt.itemsSold > 0)
        {
            builder.putInt("itemCount", ereceipt.itemsSold);
        }
        builder.putString("TC", ereceipt.tcNumber);
        if (ereceipt.store != null && !TextUtils.isEmpty(ereceipt.store.id))
        {
            builder.putString("storeId", ereceipt.store.id);
        }
        try
        {
            builder.putString("date", AniviaAnalytics.DATE_FORMAT.format(EReceiptsContractUtil.RECEIPT_PRINT_FORMAT.parse(ereceipt.datetimePrinted)));
        }
        // Misplaced declaration of an exception variable
        catch (EReceipt ereceipt) { }
        if (!"qr-scan".equals(s) && !"tc-scan".equals(s)) goto _L2; else goto _L1
_L1:
        builder.putString("entryMethod", "scan");
_L4:
        MessageBus.getBus().post(builder);
        return;
_L2:
        if ("tc-manual".equals(s))
        {
            builder.putString("entryMethod", "manual");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void processMissingAndUnconfirmedSaverReceipts(List list, Map map)
    {
        AppConfig appconfig;
        Object obj;
        Object obj1;
        Calendar calendar;
        appconfig = null;
        obj = AppConfigManager.get();
        if (obj != null)
        {
            appconfig = ((AppConfigManager) (obj)).getAppConfig();
        }
        if (appconfig == null)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        obj1 = Calendar.getInstance();
        obj = Calendar.getInstance();
        ((Calendar) (obj)).clear();
        ((Calendar) (obj)).set(1, ((Calendar) (obj1)).get(1));
        ((Calendar) (obj)).set(2, ((Calendar) (obj1)).get(2));
        ((Calendar) (obj)).set(5, ((Calendar) (obj1)).get(5));
        ((Calendar) (obj)).add(5, -7);
        calendar = Calendar.getInstance();
        obj1 = mSaverProvider.findMissingSaverReceipts(mCustomerId);
_L4:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        SaverReceipt saverreceipt;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        saverreceipt = SaverContractUtil.populateSaverReceipt(((Cursor) (obj1)), (SaverReceipt)EReceiptsContractUtil.populateEReceipt(((Cursor) (obj1)), new SaverReceipt()));
        if (!appconfig.saverManualSubmit)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        if (!saverreceipt.submitConfirmed)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list.add(saverreceipt);
        continue; /* Loop/switch isn't completed */
        list;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw list;
        calendar.setTime(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(saverreceipt.localDate));
_L2:
        if (((Calendar) (obj)).after(calendar))
        {
            mSaverProvider.decorateEReceipt(saverreceipt.tcNumber, saverreceipt.localDate, saverreceipt.seen, true, saverreceipt.notificationShown, SaverContract.SaverRejectedReasons.TOO_OLD);
            continue; /* Loop/switch isn't completed */
        }
        break; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        calendar.setTimeInMillis(0L);
        WLog.e(TAG, (new StringBuilder()).append("Could not parse local date ").append(saverreceipt.localDate).toString(), parseexception);
        if (true) goto _L2; else goto _L1
_L1:
        if (!saverreceipt.needsConfirmation() || saverreceipt.notificationShown || map == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        map.put(saverreceipt.tcNumber, saverreceipt);
        continue; /* Loop/switch isn't completed */
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list.add(saverreceipt);
        if (true) goto _L4; else goto _L3
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
    }

    private void setSyncing(boolean flag)
    {
        mSyncing = flag;
    }

    private void successfulReceiptRetrieval(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt, String s, AsyncCallbackOnThread asynccallbackonthread, AsyncCallbackOnThread asynccallbackonthread1)
    {
        String s1;
        try
        {
            s1 = EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(EReceiptsContractUtil.RECEIPT_PRINT_FORMAT.parse(receipt.datetimePrinted));
        }
        catch (Exception exception)
        {
            WLog.e(TAG, "Failed to parse eReceipt printed date, using timestamp instead.", exception);
            exception = EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(new Date(receipt.getTimeInMs()));
        }
        addReceipt(receipt, s1, s, asynccallbackonthread, asynccallbackonthread1);
    }

    private void syncDone(Integer integer)
    {
        WLog.d(TAG, (new StringBuilder()).append("SaverManager.syncDone(").append(integer).append(")").toString());
        setSyncing(false);
        for (Iterator iterator = mSyncListeners.iterator(); iterator.hasNext(); ((ResultCallback)iterator.next()).onResult(integer)) { }
        mSyncListeners.clear();
    }

    public void addReceiptToSaver(EReceipt ereceipt, String s, AsyncCallbackOnThread asynccallbackonthread)
    {
        addReceipt(ereceipt, ereceipt.localDate, s, null, asynccallbackonthread);
    }

    public void addReceiptToSaverByTc(final String tcNumber, final String localDate, final String source, final AsyncCallbackOnThread saverCallback)
    {
        checkRegistration(new ResultCallback() {

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
                    addReceipt(boolean1, localDate, source, true, true, new AsyncCallbackOnThread(mHandler) {

                        final _cls8 this$1;

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

            
            {
                this$1 = _cls8.this;
                super(handler);
            }
                    });
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
                this$0 = SaverManager.this;
                tcNumber = s;
                localDate = s1;
                source = s2;
                saverCallback = asynccallbackonthread;
                super();
            }
        });
    }

    public void addReceiptToSaverByTc(String s, Date date, String s1, AsyncCallbackOnThread asynccallbackonthread)
    {
        addReceiptToSaverByTc(s, EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(date), s1, asynccallbackonthread);
    }

    public void cancelSyncAll()
    {
        WLog.d(TAG, "SaverManager.cancelSyncAll()");
        cancelSyncAllInternal();
        for (Iterator iterator = mSyncListeners.iterator(); iterator.hasNext(); ((ResultCallback)iterator.next()).onResult(Integer.valueOf(-1))) { }
        mSyncListeners.clear();
    }

    public void findNearbyCompetitors(final String storeId, final AsyncCallback callback)
    {
        checkRegistration(new ResultCallback() {

            final SaverManager this$0;
            final AsyncCallback val$callback;
            final String val$storeId;

            public void onResult(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    mSaverService.findNearbyCompetitors(storeId, new AsyncCallbackOnThread(new Handler()) {

                        final _cls18 this$1;

                        public void onFailureSameThread(Integer integer, CompetitorsResponse competitorsresponse)
                        {
                            if (callback != null)
                            {
                                callback.onFailure(integer, competitorsresponse);
                            }
                        }

                        public volatile void onFailureSameThread(Object obj, Object obj1)
                        {
                            onFailureSameThread((Integer)obj, (CompetitorsResponse)obj1);
                        }

                        public void onSuccessSameThread(CompetitorsResponse competitorsresponse)
                        {
                            if (callback != null)
                            {
                                callback.onSuccess(competitorsresponse);
                            }
                        }

                        public volatile void onSuccessSameThread(Object obj)
                        {
                            onSuccessSameThread((CompetitorsResponse)obj);
                        }

            
            {
                this$1 = _cls18.this;
                super(handler);
            }
                    });
                } else
                if (callback != null)
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
                this$0 = SaverManager.this;
                storeId = s;
                callback = asynccallback;
                super();
            }
        });
    }

    public void getActiveSince(final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Date doInBackground(Void avoid[])
            {
                String s = mSaverProvider.getOldestSaverReceipt();
                avoid = null;
                if (!TextUtils.isEmpty(s))
                {
                    try
                    {
                        avoid = EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        WLog.e(SaverManager.TAG, "Could not parse date read from database", avoid);
                        return null;
                    }
                }
                return avoid;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Date)obj);
            }

            protected void onPostExecute(Date date)
            {
                callback.onResult(date);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Void[0]);
    }

    public void getAllReceipts(final ResultCallback callback)
    {
        boolean flag = true;
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        callback = new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient Cursor doInBackground(Boolean aboolean[])
            {
                return mSaverProvider.getAllReceipts(mCustomerId, aboolean[0].booleanValue());
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Boolean[])aobj);
            }

            protected void onPostExecute(Cursor cursor)
            {
                callback.onResult(cursor);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Cursor)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        };
        if (!isLastSaverSyncSuccess() || appconfig == null || !appconfig.saverManualSubmit)
        {
            flag = false;
        }
        callback.execute(new Boolean[] {
            Boolean.valueOf(flag)
        });
    }

    public void getCompetitors(Integer integer, final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient Cursor doInBackground(Integer ainteger[])
            {
                return mSaverProvider.getCompetitors(ainteger[0]);
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Integer[])aobj);
            }

            protected void onPostExecute(Cursor cursor)
            {
                callback.onResult(cursor);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Cursor)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Integer[] {
            integer
        });
    }

    public void getReceipt(String s, final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient SaverReceipt doInBackground(String as[])
            {
                SaverReceipt saverreceipt;
                Cursor cursor;
                cursor = null;
                Object obj = null;
                saverreceipt = cursor;
                if (as == null)
                {
                    break MISSING_BLOCK_LABEL_93;
                }
                saverreceipt = cursor;
                if (as.length <= 0)
                {
                    break MISSING_BLOCK_LABEL_93;
                }
                cursor = mSaverProvider.getReceipt(as[0]);
                as = obj;
                if (cursor == null)
                {
                    break MISSING_BLOCK_LABEL_77;
                }
                as = obj;
                if (cursor.moveToFirst())
                {
                    as = SaverContractUtil.populateSaverReceipt(cursor, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(cursor, new SaverReceipt()));
                }
                saverreceipt = as;
                if (cursor != null)
                {
                    cursor.close();
                    saverreceipt = as;
                }
                return saverreceipt;
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

            protected void onPostExecute(SaverReceipt saverreceipt)
            {
                callback.onResult(saverreceipt);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((SaverReceipt)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new String[] {
            s
        });
    }

    public void getReceiptByTc(String s, String s1, final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient SaverReceipt doInBackground(String as[])
            {
                SaverReceipt saverreceipt;
                Cursor cursor;
                cursor = null;
                Object obj = null;
                saverreceipt = cursor;
                if (as == null)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                saverreceipt = cursor;
                if (as.length <= 0)
                {
                    break MISSING_BLOCK_LABEL_96;
                }
                cursor = mSaverProvider.getReceipt(as[0], as[1]);
                as = obj;
                if (cursor == null)
                {
                    break MISSING_BLOCK_LABEL_80;
                }
                as = obj;
                if (cursor.moveToFirst())
                {
                    as = SaverContractUtil.populateSaverReceipt(cursor, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(cursor, new SaverReceipt()));
                }
                saverreceipt = as;
                if (cursor != null)
                {
                    cursor.close();
                    saverreceipt = as;
                }
                return saverreceipt;
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

            protected void onPostExecute(SaverReceipt saverreceipt)
            {
                callback.onResult(saverreceipt);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((SaverReceipt)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new String[] {
            s, s1
        });
    }

    public void getReceiptByTc(String s, Date date, ResultCallback resultcallback)
    {
        getReceiptByTc(s, EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(date), resultcallback);
    }

    public void getReceiptCount(final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient Integer doInBackground(Void avoid[])
            {
                return Integer.valueOf(mSaverProvider.getNrbOfReceipts(mCustomerId));
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(Integer integer)
            {
                callback.onResult(integer);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Integer)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Void[0]);
    }

    public void getReceiptItems(long l, String s, String s1, final boolean sortByPrice, final ResultCallback resultCallback)
    {
        if (l < 0L || s == null || s1 == null)
        {
            resultCallback.onResult(Collections.emptyList());
        }
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$resultCallback;
            final boolean val$sortByPrice;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground(aobj);
            }

            protected transient List doInBackground(Object aobj[])
            {
                Cursor cursor;
                Cursor cursor1;
                ArrayList arraylist;
                cursor = mSaverProvider.getReceiptItems(((Long)aobj[0]).longValue());
                cursor1 = mSaverProvider.getSaverReceiptItems((String)aobj[1], (String)aobj[2]);
                arraylist = new ArrayList();
                if (cursor == null || cursor1 == null || cursor.getCount() <= 0 || cursor1.getCount() <= 0) goto _L2; else goto _L1
_L1:
                int i = cursor.getColumnIndex("normalizedUpc");
                int j = cursor1.getColumnIndex("normalizedUpc");
                do
                {
                    if (!(cursor.moveToNext() & cursor1.moveToNext()))
                    {
                        break;
                    }
                    String s2 = cursor.getString(i);
                    String s3 = cursor1.getString(j);
                    SaverReceipt.Item item = (SaverReceipt.Item)EReceiptsContractUtil.populateEReceiptItem(cursor, new SaverReceipt.Item());
                    if (item.coupon)
                    {
                        cursor1.move(-1);
                        arraylist.add(item);
                    } else
                    if (s2.equals(s3))
                    {
                        arraylist.add(SaverContractUtil.populateSaverReceiptItem(cursor1, item));
                        if (cursor.getPosition() < cursor.getCount() - 1)
                        {
                            cursor1.move(-1);
                        }
                    } else
                    if (s2.compareTo(s3) < 0)
                    {
                        cursor1.move(-1);
                        arraylist.add(item);
                    } else
                    {
                        cursor.move(-1);
                    }
                } while (true);
                if (!cursor.isAfterLast() || !cursor1.isAfterLast())
                {
                    WLog.e(SaverManager.TAG, (new StringBuilder()).append("Mismatch between eReceipt and Saver item rows. RUID: ").append(aobj[0]).toString());
                }
_L4:
                Collections.sort(arraylist, new SavingsComparator(sortByPrice));
                return arraylist;
_L2:
                if (cursor == null || cursor.getCount() <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                while (cursor.moveToNext()) 
                {
                    arraylist.add(EReceiptsContractUtil.populateEReceiptItem(cursor, new SaverReceipt.Item()));
                }
                if (true) goto _L4; else goto _L3
_L3:
                if (cursor1 != null && cursor1.getCount() > 0)
                {
                    while (cursor1.moveToNext()) 
                    {
                        arraylist.add(SaverContractUtil.populateSaverReceiptItem(cursor1, new SaverReceipt.Item()));
                    }
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((List)obj);
            }

            protected void onPostExecute(List list)
            {
                resultCallback.onResult(list);
            }

            
            {
                this$0 = SaverManager.this;
                sortByPrice = flag;
                resultCallback = resultcallback;
                super();
            }
        }).execute(new Object[] {
            Long.valueOf(l), s, s1
        });
    }

    public void getRecommendations(String s, AsyncCallback asynccallback)
    {
        mSaverService.getRecommendations(s, asynccallback);
    }

    public void getSaverReceiptDetails(final SaverReceipt receipt, final AsyncCallbackOnThread callback)
    {
        checkRegistration(new ResultCallback() {

            final SaverManager this$0;
            final AsyncCallbackOnThread val$callback;
            final SaverReceipt val$receipt;

            public void onResult(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    mSaverService.getReceipt(receipt.tcNumber, receipt.serverState, new AsyncCallbackOnThread(mHandler) {

                        final _cls10 this$1;

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
                                (new InsertDetailsTask(callback)).execute(new SaverReceiptResponse.Payload[] {
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
                this$1 = _cls10.this;
                super(handler);
            }
                    });
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
                this$0 = SaverManager.this;
                receipt = saverreceipt;
                callback = asynccallbackonthread;
                super();
            }
        });
    }

    protected ReceiptsSummaryResponse.OverallSavingsSummary getSaverSummary()
    {
        return mOverallSavingSummary;
    }

    public List getUnconfirmedReceipts()
    {
        ArrayList arraylist = new ArrayList(mUnconfirmedReceipts.values());
        if (arraylist.size() > 1)
        {
            Collections.sort(arraylist, new Comparator() {

                final SaverManager this$0;

                public int compare(SaverReceipt saverreceipt, SaverReceipt saverreceipt1)
                {
                    return saverreceipt1.compareTo(saverreceipt);
                }

                public volatile int compare(Object obj, Object obj1)
                {
                    return compare((SaverReceipt)obj, (SaverReceipt)obj1);
                }

            
            {
                this$0 = SaverManager.this;
                super();
            }
            });
        }
        return arraylist;
    }

    public void getUnseenReceiptCount(final ResultCallback callback)
    {
        (new AsyncTask() {

            final SaverManager this$0;
            final ResultCallback val$callback;

            protected transient Integer doInBackground(Void avoid[])
            {
                Cursor cursor = mSaverProvider.getUnseenReceipts(mCustomerId);
                if (cursor == null) goto _L2; else goto _L1
_L1:
                int i = cursor.getCount();
                Integer integer = Integer.valueOf(i);
                avoid = integer;
                if (cursor != null)
                {
                    cursor.close();
                    avoid = integer;
                }
_L4:
                return avoid;
_L2:
                Integer integer1;
                integer1 = Integer.valueOf(0);
                avoid = integer1;
                if (cursor == null) goto _L4; else goto _L3
_L3:
                cursor.close();
                return integer1;
                avoid;
                if (cursor != null)
                {
                    cursor.close();
                }
                throw avoid;
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(Integer integer)
            {
                callback.onResult(integer);
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Integer)obj);
            }

            
            {
                this$0 = SaverManager.this;
                callback = resultcallback;
                super();
            }
        }).execute(new Void[0]);
    }

    public boolean isLastSaverSyncSuccess()
    {
        return mOverallSavingSummary != null;
    }

    public boolean isSyncing(ResultCallback resultcallback)
    {
        if (mSyncing)
        {
            if (resultcallback != null)
            {
                mSyncListeners.add(resultcallback);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void markAsNotified(List list)
    {
        SaverReceipt saverreceipt;
        for (list = list.iterator(); list.hasNext(); (new DecorateReceiptTask(null, null, null, saverreceipt.tcNumber, saverreceipt.localDate, saverreceipt.submitConfirmed, true)).execute(new SaverContract.SaverRejectedReasons[] {
    saverreceipt.reason
}))
        {
            saverreceipt = (SaverReceipt)list.next();
            mUnconfirmedReceipts.remove(saverreceipt.tcNumber);
        }

    }

    public void markAsSeen(SaverReceipt saverreceipt)
    {
        (new AsyncTask() {

            final SaverManager this$0;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((SaverReceipt[])aobj);
            }

            protected transient Void doInBackground(SaverReceipt asaverreceipt[])
            {
                asaverreceipt = asaverreceipt[0];
                if (SaverContract.SaverState.isProcessed(((SaverReceipt) (asaverreceipt)).state))
                {
                    mSaverProvider.updateSeenReceipt(true, new Pair[] {
                        new Pair(((SaverReceipt) (asaverreceipt)).tcNumber, ((SaverReceipt) (asaverreceipt)).localDate)
                    });
                }
                return null;
            }

            
            {
                this$0 = SaverManager.this;
                super();
            }
        }).execute(new SaverReceipt[] {
            saverreceipt
        });
    }

    public void markAsSubmitted(SaverReceipt saverreceipt)
    {
        mUnconfirmedReceipts.remove(saverreceipt.tcNumber);
        (new DecorateReceiptTask(null, null, null, saverreceipt.tcNumber, saverreceipt.localDate, true, saverreceipt.notificationShown)).execute(new SaverContract.SaverRejectedReasons[] {
            saverreceipt.reason
        });
    }

    public void onAppForegroundEvent(AppForegroundEvent appforegroundevent)
    {
        syncReceipts();
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        mRegistrationRunnable.setTriedOnce(false);
        mCustomerId = authenticationstatusevent.customerId;
        if (authenticationstatusevent.loggedIn && authenticationstatusevent.hasCredentials)
        {
            mCustomerEmail = authenticationstatusevent.email;
            syncAll(false);
        } else
        {
            mCustomerEmail = null;
            setSaverSummary(null, true);
            (new ResetSaverDataTask()).execute(new Void[0]);
            cancelSyncAll();
        }
        doRegistration(0L);
    }

    public void onNewAppConfigReceived(AppConfig appconfig)
    {
        if (appconfig.scBanner != null && appconfig.scBanner.imageUrl != null)
        {
            Picasso.with(mContext).load(appconfig.scBanner.imageUrl).fetch();
        }
        appconfig = getSaverSummary();
        boolean flag;
        if (getSaverSummary() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setSaverSummary(appconfig, flag);
        (new UnconfirmedReceipts()).execute(new Void[0]);
    }

    public SaverSummaryUpdateEvent produceSaverSummaryUpdateEvent()
    {
        return new SaverSummaryUpdateEvent(getSaverSummary());
    }

    public void redeem(final boolean bluebird, final boolean firstTime, final AsyncCallback callback)
    {
        checkRegistration(new ResultCallback() {

            final SaverManager this$0;
            final boolean val$bluebird;
            final AsyncCallback val$callback;
            final boolean val$firstTime;

            public void onResult(Boolean boolean1)
            {
                Object obj = getSaverSummary();
                if (boolean1.booleanValue() && obj != null)
                {
                    boolean1 = new RedeemResponse();
                    boolean flag;
                    if (bluebird)
                    {
                        boolean1.redeemedTotalCents = ((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).bluebirdRedeemableCents;
                    } else
                    {
                        boolean1.redeemedTotalCents = ((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).redeemableCents;
                    }
                    if (!((ReceiptsSummaryResponse.OverallSavingsSummary) (obj)).hasSaverGiftCard)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    boolean1.giftCardCreated = flag;
                    obj = new RedeemRequest();
                    if (bluebird)
                    {
                        obj.method = RedeemRequest.Method.AMEX.name();
                    } else
                    if (firstTime)
                    {
                        obj.method = RedeemRequest.Method.GCActivate.name();
                    } else
                    {
                        obj.method = RedeemRequest.Method.GCReload.name();
                    }
                    mSaverService.redeem(((RedeemRequest) (obj)), mHandler. new AsyncCallbackOnThread(boolean1) {

                        final _cls20 this$1;
                        final RedeemResponse val$result;

                        public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
                        {
                            WLog.e(SaverManager.TAG, (new StringBuilder()).append("Redeem failed. Error: ").append(integer).toString());
                            if (callback != null)
                            {
                                callback.onFailure(integer, result);
                            }
                        }

                        public volatile void onFailureSameThread(Object obj, Object obj1)
                        {
                            onFailureSameThread((Integer)obj, (StatusResponse)obj1);
                        }

                        public void onSuccessSameThread(StatusResponse statusresponse)
                        {
                            WLog.e(SaverManager.TAG, "Redeem success");
                            if (callback != null)
                            {
                                callback.onSuccess(result);
                            }
                            mHandler.post(new Runnable() {

                                final _cls1 this$2;

                                public void run()
                                {
                                    setSaverSummary(null, true);
                                    syncAll(true);
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            });
                        }

                        public volatile void onSuccessSameThread(Object obj)
                        {
                            onSuccessSameThread((StatusResponse)obj);
                        }

            
            {
                this$1 = final__pcls20;
                result = redeemresponse;
                super(Handler.this);
            }
                    });
                } else
                if (callback != null)
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
                this$0 = SaverManager.this;
                bluebird = flag;
                firstTime = flag1;
                callback = asynccallback;
                super();
            }
        });
    }

    public void retrieveReceipt(String s, String s1, AsyncCallbackOnThread asynccallbackonthread, AsyncCallbackOnThread asynccallbackonthread1)
    {
        EReceiptManager.get().retrieveReceipt(s, new AsyncCallbackOnThread(asynccallbackonthread1) {

            final SaverManager this$0;
            final AsyncCallbackOnThread val$eReceiptCallback;
            final AsyncCallbackOnThread val$saverCallback;
            final String val$source;

            public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                eReceiptCallback.onFailure(integer, receipt);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                successfulReceiptRetrieval(receipt, source, eReceiptCallback, saverCallback);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$0 = SaverManager.this;
                eReceiptCallback = asynccallbackonthread;
                source = s;
                saverCallback = asynccallbackonthread1;
                super(final_handler);
            }
        });
    }

    public void retrieveReceiptByTc(String s, String s1, String s2, AsyncCallbackOnThread asynccallbackonthread, AsyncCallbackOnThread asynccallbackonthread1)
    {
        EReceiptManager.get().retrieveReceiptByTc(s, s1, new AsyncCallbackOnThread(asynccallbackonthread1) {

            final SaverManager this$0;
            final AsyncCallbackOnThread val$eReceiptCallback;
            final AsyncCallbackOnThread val$saverCallback;
            final String val$source;

            public void onFailureSameThread(Integer integer, com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                eReceiptCallback.onFailure(integer, receipt);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt receipt)
            {
                successfulReceiptRetrieval(receipt, source, eReceiptCallback, saverCallback);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((com.walmartlabs.ereceipt.service.EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$0 = SaverManager.this;
                eReceiptCallback = asynccallbackonthread;
                source = s;
                saverCallback = asynccallbackonthread1;
                super(final_handler);
            }
        });
    }

    public void retrieveReceiptByTc(String s, Date date, String s1, AsyncCallbackOnThread asynccallbackonthread, AsyncCallbackOnThread asynccallbackonthread1)
    {
        retrieveReceiptByTc(s, EReceiptsContractUtil.LOCAL_DATE_FORMAT.format(date), s1, asynccallbackonthread, asynccallbackonthread1);
    }

    protected void setSaverSummary(ReceiptsSummaryResponse.OverallSavingsSummary overallsavingssummary, boolean flag)
    {
        if (overallsavingssummary != null)
        {
            AppConfig appconfig = AppConfigManager.get().getAppConfig();
            if (appconfig == null || !appconfig.bluebirdEnabled)
            {
                overallsavingssummary.canRedeemNowAMEX = false;
                overallsavingssummary.enableAMEXLink = false;
                overallsavingssummary.enableAMEXRegister = false;
            }
        }
        mOverallSavingSummary = overallsavingssummary;
        if (flag)
        {
            MessageBus.getBus().post(produceSaverSummaryUpdateEvent());
        }
    }

    public void submitFeedback(final FeedbackRequest feedbackRequest, final AsyncCallback callback)
    {
        checkRegistration(new ResultCallback() {

            final SaverManager this$0;
            final AsyncCallback val$callback;
            final FeedbackRequest val$feedbackRequest;

            public void onResult(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    mSaverService.postFeedback(feedbackRequest, callback);
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
                this$0 = SaverManager.this;
                feedbackRequest = feedbackrequest;
                callback = asynccallback;
                super();
            }
        });
    }

    public void syncAll(boolean flag)
    {
        WLog.d(TAG, "SaverManager.syncAll()");
        cancelSyncAllInternal();
        setSyncing(true);
        mSyncAllTask = new SyncAllTask(flag);
        if (Services.get().getAuthentication().hasCredentials())
        {
            final SyncAllTask syncAllTask = mSyncAllTask;
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverManager this$0;
                final SyncAllTask val$syncAllTask;

                public void onFailure(int i)
                {
                    syncDone(Integer.valueOf(i));
                }

                public void onSuccess()
                {
                    if (!syncAllTask.isCancelled())
                    {
                        syncAllTask.execute(new Void[0]);
                    }
                }

            
            {
                this$0 = SaverManager.this;
                syncAllTask = syncalltask;
                super();
            }
            });
            return;
        } else
        {
            mSyncAllTask.execute(new Void[0]);
            return;
        }
    }

    public void syncReceipts()
    {
        if (!isSyncing(null))
        {
            syncAll(false);
        }
    }







/*
    static MismatchedReceiptsTask access$1402(SaverManager savermanager, MismatchedReceiptsTask mismatchedreceiptstask)
    {
        savermanager.mMismatchedReceiptsTask = mismatchedreceiptstask;
        return mismatchedreceiptstask;
    }

*/



/*
    static InsertSummariesTask access$1602(SaverManager savermanager, InsertSummariesTask insertsummariestask)
    {
        savermanager.insertSummariesTask = insertsummariestask;
        return insertsummariestask;
    }

*/









/*
    static String access$2702(SaverManager savermanager, String s)
    {
        savermanager.mRegisteredUser = s;
        return s;
    }

*/






}
