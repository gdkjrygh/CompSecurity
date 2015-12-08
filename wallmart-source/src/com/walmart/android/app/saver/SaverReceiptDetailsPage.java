// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;
import com.walmartlabs.utils.WLog;
import com.walmartlabs.utils.WordUtils;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemListAdapter

public class SaverReceiptDetailsPage
{
    public static interface ActionCallbacks
    {

        public abstract void onAddressClicked(int i);

        public abstract void onItemClicked(SaverReceipt saverreceipt, com.walmart.android.service.saver.SaverReceipt.Item item);
    }


    private static final String TAG = com/walmart/android/app/saver/SaverReceiptDetailsPage.getSimpleName();
    private static final SimpleDateFormat sFormattedDate;
    private static final DecimalFormat sFormatter = new DecimalFormat("$#,##0.00;($#,##0.00)");
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private View mAddressView;
    private boolean mBlocked;
    private boolean mCanceled;
    private View mDetailProgress;
    private View mFooterView;
    private ListView mItemList;
    private final SaverReceiptItemListAdapter mItemListAdapter;
    private final SaverReceipt mReceipt;
    private ViewGroup mRootView;
    private View mSaverView;
    private List mTaxes;
    private List mTenders;

    public SaverReceiptDetailsPage(Activity activity, SaverReceipt saverreceipt, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mActionCallbacks = actioncallbacks;
        mReceipt = saverreceipt;
        mItemListAdapter = new SaverReceiptItemListAdapter(mActivity);
    }

    private View createSummaryItem(ViewGroup viewgroup, String s, String s1, boolean flag)
    {
        View view = ViewUtil.inflate(mActivity, 0x7f040050, viewgroup, false);
        setSummaryItem(view, s, s1, flag);
        viewgroup.addView(view);
        return view;
    }

