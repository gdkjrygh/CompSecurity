// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.controller.edit.ConfirmationActivity;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.payment.SetGiftCardsRequest;
import com.walmartlabs.payment.service.payment.UserCardsResponse;
import com.walmartlabs.payment.view.OnSingleClickListener;
import com.walmartlabs.payment.view.OneLineCreditCardView;
import com.walmartlabs.payment.view.VerticalSpaceItemDecoration;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            CreditCardsState, GiftCardState, GiftCardAdapter

public class MobilePaySettingsFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onDone(boolean flag);
    }

    private static class CreditCardAdapter extends BaseAdapter
    {

        private final Activity mActivity;
        private final List mCards;

        public int getCount()
        {
            return mCards.size();
        }

        public Object getItem(int i)
        {
            return mCards.get(i);
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = ViewUtil.inflate(mActivity, com.walmartlabs.android.payment.R.layout.pm_one_line_credit_card, viewgroup, false);
            }
            ((OneLineCreditCardView)view1).setCreditCard((CreditCard)getItem(i));
            return view1;
        }

        private CreditCardAdapter(Activity activity, List list)
        {
            mActivity = activity;
            mCards = list;
        }

    }


    private static final long CONFIRMATION_TIME = 3000L;
    private View mCreditCardIsDefault;
    private View mCreditCards;
    private View mCreditCardsIndicator;
    private final CreditCardsState mCreditCardsState = new CreditCardsState();
    private final DoneCheck mDoneCheck = new DoneCheck();
    private GiftCardAdapter mGiftCardAdapter;
    private ListRecyclerView mGiftCardList;
    private TextView mGiftCardMessage;
    private final GiftCardState mGiftCardState = new GiftCardState();
    private View mGiftCardTotal;
    private final List mInFlightRequests = new ArrayList();
    private View mNoCreditCards;
    private OneLineCreditCardView mOneCreditCard;
    private View mProgressCreditCards;
    private View mProgressGiftCards;

    public MobilePaySettingsFragment()
    {
        CallbackFragment(com/walmartlabs/payment/controller/settings/MobilePaySettingsFragment$Callbacks);
    }

    private void createChooseDefaultCreditCardDialog()
    {
        final CreditCardAdapter mAdapter = new CreditCardAdapter(getActivity(), CreditCardsModel.get().getCreditCards());
        com.walmart.android.ui.CustomAlertDialog.Builder builder = new Builder(getActivity());
        builder.setTitle(getResources().getString(com.walmartlabs.android.payment.R.string.mpay_settings_dialog_cc_title)).setNeutralButton(com.walmartlabs.android.payment.R.string.cancel_button, null).setSingleChoiceItems(mAdapter, -1, new android.content.DialogInterface.OnClickListener() {

            final MobilePaySettingsFragment this$0;
            final CreditCardAdapter val$mAdapter;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                mCreditCardsState.setDefaultCreditCard((CreditCard)mAdapter.getItem(i));
                setupCreditCardList();
            }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                mAdapter = creditcardadapter;
                super();
            }
        });
        builder.show();
    }

    private void done()
    {
        if (mCreditCardsState.hasChanged())
        {
            CreditCard creditcard = mCreditCardsState.getDefaultCreditCard();
            CreditCardRequest creditcardrequest = new CreditCardRequest();
            creditcardrequest.isDefault = true;
            mInFlightRequests.add(PaymentServices.get().getCustomerService().updateCreditCard(creditcard.id, creditcardrequest).addCallback(new CallbackSameThread() {

                final MobilePaySettingsFragment this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    mInFlightRequests.remove(request);
                    if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
                    {
                        CreditCardsModel.get().updateCreditCard((CreditCard)result.getData());
                        mDoneCheck.setCcDone(true);
                        return;
                    }
                    if (result.hasData() && ((CreditCard)result.getData()).hasClientErrorMessage())
                    {
                        ErrorHandlingUtil.handleResponseError(getActivity(), result);
                        return;
                    }
                    if (result.hasError() && result.getError().connectionError())
                    {
                        DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.network_error_title), getString(com.walmartlabs.android.payment.R.string.network_error_message), getActivity()).show();
                        return;
                    } else
                    {
                        DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.system_error_message), getActivity()).show();
                        return;
                    }
                }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
            }));
        } else
        {
            mDoneCheck.setCcDone(false);
        }
        if (mGiftCardState.hasChanged())
        {
            mInFlightRequests.add(PaymentServices.get().getCustomerService().setUserGiftCards(SetGiftCardsRequest.makeRequestData(mGiftCardState.getGiftCards())).addCallback(new CallbackSameThread() {

                final MobilePaySettingsFragment this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    mInFlightRequests.remove(request);
                    if (result.successful())
                    {
                        GiftCardsModel.get().setGiftCards(true, mGiftCardState.getGiftCards());
                        mDoneCheck.setGcDone(true);
                        return;
                    } else
                    {
                        ErrorHandlingUtil.handleResponseError(getActivity(), result);
                        return;
                    }
                }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
            }));
            return;
        } else
        {
            mDoneCheck.setGcDone(false);
            return;
        }
    }

    public static Fragment newInstance()
    {
        return new MobilePaySettingsFragment();
    }

    private void setupCreditCardList()
    {
        mProgressCreditCards.setVisibility(8);
        if (CreditCardsModel.get().hasCreditCards())
        {
            List list = CreditCardsModel.get().getCreditCards();
            mNoCreditCards.setVisibility(8);
            mCreditCards.setVisibility(0);
            mOneCreditCard.setVisibility(0);
            mOneCreditCard.setCreditCard(mCreditCardsState.getDefaultCreditCard());
            if (list.size() > 1)
            {
                mCreditCards.setOnClickListener(new OnSingleClickListener() {

                    final MobilePaySettingsFragment this$0;

                    public void onSingleClick(View view)
                    {
                        createChooseDefaultCreditCardDialog();
                    }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
                });
                mCreditCardsIndicator.setVisibility(0);
                mCreditCardIsDefault.setVisibility(0);
                return;
            } else
            {
                mCreditCards.setOnClickListener(null);
                mCreditCardsIndicator.setVisibility(8);
                mCreditCardIsDefault.setVisibility(8);
                return;
            }
        } else
        {
            mNoCreditCards.setVisibility(0);
            mOneCreditCard.setVisibility(8);
            mCreditCards.setVisibility(8);
            mCreditCardIsDefault.setVisibility(8);
            return;
        }
    }

    private void setupGiftCardList()
    {
        mProgressGiftCards.setVisibility(8);
        mGiftCardMessage.setVisibility(0);
        List list = GiftCardsModel.get().getAllGiftCards();
        int i = list.size();
        TextView textview = mGiftCardMessage;
        CharSequence charsequence;
        if (i == 0)
        {
            charsequence = getText(com.walmartlabs.android.payment.R.string.mpay_settings_gift_card_no_cards);
        } else
        {
            charsequence = getResources().getQuantityText(com.walmartlabs.android.payment.R.plurals.mpay_settings_gift_card_message, i);
        }
        textview.setText(charsequence);
        mGiftCardAdapter = new GiftCardAdapter(getActivity());
        mGiftCardAdapter.setGiftCards(list);
        mGiftCardAdapter.setSwitchEnable(GiftCardsModel.get().hasMobilePayData());
        mGiftCardAdapter.setOnSwitchedListener(new GiftCardAdapter.OnSwitchedListener() {

            final MobilePaySettingsFragment this$0;

            public void onSwitched(int j, boolean flag)
            {
                GiftCardState giftcardstate = mGiftCardState;
                com.walmartlabs.payment.model.GiftCard giftcard = mGiftCardAdapter.getItem(j);
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                giftcardstate.optOut(giftcard, flag);
                updateTotalGiftCardBalance();
            }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
        });
        mGiftCardList.setVisibility(0);
        mGiftCardList.setAdapter(mGiftCardAdapter);
        mGiftCardList.addItemDecoration(new VerticalSpaceItemDecoration(getActivity()));
        mGiftCardList.setLayoutManager(new WrappedLinearLayoutManager(getActivity(), 1, false));
        updateTotalGiftCardBalance();
        if (i > 1)
        {
            mGiftCardTotal.setVisibility(0);
            return;
        } else
        {
            mGiftCardTotal.setVisibility(8);
            return;
        }
    }

    private void showConfirmation(int i)
    {
        Intent intent = new Intent(getActivity(), com/walmartlabs/payment/controller/edit/ConfirmationActivity);
        intent.putExtra(ConfirmationActivity.EXTRA_CONFIRMATION_TEXT, getText(i));
        intent.putExtra(ConfirmationActivity.EXTRA_CONFIRMATION_TIME, 3000L);
        startActivity(intent);
    }

    private void updateTotalGiftCardBalance()
    {
        ((TextView)ViewUtil.findViewById(mGiftCardTotal, com.walmartlabs.android.payment.R.id.mpay_gc_balance)).setText(NumberFormat.getCurrencyInstance(Locale.US).format(mGiftCardState.getTotalBalance()));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle(com.walmartlabs.android.payment.R.string.mpay_settings_title);
        }
        layoutinflater = (ViewGroup)layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.mpay_settings, viewgroup, false);
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_btn_security).setOnClickListener(new OnSingleClickListener() {

            final MobilePaySettingsFragment this$0;

            public void onSingleClick(View view)
            {
                MobilePayPinController.launchPin(getActivity(), true);
            }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_btn_done).setOnClickListener(new OnSingleClickListener() {

            final MobilePaySettingsFragment this$0;

            public void onSingleClick(View view)
            {
                if (!CreditCardsModel.get().hasCreditCards() && mGiftCardState.getTotalBalance() <= 0.0F)
                {
                    (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_msg).setNegativeButton(com.walmartlabs.android.payment.R.string.mpay_setup_gc_go_back, new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    }).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                        final _cls2 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            done();
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    }).show();
                    return;
                } else
                {
                    done();
                    return;
                }
            }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
        });
        mProgressCreditCards = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_card_progress);
        mNoCreditCards = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_card_no_cards);
        mOneCreditCard = (OneLineCreditCardView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_cards_view);
        mCreditCardsIndicator = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_cards_indicator);
        mCreditCards = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_cards_container);
        mCreditCardIsDefault = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_credit_cards_default);
        mProgressGiftCards = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_gift_card_progress);
        mGiftCardMessage = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_gift_card_message);
        mGiftCardList = (ListRecyclerView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_settings_gift_cards_list);
        mGiftCardTotal = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_gift_card_total);
        return layoutinflater;
    }

    public void onStart()
    {
        super.onStart();
        if (!GiftCardsModel.get().hasMobilePayData())
        {
            mInFlightRequests.add(MobilePayManager.get().getUserCards().addCallback(new CallbackSameThread() {

                final MobilePaySettingsFragment this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    mInFlightRequests.remove(request);
                    if (result.successful() && result.hasData() && !((UserCardsResponse)result.getData()).hasClientErrorMessage())
                    {
                        CreditCardsModel.get().setCreditCards(((UserCardsResponse)result.getData()).getCreditCards());
                        GiftCardsModel.get().setGiftCards(true, ((UserCardsResponse)result.getData()).getGiftCards());
                    } else
                    if (result.hasError() && result.getError().connectionError())
                    {
                        DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.network_error_title), getString(com.walmartlabs.android.payment.R.string.network_error_message), getActivity()).show();
                    } else
                    {
                        DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.system_error_message), getActivity()).show();
                    }
                    setupCreditCardList();
                    setupGiftCardList();
                }

            
            {
                this$0 = MobilePaySettingsFragment.this;
                super();
            }
            }));
            return;
        } else
        {
            setupCreditCardList();
            setupGiftCardList();
            return;
        }
    }

    public void onStop()
    {
        for (Iterator iterator = mInFlightRequests.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
        mInFlightRequests.clear();
        super.onStop();
    }












}
