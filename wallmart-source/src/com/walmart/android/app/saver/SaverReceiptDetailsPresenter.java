// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.EReceiptImageContentProvider;
import com.walmart.android.service.saver.SaverContractUtil;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmui.WalmartActivityChooserView;
import com.walmart.android.wmui.WalmartShareActionProvider;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;
import com.walmartlabs.utils.WLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverReceiptListAdapter, SaverSubmitReceipt, SaverReceiptDetailsPage, 
//            SaverPresenterSyncCallback

public class SaverReceiptDetailsPresenter extends Presenter
    implements HasGetItBackBar
{
    public static interface ActionCallbacks
    {

        public abstract void launchReceiptImage(String s);

        public abstract void launchReceiptItem(SaverReceipt saverreceipt, com.walmart.android.service.saver.SaverReceipt.Item item);

        public abstract void launchReturn(String s);

        public abstract void launchSignIn();

        public abstract void moveTo(int i);

        public abstract void onShowCompetitors(String s, String s1, String s2, String s3);

        public abstract void onUnseen(SaverReceipt saverreceipt);
    }

    private class DetailsViewPagerAdapter extends PagerAdapter
    {

        final SaverReceiptDetailsPresenter this$0;

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            obj = (SaverReceiptDetailsPage)obj;
            ((SaverReceiptDetailsPage) (obj)).cancel();
            viewgroup.removeView(((SaverReceiptDetailsPage) (obj)).getView());
        }

        public int getCount()
        {
            return mReceiptsAdapter.getCount();
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            SaverReceipt saverreceipt = getReceipt(i);
            Object obj = new SaverReceiptDetailsPage.ActionCallbacks() {

                final DetailsViewPagerAdapter this$1;

                public void onAddressClicked(int i)
                {
                    if (!isSingleClickFlagSet())
                    {
                        setSingleClickFlag(true);
                        com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

                            final DetailsViewPagerAdapter._cls2 this$2;

                            private void handleServerResponse(WalmartStore awalmartstore[])
                            {
                                if (isPopped())
                                {
                                    return;
                                }
                                if (awalmartstore != null && awalmartstore.length > 0)
                                {
                                    awalmartstore = new StoreDetailPresenter(mActivity, awalmartstore[0]);
                                    awalmartstore.setShowLocalAd(false);
                                    pushPresenter(awalmartstore);
                                    return;
                                } else
                                {
                                    clearSingleClickFlag();
                                    return;
                                }
                            }

                            public void onFailure(int i)
                            {
                                handleServerResponse(null);
                            }

                            public void onStoresReceived(WalmartStore awalmartstore[])
                            {
                                handleServerResponse(awalmartstore);
                            }

                            public volatile void onStoresReceived(StoreData astoredata[])
                            {
                                onStoresReceived((WalmartStore[])astoredata);
                            }

            
            {
                this$2 = DetailsViewPagerAdapter._cls2.this;
                super();
            }
                        };
                        StoreService.getStoreService().getStore(i, getstorescallback);
                    }
                }

                public void onItemClicked(SaverReceipt saverreceipt, com.walmart.android.service.saver.SaverReceipt.Item item)
                {
                    if (!isSingleClickFlagSet())
                    {
                        setSingleClickFlag(true);
                        mActionCallbacks.launchReceiptItem(saverreceipt, item);
                    }
                }

            
            {
                this$1 = DetailsViewPagerAdapter.this;
                super();
            }
            };
            obj = new SaverReceiptDetailsPage(mActivity, saverreceipt, ((SaverReceiptDetailsPage.ActionCallbacks) (obj)));
            AppConfig appconfig = AppConfigManager.get().getAppConfig();
            boolean flag;
            if (appconfig != null && appconfig.saverManualSubmit && saverreceipt.needsConfirmation() && SaverManager.get().isLastSaverSyncSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((SaverReceiptDetailsPage) (obj)).block(flag);
            viewgroup.addView(((SaverReceiptDetailsPage) (obj)).createView(viewgroup));
            return obj;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return ((SaverReceiptDetailsPage)obj).getView() == view;
        }

        public DetailsViewPagerAdapter()
        {
            this$0 = SaverReceiptDetailsPresenter.this;
            super();
            mReceiptsAdapter.registerDataSetObserver(new _cls1());
        }
    }

    private class SaverCallback extends SaverSubmitReceipt.SaverCallback
    {

        private final SaverReceipt mReceipt;
        final SaverReceiptDetailsPresenter this$0;

        protected void dismissDialog(int i)
        {
            SaverReceiptDetailsPresenter.this.dismissDialog(i);
        }

        protected boolean isEReceipt()
        {
            return true;
        }

        protected boolean isTop()
        {
            return SaverReceiptDetailsPresenter.this.isTop();
        }

        public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
        {
            super.onFailureSameThread(integer, statusresponse);
            if (isTop())
            {
                fetchReceipts();
            }
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (StatusResponse)obj1);
        }

        public void onSuccessSameThread(StatusResponse statusresponse)
        {
            if (isTop())
            {
                if (mReceiptId != null && (mReceiptId.equals(mReceipt.uuid) || mReceiptId.equals(mReceipt.tcNumber)))
                {
                    if (mReceipt.store != null)
                    {
                        statusresponse = mReceipt.store.id;
                    } else
                    {
                        statusresponse = null;
                    }
                    mActionCallbacks.onShowCompetitors(mReceipt.uuid, mReceipt.tcNumber, mReceipt.localDate, statusresponse);
                } else
                {
                    SaverManager.get().syncAll(false);
                    fetchReceipts();
                }
                dismissDialog(1001);
            }
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StatusResponse)obj);
        }

        protected void showDialog(int i)
        {
            SaverReceiptDetailsPresenter.this.showDialog(i);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            SaverReceiptDetailsPresenter.this.showDialog(i, bundle);
        }

        public SaverCallback(Handler handler, SaverReceipt saverreceipt)
        {
            this$0 = SaverReceiptDetailsPresenter.this;
            super(handler);
            mReceipt = saverreceipt;
        }
    }


    private static final int DIALOG_ERROR_UNKNOWN = 2;
    private static final int DIALOG_NO_CONNECTION = 4;
    private static final int DIALOG_NO_NETWORK = 1;
    private static final int DIALOG_NO_RECEIPT = 0;
    private static final int DIALOG_SHARE_PROGRESS = 3;
    private static final int DIALOG_SUBMIT_PROGRESS = 1001;
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptDetailsPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private int mIsShowingDialog;
    private View mLoadingView;
    private ViewPager mPagerView;
    private boolean mPendingForceClose;
    private boolean mPendingPageViewEvent;
    private int mPosition;
    private String mReceiptId;
    private SaverReceiptListAdapter mReceiptsAdapter;
    private ViewGroup mRootView;
    private final DetailsViewPagerAdapter mViewPagerAdapter = new DetailsViewPagerAdapter();

    public SaverReceiptDetailsPresenter(Activity activity, String s, ActionCallbacks actioncallbacks)
    {
        mPosition = -1;
        mIsShowingDialog = -1;
        mActivity = activity;
        mReceiptId = s;
        mActionCallbacks = actioncallbacks;
        mReceiptsAdapter = new SaverReceiptListAdapter(mActivity);
        setTitleText(mActivity.getString(0x7f0904f1));
    }

    private void checkIfSeen(int i)
    {
        SaverReceipt saverreceipt = getReceipt(i);
        if (saverreceipt.hasSummary && !saverreceipt.seen)
        {
            mActionCallbacks.onUnseen(saverreceipt);
        }
    }

    private void checkIfSubmit(int i)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null && appconfig.saverManualSubmit)
        {
            SaverReceipt saverreceipt = getReceipt(i);
            if (saverreceipt.needsConfirmation())
            {
                submitReceipt(saverreceipt);
            }
        }
    }

    private void fetchReceipts()
    {
        Object obj = new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverReceiptDetailsPresenter this$0;

            public void onResult(Cursor cursor)
            {
label0:
                {
                    if (!isPopped())
                    {
                        if (cursor == null || cursor.getCount() <= 0)
                        {
                            break label0;
                        }
                        mReceiptsAdapter.changeCursor(cursor);
                        mPagerView.setAdapter(mViewPagerAdapter);
                        mLoadingView.setVisibility(8);
                        if (mPosition < 0)
                        {
                            mPosition = mReceiptsAdapter.findPosition(mReceiptId);
                        }
                        if (mPosition < 0)
                        {
                            mPendingForceClose = true;
                            showDialog(0);
                        } else
                        {
                            mPagerView.setCurrentItem(mPosition, false);
                            checkIfSubmit(mPosition);
                            checkIfSeen(mPosition);
                            invalidateOptionsMenu();
                        }
                        sendPendingPageViewEvent();
                    }
                    return;
                }
                mPendingForceClose = true;
                showDialog(2);
            }

            public volatile void onResult(Object obj1)
            {
                onResult((Cursor)obj1);
            }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
        };
        if (SaverManager.get().isSyncing(new SaverPresenterSyncCallback(((com.walmart.android.service.saver.SaverManager.ResultCallback) (obj))) {

        final SaverReceiptDetailsPresenter this$0;
        final com.walmart.android.service.saver.SaverManager.ResultCallback val$allReceiptCallback;

        protected void onSyncResult(Integer integer)
        {
            if (!isPopped())
            {
                SaverManager.get().getAllReceipts(allReceiptCallback);
            }
        }

        protected void showNoNetworkDialog()
        {
            showDialog(1);
        }

        protected void showUnknownErrorDialog()
        {
            showDialog(2);
        }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                allReceiptCallback = resultcallback;
                super(final_presenter);
            }
    }))
        {
            obj = mReceiptsAdapter.getCurrentReceiptId(mPosition);
            if (obj != null)
            {
                mReceiptId = ((String) (obj));
                mPosition = -1;
            }
            mReceiptsAdapter.changeCursor(null);
            mPagerView.setAdapter(null);
            invalidateOptionsMenu();
            mLoadingView.setVisibility(0);
            return;
        }
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null && appconfig.saverManualSubmit)
        {
            String s = mReceiptsAdapter.getCurrentReceiptId(mPosition);
            if (s != null)
            {
                mReceiptId = s;
                mPosition = -1;
            }
        }
        SaverManager.get().getAllReceipts(((com.walmart.android.service.saver.SaverManager.ResultCallback) (obj)));
    }

    private SaverReceipt getCurrentReceipt()
    {
        if (mPagerView != null)
        {
            int i = mPagerView.getCurrentItem();
            Cursor cursor = (Cursor)mReceiptsAdapter.getItem(i);
            if (cursor != null)
            {
                return SaverContractUtil.populateSaverReceipt(cursor, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(cursor, new SaverReceipt()));
            }
        }
        return null;
    }

    private SaverReceipt getReceipt(int i)
    {
        Cursor cursor = (Cursor)mReceiptsAdapter.getItem(i);
        return SaverContractUtil.populateSaverReceipt(cursor, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(cursor, new SaverReceipt()));
    }

    private void invalidateOptionsMenu()
    {
        if (mActivity instanceof AppCompatActivity)
        {
            ((AppCompatActivity)mActivity).supportInvalidateOptionsMenu();
        }
    }

    private void prepareForShareImage(final MenuItem uuid, SaverReceipt saverreceipt)
    {
        final AsyncCallbackOnThread callback;
        final String tcNbr;
label0:
        {
            callback = (WalmartActivityChooserView)MenuItemCompat.getActionView(uuid);
            if (((WalmartShareActionProvider)MenuItemCompat.getActionProvider(uuid)).getShareIntent() != null && saverreceipt != null)
            {
                uuid = saverreceipt.uuid;
                tcNbr = saverreceipt.tcNumber;
                showDialog(3);
                callback = new AsyncCallbackOnThread(callback) {

                    final SaverReceiptDetailsPresenter this$0;
                    final WalmartActivityChooserView val$chooserView;
                    final String val$tcNbr;
                    final String val$uuid;

                    public void onFailureSameThread(Integer integer, Uri uri)
                    {
                        if (isTop())
                        {
                            dismissDialog(3);
                            showDialog(2);
                        }
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (Uri)obj1);
                    }

                    public void onSuccessSameThread(Uri uri)
                    {
                        if (isTop())
                        {
                            dismissDialog(3);
                            uri = getCurrentReceipt();
                            if (uri != null && uuid.equals(((SaverReceipt) (uri)).uuid) && tcNbr.equals(((SaverReceipt) (uri)).tcNumber))
                            {
                                chooserView.showPopup();
                            }
                        }
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((Uri)obj);
                    }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                uuid = s;
                tcNbr = s1;
                chooserView = walmartactivitychooserview;
                super(final_handler);
            }
                };
                if (!saverreceipt.hasImage())
                {
                    break label0;
                }
                EReceiptManager.get().getReceiptImage(uuid, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                    final SaverReceiptDetailsPresenter this$0;
                    final AsyncCallbackOnThread val$callback;
                    final String val$tcNbr;
                    final String val$uuid;

                    public volatile void onResult(Object obj)
                    {
                        onResult((String)obj);
                    }

                    public void onResult(String s)
                    {
                        EReceiptImageContentProvider.storeReceiptImage(mActivity, uuid, tcNbr, s, callback);
                    }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                uuid = s;
                tcNbr = s1;
                callback = asynccallbackonthread;
                super();
            }
                });
            }
            return;
        }
        EReceiptImageContentProvider.downloadReceiptImage(mActivity, uuid, tcNbr, callback);
    }

    private void sendPendingPageViewEvent()
    {
        if (!mPendingPageViewEvent || mLoadingView == null || mLoadingView.getVisibility() == 0) goto _L2; else goto _L1
_L1:
        SaverReceipt saverreceipt = getCurrentReceipt();
        if (saverreceipt == null) goto _L2; else goto _L3
_L3:
        String s;
        com.walmart.android.service.saver.SaverContract.SaverState saverstate;
        saverstate = com.walmart.android.service.saver.SaverContract.SaverState.find(saverreceipt.state);
        s = null;
        static class _cls11
        {

            static final int $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[];

            static 
            {
                $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState = new int[com.walmart.android.service.saver.SaverContract.SaverState.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.CreditFound.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.NoCreditFound.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Processing.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Invalid.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$saver$SaverContract$SaverState[com.walmart.android.service.saver.SaverContract.SaverState.Unknown.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls11..SwitchMap.com.walmart.android.service.saver.SaverContract.SaverState[saverstate.ordinal()];
        JVM INSTR tableswitch 1 5: default 84
    //                   1 161
    //                   2 168
    //                   3 175
    //                   4 182
    //                   5 196;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        if (s != null)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s).putString("section", "Saver - Receipt").putString("subCategory", "Receipt"));
        }
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tcNumber")).putString("number", saverreceipt.tcNumber));
        mPendingPageViewEvent = false;
_L2:
        return;
_L5:
        s = "Receipt - Lower Price Found";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "Receipt - No Lower Price Found";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "Receipt - List View Processing";
        continue; /* Loop/switch isn't completed */
_L8:
        if (saverreceipt.uuid != null)
        {
            s = "Receipt - Pre-Program";
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (saverreceipt.reason == com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.TOO_OLD)
        {
            s = "Receipt - Not Eligible";
        } else
        if (saverreceipt.reason == com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.PRE_PROGRAM)
        {
            s = "Receipt - Pre-Program";
        }
        if (true) goto _L4; else goto _L10
_L10:
    }

    private void setupShareMenuItem(final MenuItem shareAction)
    {
        SaverReceipt saverreceipt = getCurrentReceipt();
        if (android.os.Build.VERSION.SDK_INT >= 16 && saverreceipt != null && saverreceipt.uuid != null && saverreceipt.tcNumber != null)
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            try
            {
                if (saverreceipt.localDate != null)
                {
                    intent.putExtra("android.intent.extra.SUBJECT", mActivity.getString(0x7f0900f4, new Object[] {
                        EReceiptsContractUtil.RECEIPT_SIMPLE_PRINT_FORMAT.format(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(saverreceipt.localDate))
                    }));
                }
            }
            catch (ParseException parseexception)
            {
                WLog.e(TAG, (new StringBuilder()).append("Could not parse local date ").append(saverreceipt.localDate).toString(), parseexception);
                intent.putExtra("android.intent.extra.SUBJECT", mActivity.getString(0x7f0900f5));
            }
            intent.putExtra("android.intent.extra.TEXT", mActivity.getString(0x7f0900f3));
            intent.addFlags(1);
            intent.addFlags(0x10000000);
            intent.putExtra("android.intent.extra.STREAM", EReceiptImageContentProvider.createUriForReceiptImage(mActivity, saverreceipt.uuid, saverreceipt.tcNumber));
            ((WalmartShareActionProvider)MenuItemCompat.getActionProvider(shareAction)).setShareIntent(intent);
            ((WalmartActivityChooserView)MenuItemCompat.getActionView(shareAction)).setOnClickListener(new OnSingleClickListener(saverreceipt) {

                final SaverReceiptDetailsPresenter this$0;
                final SaverReceipt val$receipt;
                final MenuItem val$shareAction;

                public void onSingleClick(View view)
                {
                    prepareForShareImage(shareAction, receipt);
                }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                shareAction = menuitem;
                receipt = saverreceipt;
                super(final_presenter);
            }
            });
            return;
        } else
        {
            shareAction.setVisible(false);
            shareAction.setEnabled(false);
            return;
        }
    }

    private void submitReceipt(final SaverReceipt receipt)
    {
        SaverManager.get().markAsSubmitted(receipt);
        if (!NetworkConnectivityHelper.isConnected(mActivity))
        {
            showDialog(4, new Bundle());
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverReceiptDetailsPresenter this$0;
                final SaverReceipt val$receipt;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        mActionCallbacks.launchSignIn();
                    }
                }

                public void onSuccess()
                {
                    SaverManager.get().addReceiptToSaver(receipt, "existing", new SaverCallback(new Handler(), receipt));
                }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                receipt = saverreceipt;
                super();
            }
            });
            return;
        }
    }

    protected void dismissDialog(int i)
    {
        super.dismissDialog(i);
        if (mIsShowingDialog == i)
        {
            mIsShowingDialog = -1;
        }
    }

    public int getRedeemLimit()
    {
        return 50;
    }

    public View getView()
    {
        return mRootView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
        mReceiptsAdapter.changeCursor(null);
        mRootView.removeAllViews();
        mRootView = null;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        fetchReceipts();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        fetchReceipts();
    }

    protected Dialog onCreateDialog(int i)
    {
        if (mIsShowingDialog < 0) goto _L2; else goto _L1
_L1:
        Dialog dialog = null;
_L12:
        return dialog;
_L2:
        Object obj;
        dialog = SaverSubmitReceipt.createDialog(mActivity, getDialogArguments(), i, null);
        obj = dialog;
        if (dialog != null) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 0 4: default 68
    //                   0 99
    //                   1 162
    //                   2 176
    //                   3 190
    //                   4 215;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_215;
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        obj = super.onCreateDialog(i);
_L4:
        dialog = ((Dialog) (obj));
        if (obj != null)
        {
            mIsShowingDialog = i;
            ((Dialog) (obj)).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final SaverReceiptDetailsPresenter this$0;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    mIsShowingDialog = -1;
                    if (mPendingForceClose)
                    {
                        pop();
                    }
                }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
            });
            return ((Dialog) (obj));
        }
        if (true) goto _L12; else goto _L11
