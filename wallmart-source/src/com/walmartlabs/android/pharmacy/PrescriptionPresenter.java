// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnItemSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.service.Prescriptions;
import com.walmartlabs.android.pharmacy.service.RefillHistory;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.ui.HistoryListWrapperAdapter;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            RefillsListAdapter, PharmacyManager, PrescriptionTabsAdapter, OrderDetailsPresenter, 
//            PharmacyResponse, ReviewOrderPresenter

public class PrescriptionPresenter extends Presenter
    implements RefillsListAdapter.CallStoreListener
{

    private static final int DIALOG_ADDING_REFILL = 1;
    private static final int DIALOG_CANNOT_CALL_MISSING_NUMBER = 4;
    private static final int DIALOG_CANNOT_CALL_RETRIEVE_FAIL = 5;
    private static final int DIALOG_NOT_ONLINE_REFILLABLE = 3;
    private static final int DIALOG_PHARMACY_LOADING = 2;
    private static final int DIALOG_SYSTEM_ERROR = 0;
    private static final int ORDER_HISTORY_TAB = 1;
    private static final int PRESCRIPTIONS_TAB = 0;
    private static final String TAG = com/walmartlabs/android/pharmacy/PrescriptionPresenter.getSimpleName();
    private static final String TAG_ORDER_HISTORY = "order_history";
    private static final String TAG_PRESCRIPTIONS = "prescriptions";
    private static boolean sHasSentHistoryCountEvent;
    private static boolean sHasSentRxCountEvent;
    private final Activity mActivity;
    private boolean mErrorIsShowing;
    private final HistoryListWrapperAdapter mHistoryListAdapter;
    private ViewGroup mHistoryView;
    private boolean mLoadingHistory;
    private boolean mLoadingRefills;
    private ViewGroup mPrescriptionsView;
    private final RefillsListAdapter mRefillsListAdapter;
    private ViewGroup mRootView;
    private TabHost mTabHost;
    private PrescriptionTabsAdapter mTabsAdapter;
    private boolean mViewOrderHistory;
    private ViewPager mViewPager;

    public PrescriptionPresenter(Activity activity)
    {
        mActivity = activity;
        setTitleText(mActivity.getString(R.string.pharmacy_my_prescriptions_title));
        mRefillsListAdapter = new RefillsListAdapter(mActivity);
        mHistoryListAdapter = new HistoryListWrapperAdapter(mActivity);
    }

    public PrescriptionPresenter(Activity activity, boolean flag)
    {
        this(activity);
        mViewOrderHistory = flag;
    }

    private View createTab(ViewGroup viewgroup, int i)
    {
        viewgroup = ViewUtil.inflate(mActivity, R.layout.pharmacy_prescriptions_tab, viewgroup);
        ((TextView)viewgroup.findViewById(R.id.tab_title)).setText(mActivity.getString(i));
        return viewgroup;
    }

    private void loadData()
    {
        loadPrescriptions();
        loadHistory();
    }

    private void loadHistory()
    {
        if (mLoadingHistory)
        {
            return;
        } else
        {
            mLoadingHistory = true;
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final PrescriptionPresenter this$0;

                public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    } else
                    {
                        showErrorDialog();
                        return;
                    }
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                }

                public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    }
                    if (pharmacyresponse != null && pharmacyresponse.data != null && ((RefillHistory)pharmacyresponse.data).refills != null)
                    {
                        mHistoryListAdapter.setItems(((RefillHistory)pharmacyresponse.data).refills);
                        if (!PrescriptionPresenter.sHasSentHistoryCountEvent)
                        {
                            pharmacyresponse = ((RefillHistory)pharmacyresponse.data).refills;
                            if (pharmacyresponse != null)
                            {
                                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmCountOrderHistory")).putInt("countRxOrderHistory", pharmacyresponse.length));
                                PrescriptionPresenter.sHasSentHistoryCountEvent = true;
                            }
                        }
                    }
                    updateLoadingVisibility(mHistoryView, true);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((PharmacyResponse)obj);
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super(handler);
            }
            };
            PharmacyManager.get().loadOrderHistory(asynccallbackonthread);
            return;
        }
    }

    private void loadPrescriptions()
    {
        if (mLoadingRefills)
        {
            return;
        } else
        {
            mLoadingRefills = true;
            AsyncCallbackOnThread asynccallbackonthread = new AsyncCallbackOnThread(new Handler()) {

                final PrescriptionPresenter this$0;

                public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    } else
                    {
                        showErrorDialog();
                        return;
                    }
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
                }

                public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
                {
                    if (isPopped())
                    {
                        return;
                    }
                    if (pharmacyresponse != null && pharmacyresponse.data != null)
                    {
                        mRefillsListAdapter.setItems(((Prescriptions)pharmacyresponse.data).prescriptions);
                        if (!PrescriptionPresenter.sHasSentRxCountEvent)
                        {
                            int j = 0;
                            pharmacyresponse = ((Prescriptions)pharmacyresponse.data).prescriptions;
                            if (pharmacyresponse != null)
                            {
                                int l = pharmacyresponse.length;
                                for (int i = 0; i < l;)
                                {
                                    int k = j;
                                    if (((com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription) (pharmacyresponse[i])).rxOnlineRefillable)
                                    {
                                        k = j + 1;
                                    }
                                    i++;
                                    j = k;
                                }

                                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmPrescriptionsCountInMyRxs")).putInt("totalCount", pharmacyresponse.length).putInt("countRefillable", j).putInt("countNotRefillable", pharmacyresponse.length - j));
                                PrescriptionPresenter.sHasSentRxCountEvent = true;
                            }
                        }
                    }
                    updateLoadingVisibility(mPrescriptionsView, true);
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((PharmacyResponse)obj);
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super(handler);
            }
            };
            PharmacyManager.get().loadPrescriptions(asynccallbackonthread);
            return;
        }
    }

    private void refillPrescription(com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription)
    {
        showDialog(1);
        PharmacyManager.get().addRefillToCart(prescription.rxNumber, prescription.storeNumber, new AsyncCallbackOnThread(prescription) {

            final PrescriptionPresenter this$0;
            final com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription val$prescription;

            public void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(1);
                if (isPopped())
                {
                    return;
                }
                if (pharmacyresponse != null)
                {
                    int i;
                    switch (pharmacyresponse.status)
                    {
                    default:
                        Log.w(PrescriptionPresenter.TAG, (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
                        PharmacyManager.get().deleteRefillFromCartSilent(prescription.rxNumber, prescription.storeNumber);
                        showDialog(0);
                        return;

                    case 1008: 
                        Log.w(PrescriptionPresenter.TAG, "Invalid RX / Store. Should not happen in this context");
                        showDialog(0);
                        return;

                    case 1071: 
                        retryRefill(prescription);
                        return;

                    case 1073: 
                    case 1074: 
                        retryRefill(prescription);
                        return;

                    case 1072: 
                        showDialog(3);
                        return;

                    case 1: // '\001'
                        i = ((Cart)pharmacyresponse.data).getStatus(prescription.rxNumber, prescription.storeNumber);
                        break;
                    }
                    if (i == 0)
                    {
                        if (((Cart)pharmacyresponse.data).canBeRefilled(prescription.rxNumber, prescription.storeNumber))
                        {
                            pharmacyresponse = new ReviewOrderPresenter(mActivity, (Cart)pharmacyresponse.data, prescription, null);
                            pushPresenter(pharmacyresponse);
                            return;
                        } else
                        {
                            PharmacyManager.get().deleteRefillFromCartSilent(prescription.rxNumber, prescription.storeNumber);
                            showDialog(3);
                            return;
                        }
                    } else
                    {
                        Log.w(PrescriptionPresenter.TAG, (new StringBuilder()).append("Unexpected cart status: ").append(i).toString());
                        PharmacyManager.get().deleteRefillFromCartSilent(prescription.rxNumber, prescription.storeNumber);
                        showDialog(0);
                        return;
                    }
                } else
                {
                    showDialog(0);
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PrescriptionPresenter.this;
                prescription = prescription1;
                super(final_handler);
            }
        });
    }

    private void retryRefill(com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription prescription)
    {
        showDialog(1);
        PharmacyManager.get().deleteCart(new AsyncCallbackOnThread(prescription) {

            final PrescriptionPresenter this$0;
            final com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription val$prescription;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                dismissDialog(1);
                if (pharmacyresponse != null && pharmacyresponse.status == 1)
                {
                    refillPrescription(prescription);
                    return;
                } else
                {
                    showDialog(0);
                    return;
                }
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((PharmacyResponse)obj);
            }

            
            {
                this$0 = PrescriptionPresenter.this;
                prescription = prescription1;
                super(final_handler);
            }
        });
    }

    private void showErrorDialog()
    {
        if (!mErrorIsShowing)
        {
            mErrorIsShowing = true;
            DialogFactory.showDialog(0x10004, mActivity, new com.walmartlabs.android.pharmacy.ui.DialogFactory.DialogListener() {

                final PrescriptionPresenter this$0;

                public void onClicked(int i, int j, Object aobj[])
                {
                    pop();
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super();
            }
            });
        }
    }

    private void updateLoadingVisibility(ViewGroup viewgroup, boolean flag)
    {
        byte byte0 = 0;
        if (flag)
        {
            byte0 = 8;
        }
        viewgroup.findViewById(R.id.loading_view).setVisibility(byte0);
    }

    public void callHomeDelivery()
    {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(PharmacyManager.get().getHomeDeliveryPhoneNumber()).toString()));
        mActivity.startActivity(intent);
    }

    public void callStore(int i)
    {
        com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final PrescriptionPresenter this$0;

            public void onFailure(int j)
            {
                dismissDialog(2);
                showDialog(5);
            }

            public void onStoresReceived(StoreData astoredata[])
            {
                dismissDialog(2);
                if (astoredata.length > 0)
                {
                    astoredata = PharmacyManager.get().getPharmacyPhoneNumber(astoredata[0]);
                    if (!TextUtils.isEmpty(astoredata))
                    {
                        astoredata = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(astoredata).toString()));
                        mActivity.startActivity(astoredata);
                        return;
                    } else
                    {
                        showDialog(4);
                        return;
                    }
                } else
                {
                    showDialog(5);
                    return;
                }
            }

            
            {
                this$0 = PrescriptionPresenter.this;
                super();
            }
        };
        showDialog(2);
        StoreService.getStoreService().getStore(i, getstorescallback);
    }

    public String getScreenName()
    {
        String s1 = "Rx:YourPrescriptions";
        String s = s1;
        if (mViewPager != null)
        {
            s = s1;
            if (mViewPager.getCurrentItem() == 1)
            {
                s = "Rx:OrderHistory";
            }
        }
        return s;
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mRefillsListAdapter.notifyDataSetChanged();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        loadData();
    }

    protected Dialog onCreateDialog(int i)
    {
        Object obj = null;
        i;
        JVM INSTR tableswitch 0 5: default 40
    //                   0 59
    //                   1 73
    //                   2 108
    //                   3 122
    //                   4 136
    //                   5 171;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        Dialog dialog = ((Dialog) (obj));
        if (obj == null)
        {
            dialog = DialogFactory.onCreateDialog(0x10004, mActivity);
        }
        return dialog;
_L2:
        obj = DialogFactory.onCreateDialog(0x10004, mActivity);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = CustomProgressDialog.create(mActivity);
        ((ProgressDialog) (obj)).setMessage(mActivity.getString(R.string.pharmacy_add_refill_to_cart));
        ((ProgressDialog) (obj)).setIndeterminate(true);
        ((ProgressDialog) (obj)).setCancelable(true);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = DialogFactory.onCreateDialog(0x10002, mActivity);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = DialogFactory.onCreateDialog(0x10001, mActivity);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_cannot_call_missing_number).setCancelable(true).setPositiveButton(R.string.ok, null).create();
        continue; /* Loop/switch isn't completed */
