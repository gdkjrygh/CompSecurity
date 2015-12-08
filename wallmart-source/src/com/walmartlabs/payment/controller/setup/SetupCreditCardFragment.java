// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

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
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import java.util.List;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCardData, SetupCallbacks, SetupCreditCardAdapter

public class SetupCreditCardFragment extends Fragment
{

    private Button mBtnContinue;
    private SetupCallbacks mCallbacks;
    private SetupCreditCardAdapter mCreditCardAdapter;
    private ListRecyclerView mCreditCardList;
    private TextView mHeadline;
    private String mInitialDefaultCardId;
    private View mLoadingView;
    private TextView mSubhead;
    private TextView mTextBtnAddCard;

    public SetupCreditCardFragment()
    {
    }

    private void init()
    {
        setupText();
        setupList();
        setupButtons();
    }

    private void nextStep()
    {
        SetupCardData.getInstance().setHasCreditCardPayData(true);
        mCallbacks.onSetupCreditCards();
    }

    private void setupButtons()
    {
        mTextBtnAddCard.setOnClickListener(new android.view.View.OnClickListener() {

            final SetupCreditCardFragment this$0;

            public void onClick(View view)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("setupAddCard")).putString("cardType", "credit or debit card"));
                mCallbacks.onAddCreditCard();
            }

            
            {
                this$0 = SetupCreditCardFragment.this;
                super();
            }
        });
        mBtnContinue.setOnClickListener(new android.view.View.OnClickListener() {

            final SetupCreditCardFragment this$0;

            public void onClick(View view)
            {
                if (mCreditCardAdapter != null && mCreditCardAdapter.getItemCount() > 0)
                {
                    view = mCreditCardAdapter.getSelectedItem().getId();
                    if (!view.equals(mInitialDefaultCardId))
                    {
                        mLoadingView.setVisibility(0);
                        CreditCardRequest creditcardrequest = new CreditCardRequest();
                        creditcardrequest.isDefault = true;
                        PaymentServices.get().getCustomerService().updateCreditCard(view, creditcardrequest).addCallback(new CallbackSameThread() {

                            final _cls3 this$1;

                            public void onResultSameThread(Request request, Result result)
                            {
                                mLoadingView.setVisibility(8);
                                if (result.successful())
                                {
                                    nextStep();
                                    return;
                                } else
                                {
                                    ErrorHandlingUtil.handleResponseError(getActivity(), result);
                                    return;
                                }
                            }

            
            {
                this$1 = _cls3.this;
                super();
            }
                        });
                        return;
                    } else
                    {
                        nextStep();
                        return;
                    }
                } else
                {
                    nextStep();
                    return;
                }
            }

            
            {
                this$0 = SetupCreditCardFragment.this;
                super();
            }
        });
    }

    private void setupList()
    {
        if (CreditCardsModel.get().hasCreditCards())
        {
            mInitialDefaultCardId = CreditCardsModel.get().getDefaultCard().getId();
            mCreditCardAdapter = new SetupCreditCardAdapter(getActivity());
            mCreditCardAdapter.setCreditCards(CreditCardsModel.get().getCreditCards());
            mCreditCardList.setAdapter(mCreditCardAdapter);
            mCreditCardList.setLayoutManager(new WrappedLinearLayoutManager(getActivity(), 1, false));
            mCreditCardList.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

                final SetupCreditCardFragment this$0;

                public void onItemClick(BasicViewHolder basicviewholder, int i)
                {
                    mCreditCardAdapter.setSelectedItem(i);
                }

            
            {
                this$0 = SetupCreditCardFragment.this;
                super();
            }
            });
            return;
        } else
        {
            mCreditCardList.setVisibility(8);
            return;
        }
    }

    private void setupText()
    {
        switch (CreditCardsModel.get().getCreditCards().size())
        {
        default:
            mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_cc_many));
            mSubhead.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_subhead_cc_many));
            mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_cc_continue_many));
            mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_cc_next));
            return;

        case 0: // '\0'
            mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_cc_none));
            mSubhead.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_subhead_cc_none));
            mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_not_now));
            mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_cc_first));
            return;

        case 1: // '\001'
            mHeadline.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_headline_cc_one));
            break;
        }
        mSubhead.setVisibility(8);
        mBtnContinue.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_cc_continue_one));
        mTextBtnAddCard.setText(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_btn_add_cc_next));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_setup_has_cc);
        mLoadingView = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.loading_page);
        mHeadline = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_headline_cc);
        mSubhead = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_subhead_cc);
        mCreditCardList = (ListRecyclerView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_cc_list);
        mBtnContinue = (Button)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_btn_continue);
        mTextBtnAddCard = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_setup_btn_add_cc_next);
        init();
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        SetupCardData.getInstance().setHasCreditCardPayData(false);
        ActionBar actionbar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(com.walmartlabs.android.payment.R.string.mpay_setup_title);
        }
    }

    public void onStart()
    {
        super.onStart();
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "mobile pay credit card").putString("section", "mobile pay"));
    }

    public void setCallbacks(SetupCallbacks setupcallbacks)
    {
        mCallbacks = setupcallbacks;
    }





}
