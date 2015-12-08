// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.PaymentNavigationUtil;
import com.walmartlabs.payment.controller.methods.CreditCardAdapter;
import com.walmartlabs.payment.controller.methods.GiftCardAdapter;
import com.walmartlabs.payment.controller.settings.MobilePaySettingsActivity;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CardResponse;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.view.VerticalSpaceItemDecoration;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.LoadingContainerView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class PaymentMethodsController
    implements com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface
{
    public static interface Callbacks
    {

        public abstract void onOpenPay();
    }


    private static final String APPLY_CC_URL = "https://www.walmart.com/instantcredit";
    private static final String TAG = com/walmartlabs/payment/controller/edit/PaymentMethodsController.getSimpleName();
    private final Activity mActivity;
    private View mApplyPayFooter;
    private View mApplyWalmartCardFooter;
    private Callbacks mCallbacks;
    private final CreditCardAdapter mCreditCardAdapter;
    private ListRecyclerView mCreditCardsList;
    private TextView mCreditCardsListHeader;
    private final GiftCardAdapter mGiftCardAdapter;
    private ListRecyclerView mGiftCardsList;
    private View mGiftCardsListHeader;
    private TextView mGiftCardsListHeaderTotal;
    private View mLandingView;
    private LoadingContainerView mLoadingView;
    private View mNoCardsView;
    private View mNoCreditCardsFooter;
    private View mNoGiftCardsFooter;
    private View mPaySetting;
    private boolean mPaySetup;
    private View mRootView;

    public PaymentMethodsController(Activity activity)
    {
        mActivity = activity;
        mGiftCardAdapter = new GiftCardAdapter(mActivity);
        mCreditCardAdapter = new CreditCardAdapter(mActivity);
    }

    public static void addCard(Context context)
    {
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new com.walmart.android.ui.CustomAlertDialog.Builder(context);
        builder.setTitle(context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_methods_choose_card_type)).setNeutralButton(com.walmartlabs.android.payment.R.string.cancel_button, new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

        }).setSingleChoiceItems(context.getResources().getStringArray(com.walmartlabs.android.payment.R.array.pm_methods_card_types), -1, new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                if (i == 0)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("paymentMethodAddCard")).putString("cardType", "credit or debit card"));
                    PaymentNavigationUtil.launchAddCreditCard(context);
                } else
                if (i == 1)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("paymentMethodAddCard")).putString("cardType", "gift card"));
                    if (GiftCardsModel.get().hasGiftCards() && GiftCardsModel.get().getAllGiftCards().size() >= 5)
                    {
                        (new com.walmart.android.ui.dialog.AlertDialog.Builder(context)).setTitle(context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_gift_card_err_max_title)).setMessage(context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_gift_card_err_max_msg)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                            final _cls8 this$0;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                            }

            
            {
                this$0 = _cls8.this;
                super();
            }
                        }).create().show();
                        return;
                    } else
                    {
                        PaymentNavigationUtil.launchAddGiftCard(context);
                        return;
                    }
                }
            }

            
            {
                context = context1;
                super();
            }
        });
        builder.show();
    }

    private void hideFooters()
    {
        mApplyPayFooter.setVisibility(8);
        if (mApplyWalmartCardFooter != null)
        {
            mApplyWalmartCardFooter.setVisibility(8);
        }
    }

    private void hidePaySettings()
    {
        mPaySetup = false;
        updatePaySettings();
    }

    private void loadAllCards()
    {
        if (mRootView != null)
        {
            mLoadingView.setLoadingState();
            PaymentServices.get().getCustomerService().getAllCards().addCallback(new CallbackSameThread() {

                final PaymentMethodsController this$0;

                public void onCancelledSameThread(Request request)
                {
                    WLog.d(PaymentMethodsController.TAG, "Cancelled request");
                }

                public void onResultSameThread(Request request, Result result)
                {
                    if (result.successful() && result.hasData() && !((CardResponse)result.getData()).hasClientErrorMessage())
                    {
                        mLoadingView.setContentState();
                        CreditCardsModel.get().setCreditCards(((CardResponse)result.getData()).getCreditCards());
                        GiftCardsModel.get().setGiftCards(((CardResponse)result.getData()).getGiftCards());
                        updateLandingView();
                        return;
                    } else
                    {
                        mLoadingView.setEmptyState();
                        return;
                    }
                }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
            });
        }
    }

    private void loadMobilePayInfo()
    {
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            MobilePayManager.get().getUserInfo(this);
            return;
        } else
        {
            updateFooters();
            return;
        }
    }

    private void setupCreditCardList()
    {
        mCreditCardsListHeader = (TextView)ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_loaded_credit_card_list_header);
        mCreditCardsList = (ListRecyclerView)ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_landing_credit_cards_list);
        mCreditCardsList.setAdapter(mCreditCardAdapter);
        mCreditCardsList.addItemDecoration(new VerticalSpaceItemDecoration(mActivity));
        mCreditCardsList.setLayoutManager(new WrappedLinearLayoutManager(mActivity, 1, false));
        mCreditCardsList.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final PaymentMethodsController this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                PaymentNavigationUtil.viewCreditCard(mActivity, mCreditCardAdapter.getItem(i));
            }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
        });
    }

    private void setupGiftCardList()
    {
        mGiftCardsListHeader = ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_loaded_gift_card_list_header);
        mGiftCardsListHeaderTotal = (TextView)ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_loaded_gift_card_list_header_total);
        mGiftCardsList = (ListRecyclerView)ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_landing_gift_cards_list);
        mGiftCardsList.setAdapter(mGiftCardAdapter);
        mGiftCardsList.addItemDecoration(new VerticalSpaceItemDecoration(mActivity));
        mGiftCardsList.setLayoutManager(new WrappedLinearLayoutManager(mActivity, 1, false));
        mGiftCardsList.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final PaymentMethodsController this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                PaymentNavigationUtil.viewGiftCard(mActivity, mGiftCardAdapter.getItem(i));
            }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
        });
    }

    private void setupNoCardsView()
    {
        mNoCardsView = ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_landing_no_cards);
        ((Button)ViewUtil.findViewById(mNoCardsView, com.walmartlabs.android.payment.R.id.pm_landing_add_payment_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final PaymentMethodsController this$0;

            public void onClick(View view)
            {
                PaymentMethodsController.addCard(mActivity);
            }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
        });
        updateNoCards();
    }

    private void setupPaySettings()
    {
        mPaySetting = ViewUtil.findViewById(mLandingView, com.walmartlabs.android.payment.R.id.pm_pay_setting);
        mPaySetting.setOnClickListener(new android.view.View.OnClickListener() {

            final PaymentMethodsController this$0;

            public void onClick(View view)
            {
                MobilePaySettingsActivity.show(mActivity);
            }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
        });
        updatePaySettings();
    }

    private void updateFooters()
    {
        if (!MobilePayManager.get().isMobilePayAvailable() || mPaySetup) goto _L2; else goto _L1
_L1:
        mApplyPayFooter.setVisibility(0);
        if (mApplyWalmartCardFooter != null)
        {
            mApplyWalmartCardFooter.setVisibility(8);
        }
_L4:
        updateLandingView();
        return;
_L2:
        mApplyPayFooter.setVisibility(8);
        if (mApplyWalmartCardFooter != null)
        {
            mApplyWalmartCardFooter.setVisibility(0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateLandingView()
    {
        if (!CreditCardsModel.get().hasCreditCards() && !GiftCardsModel.get().hasGiftCards())
        {
            break MISSING_BLOCK_LABEL_332;
        }
        mNoCardsView.setVisibility(8);
        mCreditCardsList.setVisibility(0);
        mCreditCardsListHeader.setVisibility(0);
        mGiftCardsList.setVisibility(0);
        mGiftCardsListHeader.setVisibility(0);
        mCreditCardAdapter.setCreditCards(CreditCardsModel.get().getCreditCards());
        mGiftCardAdapter.setGiftCards(GiftCardsModel.get().getAllGiftCards());
        if (CreditCardsModel.get().hasCreditCards()) goto _L2; else goto _L1
_L1:
        if (mCreditCardsList.getFooterCount() == 0)
        {
            if (mNoCreditCardsFooter == null)
            {
                mNoCreditCardsFooter = ViewUtil.inflate(mActivity, com.walmartlabs.android.payment.R.layout.pm_landing_simple_list_item);
                ((TextView)ViewUtil.findViewById(mNoCreditCardsFooter, 0x1020014)).setText(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.pm_loaded_credit_card_list_footer));
            }
            mCreditCardsList.addFooterView(mNoCreditCardsFooter);
        }
_L4:
        if (!GiftCardsModel.get().hasGiftCards())
        {
            if (mGiftCardsList.getFooterCount() == 0)
            {
                if (mNoGiftCardsFooter == null)
                {
                    mNoGiftCardsFooter = ViewUtil.inflate(mActivity, com.walmartlabs.android.payment.R.layout.pm_landing_simple_list_item);
                    ((TextView)ViewUtil.findViewById(mNoGiftCardsFooter, 0x1020014)).setText(mActivity.getResources().getString(com.walmartlabs.android.payment.R.string.pm_loaded_gift_card_list_footer));
                }
                mGiftCardsList.addFooterView(mNoGiftCardsFooter);
            }
            mGiftCardsListHeaderTotal.setVisibility(8);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (mCreditCardsList.getFooterCount() > 0)
        {
            mCreditCardsList.removeFooterView(mNoCreditCardsFooter);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mGiftCardsList.getFooterCount() > 0)
        {
            mGiftCardsList.removeFooterView(mNoGiftCardsFooter);
        }
        mGiftCardsListHeaderTotal.setVisibility(0);
        mGiftCardsListHeaderTotal.setText(NumberFormat.getCurrencyInstance(Locale.US).format(GiftCardsModel.get().getTotalAvailable()));
        return;
        mNoCardsView.setVisibility(0);
        mCreditCardsList.setVisibility(8);
        mCreditCardsListHeader.setVisibility(8);
        mGiftCardsList.setVisibility(8);
        mGiftCardsListHeader.setVisibility(8);
        mGiftCardsListHeaderTotal.setVisibility(8);
        return;
    }

    private void updateNoCards()
    {
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_landing_no_cards_title, mRootView, com.walmartlabs.android.payment.R.string.pm_landing_no_cards_title_mpay);
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_landing_no_cards_subheader, mRootView, com.walmartlabs.android.payment.R.string.pm_landing_no_cards_subheader_mpay);
            return;
        } else
        {
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_landing_no_cards_title, mRootView, com.walmartlabs.android.payment.R.string.pm_landing_no_cards_title);
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_landing_no_cards_subheader, mRootView, com.walmartlabs.android.payment.R.string.pm_landing_no_cards_subheader);
            return;
        }
    }

    private void updatePaySettings()
    {
        if (mPaySetting != null)
        {
            View view = mPaySetting;
            int i;
            if (mPaySetup)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void init(View view, Callbacks callbacks)
    {
        mRootView = view;
        mCallbacks = callbacks;
        mLoadingView = (LoadingContainerView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.pm_loading_landing_page);
        mLoadingView.setLoadingState();
        mLandingView = mLoadingView.getContentView();
        setupNoCardsView();
        setupCreditCardList();
        setupGiftCardList();
        setupPaySettings();
        mApplyWalmartCardFooter = ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.pm_apply_walmart_cc_container);
        if (mApplyWalmartCardFooter != null)
        {
            ViewUtil.findViewById(mApplyWalmartCardFooter, com.walmartlabs.android.payment.R.id.pm_apply_walmart_cc_body).setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentMethodsController this$0;

                public void onClick(View view1)
                {
                    view1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.walmart.com/instantcredit"));
                    try
                    {
                        mActivity.startActivity(view1);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (View view1)
                    {
                        return;
                    }
                }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
            });
        }
        mApplyPayFooter = ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.pm_apply_walmart_mpay_container);
        if (mApplyPayFooter != null)
        {
            mApplyPayFooter.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentMethodsController this$0;

                public void onClick(View view1)
                {
                    if (mCallbacks != null)
                    {
                        mCallbacks.onOpenPay();
                    }
                }

            
            {
                this$0 = PaymentMethodsController.this;
                super();
            }
            });
        }
        hideFooters();
    }

    public void onGetUserInfo(boolean flag)
    {
        mPaySetup = flag;
        updatePaySettings();
        updateFooters();
    }

    public void refresh()
    {
        hideFooters();
        hidePaySettings();
        updateNoCards();
        updatePaySettings();
        loadAllCards();
        loadMobilePayInfo();
    }








}