_L7:
        obj = (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage(R.string.pharmacy_cannot_call_retrieve_fail).setCancelable(true).setPositiveButton(R.string.ok, null).create();
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_prescriptions_content, viewgroup);
            mPrescriptionsView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_refill_content);
            viewgroup = (ListView)ViewUtil.findViewById(mPrescriptionsView, R.id.refill_list);
            mRefillsListAdapter.setCallStoreListener(this);
            viewgroup.setAdapter(mRefillsListAdapter);
            viewgroup.setEmptyView(ViewUtil.findViewById(mPrescriptionsView, R.id.empty_view));
            viewgroup.setOnItemClickListener(new OnItemSingleClickListener(this) {

                final PrescriptionPresenter this$0;

                public void onItemSingleClick(AdapterView adapterview, View view, int j, long l)
                {
label0:
                    {
                        adapterview = (com.walmartlabs.android.pharmacy.service.Prescriptions.Prescription)mRefillsListAdapter.getItem(j);
                        if (adapterview != null)
                        {
                            if (!adapterview.canBeRefilled())
                            {
                                break label0;
                            }
                            refillPrescription(adapterview);
                            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmRefillAttemptMethod")).putBoolean("loggedIn", true).putString("refillType", "historyRefill"));
                        }
                        return;
                    }
                    showDialog(3);
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super(presenter);
            }
            });
            mHistoryView = (ViewGroup)ViewUtil.inflate(mActivity, R.layout.pharmacy_history_content);
            viewgroup = (ListView)ViewUtil.findViewById(mHistoryView, R.id.order_history_list);
            viewgroup.setAdapter(mHistoryListAdapter);
            viewgroup.setEmptyView(ViewUtil.findViewById(mHistoryView, R.id.empty_view));
            viewgroup.setOnItemClickListener(new OnItemSingleClickListener(this) {

                final PrescriptionPresenter this$0;

                public void onItemSingleClick(AdapterView adapterview, View view, int j, long l)
                {
                    adapterview = (com.walmartlabs.android.pharmacy.service.RefillHistory.RxFill)mHistoryListAdapter.getItem(j);
                    if (adapterview != null)
                    {
                        pushPresenter(new OrderDetailsPresenter(mActivity, adapterview));
                    }
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super(presenter);
            }
            });
            mTabHost = (TabHost)ViewUtil.findViewById(mRootView, R.id.tabhost);
            viewgroup = (TabWidget)mRootView.findViewById(0x1020013);
            viewgroup.setStripEnabled(false);
            viewgroup.setDividerDrawable(R.drawable.pharmacy_tab_divider);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                viewgroup.setShowDividers(2);
            }
            mTabHost.setup();
            mViewPager = (ViewPager)ViewUtil.findViewById(mRootView, R.id.pager);
            mTabsAdapter = new PrescriptionTabsAdapter(mActivity, mTabHost, mViewPager);
            mTabHost.setOnTabChangedListener(mTabsAdapter);
            mViewPager.setAdapter(mTabsAdapter);
            mViewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

                final PrescriptionPresenter this$0;

                public void onPageScrollStateChanged(int j)
                {
                }

                public void onPageScrolled(int j, float f, int k)
                {
                }

                public void onPageSelected(int j)
                {
                    if (mTabsAdapter != null)
                    {
                        mTabsAdapter.onPageSelected(j);
                    }
                    String s;
                    if (j == 1)
                    {
                        s = "Rx:OrderHistory";
                    } else
                    {
                        s = "Rx:YourPrescriptions";
                    }
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s));
                }

            
            {
                this$0 = PrescriptionPresenter.this;
                super();
            }
            });
            viewgroup = mTabHost.newTabSpec("prescriptions");
            viewgroup.setIndicator(createTab(mTabHost.getTabWidget(), R.string.pharmacy_my_prescription_refill_tab));
            mTabsAdapter.addTab(viewgroup, mPrescriptionsView);
            viewgroup = mTabHost.newTabSpec("order_history");
            viewgroup.setIndicator(createTab(mTabHost.getTabWidget(), R.string.pharmacy_my_prescription_order_history_tab));
            mTabsAdapter.addTab(viewgroup, mHistoryView);
            viewgroup = mViewPager;
            int i;
            if (mViewOrderHistory)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            viewgroup.setCurrentItem(i);
        }
    }

    public void onPushed()
    {
        super.onPushed();
    }

















/*
    static boolean access$2002(boolean flag)
    {
        sHasSentRxCountEvent = flag;
        return flag;
    }

*/





/*
    static boolean access$2302(boolean flag)
    {
        sHasSentHistoryCountEvent = flag;
        return flag;
    }

*/














}
