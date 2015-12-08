// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.settings.GiftCardState;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupGiftCardAdapter, SetupCardData, SetupCallbacks

public class SetupGiftCardFragment extends Fragment
{

    private Button mBtnContinue;
    private SetupCallbacks mCallbacks;
    private SetupGiftCardAdapter mGiftCardAdapter;
    private View mGiftCardListContainer;
    private View mGiftCardListFooter;
    private TextView mGiftCardTotalBalance;
    private float mGiftCardTotalBalanceAmount;
    private TextView mHeadline;
    private View mRootView;
    private TextView mSubhead;
    private TextView mTextBtnAddCard;

    public SetupGiftCardFragment()
    {
    }

    private void init()
    {
        setupText();
        setupGiftCardList();
        setupButtons();
    }

    private void setupButtons()
    {
        if (!CreditCardsModel.get().hasCreditCards() && !GiftCardsModel.get().hasGiftCards())
        {
            mBtnContinue.setOnClickListener(new android.view.View.OnClickListener() {

                final SetupGiftCardFragment this$0;

                public void onClick(View view)
                {
                    mCallbacks.onAddGiftCard();
                }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }
            });
            mTextBtnAddCard.setOnClickListener(new android.view.View.OnClickListener() {

                final SetupGiftCardFragment this$0;

                public void onClick(View view)
                {
                    mCallbacks.onAddCreditCard();
                }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }
            });
            return;
        } else
        {
            mBtnContinue.setOnClickListener(new android.view.View.OnClickListener() {

                final SetupGiftCardFragment this$0;

                public void onClick(View view)
                {
                    if (mGiftCardAdapter != null)
                    {
                        if (mGiftCardAdapter.hasEnabledGiftCards() || SetupCardData.getInstance().hasCreditCardPayData())
                        {
                            nextStep();
                            return;
                        } else
                        {
                            (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_gc_confirm_msg).setNegativeButton(com.walmartlabs.android.payment.R.string.mpay_setup_gc_go_back, new android.content.DialogInterface.OnClickListener() {

                                final _cls4 this$1;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    dialoginterface.dismiss();
                                }

            
            {
                this$1 = _cls4.this;
                super();
            }
                            }).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                                final _cls4 this$1;

                                public void onClick(DialogInterface dialoginterface, int i)
                                {
                                    nextStep();
                                }

            
            {
                this$1 = _cls4.this;
                super();
            }
                            }).show();
                            return;
                        }
                    } else
                    {
                        nextStep();
                        return;
                    }
                }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }
            });
            mTextBtnAddCard.setOnClickListener(new android.view.View.OnClickListener() {

                final SetupGiftCardFragment this$0;

                public void onClick(View view)
                {
                    MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("setupAddCard")).putString("cardType", "gift card"));
                    mCallbacks.onAddGiftCard();
                }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }
            });
            return;
        }
    }

    private void setupGiftCardList()
    {
        if (GiftCardsModel.get().hasGiftCards())
        {
            mGiftCardAdapter = new SetupGiftCardAdapter(getActivity());
            mGiftCardAdapter.setGiftCards(GiftCardsModel.get().getAllGiftCards());
            mGiftCardAdapter.setGiftCardCheckedChangedListener(new com.walmartlabs.payment.controller.methods.GiftCardAdapter.GiftCardCheckedChangedListener() {

                final SetupGiftCardFragment this$0;

                public void onGiftCardCheckedChanged(int i, boolean flag)
                {
                    if (!flag) goto _L2; else goto _L1
_L1:
                    mGiftCardTotalBalanceAmount = mGiftCardTotalBalanceAmount + mGiftCardAdapter.getItem(i).balance;
_L4:
                    updateGiftCardBalance();
                    return;
_L2:
                    mGiftCardTotalBalanceAmount = mGiftCardTotalBalanceAmount - mGiftCardAdapter.getItem(i).balance;
                    if (mGiftCardTotalBalanceAmount < 0.0F)
                    {
                        mGiftCardTotalBalanceAmount = 0.0F;
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                this$0 = SetupGiftCardFragment.this;
                super();
            }
            });
            ListRecyclerView listrecyclerview = (ListRecyclerView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_gc_list);
            listrecyclerview.setLayoutManager(new WrappedLinearLayoutManager(getActivity(), 1, false));
            listrecyclerview.setAdapter(mGiftCardAdapter);
            return;
        } else
        {
            mGiftCardListContainer.setVisibility(8);
            return;
        }
    }

    private void setupText()
    {
        switch (GiftCardsModel.get().getAllGiftCards().size())
        {
        default:
            mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_gc_many));
            mSubhead.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_subhead_gc));
            mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_continue));
            mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_gc_next));
            mGiftCardTotalBalanceAmount = GiftCardsModel.get().getTotalBalance();
            updateGiftCardBalance();
            return;

        case 0: // '\0'
            if (CreditCardsModel.get().hasCreditCards())
            {
                mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_gc_none));
                mSubhead.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_subhead_gc_none));
                mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_not_now));
                mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_gc_first));
                return;
            } else
            {
                mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_nocards));
                mSubhead.setVisibility(8);
                mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_gc_first));
                mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_cc));
                return;
            }

        case 1: // '\001'
            mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_gc_one));
            mSubhead.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_subhead_gc));
            mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_continue));
            mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_gc_next));
            mGiftCardListFooter.setVisibility(8);
            return;
        }
    }

    private void updateGiftCardBalance()
    {
        mGiftCardTotalBalance.setText(NumberFormat.getCurrencyInstance(Locale.US).format(mGiftCardTotalBalanceAmount));
    }

    public void nextStep()
    {
        if (mGiftCardAdapter != null && mGiftCardAdapter.getItemCount() > 0)
        {
            SetupCardData.getInstance().getGiftCardState().setOptOutState(mGiftCardAdapter.getOptOutState());
        }
        SetupCardData.getInstance().setHasGiftCardPayData(true);
        mCallbacks.onSetupGiftCards();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mRootView = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_setup_has_gc);
        mHeadline = (TextView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_headline_gc);
        mSubhead = (TextView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_subhead_gc);
        mGiftCardListContainer = ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_gc_list_container);
        mGiftCardListFooter = ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_gc_list_footer);
        mGiftCardTotalBalance = (TextView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_default_balance);
        mBtnContinue = (Button)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_btn_continue);
        mTextBtnAddCard = (TextView)ViewUtil.findViewById(mRootView, com.walmartlabs.android.payment.R.id.mpay_setup_btn_add_gc_next);
        init();
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile pay gift card").putString("section", "mobile pay"));
        return mRootView;
    }

    public void onResume()
    {
        super.onResume();
        SetupCardData.getInstance().setHasGiftCardPayData(false);
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_title);
        }
    }

    public void setCallbacks(SetupCallbacks setupcallbacks)
    {
        mCallbacks = setupcallbacks;
    }



/*
    static float access$002(SetupGiftCardFragment setupgiftcardfragment, float f)
    {
        setupgiftcardfragment.mGiftCardTotalBalanceAmount = f;
        return f;
    }

*/



}
