// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.SaverDetailsUpdateEvent;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverContractUtil;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.DialogFactory;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.ereceipt.EReceiptScanner;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;
import com.walmartlabs.ereceipt.service.EReceipt;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverReceiptListAdapter, SaverReceiptFilteredListAdapter, EReceiptSearchManager, 
//            SaverSubmitReceipt, SaverPresenterSyncCallback

public class SaverReceiptListPresenter extends Presenter
    implements HasGetItBackBar
{
    public static interface ActionCallbacks
    {

        public abstract void launchDetails(SaverReceiptListPresenter saverreceiptlistpresenter, String s);

        public abstract void launchSignIn();

        public abstract void onShowCompetitors(SaverReceiptListPresenter saverreceiptlistpresenter, String s, String s1, String s2, String s3);
    }

    private class SaverCallback extends SaverSubmitReceipt.SaverCallback
    {

        private final boolean mIsLastInList;
        private final boolean mIsList;
        private final EReceipt mReceipt;
        final SaverReceiptListPresenter this$0;

        protected void dismissDialog(int i)
        {
            SaverReceiptListPresenter.this.dismissDialog(i);
        }

        protected boolean isEReceipt()
        {
            return true;
        }

        protected boolean isTop()
        {
            return SaverReceiptListPresenter.this.isTop();
        }

        public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
        {
            super.onFailureSameThread(integer, statusresponse);
            markRemainingReceiptsAsSubmitted();
            if (isTop())
            {
                fetchReceipts(false, false);
            }
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (StatusResponse)obj1);
        }

        public void onSuccessSameThread(StatusResponse statusresponse)
        {
label0:
            {
label1:
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        if (mReceipt.store != null)
                        {
                            statusresponse = mReceipt.store.id;
                        } else
                        {
                            statusresponse = null;
                        }
                        if (!mIsList)
                        {
                            break label0;
                        }
                        if (mIsLastInList)
                        {
                            break label1;
                        }
                        submitNextUnconfirmedReceipts();
                    }
                    return;
                }
                SaverManager.get().syncAll(false);
                syncReceipts();
                return;
            }
            fetchReceipts(false, false);
            mActionCallbacks.onShowCompetitors(SaverReceiptListPresenter.this, mReceipt.uuid, mReceipt.tcNumber, mReceipt.localDate, statusresponse);
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((StatusResponse)obj);
        }

        protected void showDialog(int i)
        {
            Bundle bundle = new Bundle();
            if (!mIsList && !mIsLastInList)
            {
                bundle.putString("DIALOG_ARG_TC_NUMBER", mReceipt.tcNumber);
            }
            SaverReceiptListPresenter.this.showDialog(i, bundle);
        }

        protected void showDialog(int i, Bundle bundle)
        {
            if (!mIsList && !mIsLastInList)
            {
                bundle.putString("DIALOG_ARG_TC_NUMBER", mReceipt.tcNumber);
            }
            SaverReceiptListPresenter.this.showDialog(i, bundle);
        }

        public SaverCallback(Handler handler, EReceipt ereceipt, boolean flag, boolean flag1)
        {
            this$0 = SaverReceiptListPresenter.this;
            super(handler);
            mReceipt = ereceipt;
            mIsList = flag;
            mIsLastInList = flag1;
        }
    }


    private static final int DIALOG_ALREADY_SUBMITTED = 1005;
    public static final String DIALOG_ARG_TC_NUMBER = "DIALOG_ARG_TC_NUMBER";
    private static final int DIALOG_ERROR_UNKNOWN = 1;
    private static final int DIALOG_NO_CONNECTION = 3;
    private static final int DIALOG_NO_NETWORK = 0;
    private static final int DIALOG_PROGRESS = 1001;
    private static final int DIALOG_SAVER_NOT_ELIGIBLE = 1004;
    private static final int DIALOG_TC_NOT_VALID = 1002;
    private static final int DIALOG_UNKNOWN_ERROR = 1003;
    private static final int DIALOG_WEEKLY_LIMIT = 1006;
    private static final String TAG = com/walmart/android/app/saver/SaverReceiptListPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private DataSetObserver mCountObserver;
    private CharSequence mCurrentFilter;
    private EReceiptSearchManager mEReceiptSearchManager;
    private View mEmptyView;
    private final SaverReceiptFilteredListAdapter mFilteredAdapter;
    private boolean mIsSubmittingMultipleUnconfirmedReceipts;
    private final SaverReceiptListAdapter mListAdapter;
    private ListView mListView;
    private View mLoadingView;
    private ViewGroup mRootView;
    private final EReceiptScanner mScanner;
    private ViewGroup mSearchBar;
    private boolean mSignedIn;
    private int mTrackPending;
    private List mUnconfirmedReceipts;

    public SaverReceiptListPresenter(Activity activity, EReceiptScanner ereceiptscanner, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mScanner = ereceiptscanner;
        mActionCallbacks = actioncallbacks;
        mListAdapter = new SaverReceiptListAdapter(mActivity);
        mFilteredAdapter = new SaverReceiptFilteredListAdapter(mActivity);
        updatePresenterTitle();
    }

    private void checkHasSaverData()
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null && appconfig.saverManualSubmit)
        {
            mListAdapter.setHasSaverData(SaverManager.get().isLastSaverSyncSuccess());
        }
    }

    private void fetchReceipts(final boolean sendPendingTrackEvent, final boolean hideLoading)
    {
        SaverManager.get().getAllReceipts(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverReceiptListPresenter this$0;
            final boolean val$hideLoading;
            final boolean val$sendPendingTrackEvent;

            public void onResult(Cursor cursor)
            {
                if (!isPopped())
                {
                    mListAdapter.changeCursor(cursor);
                    if (hideLoading)
                    {
                        hideLoadingView();
                    }
                    if (sendPendingTrackEvent)
                    {
                        SaverReceiptListPresenter.this.sendPendingTrackEvent();
                    }
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((Cursor)obj);
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                hideLoading = flag;
                sendPendingTrackEvent = flag1;
                super();
            }
        });
        filterReceipt();
    }

    private void filterReceipt()
    {
        if (!isInListMode() && !TextUtils.isEmpty(mCurrentFilter))
        {
            final String searchQuery = mCurrentFilter.toString();
            EReceiptManager.get().filterReceipts(searchQuery, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

                final SaverReceiptListPresenter this$0;
                final String val$searchQuery;

                public void onResult(Cursor cursor)
                {
                    if (searchQuery.equals(mCurrentFilter))
                    {
                        mFilteredAdapter.setData(searchQuery, cursor);
                    }
                }

                public volatile void onResult(Object obj)
                {
                    onResult((Cursor)obj);
                }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                searchQuery = s;
                super();
            }
            });
        }
    }

    private void hideLoadingView()
    {
        ViewUtil.setTextHideIfEmpty(0x7f1005d2, mLoadingView, null);
        mLoadingView.setVisibility(8);
        mListAdapter.setEnabled(true);
        mFilteredAdapter.setEnabled(true);
        setViewGroupEnabled(mSearchBar, true);
    }

    private void initView(ViewGroup viewgroup)
    {
        mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040157, viewgroup);
        mEmptyView = ViewUtil.findViewById(mRootView, 0x7f1004b4);
        mListView = (ListView)mRootView.findViewById(0x7f1004b3);
        mLoadingView = mRootView.findViewById(0x7f10010f);
        mSearchBar = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04017d, mListView);
        mListView.addHeaderView(mSearchBar);
        mEReceiptSearchManager = new EReceiptSearchManager(mActivity, mListView, mEmptyView);
        mEReceiptSearchManager.setUnfilteredAdapter(mListAdapter, new OnItemSingleClickListener(this) {

            final SaverReceiptListPresenter this$0;

            public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
            {
                i -= mListView.getHeaderViewsCount();
                adapterview = (Cursor)mListAdapter.getItem(i);
                if (adapterview != null)
                {
                    adapterview = SaverContractUtil.populateSaverReceipt(adapterview, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(adapterview, new SaverReceipt()));
                    if (adapterview.needsConfirmation() && mListAdapter.hasSaverData())
                    {
                        submitReceipt(adapterview);
                        return;
                    } else
                    {
                        mActionCallbacks.launchDetails(SaverReceiptListPresenter.this, ((SaverReceipt) (adapterview)).tcNumber);
                        return;
                    }
                } else
                {
                    WLog.e(SaverReceiptListPresenter.TAG, (new StringBuilder()).append("Invalid eReceipt at position ").append(i).toString());
                    return;
                }
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super(presenter);
            }
        });
        mEReceiptSearchManager.setFilteredAdapter(mFilteredAdapter, new OnItemSingleClickListener(this) {

            final SaverReceiptListPresenter this$0;

            public void onItemSingleClick(AdapterView adapterview, View view, int i, long l)
            {
                int j = mListView.getHeaderViewsCount();
                adapterview = (EReceipt)mFilteredAdapter.getItem(i - j);
                SaverManager.get().getReceipt(((EReceipt) (adapterview)).uuid, adapterview. new com.walmart.android.service.saver.SaverManager.ResultCallback() {

                    final _cls3 this$1;
                    final EReceipt val$receipt;

                    public void onResult(SaverReceipt saverreceipt)
                    {
                        if (saverreceipt.needsConfirmation() && mListAdapter.hasSaverData())
                        {
                            submitReceipt(saverreceipt);
                            return;
                        } else
                        {
                            mActionCallbacks.launchDetails(_fld0, receipt.tcNumber);
                            return;
                        }
                    }

                    public volatile void onResult(Object obj)
                    {
                        onResult((SaverReceipt)obj);
                    }

            
            {
                this$1 = final__pcls3;
                receipt = EReceipt.this;
                super();
            }
                });
                mEReceiptSearchManager.saveFocusState();
                mEReceiptSearchManager.requestSearch();
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super(presenter);
            }
        });
        mEReceiptSearchManager.setOnSearchFieldFocusedListener(new com.walmart.android.search.BasicSearchManager.OnSearchFieldFocusedListener() {

            final SaverReceiptListPresenter this$0;

            public void onFocused(boolean flag)
            {
                updatePresenterTitle();
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super();
            }
        });
        mEReceiptSearchManager.setOnFilterChangeListener(new BasicFilterManager.OnFilterChangeListener() {

            final SaverReceiptListPresenter this$0;

            public void onFilterChange(CharSequence charsequence)
            {
                mCurrentFilter = charsequence.toString();
                mFilteredAdapter.cancelSetData();
                filterReceipt();
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super();
            }
        });
        mEReceiptSearchManager.init();
        ViewUtil.findViewById(mRootView, 0x7f100108).setOnClickListener(new OnSingleClickListener(this) {

            final SaverReceiptListPresenter this$0;

            public void onSingleClick(View view)
            {
                mActionCallbacks.launchSignIn();
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super(presenter);
            }
        });
        updatePresenterTitle();
    }

    private boolean isInListMode()
    {
        return !mEReceiptSearchManager.isFilterMode();
    }

    private void markRemainingReceiptsAsSubmitted()
    {
        if (mUnconfirmedReceipts != null)
        {
            SaverReceipt saverreceipt;
            for (Iterator iterator = mUnconfirmedReceipts.iterator(); iterator.hasNext(); SaverManager.get().markAsSubmitted(saverreceipt))
            {
                saverreceipt = (SaverReceipt)iterator.next();
            }

            mUnconfirmedReceipts.clear();
        }
    }

    private void sendPendingTrackEvent()
    {
        int j;
        if (mLoadingView == null || mLoadingView.getVisibility() == 0)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        j = mListAdapter.getCount();
        j;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 132
    //                   1 139;
           goto _L1 _L2 _L3
_L1:
        String s = "Receipt - List view";
_L5:
        for (int i = 0; i < mTrackPending; i++)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s).putString("section", "Saver - Receipt").putString("subCategory", "Receipt");
            if (j > 1)
            {
                builder.putInt("receiptCount", j);
            }
            MessageBus.getBus().post(builder);
        }

        break; /* Loop/switch isn't completed */
