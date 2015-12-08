// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;

public class SaverRedeemBluebirdPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void onBrowserLink(Uri uri);

        public abstract void onForceClose();
    }


    private static final String QUERY_PARAM_CLIENT_KEY = "scClient";
    private static final String QUERY_PARAM_CLIENT_VALUE = "nativeAndroid";
    private static final String QUERY_PARAM_LINK_FAIL_KEY = "onLinkingFailureURL";
    private static final String QUERY_PARAM_LINK_SUCCESS_KEY = "onLinkingSuccessURL";
    private static final String QUERY_PARAM_REGISTRATION_KEY = "onRegistrationCompleteURL";
    private ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private Button mBluebirdCreateBtn;
    private Button mBluebirdTransferBtn;
    private com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary mOverallSavingsSummary;
    private View mRootView;

    public SaverRedeemBluebirdPresenter(Activity activity)
    {
        mActivity = activity;
        setTitleText(mActivity.getString(0x7f09048a));
    }

    private void trackBlueBirdSitePageView()
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Bluebird site").putString("section", "Saver").putString("subCategory", "Bluebird"));
    }

    private void updateViews()
    {
        if (mOverallSavingsSummary != null)
        {
            if (mBluebirdCreateBtn != null)
            {
                mBluebirdCreateBtn.setEnabled(mOverallSavingsSummary.isAmexRegisterEnabled());
            }
            if (mBluebirdTransferBtn != null)
            {
                mBluebirdTransferBtn.setEnabled(mOverallSavingsSummary.isAmexLinkEnabled());
            }
        }
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040175, viewgroup, false);
        }
        mBluebirdCreateBtn = (Button)ViewUtil.findViewById(mRootView, 0x7f10050b);
        mBluebirdCreateBtn.setOnClickListener(new OnSingleClickListener(this) {

            final SaverRedeemBluebirdPresenter this$0;

            public void onSingleClick(View view)
            {
                if (mActionCallbacks != null && mOverallSavingsSummary != null && mOverallSavingsSummary.isAmexRegisterEnabled())
                {
                    view = Uri.parse(mOverallSavingsSummary.amexRegisterUrl).buildUpon();
                    view.appendQueryParameter("scClient", "nativeAndroid");
                    view.appendQueryParameter("onRegistrationCompleteURL", SaverUtils.createBluebirdRegistrationCallbackUrl(mActivity));
                    mActionCallbacks.onBrowserLink(view.build());
                    trackBlueBirdSitePageView();
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("attemptBbcard"));
                }
            }

            
            {
                this$0 = SaverRedeemBluebirdPresenter.this;
                super(presenter);
            }
        });
        mBluebirdTransferBtn = (Button)ViewUtil.findViewById(mRootView, 0x7f10050c);
        mBluebirdTransferBtn.setOnClickListener(new OnSingleClickListener(this) {

            final SaverRedeemBluebirdPresenter this$0;

            public void onSingleClick(View view)
            {
                if (mActionCallbacks != null && mOverallSavingsSummary != null && mOverallSavingsSummary.isAmexLinkEnabled())
                {
                    SharedPreferencesUtil.setSaverAmountRedeemed(mActivity, mOverallSavingsSummary.redeemedCents, mOverallSavingsSummary.redeemableCents, mOverallSavingsSummary.bluebirdRedeemableCents);
                    view = Uri.parse(mOverallSavingsSummary.amexLinkUrl).buildUpon();
                    view.appendQueryParameter("scClient", "nativeAndroid");
                    view.appendQueryParameter("onLinkingSuccessURL", SaverUtils.createBluebirdLinkSuccessCallbackUrl(mActivity));
                    view.appendQueryParameter("onLinkingFailureURL", SaverUtils.createBluebirdLinkFailureCallbackUrl(mActivity));
                    mActionCallbacks.onBrowserLink(view.build());
                    trackBlueBirdSitePageView();
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("bluebirdSignin"));
                }
            }

            
            {
                this$0 = SaverRedeemBluebirdPresenter.this;
                super(presenter);
            }
        });
        ((TextView)ViewUtil.findViewById(mRootView, 0x7f10050a)).setOnClickListener(new android.view.View.OnClickListener() {

            final SaverRedeemBluebirdPresenter this$0;

            public void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(mActivity.getString(0x7f09048b)));
                if (view.resolveActivity(mActivity.getPackageManager()) != null)
                {
                    mActivity.startActivity(view);
                    trackBlueBirdSitePageView();
                }
            }

            
            {
                this$0 = SaverRedeemBluebirdPresenter.this;
                super();
            }
        });
        updateViews();
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Bluebird SignIn/Up").putString("section", "Saver").putString("subCategory", "Bluebird");
        MessageBus.getBus().post(builder);
    }

    public void onPop()
    {
        super.onPop();
        MessageBus.getBus().unregister(this);
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        mOverallSavingsSummary = saversummaryupdateevent.mOverallSavingsSummary;
        if (mOverallSavingsSummary != null && !mOverallSavingsSummary.isAmexRegisterEnabled() && !mOverallSavingsSummary.isAmexLinkEnabled())
        {
            if (mActionCallbacks != null)
            {
                mActionCallbacks.onForceClose();
            } else
            {
                pop();
            }
        }
        if (!isPopped())
        {
            updateViews();
        }
    }

    public void setActionCallbacks(ActionCallbacks actioncallbacks)
    {
        mActionCallbacks = actioncallbacks;
    }




}
