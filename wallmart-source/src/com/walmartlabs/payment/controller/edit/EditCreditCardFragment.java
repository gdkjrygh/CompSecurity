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
import android.widget.EditText;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.analytics.AniviaAnalytics;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.view.CreditCardView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            CreditCardValidator

public class EditCreditCardFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onCreditCardDeleted();

        public abstract void onCreditCardUpdated();
    }


    private static final String ARG_CREDIT_CARD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/EditCreditCardFragment.getName()).append(".CREDIT_CARD").toString();
    private CreditCard mCreditCard;
    private View mLoadingView;

    public EditCreditCardFragment()
    {
        super(com/walmartlabs/payment/controller/edit/EditCreditCardFragment$Callbacks);
        TAG = com/walmartlabs/payment/controller/edit/EditCreditCardFragment.getSimpleName();
    }

    public static EditCreditCardFragment newInstance(CreditCard creditcard)
    {
        EditCreditCardFragment editcreditcardfragment = new EditCreditCardFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_CREDIT_CARD, creditcard);
        editcreditcardfragment.setArguments(bundle);
        return editcreditcardfragment;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mCreditCard = (CreditCard)getArguments().getParcelable(ARG_CREDIT_CARD);
    }

    public View onCreateView(LayoutInflater layoutinflater, final ViewGroup creditCardView, Bundle bundle)
    {
        bundle = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle(com.walmartlabs.android.payment.R.string.pm_edit_credit_card_title);
        }
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.pm_edit_credit_card, creditCardView, false);
        mLoadingView = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_edit_cc_loading_view);
        mLoadingView.setVisibility(8);
        creditCardView = (CreditCardView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.pm_edit_cc_ccview);
        creditCardView.populate(mCreditCard);
        creditCardView.setSecurityCodeListener(new android.view.View.OnFocusChangeListener() {

            final EditCreditCardFragment this$0;

            public void onFocusChange(View view, boolean flag)
            {
                if (flag && (view instanceof EditText))
                {
                    ((EditText)view).setText("");
                }
            }

            
            {
                this$0 = EditCreditCardFragment.this;
                super();
            }
        });
        creditCardView.setSaveListener(new android.view.View.OnClickListener() {

            final EditCreditCardFragment this$0;
            final CreditCardView val$creditCardView;

            public void onClick(View view)
            {
                if (CreditCardValidator.validateCreditCard(creditCardView))
                {
                    mLoadingView.setVisibility(0);
                    view = new CreditCardRequest();
                    view.firstName = creditCardView.getFirstName();
                    view.lastName = creditCardView.getLastName();
                    if (!creditCardView.getCardType().equals("WMUSGESTORECARD"))
                    {
                        view.expiryMonth = creditCardView.getExpiryMonth();
                        view.expiryYear = creditCardView.getExpiryYear();
                    }
                    view.addressLineOne = creditCardView.getAddress1();
                    view.addressLineTwo = creditCardView.getAddress2();
                    view.city = creditCardView.getCity();
                    view.state = creditCardView.getState();
                    view.postalCode = creditCardView.getZipCode();
                    view.phone = creditCardView.getPhoneNumber();
                    PaymentServices.get().getCustomerService().updateCreditCard(mCreditCard.getId(), view).addCallback(new CallbackSameThread() {

                        final _cls2 this$1;

                        public void onResultSameThread(Request request, Result result)
                        {
                            if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
                            {
                                WLog.d(access$000, "Successfully updated credit card");
                                mLoadingView.setVisibility(8);
                                request = (CreditCard)result.getData();
                                CreditCardsModel.get().updateCreditCard(request);
                                ((Callbacks)get).onCreditCardUpdated();
                                return;
                            } else
                            {
                                WLog.d(access$000, (new StringBuilder()).append("Failed to update credit card: status = ").append(result.getStatusCode()).toString());
                                mLoadingView.setVisibility(8);
                                ErrorHandlingUtil.handleResponseError(getActivity(), result, com.walmartlabs.android.payment.R.string.pm_edit_credit_card_error);
                                return;
                            }
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = EditCreditCardFragment.this;
                creditCardView = creditcardview;
                super();
            }
        });
        creditCardView.setDeleteListener(new android.view.View.OnClickListener() {

            final EditCreditCardFragment this$0;

            public void onClick(View view)
            {
                (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_title)).setMessage(getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_msg)).setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                    final _cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }).setPositiveButton(com.walmartlabs.android.payment.R.string.pm_delete_credit_card_remove, new android.content.DialogInterface.OnClickListener() {

                    final _cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        mLoadingView.setVisibility(0);
                        PaymentServices.get().getCustomerService().deleteCreditCard(mCreditCard.getId()).addCallback(new CallbackSameThread() {

                            final _cls1 this$2;

                            public void onResultSameThread(Request request, Result result)
                            {
                                WLog.d(
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }).show();
            }

            
            {
                this$0 = EditCreditCardFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        onViewCreated(view, bundle);
        AniviaAnalytics.sendPageViewEvent();
    }









}