_L2:
        s = "Receipt - No List View";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "Receipt - Single item list view";
        if (true) goto _L5; else goto _L4
_L4:
        mTrackPending = 0;
    }

    private void setViewGroupEnabled(ViewGroup viewgroup, boolean flag)
    {
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            View view = viewgroup.getChildAt(i);
            if (view instanceof ViewGroup)
            {
                setViewGroupEnabled((ViewGroup)view, flag);
            }
            view.setEnabled(flag);
        }

    }

    private void showLoadingView()
    {
        mEmptyView.setVisibility(8);
        ViewUtil.setTextHideIfEmpty(0x7f1005d2, mLoadingView, null);
        mLoadingView.setVisibility(0);
        mListAdapter.setEnabled(false);
        mFilteredAdapter.setEnabled(false);
        setViewGroupEnabled(mSearchBar, false);
    }

    private void submitNextUnconfirmedReceipts()
    {
        if (mUnconfirmedReceipts != null && !mUnconfirmedReceipts.isEmpty())
        {
            submitReceipt((SaverReceipt)mUnconfirmedReceipts.remove(0), mIsSubmittingMultipleUnconfirmedReceipts, mUnconfirmedReceipts.isEmpty());
        }
    }

    private void submitReceipt(SaverReceipt saverreceipt)
    {
        submitReceipt(saverreceipt, false, false);
    }

    private void submitReceipt(final SaverReceipt receipt, final boolean isList, final boolean isLastInList)
    {
        SaverManager.get().markAsSubmitted(receipt);
        if (!NetworkConnectivityHelper.isConnected(mActivity))
        {
            markRemainingReceiptsAsSubmitted();
            Bundle bundle = new Bundle();
            if (!isList && !isLastInList)
            {
                bundle.putString("DIALOG_ARG_TC_NUMBER", receipt.tcNumber);
            }
            showDialog(3, bundle);
            fetchReceipts(false, false);
            return;
        } else
        {
            showDialog(1001);
            Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final SaverReceiptListPresenter this$0;
                final boolean val$isLastInList;
                final boolean val$isList;
                final SaverReceipt val$receipt;

                public void onFailure(int i)
                {
                    if (isTop())
                    {
                        dismissDialog(1001);
                        fetchReceipts(false, false);
                        mActionCallbacks.launchSignIn();
                    }
                }

                public void onSuccess()
                {
                    SaverManager.get().addReceiptToSaver(receipt, "existing", new SaverCallback(new Handler(), receipt, isList, isLastInList));
                }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                receipt = saverreceipt;
                isList = flag;
                isLastInList = flag1;
                super();
            }
            });
            return;
        }
    }

    private void syncReceipts()
    {
        boolean flag = false;
        if (SaverManager.get().isSyncing(new SaverPresenterSyncCallback(this) {

        final SaverReceiptListPresenter this$0;

        protected void onSyncResult(Integer integer)
        {
            if (!isPopped())
            {
                fetchReceipts(true, true);
                checkHasSaverData();
                submitNextUnconfirmedReceipts();
            }
        }

        protected void showNoNetworkDialog()
        {
            showDialog(0);
        }

        protected void showUnknownErrorDialog()
        {
            showDialog(1);
        }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super(presenter);
            }
    }))
        {
            showLoadingView();
        } else
        {
            hideLoadingView();
            flag = true;
            checkHasSaverData();
            submitNextUnconfirmedReceipts();
        }
        fetchReceipts(flag, false);
    }

    private void updateListHeader()
    {
        if (mSignedIn)
        {
            ViewUtil.findViewById(mRootView, 0x7f100109).setVisibility(8);
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f100109).setVisibility(0);
            return;
        }
    }

    private void updateLoadingView()
    {
        ViewUtil.setTextHideIfEmpty(0x7f1005d2, mLoadingView, mActivity.getText(0x7f0904f8));
    }

    private void updatePresenterTitle()
    {
        if (isTop())
        {
            if (isInListMode())
            {
                setTitleText(mActivity.getString(0x7f090500, new Object[] {
                    Integer.valueOf(mListAdapter.getCount())
                }));
            } else
            {
                setTitleText(mActivity.getString(0x7f090504));
            }
            notifyTitleUpdated();
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

    public boolean interceptBack()
    {
        if (mEReceiptSearchManager != null)
        {
            return mEReceiptSearchManager.onBackPressed();
        } else
        {
            return super.interceptBack();
        }
    }

    void moveTo(int i)
    {
        if (mListView != null)
        {
            mListView.smoothScrollToPosition(i);
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
        if (mEReceiptSearchManager != null)
        {
            mEReceiptSearchManager.close();
        }
        if (mCountObserver != null)
        {
            mListAdapter.unregisterDataSetObserver(mCountObserver);
            mCountObserver = null;
        }
        mListAdapter.changeCursor(null);
        mRootView.removeAllViews();
        mRootView = null;
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        boolean flag;
        if (authenticationstatusevent.loggedIn || authenticationstatusevent.hasCredentials)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mSignedIn = flag;
        syncReceipts();
        updateListHeader();
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mEReceiptSearchManager.restoreFocusState();
        updatePresenterTitle();
        syncReceipts();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mCountObserver = new DataSetObserver() {

            final SaverReceiptListPresenter this$0;

            public void onChanged()
            {
                super.onChanged();
                updatePresenterTitle();
            }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                super();
            }
        };
        mListAdapter.registerDataSetObserver(mCountObserver);
        MessageBus.getBus().register(this);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mEReceiptSearchManager != null)
        {
            mEReceiptSearchManager.saveFocusState();
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = null;
        android.content.DialogInterface.OnClickListener onclicklistener = obj;
        if (getDialogArguments() != null)
        {
            onclicklistener = obj;
            if (getDialogArguments().containsKey("DIALOG_ARG_TC_NUMBER"))
            {
                final String tcNumber = getDialogArguments().getString("DIALOG_ARG_TC_NUMBER");
                onclicklistener = obj;
                if (!TextUtils.isEmpty(tcNumber))
                {
                    onclicklistener = new android.content.DialogInterface.OnClickListener() {

                        final SaverReceiptListPresenter this$0;
                        final String val$tcNumber;

                        public void onClick(DialogInterface dialoginterface, int j)
                        {
                            mActionCallbacks.launchDetails(SaverReceiptListPresenter.this, tcNumber);
                        }

            
            {
                this$0 = SaverReceiptListPresenter.this;
                tcNumber = s;
                super();
            }
                    };
                }
            }
        }
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            return DialogFactory.onCreateDialog(600, mActivity);

        case 1: // '\001'
            return DialogFactory.onCreateDialog(900, mActivity);

        case 3: // '\003'
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(0x7f090282).setNeutralButton(0x7f090292, onclicklistener).create();

        case 1001: 
        case 1002: 
        case 1003: 
        case 1004: 
        case 1005: 
        case 1006: 
            return SaverSubmitReceipt.createDialog(mActivity, getDialogArguments(), i, onclicklistener);
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (isInListMode())
        {
            menuinflater.inflate(0x7f120005, menu);
        }
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            initView(viewgroup);
        }
        if (mEReceiptSearchManager != null)
        {
            mEReceiptSearchManager.restoreFocusState();
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131756697 2131756697: default 24
    //                   2131756697 31;
           goto _L1 _L2
_L1:
        return super.onOptionsMenuItemSelected(menuitem, activity);
_L2:
        mScanner.onScan();
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPageView()
    {
        mTrackPending = mTrackPending + 1;
        sendPendingTrackEvent();
    }

    public void onReceiptsUpdatedEvent(EReceiptsUpdatedEvent ereceiptsupdatedevent)
    {
        fetchReceipts(false, false);
        updateLoadingView();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        syncReceipts();
    }

    public void onSaverDetailsUpdateEvent(SaverDetailsUpdateEvent saverdetailsupdateevent)
    {
        fetchReceipts(false, false);
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        fetchReceipts(false, false);
    }

    public void setUnconfirmedReceipts(List list)
    {
        boolean flag = true;
        mUnconfirmedReceipts = list;
        if (list.size() <= 1)
        {
            flag = false;
        }
        mIsSubmittingMultipleUnconfirmedReceipts = flag;
    }

























/*
    static CharSequence access$802(SaverReceiptListPresenter saverreceiptlistpresenter, CharSequence charsequence)
    {
        saverreceiptlistpresenter.mCurrentFilter = charsequence;
        return charsequence;
    }

*/

}
