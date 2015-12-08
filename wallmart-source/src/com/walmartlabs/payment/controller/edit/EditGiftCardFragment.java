// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.analytics.AniviaAnalytics;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.ui.LoadingContainerView;
import java.text.NumberFormat;
import java.util.Locale;

public class EditGiftCardFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onGiftCardDeleted();

        public abstract void onGiftCardUpdated();
    }


    private static final String ARG_GIFT_CARD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/EditGiftCardFragment.getName()).append(".GIFT_CARD").toString();
    private String mDefaultLabel;
    private GiftCard mGiftCard;
    private LoadingContainerView mLoadingContainerView;

    public EditGiftCardFragment()
    {
        super(com/walmartlabs/payment/controller/edit/EditGiftCardFragment$Callbacks);
        TAG = com/walmartlabs/payment/controller/edit/EditGiftCardFragment.getSimpleName();
    }

    private void deleteGiftCard()
    {
        mLoadingContainerView.setLoadingState();
        if (mGiftCard != null)
        {
            PaymentServices.get().getCustomerService().deleteGiftCard(mGiftCard.id).addCallback(new CallbackSameThread() {

                final EditGiftCardFragment this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    mLoadingContainerView.setContentState();
                    if (result.getStatusCode() == 204)
                    {
                        GiftCardsModel.get().deleteGiftCard(mGiftCard.id);
                        ((Callbacks)pm_delete_gift_card_err).onGiftCardDeleted();
                        return;
                    } else
                    {
                        ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.R.string.pm_delete_gift_card_err);
                        return;
                    }
                }

            
            {
                this$0 = EditGiftCardFragment.this;
                super();
            }
            });
            return;
        } else
        {
            mLoadingContainerView.setContentState();
            ErrorHandlingUtil.showError(getActivity(), getString(com.walmartlabs.android.payment.R.string.pm_edit_gift_card_error_msg));
            return;
        }
    }

    public static EditGiftCardFragment newInstance(GiftCard giftcard)
    {
        EditGiftCardFragment editgiftcardfragment = new EditGiftCardFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_GIFT_CARD, giftcard);
        editgiftcardfragment.setArguments(bundle);
        return editgiftcardfragment;
    }

    private void showDeleteConfirmation()
    {
        (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(getString(com.walmartlabs.android.payment.R.string.pm_delete_title_gift_card)).setMessage(getString(com.walmartlabs.android.payment.R.string.pm_delete_msg_card)).setNegativeButton(com.walmartlabs.android.payment.R.string.cancel_button, null).setPositiveButton(getString(com.walmartlabs.android.payment.R.string.delete_button), new android.content.DialogInterface.OnClickListener() {

            final EditGiftCardFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                deleteGiftCard();
            }

            
            {
                this$0 = EditGiftCardFragment.this;
                super();
            }
        }).show();
    }

    private void updateGiftCard()
    {
        ((Callbacks)mCallback).onGiftCardUpdated();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mGiftCard = (GiftCard)getArguments().getParcelable(ARG_GIFT_CARD);
        mDefaultLabel = getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_edit_gift_card_label);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle(com.walmartlabs.android.payment.R.string.pm_edit_gift_card_title);
        }
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.pm_edit_gift_card_main, viewgroup, false);
        mLoadingContainerView = (LoadingContainerView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_edit_gift_card_main);
        mLoadingContainerView.setContentState();
        if (mGiftCard != null)
        {
            viewgroup = (TextView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_edit_gc_label);
            if (mGiftCard.label != null && !mGiftCard.label.isEmpty())
            {
                viewgroup.setText(mGiftCard.label);
            } else
            {
                viewgroup.setText(mDefaultLabel);
            }
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_edit_gc_number, layoutinflater, com.walmartlabs.android.payment.R.string.pm_edit_gift_card_header, new Object[] {
                mGiftCard.lastFour
            });
            ViewUtil.setText(com.walmartlabs.android.payment.R.id.pm_edit_gc_balance, layoutinflater, NumberFormat.getCurrencyInstance(Locale.US).format(mGiftCard.balance));
        }
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_edit_gc_delete_btn).setOnClickListener(new android.view.View.OnClickListener() {

            final EditGiftCardFragment this$0;

            public void onClick(View view)
            {
                showDeleteConfirmation();
            }

            
            {
                this$0 = EditGiftCardFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        AniviaAnalytics.sendPageViewEvent();
    }






}