_L11:
        obj = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
        ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setMessage(mActivity.getString(0x7f0900f8));
        ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final SaverReceiptDetailsPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                mPendingForceClose = true;
            }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
        });
        ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setCancelable(false);
        ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).setIcon(null);
        obj = ((com.walmart.android.ui.dialog.AlertDialog.Builder) (obj)).create();
          goto _L4
_L7:
        obj = DialogFactory.onCreateDialog(600, mActivity);
          goto _L4
_L8:
        obj = DialogFactory.onCreateDialog(900, mActivity);
          goto _L4
_L9:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(0x7f0900cc));
          goto _L4
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090282).setNeutralButton(0x7f090292, new android.content.DialogInterface.OnClickListener() {

            final SaverReceiptDetailsPresenter this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                fetchReceipts();
            }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
        }).create();
          goto _L4
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        Cursor cursor = (Cursor)mReceiptsAdapter.getItem(mPosition);
        if (cursor != null && !cursor.isBeforeFirst() && !cursor.isAfterLast() && !cursor.isNull(cursor.getColumnIndex("uuid")))
        {
            menuinflater.inflate(0x7f12000b, menu);
            setupShareMenuItem(menu.findItem(0x7f10069f));
        }
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040165, viewgroup, false);
            mPagerView = (ViewPager)ViewUtil.findViewById(mRootView, 0x7f1004d7);
            mPagerView.setAdapter(mViewPagerAdapter);
            mPagerView.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

                final SaverReceiptDetailsPresenter this$0;

                public void onPageScrollStateChanged(int i)
                {
                }

                public void onPageScrolled(int i, float f, int j)
                {
                }

                public void onPageSelected(int i)
                {
                    if (mPosition != i)
                    {
                        checkIfSubmit(i);
                        checkIfSeen(i);
                        mPosition = i;
                        invalidateOptionsMenu();
                        mActionCallbacks.moveTo(i);
                        onPageView();
                    }
                }

            
            {
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
            });
            mLoadingView = ViewUtil.findViewById(mRootView, 0x7f10010f);
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        int i = menuitem.getItemId();
        if (i != 0x7f10068d) goto _L2; else goto _L1
