// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.DialogFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar, SaverMerchandiseController, SaverPresenterSyncCallback

public class SaverRewardPresenter extends Presenter
    implements HasGetItBackBar
{
    public static interface ActionCallbacks
    {

        public abstract void onShowMerchandise(String s);
    }


    private static final DateFormat ACTIVE_SINCE_FORMAT = new SimpleDateFormat("MMM yyyy");
    public static final SimpleDateFormat ANALYTICS_DATE_FORMAT;
    private static final int DIALOG_ERROR_UNKNOWN = 1;
    private static final int DIALOG_NO_NETWORK = 0;
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private Date mDate;
    private final SaverMerchandiseController mMerchandiseController;
    private com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary mOverallSavingsSummary;
    private int mPendingPageViewEvents;
    private View mView;

    public SaverRewardPresenter(Activity activity, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mActionCallbacks = actioncallbacks;
        setTitleText(mActivity.getString(0x7f09052c));
        mMerchandiseController = new SaverMerchandiseController(mActivity, "SavingsCatcherDashboard", "Your Reward dollars", new SaverMerchandiseController.MerchandiseSelectedListener() {

            final SaverRewardPresenter this$0;

            public void onShowMerchandise(String s)
            {
                mActionCallbacks.onShowMerchandise(s);
            }

            
            {
                this$0 = SaverRewardPresenter.this;
                super();
            }
        });
    }

    private void checkActiveSince()
    {
        if (SaverManager.get().isSyncing(new SaverPresenterSyncCallback(this) {

        final SaverRewardPresenter this$0;

        protected void onSyncResult(Integer integer)
        {
            if (!isPopped())
            {
                SaverManager.get().getActiveSince(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

                    final _cls3 this$1;

                    public volatile void onResult(Object obj)
                    {
                        onResult((Date)obj);
                    }

                    public void onResult(Date date)
                    {
                        if (!isPopped())
                        {
                            mDate = date;
                            updateActiveSince();
                            ViewUtil.findViewById(mView, 0x7f10010f).setVisibility(8);
                            sendPendingPageViewEvent();
                        }
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
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
                this$0 = SaverRewardPresenter.this;
                super(presenter);
            }
    }))
        {
            ViewUtil.findViewById(mView, 0x7f10010f).setVisibility(0);
            return;
        } else
        {
            SaverManager.get().getActiveSince(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

                final SaverRewardPresenter this$0;

                public volatile void onResult(Object obj)
                {
                    onResult((Date)obj);
                }

                public void onResult(Date date)
                {
                    if (!isPopped())
                    {
                        mDate = date;
                        updateActiveSince();
                        ViewUtil.findViewById(mView, 0x7f10010f).setVisibility(8);
                        sendPendingPageViewEvent();
                    }
                }

            
            {
                this$0 = SaverRewardPresenter.this;
                super();
            }
            });
            return;
        }
    }

    private void sendPendingPageViewEvent()
    {
        if (mView != null && ViewUtil.findViewById(mView, 0x7f10010f).getVisibility() != 0)
        {
            for (int i = 0; i < mPendingPageViewEvents; i++)
            {
                com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Your Reward dollars").putString("section", "Saver").putString("subCategory", "Savings Catcher");
                if (mDate != null)
                {
                    builder.putString("activeSince", ANALYTICS_DATE_FORMAT.format(mDate));
                }
                if (mOverallSavingsSummary != null)
                {
                    builder.putString("totalRewards", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemedCents + mOverallSavingsSummary.redeemableCents));
                    builder.putString("redeemed", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemedCents));
                    builder.putString("available", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemableCents));
                }
                MessageBus.getBus().post(builder);
            }

            mPendingPageViewEvents = 0;
        }
    }

    private void updateActiveSince()
    {
        if (mDate != null)
        {
            String s = ACTIVE_SINCE_FORMAT.format(mDate);
            ViewUtil.setTextHideIfEmpty(0x7f10050e, mView, mActivity.getString(0x7f090522, new Object[] {
                s.toUpperCase()
            }));
            return;
        } else
        {
            mView.findViewById(0x7f10050e).setVisibility(8);
            return;
        }
    }

    private void updateSummary()
    {
        String s2 = "0.00";
        String s = "0.00";
        String s1 = "0.00";
        if (mOverallSavingsSummary != null)
        {
            s2 = String.format("%.2f", new Object[] {
                Float.valueOf((float)(mOverallSavingsSummary.redeemedCents + mOverallSavingsSummary.redeemableCents) / 100F)
            });
            s = String.format("%.2f", new Object[] {
                Float.valueOf((float)mOverallSavingsSummary.redeemableCents / 100F)
            });
            s1 = String.format("%.2f", new Object[] {
                Float.valueOf((float)mOverallSavingsSummary.redeemedCents / 100F)
            });
            if (mOverallSavingsSummary.redeemableCents > 0)
            {
                ViewUtil.setText(0x7f1004ba, mView, 0x7f090529);
            } else
            {
                ViewUtil.setText(0x7f1004ba, mView, 0x7f09052a);
            }
        }
        ViewUtil.setTextHideIfEmpty(0x7f100512, mView, (new StringBuilder()).append("$").append(s2).toString());
        ViewUtil.setTextHideIfEmpty(0x7f100518, mView, (new StringBuilder()).append("$").append(s).toString());
        ViewUtil.setTextHideIfEmpty(0x7f100516, mView, (new StringBuilder()).append("$").append(s1).toString());
        if (mOverallSavingsSummary != null)
        {
            if (mOverallSavingsSummary.redeemedCents > 0 || mOverallSavingsSummary.redeemableCents > 0)
            {
                ViewUtil.findViewById(mView, 0x7f10050d).setVisibility(0);
                ViewUtil.findViewById(mView, 0x7f10051b).setVisibility(8);
                ViewUtil.findViewById(mView, 0x7f10051a).setVisibility(8);
                return;
            } else
            {
                ViewUtil.findViewById(mView, 0x7f10050d).setVisibility(8);
                ViewUtil.findViewById(mView, 0x7f10051b).setVisibility(0);
                ViewUtil.findViewById(mView, 0x7f10051a).setVisibility(8);
                return;
            }
        } else
        {
            ViewUtil.findViewById(mView, 0x7f10050d).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f10051b).setVisibility(8);
            ViewUtil.findViewById(mView, 0x7f10051a).setVisibility(0);
            return;
        }
    }

    public int getRedeemLimit()
    {
        return 0;
    }

    public View getView()
    {
        return mView;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
        checkActiveSince();
        mMerchandiseController.loadMerchandise();
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            return DialogFactory.onCreateDialog(600, mActivity);

        case 1: // '\001'
            return DialogFactory.onCreateDialog(900, mActivity);
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mView == null)
        {
            mView = mActivity.getLayoutInflater().inflate(0x7f040176, viewgroup, false);
            viewgroup = (TextView)ViewUtil.findViewById(mView, 0x7f100519);
            viewgroup.setText(Html.fromHtml(mActivity.getString(0x7f090526)));
            viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                final SaverRewardPresenter this$0;

                public void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse(mActivity.getString(0x7f09048b)));
                    if (view.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(view);
                    }
                }

            
            {
                this$0 = SaverRewardPresenter.this;
                super();
            }
            });
        }
        mMerchandiseController.updateViews(this, mView);
        updateActiveSince();
    }

    protected void onPageView()
    {
        mPendingPageViewEvents = mPendingPageViewEvents + 1;
        sendPendingPageViewEvent();
        mMerchandiseController.pageViewed();
    }

    public void onPop()
    {
        super.onPop();
        MessageBus.getBus().unregister(this);
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        checkActiveSince();
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        mOverallSavingsSummary = saversummaryupdateevent.mOverallSavingsSummary;
        updateSummary();
        checkActiveSince();
    }

    static 
    {
        ANALYTICS_DATE_FORMAT = new SimpleDateFormat("MMyy", Locale.US);
    }




/*
    static Date access$202(SaverRewardPresenter saverrewardpresenter, Date date)
    {
        saverrewardpresenter.mDate = date;
        return date;
    }

*/





}
