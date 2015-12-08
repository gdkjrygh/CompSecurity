// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.events.SaverSummaryUpdateEvent;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.RedeemResponse;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import java.util.ArrayList;
import java.util.Iterator;

public class SaverRedeemPresenter extends Presenter
{
    public static interface ActionCallbacks
    {

        public abstract void onCorrectEmail();

        public abstract void onForceClose();

        public abstract void onRedeemed(int i, boolean flag, int j, boolean flag1);

        public abstract void onRegisterBluebird();
    }


    private static final int DIALOG_ERROR = 2;
    private static final int DIALOG_PROGRESS = 1;
    private final ActionCallbacks mActionCallbacks;
    private final Activity mActivity;
    private com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary mOverallSavingsSummary;
    private View mRootView;
    private boolean mTrackPending;

    public SaverRedeemPresenter(Activity activity, ActionCallbacks actioncallbacks)
    {
        mActivity = activity;
        mActionCallbacks = actioncallbacks;
        setTitleText(mActivity.getString(0x7f09051a));
    }

    private void checkSyncing()
    {
        if (SaverManager.get().isSyncing(new com.walmart.android.service.saver.SaverManager.ResultCallback() {

        final SaverRedeemPresenter this$0;

        public void onResult(Integer integer)
        {
            updateViews();
            ViewUtil.findViewById(mRootView, 0x7f10010f).setVisibility(8);
        }

        public volatile void onResult(Object obj)
        {
            onResult((Integer)obj);
        }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super();
            }
    }))
        {
            ViewUtil.findViewById(mRootView, 0x7f10010f).setVisibility(0);
            return;
        } else
        {
            updateViews();
            ViewUtil.findViewById(mRootView, 0x7f10010f).setVisibility(8);
            return;
        }
    }

    private void disableTransferButtons()
    {
        ViewUtil.findViewById(mRootView, 0x7f1004f8).setEnabled(false);
        ViewUtil.findViewById(mRootView, 0x7f1004f1).setEnabled(false);
        ViewUtil.findViewById(mRootView, 0x7f1004f5).setEnabled(false);
    }

    private com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod findMethod(String s)
    {
label0:
        {
            if (mOverallSavingsSummary == null || mOverallSavingsSummary.redeemMethods == null)
            {
                break label0;
            }
            Iterator iterator = mOverallSavingsSummary.redeemMethods.iterator();
            com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                redeemmethod = (com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod)iterator.next();
            } while (!s.equals(redeemmethod.type));
            return redeemmethod;
        }
        return null;
    }

    private com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod findPreferredMethod()
    {
        Object obj = null;
        com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod = obj;
        if (mOverallSavingsSummary != null)
        {
            redeemmethod = obj;
            if (mOverallSavingsSummary.redeemMethods != null)
            {
                redeemmethod = obj;
                if (!mOverallSavingsSummary.redeemMethods.isEmpty())
                {
                    Iterator iterator = mOverallSavingsSummary.redeemMethods.iterator();
                    do
                    {
                        redeemmethod = obj;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        redeemmethod = (com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod)iterator.next();
                    } while (!redeemmethod.preferred);
                }
            }
        }
        return redeemmethod;
    }

    private boolean isBluebirdPreferred(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod)
    {
        return redeemmethod != null && "AMEX Bluebird".equals(redeemmethod.type) && mOverallSavingsSummary.canRedeemNowAMEX;
    }

    private void sendPendingTrackEvent()
    {
        if (mOverallSavingsSummary != null && mTrackPending)
        {
            Object obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Get Money Back").putString("section", "Saver").putString("subCategory", "Savings Catcher");
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("totalRewards", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemedCents + mOverallSavingsSummary.redeemableCents));
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("redeemed", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemedCents));
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("available", TextUtils.getFormattedAmount(mOverallSavingsSummary.redeemableCents));
            MessageBus.getBus().post(obj);
            String s;
            if (mOverallSavingsSummary.hasSaverGiftCard)
            {
                if (mOverallSavingsSummary.isBlueBirdLinked())
                {
                    obj = "eGift Card Created - Linked to Bluebird";
                } else
                {
                    obj = "eGift Card Created - Bluebird not created";
                }
                s = "eGift Card";
            } else
            {
                obj = "eGift Card Not Yet Created";
                s = "Savings Catcher";
            }
            obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", ((String) (obj))).putString("section", "Saver").putString("subCategory", s);
            MessageBus.getBus().post(obj);
            mTrackPending = false;
        }
    }

    private void transferToBluebird()
    {
        showDialog(1);
        SaverManager.get().redeem(true, false, new AsyncCallbackOnThread(new Handler()) {

            final SaverRedeemPresenter this$0;

            public void onFailureSameThread(Integer integer, RedeemResponse redeemresponse)
            {
                dismissDialog(1);
                showDialog(2);
                clearSingleClickFlag();
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (RedeemResponse)obj1);
            }

            public void onSuccessSameThread(RedeemResponse redeemresponse)
            {
                dismissDialog(1);
                ActionCallbacks actioncallbacks = mActionCallbacks;
                int j = redeemresponse.redeemedTotalCents;
                int i;
                if (mOverallSavingsSummary != null)
                {
                    i = mOverallSavingsSummary.redeemedCents;
                } else
                {
                    i = -1;
                }
                actioncallbacks.onRedeemed(j, false, i, true);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((RedeemResponse)obj);
            }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(handler);
            }
        });
        MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("attemptBBtransfer"));
    }

    private void transferToGiftCard()
    {
        boolean flag = true;
        showDialog(1);
        SaverManager savermanager = SaverManager.get();
        if (mOverallSavingsSummary.hasSaverGiftCard)
        {
            flag = false;
        }
        savermanager.redeem(false, flag, new AsyncCallbackOnThread(new Handler()) {

            final SaverRedeemPresenter this$0;

            public void onFailureSameThread(Integer integer, RedeemResponse redeemresponse)
            {
                dismissDialog(1);
                showDialog(2);
                clearSingleClickFlag();
                integer = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Not able to redeem funds").putString("section", "Saver").putString("subCategory", "Error");
                MessageBus.getBus().post(integer);
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (RedeemResponse)obj1);
            }

            public void onSuccessSameThread(RedeemResponse redeemresponse)
            {
                dismissDialog(1);
                Object obj = mActionCallbacks;
                int j = redeemresponse.redeemedTotalCents;
                boolean flag1 = redeemresponse.giftCardCreated;
                int i;
                if (mOverallSavingsSummary != null)
                {
                    i = mOverallSavingsSummary.redeemedCents;
                } else
                {
                    i = -1;
                }
                ((ActionCallbacks) (obj)).onRedeemed(j, flag1, i, false);
                obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("successGiftCardTransfer")).putString("amount", TextUtils.getFormattedAmount(redeemresponse.redeemedTotalCents));
                MessageBus.getBus().post(obj);
                if (redeemresponse.giftCardCreated)
                {
                    MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("eGiftCardCreation"));
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((RedeemResponse)obj);
            }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(handler);
            }
        });
        if (!mOverallSavingsSummary.hasSaverGiftCard)
        {
            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("attemptCreateGiftCard"));
        }
    }

    private void updateGiftCardFinePrint(View view)
    {
        ViewUtil.setText(0x7f100505, view, 0x7f090516, new Object[] {
            Services.get().getAuthentication().getEmail()
        });
        ViewUtil.findViewById(view, 0x7f100506).setOnClickListener(new OnSingleClickListener(this) {

            final SaverRedeemPresenter this$0;

            public void onSingleClick(View view1)
            {
                mActionCallbacks.onCorrectEmail();
            }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
        });
    }

    private void updatePreferredMethod(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod)
    {
        if (isBluebirdPreferred(redeemmethod))
        {
            ViewUtil.findViewById(mRootView, 0x7f100509).setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f1004f7).setVisibility(8);
            ViewUtil.findViewById(mRootView, 0x7f1004f0).setVisibility(0);
            return;
        }
        if (mOverallSavingsSummary.canRedeemNowGiftCard)
        {
            ViewUtil.findViewById(mRootView, 0x7f100509).setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f1004f7).setVisibility(0);
            ViewUtil.findViewById(mRootView, 0x7f1004f0).setVisibility(8);
            return;
        } else
        {
            ViewUtil.findViewById(mRootView, 0x7f100509).setVisibility(8);
            ViewUtil.findViewById(mRootView, 0x7f1004f7).setVisibility(8);
            ViewUtil.findViewById(mRootView, 0x7f1004f0).setVisibility(8);
            return;
        }
    }

    private void updateSecondaryCard(com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod)
    {
        View view = ViewUtil.findViewById(mRootView, 0x7f1004f3);
        View view1 = ViewUtil.findViewById(mRootView, 0x7f1004f9);
        view.setOnClickListener(null);
        ViewUtil.findViewById(view, 0x7f1004f5).setOnClickListener(null);
        ViewUtil.findViewById(view1, 0x7f1004f5).setOnClickListener(null);
        if (isBluebirdPreferred(redeemmethod))
        {
            view.setVisibility(8);
            if (findMethod("eGiftCard") != null && mOverallSavingsSummary != null && mOverallSavingsSummary.canRedeemNowGiftCard)
            {
                view1.setVisibility(0);
                updateGiftCardFinePrint(view1);
                redeemmethod = (TextView)ViewUtil.findViewById(view1, 0x7f1004f5);
                if (mOverallSavingsSummary.hasSaverGiftCard)
                {
                    redeemmethod.setText(0x7f09051e);
                } else
                {
                    redeemmethod.setText(0x7f090515);
                }
                redeemmethod.setOnClickListener(new OnSingleClickListener(this) {

                    final SaverRedeemPresenter this$0;

                    public void onSingleClick(View view2)
                    {
                        transferToGiftCard();
                        disableTransferButtons();
                    }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
                });
                return;
            } else
            {
                view1.setVisibility(8);
                return;
            }
        }
        view1.setVisibility(8);
        if (mOverallSavingsSummary.isAmexRegisterEnabled() || mOverallSavingsSummary.isAmexLinkEnabled())
        {
            view.setVisibility(0);
            ViewUtil.setText(0x7f1004f5, view, 0x7f090508);
            ViewUtil.setText(0x7f1004f6, view, 0x7f090507);
            view.setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemPresenter this$0;

                public void onSingleClick(View view2)
                {
                    mActionCallbacks.onRegisterBluebird();
                }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
            });
            return;
        }
        if (findMethod("AMEX Bluebird") != null && mOverallSavingsSummary != null && mOverallSavingsSummary.canRedeemNowAMEX)
        {
            view.setVisibility(0);
            ViewUtil.setText(0x7f1004f6, view, 0x7f09051b);
            redeemmethod = (TextView)ViewUtil.findViewById(view, 0x7f1004f5);
            redeemmethod.setText(0x7f09051d);
            redeemmethod.setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemPresenter this$0;

                public void onSingleClick(View view2)
                {
                    transferToBluebird();
                    disableTransferButtons();
                }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
            });
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void updateViews()
    {
        com.walmart.android.service.saver.ReceiptsSummaryResponse.OverallSavingsSummary.RedeemMethod redeemmethod = findPreferredMethod();
        if (mOverallSavingsSummary == null || !mOverallSavingsSummary.canRedeemNow() && !mOverallSavingsSummary.isAmexRegisterEnabled() || redeemmethod == null && !mOverallSavingsSummary.canRedeemNowGiftCard)
        {
            mActionCallbacks.onForceClose();
            return;
        }
        ViewUtil.setText(0x7f100508, mRootView, 0x7f0900fc, new Object[] {
            Float.valueOf((float)mOverallSavingsSummary.redeemableCents * 0.01F)
        });
        if (mOverallSavingsSummary.hasSaverGiftCard)
        {
            ViewUtil.setText(0x7f1004f8, mRootView, 0x7f090520);
        } else
        {
            ViewUtil.setText(0x7f1004f8, mRootView, 0x7f090515);
        }
        updatePreferredMethod(redeemmethod);
        updateSecondaryCard(redeemmethod);
    }

    public View getView()
    {
        return mRootView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        checkSyncing();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            ProgressDialog progressdialog = CustomProgressDialog.create(mActivity);
            progressdialog.setCancelable(false);
            progressdialog.setCanceledOnTouchOutside(false);
            progressdialog.setMessage(mActivity.getString(0x7f0900cc));
            return progressdialog;

        case 2: // '\002'
            return (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setMessage(0x7f090517).setNeutralButton(0x7f090292, null).create();
        }
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mRootView = ViewUtil.inflate(mActivity, 0x7f040174, viewgroup, false);
            ViewUtil.findViewById(mRootView, 0x7f1004f8).setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemPresenter this$0;

                public void onSingleClick(View view)
                {
                    transferToGiftCard();
                    disableTransferButtons();
                }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
            });
            ViewUtil.findViewById(mRootView, 0x7f1004f1).setOnClickListener(new OnSingleClickListener(this) {

                final SaverRedeemPresenter this$0;

                public void onSingleClick(View view)
                {
                    transferToBluebird();
                    disableTransferButtons();
                }

            
            {
                this$0 = SaverRedeemPresenter.this;
                super(presenter);
            }
            });
            updateGiftCardFinePrint(ViewUtil.findViewById(mRootView, 0x7f1004f7));
        }
    }

    protected void onPageView()
    {
        mTrackPending = true;
        sendPendingTrackEvent();
    }

    public void onPop()
    {
        super.onPop();
        MessageBus.getBus().unregister(this);
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        checkSyncing();
    }

    public void onSaverSummaryUpdateEvent(SaverSummaryUpdateEvent saversummaryupdateevent)
    {
        mOverallSavingsSummary = saversummaryupdateevent.mOverallSavingsSummary;
        checkSyncing();
        sendPendingTrackEvent();
    }













}