_L1:
        menuitem = getCurrentReceipt();
        if (menuitem != null)
        {
            mActionCallbacks.launchReceiptImage(((SaverReceipt) (menuitem)).uuid);
        }
_L4:
        return true;
_L2:
        if (i == 0x7f10068e)
        {
            menuitem = getCurrentReceipt();
            if (menuitem != null)
            {
                mActionCallbacks.launchReturn(((SaverReceipt) (menuitem)).tcNumber);
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("returnItem"));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0x7f10069f)
        {
            break; /* Loop/switch isn't completed */
        }
        activity = getCurrentReceipt();
        if (activity != null)
        {
            prepareForShareImage(menuitem, activity);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return super.onOptionsMenuItemSelected(menuitem, activity);
    }

    protected void onPageView()
    {
        mPendingPageViewEvent = true;
        sendPendingPageViewEvent();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        fetchReceipts();
    }




/*
    static int access$002(SaverReceiptDetailsPresenter saverreceiptdetailspresenter, int i)
    {
        saverreceiptdetailspresenter.mPosition = i;
        return i;
    }

*/




























/*
    static boolean access$502(SaverReceiptDetailsPresenter saverreceiptdetailspresenter, boolean flag)
    {
        saverreceiptdetailspresenter.mPendingForceClose = flag;
        return flag;
    }

*/



/*
    static int access$702(SaverReceiptDetailsPresenter saverreceiptdetailspresenter, int i)
    {
        saverreceiptdetailspresenter.mIsShowingDialog = i;
        return i;
    }

*/



    // Unreferenced inner class com/walmart/android/app/saver/SaverReceiptDetailsPresenter$DetailsViewPagerAdapter$1

/* anonymous class */
    class DetailsViewPagerAdapter._cls1 extends DataSetObserver
    {

        final DetailsViewPagerAdapter this$1;
        final SaverReceiptDetailsPresenter val$this$0;

        public void onChanged()
        {
            notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            notifyDataSetChanged();
        }

            
            {
                this$1 = final_detailsviewpageradapter;
                this$0 = SaverReceiptDetailsPresenter.this;
                super();
            }
    }

}
