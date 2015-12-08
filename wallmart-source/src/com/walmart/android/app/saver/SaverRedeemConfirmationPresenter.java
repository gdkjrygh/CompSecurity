// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.payment.service.mpay.MobilePayManager;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

public class SaverRedeemConfirmationPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void launchPayment();

        public abstract void launchWalmartPay();

        public abstract void onCorrectEmail();

        public abstract void onShowMerchandise(String s);

        public abstract void onViewReward();
    }


    private ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private final boolean mGiftCardCreated;
    private boolean mHasSentBBTransferEvent;
    private final boolean mIsBluebird;
    private SaverMerchandiseController mMerchandiseController;
    private final int mPreviousTotalRedeemCents;
    private final int mRedeemedTotal;
    private View mRootView;

    public SaverRedeemConfirmationPresenter(Activity activity, boolean flag, int i, int j, boolean flag1)
    {
        mActivity = activity;
        mGiftCardCreated = flag;
        mRedeemedTotal = i;
        mPreviousTotalRedeemCents = j;
        mIsBluebird = flag1;
        setTitleText(mActivity.getString(0x7f090511));
        if (mIsBluebird)
        {
            activity = "Bluebird transfer success";
        } else
        if (mGiftCardCreated)
        {
            activity = "eGift Card Created";
        } else
        {
            activity = "eGift Card Transfer Success";
        }
        mMerchandiseController = new SaverMerchandiseController(mActivity, "SavingsCatcherConfirmation", activity, new SaverMerchandiseController.MerchandiseSelectedListener() {

            final SaverRedeemConfirmationPresenter this$0;

            public void onShowMerchandise(String s)
            {
                mActionCallbacks.onShowMerchandise(s);
            }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super();
            }
        });
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        mMerchandiseController.loadMerchandise();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        float f;
        if (mRootView == null)
        {
            if (mIsBluebird)
            {
                mRootView = ViewUtil.inflate(mActivity, 0x7f040171, viewgroup, false);
            } else
            {
                mRootView = ViewUtil.inflate(mActivity, 0x7f040172, viewgroup, false);
            }
        }
        f = (float)mRedeemedTotal * 0.01F;
        ViewUtil.setText(0x7f1004fd, mRootView, 0x7f09050a, new Object[] {
            Float.valueOf(f)
        });
        mMerchandiseController.updateViews(this, mRootView);
        if (mIsBluebird)
        {
            ViewUtil.setText(0x7f1004fb, mRootView, 0x7f09050c);
            ViewUtil.setText(0x7f1004fc, mRootView, 0x7f090512, new Object[] {
                Float.valueOf(f)
            });
            viewgroup = (TextView)ViewUtil.findViewById(mRootView, 0x7f1004fe);
            viewgroup.setText(Html.fromHtml(mActivity.getString(0x7f090509)));
            viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

                final SaverRedeemConfirmationPresenter this$0;

                public void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse(mActivity.getString(0x7f09048b)));
                    if (view.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(view);
                        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Bluebird site").putString("section", "Saver").putString("subCategory", "Bluebird"));
                    }
                }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super();
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f1004ff).setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemConfirmationPresenter this$0;

                public void onSingleClick(View view)
                {
                    if (mActionCallbacks != null)
                    {
                        mActionCallbacks.onViewReward();
                    }
                }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super(presenter);
            }
            });
            return;
        }
        if (mGiftCardCreated)
        {
            ViewUtil.setText(0x7f1004fb, mRootView, 0x7f09050e);
            ViewUtil.findViewById(mRootView, 0x7f100500).setVisibility(8);
        } else
        {
            ViewUtil.setText(0x7f1004fb, mRootView, 0x7f090510);
            ViewUtil.findViewById(mRootView, 0x7f100500).setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemConfirmationPresenter this$0;

                public void onSingleClick(View view)
                {
                    mActionCallbacks.launchPayment();
                }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super(presenter);
            }
            });
        }
        viewgroup = Services.get().getAuthentication().getEmail();
        ViewUtil.setText(0x7f100501, mRootView, 0x7f090513, new Object[] {
            viewgroup
        });
        ViewUtil.findViewById(mRootView, 0x7f100502).setOnClickListener(new OnSingleClickListener(this) {

            final SaverRedeemConfirmationPresenter this$0;

            public void onSingleClick(View view)
            {
                mActionCallbacks.onCorrectEmail();
            }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super(presenter);
            }
        });
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            ViewUtil.findViewById(mRootView, 0x7f1004bb).setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f1004bd).setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemConfirmationPresenter this$0;

                public void onSingleClick(View view)
                {
                    mActionCallbacks.launchWalmartPay();
                }

            
            {
                this$0 = SaverRedeemConfirmationPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.setText(0x7f1004b6, mRootView, 0x7f0904d1);
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f1004bb).setVisibility(8);
            return;
        }
    }

    protected void onPageView()
    {
        Object obj;
        String s;
        if (mIsBluebird)
        {
            String s1 = "Bluebird transfer success";
            String s2 = "Bluebird";
            obj = s1;
            s = s2;
            if (!mHasSentBBTransferEvent)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("successBbcardTransfer")).putString("amount", TextUtils.getFormattedAmount(mRedeemedTotal)));
                mHasSentBBTransferEvent = true;
                s = s2;
                obj = s1;
            }
        } else
        {
            s = "eGift Card";
            if (mGiftCardCreated)
            {
                obj = "eGift Card Created";
            } else
            {
                obj = "eGift Card Transfer Success";
            }
        }
        obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", ((String) (obj))).putString("section", "Saver").putString("subCategory", s).putString("amount", TextUtils.getFormattedAmount(mRedeemedTotal)).putString("redeemed", TextUtils.getFormattedAmount(mRedeemedTotal)).putString("available", TextUtils.getFormattedAmount(0));
        if (mPreviousTotalRedeemCents >= 0)
        {
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("totalRewards", TextUtils.getFormattedAmount(mRedeemedTotal + mPreviousTotalRedeemCents));
        }
        MessageBus.getBus().post(obj);
        if (!SharedPreferencesUtil.hasShownRateAppDialog(mActivity))
        {
            SharedPreferencesUtil.setShowRateAppDialog(mActivity, true);
        }
        mMerchandiseController.pageViewed();
    }

    public void setActionCallbacks(ActionCallbacks actioncallbacks)
    {
        mActionCallbacks = actioncallbacks;
    }


}