    private void fetchReceiptData()
    {
        mItemListAdapter.setShowSaverInfo(isReceiptProcessed());
        if (mReceipt.hasSummary && mReceipt.hasDetails)
        {
            getReceiptItems(false);
        } else
        if (mReceipt.hasSummary && !mReceipt.hasDetails && mReceipt.serverState != null)
        {
            SaverManager.get().getSaverReceiptDetails(mReceipt, new AsyncCallbackOnThread(new Handler()) {

                final SaverReceiptDetailsPage this$0;

                public void onFailureSameThread(Integer integer, com.walmart.android.service.saver.SaverReceiptResponse.Payload payload)
                {
                    onSuccessSameThread(payload);
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (com.walmart.android.service.saver.SaverReceiptResponse.Payload)obj1);
                }

                public void onSuccessSameThread(com.walmart.android.service.saver.SaverReceiptResponse.Payload payload)
                {
                    if (!isCanceled())
                    {
                        if (payload != null && payload.processedDetails != null)
                        {
                            mReceipt.totalTaxBack = payload.processedDetails.getItBackTaxComponentCents.intValue();
                            mReceipt.totalBack = payload.processedDetails.totalGetItBackCents.intValue();
                            mReceipt.hasDetails = true;
                        }
                        mItemListAdapter.setShowSaverInfo(isReceiptProcessed());
                        getReceiptItems(false);
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((com.walmart.android.service.saver.SaverReceiptResponse.Payload)obj);
                }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super(handler);
            }
            });
        } else
        {
            getReceiptItems(false);
        }
        EReceiptManager.get().getReceiptTax(mReceipt.rowId, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

            final SaverReceiptDetailsPage this$0;

            public volatile void onResult(Object obj)
            {
                onResult((List)obj);
            }

            public void onResult(List list)
            {
                if (!isCanceled())
                {
                    mTaxes = list;
                    updateListSummary();
                }
            }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super();
            }
        });
        EReceiptManager.get().getReceiptTender(mReceipt.rowId, new com.walmartlabs.ereceipt.service.EReceiptManager.ResultCallback() {

            final SaverReceiptDetailsPage this$0;

            public volatile void onResult(Object obj)
            {
                onResult((List)obj);
            }

            public void onResult(List list)
            {
                if (!isCanceled())
                {
                    mTenders = list;
                    updateListSummary();
                }
            }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super();
            }
        });
    }

    private static String getAmountString(int i)
    {
        return sFormatter.format((float)i * 0.01F);
    }

    private void getReceiptItems(final boolean onlyUpdateItems)
    {
        SaverManager.get().getReceiptItems(mReceipt.rowId, mReceipt.tcNumber, mReceipt.localDate, isReceiptProcessed(), new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverReceiptDetailsPage this$0;
            final boolean val$onlyUpdateItems;

            public volatile void onResult(Object obj)
            {
                onResult((List)obj);
            }

            public void onResult(List list)
            {
                if (!isCanceled())
                {
                    if (!onlyUpdateItems)
                    {
                        lookupItems(list);
                    }
                    mItemListAdapter.setItems(list);
                    if (!onlyUpdateItems)
                    {
                        updateReceiptContent();
                    }
                }
            }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                onlyUpdateItems = flag;
                super();
            }
        });
    }

    private void hideReceiptProgress()
    {
        mDetailProgress.setVisibility(8);
    }

    private void initList()
    {
        mItemList = (ListView)ViewUtil.findViewById(mRootView, 0x7f1004d9);
        mFooterView = ViewUtil.inflate(mActivity, 0x7f04016b);
        mItemList.addFooterView(mFooterView, null, false);
        mItemList.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SaverReceiptDetailsPage this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                i -= mItemList.getHeaderViewsCount();
                adapterview = (com.walmart.android.service.saver.SaverReceipt.Item)mItemListAdapter.getItem(i);
                if (adapterview != null)
                {
                    mActionCallbacks.onItemClicked(mReceipt, adapterview);
                    return;
                } else
                {
                    WLog.e(SaverReceiptDetailsPage.TAG, (new StringBuilder()).append("Invalid item at position ").append(i).toString());
                    return;
                }
            }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super();
            }
        });
    }

    private boolean isBlocked()
    {
        return mBlocked;
    }

    private boolean isCanceled()
    {
        return mCanceled;
    }

    private boolean isReceiptProcessed()
    {
        return mReceipt.hasSummary && mReceipt.hasDetails && com.walmart.android.service.saver.SaverContract.SaverState.isProcessed(mReceipt.state);
    }

    private void lookupItems(List list)
    {
        if (!list.isEmpty())
        {
            EReceiptManager.get().lookupStoreItems(list, new AsyncCallbackOnThread(new Handler()) {

                final SaverReceiptDetailsPage this$0;

                public void onFailureSameThread(Integer integer, Boolean boolean1)
                {
                    WLog.w(SaverReceiptDetailsPage.TAG, (new StringBuilder()).append("Failed to lookup store items, error: ").append(integer).toString());
                }

                public volatile void onFailureSameThread(Object obj, Object obj1)
                {
                    onFailureSameThread((Integer)obj, (Boolean)obj1);
                }

                public void onSuccessSameThread(Boolean boolean1)
                {
                    if (boolean1.booleanValue())
                    {
                        getReceiptItems(true);
                    }
                }

                public volatile void onSuccessSameThread(Object obj)
                {
                    onSuccessSameThread((Boolean)obj);
                }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super(handler);
            }
            });
        }
    }

    private void setSummaryItem(View view, String s, String s1, boolean flag)
    {
        TextView textview = (TextView)ViewUtil.findViewById(view, 0x7f100114);
        TextView textview1 = (TextView)ViewUtil.findViewById(view, 0x7f100115);
        if (flag)
        {
            view.setBackgroundResource(0x7f0202b6);
            textview.setTextColor(mActivity.getResources().getColor(0x7f0f0011));
            textview1.setTextColor(mActivity.getResources().getColor(0x7f0f0011));
        }
        textview.setText(s);
        textview1.setText(s1);
    }

    private void updateAddressHeader()
    {
        mAddressView = ViewUtil.inflate(mActivity, 0x7f040169, mItemList, false);
        ViewUtil.findViewById(mAddressView, 0x7f1000ef).setOnClickListener(new android.view.View.OnClickListener() {

            final SaverReceiptDetailsPage this$0;

            public void onClick(View view)
            {
                if (mReceipt == null || mReceipt.store == null)
                {
                    break MISSING_BLOCK_LABEL_53;
                }
                int i = Integer.parseInt(mReceipt.store.id);
                mActionCallbacks.onAddressClicked(i);
                return;
                view;
            }

            
            {
                this$0 = SaverReceiptDetailsPage.this;
                super();
            }
        });
        String s;
        try
        {
            ViewUtil.setText(0x7f1000ee, mAddressView, sFormattedDate.format(EReceiptsContractUtil.LOCAL_DATE_FORMAT.parse(mReceipt.localDate)));
        }
        catch (ParseException parseexception)
        {
            WLog.e(TAG, (new StringBuilder()).append("Could not parse local date ").append(mReceipt.localDate).toString(), parseexception);
        }
        if (mReceipt.uuid == null)
        {
            ViewUtil.findViewById(mAddressView, 0x7f1000f0).setVisibility(8);
            ViewUtil.findViewById(mAddressView, 0x7f1000f1).setVisibility(8);
            ViewUtil.findViewById(mAddressView, 0x7f1004e5).setVisibility(8);
        } else
        {
            ViewUtil.setText(0x7f1000f0, mAddressView, mActivity.getResources().getQuantityString(0x7f110003, mReceipt.itemsSold, new Object[] {
                Integer.valueOf(mReceipt.itemsSold)
            }));
            ViewUtil.setText(0x7f1000f1, mAddressView, mActivity.getString(0x7f0900fc, new Object[] {
                Float.valueOf(mReceipt.getPriceInDollar())
            }));
            ViewUtil.findViewById(mAddressView, 0x7f1000f0).setVisibility(0);
            ViewUtil.findViewById(mAddressView, 0x7f1000f1).setVisibility(0);
            ViewUtil.findViewById(mAddressView, 0x7f1004e5).setVisibility(0);
        }
        s = mReceipt.getFormattedAddressLine();
        ViewUtil.setTextHideIfEmpty(0x7f1000ef, mAddressView, s);
    }

    private boolean updateAlreadySubmittedHeader()
    {
        return updateHeader(0x7f0904ec, 0x7f0904df, 8, 8, 8, 0x7f0202b5);
    }

    private boolean updateCreditFoundHeader()
    {
        boolean flag = false;
        if (updateHeader(0x7f0904ea, -1, 0, 0, 0, 0x7f02004c))
        {
            ViewUtil.setText(0x7f1004e9, mSaverView, mActivity.getResources().getQuantityString(0x7f11000c, mItemListAdapter.getLowerPricesFound(), new Object[] {
                Integer.valueOf(mItemListAdapter.getLowerPricesFound())
            }));
            ViewUtil.setText(0x7f1004ee, mSaverView, mActivity.getResources().getQuantityString(0x7f11000d, mItemListAdapter.getLowerPricesFound(), new Object[] {
                Integer.valueOf(mItemListAdapter.getLowerPricesFound())
            }));
            ViewUtil.setText(0x7f1004eb, mSaverView, 0x7f0900fc, new Object[] {
                Float.valueOf((float)(mReceipt.totalBack - mReceipt.totalTaxBack) * 0.01F)
            });
            ViewUtil.setText(0x7f1004ec, mSaverView, 0x7f0900fc, new Object[] {
                Float.valueOf((float)mReceipt.totalTaxBack * 0.01F)
            });
            ViewUtil.setText(0x7f1004ed, mSaverView, 0x7f0900fc, new Object[] {
                Float.valueOf((float)mReceipt.totalBack * 0.01F)
            });
            flag = true;
        }
        return flag;
    }

    private void updateEmptyText()
    {
        if (mReceipt.uuid != null) goto _L2; else goto _L1
_L1:
        String s;
        com.walmart.android.service.saver.SaverContract.SaverState saverstate;
        saverstate = com.walmart.android.service.saver.SaverContract.SaverState.find(mReceipt.state);
        s = null;
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig != null)
        {
            s = appconfig.saverPilotEndDate;
        }
        static class _cls8
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

        _cls8..SwitchMap.com.walmart.android.service.saver.SaverContract.SaverState[saverstate.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 95
    //                   2 95
    //                   3 87;
           goto _L3 _L4 _L4 _L5
_L3:
        int i = 0x7f0904e6;
_L7:
        mItemListAdapter.setEmptyText(i);
_L2:
        return;
_L5:
        i = 0x7f0904e9;
        continue; /* Loop/switch isn't completed */
_L4:
        if (s == null || mReceipt.localDate != null && mReceipt.localDate.compareTo(s) > 0)
        {
            i = 0x7f0904e8;
        } else
        {
            i = 0x7f0904e7;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean updateHeader(int i, int j, int k, int l, int i1, int j1)
    {
        if (mSaverView != null)
        {
            ViewUtil.setText(0x7f1004e8, mSaverView, i);
            if (j > 0)
            {
                ViewUtil.setText(0x7f1004e9, mSaverView, j);
            }
            ViewUtil.findViewById(mSaverView, 0x7f1004ea).setVisibility(k);
            ViewUtil.findViewById(mSaverView, 0x7f1004ee).setVisibility(l);
            ViewUtil.findViewById(mSaverView, 0x7f1004ef).setVisibility(i1);
            ((ImageView)ViewUtil.findViewById(mSaverView, 0x7f1004e7)).setImageResource(j1);
            return true;
        } else
        {
            return false;
        }
    }

    private void updateListHeaders()
    {
        boolean flag = updateSaverHeader();
        updateAddressHeader();
        if (flag)
        {
            mItemList.addHeaderView(mSaverView, null, false);
        }
        mItemList.addHeaderView(mAddressView, null, false);
    }

    private void updateListSummary()
    {
        ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(mFooterView, 0x7f100112);
        viewgroup.removeAllViews();
        if (mReceipt.uuid == null)
        {
            mFooterView.setVisibility(8);
            mItemList.removeFooterView(mFooterView);
        } else
        {
            mFooterView.setVisibility(0);
            setSummaryItem(ViewUtil.findViewById(mFooterView, 0x7f100110), mActivity.getResources().getQuantityString(0x7f110003, mReceipt.itemsSold, new Object[] {
                Integer.valueOf(mReceipt.itemsSold)
            }), getAmountString(mItemListAdapter.getItemSubtotal()), true);
            if (mReceipt.discountGiven > 0)
            {
                createSummaryItem(viewgroup, mActivity.getString(0x7f090104), getAmountString(-mReceipt.discountGiven), false);
            }
            int i = mItemListAdapter.getCouponSavings();
            if (i < 0)
            {
                createSummaryItem(viewgroup, mActivity.getString(0x7f090103), getAmountString(i), false);
            }
            if (mReceipt.subtotal > 0)
            {
                createSummaryItem(viewgroup, mActivity.getString(0x7f090105), getAmountString(mReceipt.subtotal), false);
            }
            if (mTaxes != null)
            {
                com.walmartlabs.ereceipt.service.EReceipt.Tax tax;
                for (Iterator iterator = mTaxes.iterator(); iterator.hasNext(); createSummaryItem(viewgroup, (new StringBuilder()).append(mActivity.getString(0x7f090106)).append(" ").append(tax.level).append(" ").append(tax.rateStr).append("%").toString(), getAmountString(tax.amount), false))
                {
                    tax = (com.walmartlabs.ereceipt.service.EReceipt.Tax)iterator.next();
                }

            }
            View view = createSummaryItem(viewgroup, mActivity.getString(0x7f090108), getAmountString(mReceipt.total), true);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            layoutparams.setMargins(layoutparams.leftMargin, layoutparams.topMargin + ViewUtil.dpToPixels(10, mActivity), layoutparams.rightMargin, layoutparams.bottomMargin);
            view.setLayoutParams(layoutparams);
            if (mTenders != null)
            {
                com.walmartlabs.ereceipt.service.EReceipt.Tender tender;
                for (Iterator iterator1 = mTenders.iterator(); iterator1.hasNext(); createSummaryItem(viewgroup, WordUtils.capitalizeFully(tender.name), getAmountString(-tender.amount), false))
                {
                    tender = (com.walmartlabs.ereceipt.service.EReceipt.Tender)iterator1.next();
                }

                createSummaryItem(viewgroup, mActivity.getString(0x7f090102), getAmountString(-mReceipt.changeDue), false);
                return;
            }
        }
    }

    private boolean updateNoCreditFoundHeader()
    {
        boolean flag = false;
        if (updateHeader(0x7f0904eb, 0x7f0904e0, 8, 0, 8, 0x7f02004b))
        {
            ViewUtil.setText(0x7f1004ee, mSaverView, 0x7f0904e5);
            flag = true;
        }
        return flag;
    }

    private boolean updatePreProgramHeader()
    {
        return updateHeader(0x7f0904ec, 0x7f0904e1, 8, 8, 8, 0x7f0202b5);
    }

    private boolean updateProcessingHeader()
    {
        return updateHeader(0x7f0904ed, 0x7f0904e2, 8, 8, 8, 0x7f0202b5);
    }

    private void updateReceiptContent()
    {
        hideReceiptProgress();
        if (!isBlocked())
        {
            updateListHeaders();
            updateListSummary();
            updateEmptyText();
            if (mReceipt.uuid == null)
            {
                mItemListAdapter.setItems(Collections.emptyList());
            }
            mItemList.setAdapter(mItemListAdapter);
        }
    }

    private boolean updateSaverHeader()
    {
        com.walmart.android.service.saver.SaverContract.SaverState saverstate;
label0:
        {
            mSaverView = ViewUtil.inflate(mActivity, 0x7f04016a, mItemList, false);
            com.walmart.android.service.saver.SaverContract.SaverState saverstate1 = com.walmart.android.service.saver.SaverContract.SaverState.find(mReceipt.state);
            saverstate = saverstate1;
            if (!com.walmart.android.service.saver.SaverContract.SaverState.isProcessed(mReceipt.state))
            {
                break label0;
            }
            if (mReceipt.hasSummary)
            {
                saverstate = saverstate1;
                if (mReceipt.hasDetails)
                {
                    break label0;
                }
            }
            saverstate = com.walmart.android.service.saver.SaverContract.SaverState.Unknown;
        }
        _cls8..SwitchMap.com.walmart.android.service.saver.SaverContract.SaverState[saverstate.ordinal()];
        JVM INSTR tableswitch 1 5: default 112
    //                   1 114
    //                   2 119
    //                   3 124
    //                   4 129
    //                   5 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return false;
_L2:
        return updateCreditFoundHeader();
_L3:
        return updateNoCreditFoundHeader();
_L4:
        return updateProcessingHeader();
_L5:
        if (mReceipt.uuid != null)
        {
            return updatePreProgramHeader();
        }
          goto _L1
_L6:
        if (mReceipt.reason == com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.TOO_OLD)
        {
            return updateTooOldHeader();
        }
        if (mReceipt.reason == com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.PRE_PROGRAM)
        {
            return updatePreProgramHeader();
        }
        if (mReceipt.reason == com.walmart.android.service.saver.SaverContract.SaverRejectedReasons.ALREADY_SUBMITTED)
        {
            return updateAlreadySubmittedHeader();
        } else
        {
            return updateStatusUnavailableHeader();
        }
    }

    private boolean updateStatusUnavailableHeader()
    {
        return updateHeader(0x7f0904ee, 0x7f0904e3, 8, 8, 8, 0x7f0202b5);
    }

    private boolean updateTooOldHeader()
    {
        return updateHeader(0x7f0904ec, 0x7f0904e4, 8, 8, 8, 0x7f0202b5);
    }

    public void block(boolean flag)
    {
        mBlocked = flag;
    }

    public void cancel()
    {
        mCanceled = true;
    }

    public View createView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040167, viewgroup, false);
            mDetailProgress = ViewUtil.findViewById(mRootView, 0x7f1000f2);
            initList();
            fetchReceiptData();
        }
        return mRootView;
    }

    public View getView()
    {
        return mRootView;
    }

    static 
    {
        sFormattedDate = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
    }










/*
    static List access$502(SaverReceiptDetailsPage saverreceiptdetailspage, List list)
    {
        saverreceiptdetailspage.mTaxes = list;
        return list;
    }

*/



/*
    static List access$702(SaverReceiptDetailsPage saverreceiptdetailspage, List list)
    {
        saverreceiptdetailspage.mTenders = list;
        return list;
    }

*/


}
