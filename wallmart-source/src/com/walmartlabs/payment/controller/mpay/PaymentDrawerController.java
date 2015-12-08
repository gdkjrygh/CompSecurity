// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.edit.PaymentMethodsController;
import com.walmartlabs.payment.controller.methods.DrawerCreditCardAdapter;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.payment.UserCardsResponse;
import com.walmartlabs.payment.view.DrawerIndicatorView;
import com.walmartlabs.payment.view.SlidingUpPanelLayout;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PaymentDrawerController
{
    public static interface Callback
    {

        public abstract void disableScan();

        public abstract void enableScan();

        public abstract void onCancel();
    }

    private class CreditCardSwitchListener
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final PaymentDrawerController this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            mIsUsingCreditCards = flag;
            mCreditCardsAdapter.setShowSelectedCard(mIsUsingCreditCards);
            updateFields();
        }

        private CreditCardSwitchListener()
        {
            this$0 = PaymentDrawerController.this;
            super();
        }

    }

    private class DrawerListener extends com.walmartlabs.payment.view.SlidingUpPanelLayout.SimplePanelSlideListener
    {

        final PaymentDrawerController this$0;

        public void onPanelCollapsed(View view)
        {
            WLog.d(PaymentDrawerController.TAG, "onPanelCollapsed");
            mDrawerTopClosedBg.setVisibility(0);
            mDrawerTopClosedFg.setVisibility(0);
            mDrawerOpen.setVisibility(8);
            updateScannerState();
        }

        public void onPanelExpanded(View view)
        {
            WLog.d(PaymentDrawerController.TAG, "onPanelExpanded");
            mDrawerTopClosedBg.setVisibility(8);
            mDrawerTopClosedFg.setVisibility(8);
            mDrawerOpen.setVisibility(0);
            mCallback.disableScan();
        }

        public void onPanelSlide(View view, float f)
        {
            mScannerFg.setAlpha(Math.max(0.0F, f));
        }

        private DrawerListener()
        {
            this$0 = PaymentDrawerController.this;
            super();
        }

    }

    private class GiftCardSwitchListener
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final PaymentDrawerController this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            mIsUsingGiftCards = flag;
            updateFields();
        }

        private GiftCardSwitchListener()
        {
            this$0 = PaymentDrawerController.this;
            super();
        }

    }


    private static final String TAG = com/walmartlabs/payment/controller/mpay/PaymentDrawerController.getSimpleName();
    private static final Map mCreditCardTypeMap;
    private final Activity mActivity;
    private TextView mAddPaymentButton;
    private View mAssociateDiscountContainer;
    private SwitchCompat mAssociateDiscountSwitch;
    private Callback mCallback;
    private TextView mCreditCardInfoViewClosed;
    private TextView mCreditCardInfoViewOpen;
    private TextView mCreditCardOrderViewClosed;
    private SwitchCompat mCreditCardSwitch;
    private final Map mCreditCardTypeStringMap = new HashMap();
    private DrawerCreditCardAdapter mCreditCardsAdapter;
    private ListRecyclerView mCreditCardsList;
    private ScrollView mCreditCardsListContainer;
    private int mDrawerHeight;
    private DrawerIndicatorView mDrawerIndicatorViewClosed;
    private DrawerIndicatorView mDrawerIndicatorViewOpen;
    private SlidingUpPanelLayout mDrawerLayout;
    private View mDrawerOpen;
    private View mDrawerTopClosedBg;
    private View mDrawerTopClosedFg;
    private TextView mGiftCardBalanceViewClosed;
    private TextView mGiftCardBalanceViewOpen;
    private TextView mGiftCardBalanceViewOpenNoSwitch;
    private TextView mGiftCardOrderViewClosed;
    private TextView mGiftCardOrderViewOpen;
    private SwitchCompat mGiftCardSwitch;
    private boolean mHasUpdatedCards;
    private boolean mIsAssociate;
    private boolean mIsUsingCreditCards;
    private boolean mIsUsingGiftCards;
    private View mLoadingView;
    private View mScannerFg;
    private String mStrCreditCardInfo;
    private String mStrCreditCardsAlways;
    private String mStrCreditCardsAvailable;
    private String mStrCreditCardsFirst;
    private String mStrCreditCardsNeverClosed;
    private String mStrCreditCardsNeverOpen;
    private String mStrCreditCardsOff;
    private String mStrCreditCardsSecond;
    private String mStrGiftCardBalance;
    private String mStrGiftCardsAlways;
    private String mStrGiftCardsFirst;
    private String mStrGiftCardsNever;
    private String mStrGiftCardsOff;

    public PaymentDrawerController(Activity activity)
    {
        mHasUpdatedCards = false;
        mIsUsingCreditCards = true;
        mIsUsingGiftCards = true;
        mIsAssociate = false;
        mActivity = activity;
        mCreditCardTypeStringMap.put("AMEX", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_amex));
        mCreditCardTypeStringMap.put("DISCOVER", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_discover));
        mCreditCardTypeStringMap.put("MASTERCARD", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_mc));
        mCreditCardTypeStringMap.put("VISA", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_visa));
        mCreditCardTypeStringMap.put("WMUSGESTORECARD", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_wm));
        mCreditCardTypeStringMap.put("WMMASTERCARD", mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_wm_mc));
    }

    private void getPaymentInfo()
    {
        mCallback.disableScan();
        MobilePayManager.get().getUserCards().addCallback(new CallbackSameThread() {

            final PaymentDrawerController this$0;

            public void onResultSameThread(Request request, Result result)
            {
                if (result.successful() && result.hasData() && !((UserCardsResponse)result.getData()).hasClientErrorMessage())
                {
                    CreditCardsModel.get().setCreditCards(((UserCardsResponse)result.getData()).getCreditCards());
                    GiftCardsModel.get().setGiftCards(true, ((UserCardsResponse)result.getData()).getGiftCards());
                    updateData();
                    WLog.d(PaymentDrawerController.TAG, "Setting gift card switch listener");
                    mGiftCardSwitch.setOnCheckedChangeListener(new GiftCardSwitchListener());
                    mCreditCardSwitch.setOnCheckedChangeListener(new CreditCardSwitchListener());
                    mAddPaymentButton.setOnClickListener(new android.view.View.OnClickListener() {

                        final _cls1 this$1;

                        public void onClick(View view)
                        {
                            PaymentMethodsController.addCard(mActivity);
                            mHasUpdatedCards = true;
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    mIsAssociate = ((UserCardsResponse)result.getData()).data.isAssociate;
                    if (!mIsAssociate)
                    {
                        mAssociateDiscountContainer.setVisibility(8);
                    }
                    mLoadingView.setVisibility(8);
                    mDrawerLayout.setPanelHeight(mDrawerHeight);
                    return;
                }
                TextView textview = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.loading_text);
                if (result.hasData() && ((UserCardsResponse)result.getData()).hasClientErrorMessage())
                {
                    request = ((UserCardsResponse)result.getData()).getClientErrorMessage();
                } else
                {
                    request = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpan_scan_error_loading);
                }
                textview.setText(request);
                ((ProgressBar)mActivity.findViewById(com.walmartlabs.android.payment.R.id.loading_progress_spinner)).setVisibility(8);
            }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
        });
    }

    private com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType getSelectedCreditCardType()
    {
        if (mCreditCardsAdapter != null)
        {
            CreditCard creditcard = mCreditCardsAdapter.getSelectedItem();
            if (creditcard != null)
            {
                return (com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType)mCreditCardTypeMap.get(creditcard.getCardType());
            }
        }
        return com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.NONE;
    }

    private void setupCreditCardList()
    {
        mCreditCardsAdapter = new DrawerCreditCardAdapter(mActivity, CreditCardsModel.get().getCreditCards());
        mCreditCardsAdapter.setSelectedItem(CreditCardsModel.get().getDefaultCard());
        mCreditCardsList.setAdapter(mCreditCardsAdapter);
        mCreditCardsList.setLayoutManager(new WrappedLinearLayoutManager(mActivity, 1, false));
        mCreditCardsList.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final PaymentDrawerController this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                mCreditCardsAdapter.setSelectedItem(i);
                updateFields();
            }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
        });
        mCreditCardsListContainer.setOnTouchListener(new android.view.View.OnTouchListener() {

            final PaymentDrawerController this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
        });
    }

    private void showNoPaymentDialog()
    {
        (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setTitle(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_alert_nopay_title)).setMessage(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_alert_nopay_msg)).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final PaymentDrawerController this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (mCallback != null)
                {
                    mCallback.onCancel();
                }
            }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
        }).setPositiveButton(com.walmartlabs.android.payment.R.string.mpay_scan_alert_nopay_add_card, new android.content.DialogInterface.OnClickListener() {

            final PaymentDrawerController this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                PaymentMethodsController.addCard(mActivity);
                mHasUpdatedCards = true;
            }

            
            {
                this$0 = PaymentDrawerController.this;
                super();
            }
        }).create().show();
    }

    private void updateCreditCardInfoString()
    {
        if (mCreditCardsAdapter != null && mCreditCardsAdapter.getItemCount() > 0)
        {
            CreditCard creditcard = mCreditCardsAdapter.getSelectedItem();
            mStrCreditCardInfo = String.format(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_info), new Object[] {
                mCreditCardTypeStringMap.get(creditcard.getCardType()), creditcard.getLastFour()
            });
        }
    }

    private void updateFields()
    {
        boolean flag1 = true;
        WLog.d(TAG, "In updateFields()");
        updateCreditCardInfoString();
        updateScannerState();
        float f;
        DrawerIndicatorView drawerindicatorview;
        com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType creditcardtype;
        boolean flag;
        if (!CreditCardsModel.get().hasCreditCards() && (!GiftCardsModel.get().hasEnabledGiftCards() || GiftCardsModel.get().getTotalBalance() <= 0.0F))
        {
            WLog.d(TAG, "No payment methods saved");
            mGiftCardOrderViewClosed.setVisibility(8);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardsNever);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsNever);
            mGiftCardBalanceViewOpen.setVisibility(8);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(8);
            mCreditCardOrderViewClosed.setVisibility(8);
            mCreditCardInfoViewClosed.setText(mStrCreditCardsNeverClosed);
            mCreditCardInfoViewOpen.setText(mStrCreditCardsNeverOpen);
            mCreditCardSwitch.setVisibility(8);
            showNoPaymentDialog();
        } else
        if (GiftCardsModel.get().hasEnabledGiftCards() && !CreditCardsModel.get().hasCreditCards())
        {
            WLog.d(TAG, "Only gift cards saved");
            mGiftCardOrderViewClosed.setVisibility(0);
            mGiftCardOrderViewClosed.setText(mStrGiftCardsAlways);
            mGiftCardBalanceViewClosed.setVisibility(0);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardBalance);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsAlways);
            mGiftCardBalanceViewOpen.setVisibility(8);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(0);
            mGiftCardBalanceViewOpenNoSwitch.setText(mStrGiftCardBalance);
            mGiftCardSwitch.setVisibility(8);
            mCreditCardOrderViewClosed.setVisibility(8);
            mCreditCardInfoViewClosed.setText(mStrCreditCardsNeverClosed);
            mCreditCardInfoViewOpen.setText(mStrCreditCardsNeverOpen);
            mCreditCardSwitch.setVisibility(8);
        } else
        if (!GiftCardsModel.get().hasEnabledGiftCards() && CreditCardsModel.get().hasCreditCards())
        {
            WLog.d(TAG, "Only credit cards saved");
            mGiftCardOrderViewClosed.setVisibility(8);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardsNever);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsNever);
            mGiftCardBalanceViewOpen.setVisibility(8);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(8);
            mCreditCardOrderViewClosed.setVisibility(0);
            mCreditCardOrderViewClosed.setText(mStrCreditCardsAlways);
            mCreditCardInfoViewClosed.setText(mStrCreditCardInfo);
            mCreditCardInfoViewOpen.setText(mStrCreditCardsAvailable);
            mCreditCardSwitch.setVisibility(8);
        } else
        if (GiftCardsModel.get().hasEnabledGiftCards() && GiftCardsModel.get().getTotalBalance() == 0.0F && CreditCardsModel.get().hasCreditCards())
        {
            WLog.d(TAG, "CC saved, GC = $0");
            mGiftCardOrderViewClosed.setVisibility(0);
            mGiftCardOrderViewClosed.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardBalance);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewOpen.setText(mStrGiftCardBalance);
            mGiftCardBalanceViewOpen.setVisibility(0);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(8);
            mCreditCardOrderViewClosed.setVisibility(0);
            mCreditCardOrderViewClosed.setText(mStrCreditCardsAvailable);
            mCreditCardInfoViewClosed.setText(mStrCreditCardInfo);
            mCreditCardSwitch.setVisibility(8);
        } else
        if (GiftCardsModel.get().hasEnabledGiftCards() && mIsUsingGiftCards && mIsUsingCreditCards)
        {
            WLog.d(TAG, "CC saved, GC saved + on");
            mGiftCardOrderViewClosed.setVisibility(0);
            mGiftCardOrderViewClosed.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardBalance);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewOpen.setVisibility(0);
            mGiftCardBalanceViewOpen.setText(mStrGiftCardBalance);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(0);
            mGiftCardSwitch.setEnabled(true);
            mGiftCardSwitch.setChecked(true);
            mCreditCardOrderViewClosed.setVisibility(0);
            mCreditCardOrderViewClosed.setText(mStrCreditCardsSecond);
            mCreditCardInfoViewClosed.setText(mStrCreditCardInfo);
            mCreditCardInfoViewOpen.setText(mStrCreditCardsAvailable);
            mCreditCardSwitch.setVisibility(0);
            mCreditCardSwitch.setChecked(true);
            mCreditCardSwitch.setEnabled(true);
        } else
        if (GiftCardsModel.get().hasEnabledGiftCards() && !mIsUsingGiftCards && CreditCardsModel.get().hasCreditCards())
        {
            WLog.d(TAG, "CC saved, GC saved + OFF");
            mGiftCardOrderViewClosed.setVisibility(0);
            mGiftCardOrderViewClosed.setText(mStrGiftCardsOff);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardBalance);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewOpen.setVisibility(0);
            mGiftCardBalanceViewOpen.setText(mStrGiftCardBalance);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(0);
            mGiftCardSwitch.setEnabled(true);
            mGiftCardSwitch.setChecked(false);
            mCreditCardOrderViewClosed.setVisibility(0);
            mCreditCardOrderViewClosed.setText(mStrCreditCardsAlways);
            mCreditCardInfoViewClosed.setText(mStrCreditCardInfo);
            mCreditCardInfoViewOpen.setText(mStrCreditCardsAvailable);
            mCreditCardSwitch.setChecked(true);
            mCreditCardSwitch.setEnabled(false);
        } else
        if (GiftCardsModel.get().hasEnabledGiftCards() && mIsUsingGiftCards && CreditCardsModel.get().hasCreditCards() && !mIsUsingCreditCards)
        {
            WLog.d(TAG, "CC saved + OFF, GC saved + ON");
            mGiftCardOrderViewClosed.setVisibility(0);
            mGiftCardOrderViewClosed.setText(mStrGiftCardsAlways);
            mGiftCardBalanceViewClosed.setText(mStrGiftCardBalance);
            mGiftCardOrderViewOpen.setText(mStrGiftCardsFirst);
            mGiftCardBalanceViewOpen.setText(mStrGiftCardBalance);
            mGiftCardBalanceViewOpen.setVisibility(0);
            mGiftCardBalanceViewOpenNoSwitch.setVisibility(8);
            mGiftCardSwitch.setVisibility(0);
            mGiftCardSwitch.setChecked(true);
            mGiftCardSwitch.setEnabled(false);
            mCreditCardInfoViewClosed.setText(mStrCreditCardsOff);
            mCreditCardOrderViewClosed.setVisibility(8);
            mCreditCardSwitch.setChecked(false);
        }
        drawerindicatorview = mDrawerIndicatorViewOpen;
        f = GiftCardsModel.get().getTotalBalance();
        if (mIsUsingGiftCards && GiftCardsModel.get().hasEnabledGiftCards())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drawerindicatorview.setGiftCard(f, flag);
        drawerindicatorview = mDrawerIndicatorViewOpen;
        creditcardtype = getSelectedCreditCardType();
        if (mIsUsingCreditCards && CreditCardsModel.get().hasCreditCards())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drawerindicatorview.setCreditCard(creditcardtype, flag);
        drawerindicatorview = mDrawerIndicatorViewClosed;
        f = GiftCardsModel.get().getTotalBalance();
        if (mIsUsingGiftCards && GiftCardsModel.get().hasEnabledGiftCards())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        drawerindicatorview.setGiftCard(f, flag);
        drawerindicatorview = mDrawerIndicatorViewClosed;
        creditcardtype = getSelectedCreditCardType();
        if (mIsUsingCreditCards && CreditCardsModel.get().hasCreditCards())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        drawerindicatorview.setCreditCard(creditcardtype, flag);
    }

    private void updateScannerState()
    {
        if (!CreditCardsModel.get().hasCreditCards() && (!GiftCardsModel.get().hasEnabledGiftCards() || GiftCardsModel.get().getTotalBalance() <= 0.0F))
        {
            mCallback.disableScan();
            return;
        } else
        {
            mCallback.enableScan();
            return;
        }
    }

    public String getCreditCardId()
    {
        if (mIsUsingCreditCards)
        {
            CreditCard creditcard = mCreditCardsAdapter.getSelectedItem();
            if (creditcard != null)
            {
                WLog.d(TAG, (new StringBuilder()).append("creditCard id = ").append(creditcard.getId()).toString());
                return creditcard.getId();
            }
        }
        return null;
    }

    public boolean hasUpdatedCards()
    {
        return mHasUpdatedCards;
    }

    public void init(Callback callback)
    {
        mCallback = callback;
        mActivity.setContentView(com.walmartlabs.android.payment.R.layout.mpay_scan);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile pay scan").putString("section", "mobile pay").putString("scan_type", "qr code"));
        mLoadingView = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_barcode_scan_loading);
        mScannerFg = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_barcode_scan_foreground);
        mDrawerLayout = (SlidingUpPanelLayout)mActivity.findViewById(com.walmartlabs.android.payment.R.id.sliding_layout);
        mDrawerLayout.setPanelSlideListener(new DrawerListener());
        mDrawerHeight = mActivity.getResources().getDimensionPixelSize(com.walmartlabs.android.payment.R.dimen.payment_drawer_closed_height);
        mDrawerLayout.setPanelHeight(0);
        mScannerFg.setAlpha(0.0F);
        mDrawerTopClosedBg = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_top_closed_bg);
        mDrawerTopClosedFg = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_top_closed_fg);
        mDrawerOpen = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_open_container);
        mDrawerIndicatorViewClosed = (DrawerIndicatorView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_drawer_icon);
        mDrawerIndicatorViewOpen = (DrawerIndicatorView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_drawer_icon_open);
        mGiftCardOrderViewClosed = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_order_closed);
        mGiftCardBalanceViewClosed = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_balance_closed);
        mGiftCardOrderViewOpen = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_order_open);
        mGiftCardBalanceViewOpen = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_balance_open);
        mGiftCardBalanceViewOpenNoSwitch = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_balance_open_noswitch);
        mGiftCardSwitch = (SwitchCompat)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_gc_switch);
        mCreditCardOrderViewClosed = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_order_closed);
        mCreditCardInfoViewClosed = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_info_closed);
        mCreditCardInfoViewOpen = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_info_open);
        mCreditCardSwitch = (SwitchCompat)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_switch);
        mAddPaymentButton = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_btn_add);
        mCreditCardsListContainer = (ScrollView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_drawer_list_container);
        mCreditCardsList = (ListRecyclerView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_drawer_list_cc);
        mAddPaymentButton = (TextView)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_cc_btn_add);
        mAssociateDiscountContainer = mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_assoc);
        mAssociateDiscountSwitch = (SwitchCompat)mActivity.findViewById(com.walmartlabs.android.payment.R.id.mpay_scan_associate_switch);
        mStrGiftCardsFirst = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_gc_first);
        mStrGiftCardsOff = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_gc_off);
        mStrGiftCardsAlways = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_gc_always);
        mStrGiftCardsNever = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_gc_never);
        mStrCreditCardsAvailable = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_available);
        mStrCreditCardsFirst = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_first);
        mStrCreditCardsSecond = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_second);
        mStrCreditCardsOff = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_off);
        mStrCreditCardsAlways = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_always);
        mStrCreditCardsNeverClosed = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_unavailable_twolines);
        mStrCreditCardsNeverOpen = mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_unavailable);
        getPaymentInfo();
    }

    public boolean isUsingAssociateDiscount()
    {
        return mIsAssociate && mAssociateDiscountSwitch.isChecked();
    }

    public boolean isUsingGiftCards()
    {
        return mIsUsingGiftCards && GiftCardsModel.get().hasEnabledGiftCards();
    }

    public void setHasUpdatedCards(boolean flag)
    {
        mHasUpdatedCards = flag;
    }

    public void updateData()
    {
        setupCreditCardList();
        mStrGiftCardBalance = String.format(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_gc_balance), new Object[] {
            NumberFormat.getCurrencyInstance(Locale.US).format(GiftCardsModel.get().getTotalBalance())
        });
        updateFields();
    }

    static 
    {
        mCreditCardTypeMap = new HashMap();
        mCreditCardTypeMap.put("AMEX", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.AMEX);
        mCreditCardTypeMap.put("DISCOVER", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.DISCOVER);
        mCreditCardTypeMap.put("MASTERCARD", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.MC);
        mCreditCardTypeMap.put("VISA", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.VISA);
        mCreditCardTypeMap.put("WMUSGESTORECARD", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.WMUSGESTORECARD);
        mCreditCardTypeMap.put("WMMASTERCARD", com.walmartlabs.payment.view.DrawerIndicatorView.CreditCardType.WMMASTERCARD);
    }















/*
    static boolean access$2202(PaymentDrawerController paymentdrawercontroller, boolean flag)
    {
        paymentdrawercontroller.mIsUsingGiftCards = flag;
        return flag;
    }

*/



/*
    static boolean access$2302(PaymentDrawerController paymentdrawercontroller, boolean flag)
    {
        paymentdrawercontroller.mIsUsingCreditCards = flag;
        return flag;
    }

*/





/*
    static boolean access$702(PaymentDrawerController paymentdrawercontroller, boolean flag)
    {
        paymentdrawercontroller.mHasUpdatedCards = flag;
        return flag;
    }

*/




/*
    static boolean access$902(PaymentDrawerController paymentdrawercontroller, boolean flag)
    {
        paymentdrawercontroller.mIsAssociate = flag;
        return flag;
    }

*/
}
