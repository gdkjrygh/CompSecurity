// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.ereceipt.EReceiptScanner;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverPresenterSyncCallback

public class SaverDashboardPresenter extends Presenter
    implements HasGetItBackBar
{
    public static interface ActionCallbacks
    {

        public abstract void launchFaq();

        public abstract void launchReceipts();

        public abstract void launchReward();

        public abstract void launchWalmartPay();

        public abstract void submitUnconfirmedReceipts();
    }


    private static final int DIALOG_ERROR_UNKNOWN = 3;
    private static final int DIALOG_NO_NETWORK = 2;
    private static final String TAG = com/walmart/android/app/saver/SaverDashboardPresenter.getSimpleName();
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private final Handler mHandler = new Handler();
    private boolean mHasLoadedHowto;
    private boolean mHasScanned;
    private boolean mMainContentIsVisible;
    private int mPendingPageviewEvents;
    private final com.walmart.android.service.saver.SaverManager.ResultCallback mResultCallback = new SaverPresenterSyncCallback(this) {

        final SaverDashboardPresenter this$0;

        protected void onSyncResult(Integer integer)
        {
            if (!isPopped())
            {
                countReceipts();
            }
        }

        protected void showNoNetworkDialog()
        {
            showDialog(2);
        }

        protected void showUnknownErrorDialog()
        {
            showDialog(3);
        }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
    };
    private final EReceiptScanner mScanner;
    private boolean mSuppressNextUnconfirmedReceiptsCheck;
    private ViewGroup mView;

    public SaverDashboardPresenter(Activity activity, EReceiptScanner ereceiptscanner, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mScanner = ereceiptscanner;
        mActionCallbacks = actioncallbacks;
        setTitleText(mActivity.getString(0x7f0904a0));
    }

    private void countAllReceipts()
    {
        SaverManager.get().getReceiptCount(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverDashboardPresenter this$0;

            public void onResult(Integer integer)
            {
                if (!isPopped())
                {
                    updateReceiptsInfo(integer.intValue());
                    updateScanButtonTexts(integer.intValue());
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((Integer)obj);
            }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
        });
    }

    private void countReceipts()
    {
        countAllReceipts();
        countUnseenReceipts();
    }

    private void countReceiptsAfterSync()
    {
        if (!SaverManager.get().isSyncing(mResultCallback))
        {
            mResultCallback.onResult(null);
        }
    }

    private void countUnseenReceipts()
    {
        SaverManager.get().getUnseenReceiptCount(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

            final SaverDashboardPresenter this$0;

            public void onResult(Integer integer)
            {
                if (!isPopped())
                {
                    ViewGroup viewgroup = mView;
                    if (integer.intValue() == 0)
                    {
                        integer = null;
                    } else
                    {
                        integer = String.valueOf(integer);
                    }
                    ViewUtil.setTextHideIfEmpty(0x7f10049d, viewgroup, integer);
                }
            }

            public volatile void onResult(Object obj)
            {
                onResult((Integer)obj);
            }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
        });
    }

    private CharSequence createQuestionText()
    {
        String s = (new StringBuilder()).append(mActivity.getText(0x7f09049c)).append(" ").toString();
        CharSequence charsequence = mActivity.getText(0x7f09049d);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        spannablestringbuilder.append(charsequence);
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final SaverDashboardPresenter this$0;

            public void onClick(View view)
            {
                mActionCallbacks.launchFaq();
            }

            public void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
        }, s.length(), s.length() + charsequence.length(), 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(mActivity.getResources().getColor(0x7f0f0109)), s.length(), s.length() + charsequence.length(), 33);
        return spannablestringbuilder;
    }

    private void removeMinHeight()
    {
        ViewUtil.findViewById(mView, 0x7f100494).setMinimumHeight(0);
    }

    private void sendPendingPageViewEvents()
    {
        if (mHasLoadedHowto && mPendingPageviewEvents > 0)
        {
            int i = 0;
            while (i < mPendingPageviewEvents) 
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView");
                Object obj;
                if (mHasScanned)
                {
                    obj = "Dashboard - Return User";
                } else
                {
                    obj = "Dashboard - New User";
                }
                obj = builder.putString("name", ((String) (obj))).putString("section", "Saver").putString("subCategory", "Dashboard");
                MessageBus.getBus().post(obj);
                i++;
            }
            mPendingPageviewEvents = 0;
        }
    }

    private void setMinBannerHeight()
    {
        View view = ViewUtil.findViewById(mView, 0x7f100494);
        view.setMinimumHeight(view.getHeight());
        view = ViewUtil.findViewById(mView, 0x7f100496);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            layoutparams.removeRule(2);
        } else
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams(layoutparams);
            layoutparams.addRule(10, -1);
            view.setLayoutParams(layoutparams);
        }
        view.requestLayout();
        view = ViewUtil.findViewById(mView, 0x7f100495);
        ((android.widget.RelativeLayout.LayoutParams)view.getLayoutParams()).addRule(3, 0x7f100496);
        view.requestLayout();
    }

    private void showAndBlock(final Dialog d)
    {
        d.setCancelable(false);
        mHandler.postDelayed(new Runnable() {

            final SaverDashboardPresenter this$0;
            final Dialog val$d;

            public void run()
            {
                d.setCancelable(true);
            }

            
            {
                this$0 = SaverDashboardPresenter.this;
                d = dialog;
                super();
            }
        }, 1000L);
        d.show();
    }

    private void updateHowSaveText(AppConfig appconfig)
    {
        int i;
        if (appconfig != null && appconfig.bluebirdEnabled)
        {
            i = 0x7f0904c3;
        } else
        {
            i = 0x7f0904c4;
        }
        ViewUtil.setText(0x7f1004a7, mView, i);
    }

    private void updateHowTo()
    {
        mHasScanned = SharedPreferencesUtil.isSaverReceiptScanned(mActivity);
        if (mHasScanned)
        {
            mMainContentIsVisible = true;
            ViewUtil.findViewById(mView, 0x7f100498).setVisibility(0);
            ViewUtil.findViewById(mView, 0x7f100495).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f100499).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f10049a).setVisibility(8);
            removeMinHeight();
        } else
        {
            ViewUtil.findViewById(mView, 0x7f100499).setVisibility(0);
            ViewUtil.findViewById(mView, 0x7f10049a).setVisibility(0);
        }
        mHasLoadedHowto = true;
        sendPendingPageViewEvents();
        updateScanButtonVisibility();
    }

    private void updateReceiptsInfo(int i)
    {
        if (i > 0 || mHasScanned)
        {
            ViewUtil.findViewById(mView, 0x7f10049b).setVisibility(0);
            ViewUtil.findViewById(mView, 0x7f10049e).setVisibility(0);
            ViewUtil.findViewById(mView, 0x7f10049f).setVisibility(0);
            ViewUtil.findViewById(mView, 0x7f1004a0).setVisibility(8);
            return;
        } else
        {
            ViewUtil.findViewById(mView, 0x7f10049b).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f10049e).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f10049f).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f1004a0).setVisibility(0);
            return;
        }
    }

    private void updateScanButtonTexts(int i)
    {
        if (i > 0 || mHasScanned)
        {
            ViewUtil.setText(0x7f100497, mView, 0x7f09049f);
            ViewUtil.setText(0x7f1004a8, mView, 0x7f09049f);
            return;
        } else
        {
            ViewUtil.setText(0x7f100497, mView, 0x7f09049a);
            ViewUtil.setText(0x7f1004a8, mView, 0x7f09049a);
            return;
        }
    }

    private void updateScanButtonVisibility()
    {
        if (ViewUtil.findViewById(mView, 0x7f100499).getVisibility() == 0)
        {
            ViewUtil.findViewById(mView, 0x7f1004a8).setVisibility(0);
            return;
        } else
        {
            ViewUtil.findViewById(mView, 0x7f1004a8).setVisibility(8);
            return;
        }
    }

    protected void checkForUnconfirmedReceipts()
    {
        if (mSuppressNextUnconfirmedReceiptsCheck)
        {
            mSuppressNextUnconfirmedReceiptsCheck = false;
        } else
        {
            final List receipts = SaverManager.get().getUnconfirmedReceipts();
            if (receipts != null && !receipts.isEmpty())
            {
                com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
                builder.setMessage(0x7f0904a5).setNegativeButton(0x7f0904a6, new android.content.DialogInterface.OnClickListener() {

                    final SaverDashboardPresenter this$0;
                    final List val$receipts;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        SaverManager.get().markAsNotified(receipts);
                    }

            
            {
                this$0 = SaverDashboardPresenter.this;
                receipts = list;
                super();
            }
                }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                    final SaverDashboardPresenter this$0;
                    final List val$receipts;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        SaverManager.get().markAsNotified(receipts);
                    }

            
            {
                this$0 = SaverDashboardPresenter.this;
                receipts = list;
                super();
            }
                }).setPositiveButton(0x7f0904a7, new android.content.DialogInterface.OnClickListener() {

                    final SaverDashboardPresenter this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        mActionCallbacks.submitUnconfirmedReceipts();
                    }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
                });
                showAndBlock(builder.create());
                return;
            }
            if (MobilePayManager.get().isMobilePayAvailable() && !MobilePayPreferences.hasAnnouncedInSaver(mActivity))
            {
                MobilePayManager.get().getUserInfo(new com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface() {

                    final SaverDashboardPresenter this$0;

                    public void onGetUserInfo(boolean flag)
                    {
                        if (!flag && isTop())
                        {
                            com.walmart.android.ui.dialog.AlertDialog.Builder builder1 = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
                            builder1.setView(ViewUtil.inflate(mActivity, 0x7f0400ae, mView, false)).setNeutralButton(0x7f0901ff, new android.content.DialogInterface.OnClickListener() {

                                final _cls15 this$1;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    mActionCallbacks.launchWalmartPay();
                                }

            
            {
                this$1 = _cls15.this;
                super();
            }
                            });
                            showAndBlock(builder1.create());
                            MobilePayPreferences.setAnnouncedInSaver(mActivity, true);
                        }
                    }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
                });
                return;
            }
        }
    }

    public int getRedeemLimit()
    {
        return 50;
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        countReceipts();
        countReceiptsAfterSync();
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 2: // '\002'
            return DialogFactory.onCreateDialog(600, mActivity);

        case 3: // '\003'
            return DialogFactory.onCreateDialog(900, mActivity);
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mView == null)
        {
            mView = (ViewGroup)mActivity.getLayoutInflater().inflate(0x7f040152, viewgroup, false);
            mMainContentIsVisible = false;
            ViewUtil.findViewById(mView, 0x7f100497).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                public void onSingleClick(View view)
                {
                    mScanner.onScan();
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mView, 0x7f1004a8).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                public void onSingleClick(View view)
                {
                    mScanner.onScan();
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mView, 0x7f10049b).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                public void onSingleClick(View view)
                {
                    mActionCallbacks.launchReceipts();
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mView, 0x7f10049e).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                public void onSingleClick(View view)
                {
                    mActionCallbacks.launchReward();
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mView, 0x7f10049f).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                public void onSingleClick(View view)
                {
                    mActionCallbacks.launchFaq();
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            viewgroup = (TextView)ViewUtil.findViewById(mView, 0x7f1004a0);
            viewgroup.setText(createQuestionText());
            viewgroup.setMovementMethod(WalmartLinkMovementMethod.getInstance(mActivity));
            mView.setOnTouchListener(new android.view.View.OnTouchListener() {

                private float mInitialY;
                final SaverDashboardPresenter this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 2: default 32
                //                               0 34
                //                               1 32
                //                               2 44;
                       goto _L1 _L2 _L1 _L3
_L1:
                    return false;
_L2:
                    mInitialY = motionevent.getY();
                    return false;
_L3:
                    if (motionevent.getY() - mInitialY < 0.0F)
                    {
                        if (!mMainContentIsVisible)
                        {
                            setMinBannerHeight();
                            ViewUtil.findViewById(mView, 0x7f100498).setVisibility(0);
                            mMainContentIsVisible = true;
                        }
                        mView.setOnTouchListener(null);
                        return false;
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
            });
            ViewUtil.findViewById(mView, 0x7f100495).setOnClickListener(new OnSingleClickListener(this) {

                final SaverDashboardPresenter this$0;

                private void scrollToContent()
                {
                    ScrollView scrollview = (ScrollView)mView;
                    scrollview.post(scrollview. new Runnable() {

                        final _cls8 this$1;
                        final ScrollView val$scrollView;

                        public void run()
                        {
                            int i = ViewUtil.findViewById(mView, 0x7f100494).getHeight();
                            scrollView.smoothScrollTo(0, i);
                        }

            
            {
                this$1 = final__pcls8;
                scrollView = ScrollView.this;
                super();
            }
                    });
                }

                public void onSingleClick(View view)
                {
                    if (!mMainContentIsVisible)
                    {
                        setMinBannerHeight();
                        mView.post(new Runnable() {

                            final _cls8 this$1;

                            public void run()
                            {
                                ViewUtil.findViewById(mView, 0x7f100498).setVisibility(0);
                                scrollToContent();
                                mMainContentIsVisible = true;
                            }

            
            {
                this$1 = _cls8.this;
                super();
            }
                        });
                        return;
                    } else
                    {
                        scrollToContent();
                        return;
                    }
                }


            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }
            });
            updateHowSaveText(AppConfigManager.get().getAppConfig());
            updateHowTo();
            updateReceiptsInfo(-1);
            updateScanButtonTexts(-1);
        }
    }

    public void onEReceiptsUpdatedEvent(EReceiptsUpdatedEvent ereceiptsupdatedevent)
    {
        countReceipts();
    }

    public void onNewAppConfigReceived(AppConfig appconfig)
    {
        updateHowSaveText(appconfig);
    }

    protected void onPageView()
    {
        mPendingPageviewEvents = mPendingPageviewEvents + 1;
        sendPendingPageViewEvents();
        checkForUnconfirmedReceipts();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        updateHowTo();
        countReceipts();
        countReceiptsAfterSync();
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        countReceipts();
    }

    public void suppressNextUnconfirmedReceiptsCheck()
    {
        mSuppressNextUnconfirmedReceiptsCheck = true;
    }












/*
    static boolean access$502(SaverDashboardPresenter saverdashboardpresenter, boolean flag)
    {
        saverdashboardpresenter.mMainContentIsVisible = flag;
        return flag;
    }

*/



}
