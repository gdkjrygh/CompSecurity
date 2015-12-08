// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.analytics.AniviaAnalytics;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.controller.methods.AddressAdapter;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CreditCardRequest;
import com.walmartlabs.payment.service.customer.CustomerService;
import com.walmartlabs.payment.service.customer.EncryptCreditCardService;
import com.walmartlabs.payment.view.CreditCardView;
import com.walmartlabs.payment.view.VerticalSpaceItemDecoration;
import com.walmartlabs.payment.view.WrappedLinearLayoutManager;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            CreditCardValidator

public class AddCreditCardFragment extends CallbackFragment
{
    public static interface Callbacks
    {

        public abstract void onCreditCardAdded();
    }


    private static final String ENCRYPT_HOST_DEV_QA = "qa-securedataweb.walmart.com";
    private static final String ENCRYPT_HOST_PROD = "securedataweb.walmart.com";
    private static final String ENCRYPT_MERCHANT_DEV_QA = "wwwus_pie_wml_qa";
    private static final String ENCRYPT_MERCHANT_PROD = "wmcom_us_vtg_pie";
    private static final String TAG = com/walmartlabs/payment/controller/edit/AddCreditCardFragment.getSimpleName();
    private CreditCardView mCreditCardView;
    private EncryptCreditCardService mEncryptCreditCardService;
    private View mLoadingView;

    public AddCreditCardFragment()
    {
        super(com/walmartlabs/payment/controller/edit/AddCreditCardFragment$Callbacks);
    }

    private CreditCardRequest createCreditCardRequest(com.walmartlabs.payment.service.customer.EncryptCreditCardService.EncryptedCc encryptedcc)
    {
        CreditCardRequest creditcardrequest = new CreditCardRequest();
        creditcardrequest.encryptedPan = encryptedcc.encryptedCc;
        creditcardrequest.encryptedCvv = encryptedcc.encryptedCvv;
        creditcardrequest.integrityCheck = encryptedcc.integrityCheck;
        creditcardrequest.keyId = encryptedcc.keyId;
        creditcardrequest.phase = encryptedcc.phase;
        creditcardrequest.firstName = mCreditCardView.getFirstName();
        creditcardrequest.lastName = mCreditCardView.getLastName();
        creditcardrequest.cardType = mCreditCardView.getCardType();
        int i = mCreditCardView.getExpiryMonth();
        if (i > 0)
        {
            creditcardrequest.expiryMonth = i;
        }
        i = mCreditCardView.getExpiryYear();
        if (i > 0)
        {
            creditcardrequest.expiryYear = i;
        }
        if (mCreditCardView.getBillingAddressList() != null)
        {
            encryptedcc = mCreditCardView.getBillingAddressList().getAdapter();
        } else
        {
            encryptedcc = null;
        }
        encryptedcc = (AddressAdapter)(AddressAdapter)encryptedcc;
        if (encryptedcc != null && encryptedcc.getSelectedAddress() != null)
        {
            encryptedcc = ((AddressAdapter)mCreditCardView.getBillingAddressList().getAdapter()).getSelectedAddress();
            creditcardrequest.addressLineOne = ((com.walmartlabs.payment.model.CreditCardsModel.BillingAddress) (encryptedcc)).addressLineOne;
            creditcardrequest.addressLineTwo = ((com.walmartlabs.payment.model.CreditCardsModel.BillingAddress) (encryptedcc)).addressLineTwo;
            creditcardrequest.city = ((com.walmartlabs.payment.model.CreditCardsModel.BillingAddress) (encryptedcc)).city;
            creditcardrequest.state = ((com.walmartlabs.payment.model.CreditCardsModel.BillingAddress) (encryptedcc)).state;
            creditcardrequest.postalCode = ((com.walmartlabs.payment.model.CreditCardsModel.BillingAddress) (encryptedcc)).postalCode;
        } else
        {
            creditcardrequest.addressLineOne = mCreditCardView.getAddress1();
            creditcardrequest.addressLineTwo = mCreditCardView.getAddress2();
            creditcardrequest.city = mCreditCardView.getCity();
            creditcardrequest.state = mCreditCardView.getState();
            creditcardrequest.postalCode = mCreditCardView.getZipCode();
        }
        creditcardrequest.phone = mCreditCardView.getPhoneNumber();
        creditcardrequest.isDefault = false;
        return creditcardrequest;
    }

    private EncryptCreditCardService createEncryptCreditCardService()
    {
        String s;
        String s1;
        if (PaymentServices.get().getCustomerService().getHost().equals("pay.edge.walmart.com"))
        {
            s = "securedataweb.walmart.com";
            s1 = "wmcom_us_vtg_pie";
        } else
        {
            s = "qa-securedataweb.walmart.com";
            s1 = "wwwus_pie_wml_qa";
        }
        return new EncryptCreditCardService(getActivity(), s, s1);
    }

    private void destroyEncryptCreditCardService()
    {
        if (mEncryptCreditCardService != null)
        {
            mEncryptCreditCardService.destroy();
        }
        mEncryptCreditCardService = null;
    }

    private void ensureEncryptCreditCardService()
    {
        if (mEncryptCreditCardService == null || !mEncryptCreditCardService.canEncrypt())
        {
            mEncryptCreditCardService = createEncryptCreditCardService();
        }
    }

    public static AddCreditCardFragment newInstance()
    {
        return new AddCreditCardFragment();
    }

    private void requestAddCreditCard()
    {
        mLoadingView.setVisibility(0);
        ensureEncryptCreditCardService();
        mEncryptCreditCardService.encrypt(mCreditCardView.getCardNumber().replace(" ", ""), mCreditCardView.getCvv(), new com.walmartlabs.payment.service.customer.EncryptCreditCardService.Callback() {

            final AddCreditCardFragment this$0;

            public void onError(com.walmartlabs.kangaroo.Result.Error error)
            {
                mLoadingView.setVisibility(8);
                if (getActivity() != null)
                {
                    if (error.equals(com.walmartlabs.kangaroo.Result.Error.ERROR_TIMEOUT) || error.equals(com.walmartlabs.kangaroo.Result.Error.ERROR_CONNECT_UNCLASSIFIED))
                    {
                        ErrorHandlingUtil.showError(getActivity(), getActivity().getResources().getString(com.walmartlabs.android.payment.R.string.pm_add_credit_card_err_timeout));
                    } else
                    {
                        ErrorHandlingUtil.handleServiceError(getActivity(), error);
                    }
                }
                destroyEncryptCreditCardService();
            }

            public void onResult(com.walmartlabs.payment.service.customer.EncryptCreditCardService.EncryptedCc encryptedcc)
            {
                encryptedcc = createCreditCardRequest(encryptedcc);
                PaymentServices.get().getCustomerService().createCreditCard(encryptedcc).addCallback(new CallbackSameThread() {

                    final _cls5 this$1;

                    public void onResultSameThread(Request request, Result result)
                    {
                        mLoadingView.setVisibility(8);
                        if (result.successful() && result.hasData() && !((CreditCard)result.getData()).hasClientErrorMessage())
                        {
                            CreditCardsModel.get().updateCreditCard((CreditCard)result.getData());
                            ((Callbacks)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                destroyEncryptCreditCardService();
            }

            
            {
                this$0 = AddCreditCardFragment.this;
                super();
            }
        });
    }

    private void setupAddressList()
    {
        if (mCreditCardView != null && CreditCardsModel.get().hasCreditCards())
        {
            final AddressAdapter addressAdapter = new AddressAdapter(getActivity());
            addressAdapter.setAddresses(CreditCardsModel.get().getBillingAddresses());
            ListRecyclerView listrecyclerview = mCreditCardView.getBillingAddressList();
            listrecyclerview.setAdapter(addressAdapter);
            listrecyclerview.setLayoutManager(new WrappedLinearLayoutManager(getActivity(), 1, false));
            listrecyclerview.addItemDecoration(new VerticalSpaceItemDecoration(getActivity()));
            listrecyclerview.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

                final AddCreditCardFragment this$0;
                final AddressAdapter val$addressAdapter;

                public void onItemClick(BasicViewHolder basicviewholder, int i)
                {
                    addressAdapter.setSelectedAddress(i);
                }

            
            {
                this$0 = AddCreditCardFragment.this;
                addressAdapter = addressadapter;
                super();
            }
            });
            mCreditCardView.getBillingAddressFooter().setOnClickListener(new android.view.View.OnClickListener() {

                final AddCreditCardFragment this$0;
                final AddressAdapter val$addressAdapter;

                public void onClick(View view)
                {
                    addressAdapter.setSelectedAddress(-1);
                    mCreditCardView.showAddressFields(true);
                }

            
            {
                this$0 = AddCreditCardFragment.this;
                addressAdapter = addressadapter;
                super();
            }
            });
            mCreditCardView.getAddExistingAddressView().setOnClickListener(new android.view.View.OnClickListener() {

                final AddCreditCardFragment this$0;
                final AddressAdapter val$addressAdapter;

                public void onClick(View view)
                {
                    addressAdapter.setSelectedAddress(0);
                    mCreditCardView.showAddressFields(false);
                }

            
            {
                this$0 = AddCreditCardFragment.this;
                addressAdapter = addressadapter;
                super();
            }
            });
            mCreditCardView.showAddressFields(false);
        }
    }

    private void showAllFields()
    {
        if (isResumed())
        {
            mLoadingView.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle(com.walmartlabs.android.payment.R.string.pm_add_credit_card_title);
        }
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.payment.R.layout.pm_add_credit_card_main, viewgroup, false);
        mLoadingView = ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.payments_loading_view);
        mCreditCardView = (CreditCardView)ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.payments_card_view);
        mCreditCardView.setSaveListener(new android.view.View.OnClickListener() {

            final AddCreditCardFragment this$0;

            public void onClick(View view)
            {
                ViewUtil.hideKeyboard(view);
                if (CreditCardValidator.validateCreditCard(mCreditCardView))
                {
                    requestAddCreditCard();
                }
            }

            
            {
                this$0 = AddCreditCardFragment.this;
                super();
            }
        });
        setupAddressList();
        return layoutinflater;
    }

    public void onDestroy()
    {
        destroyEncryptCreditCardService();
        super.onDestroy();
    }

    public void onResume()
    {
        super.onResume();
        showAllFields();
        ensureEncryptCreditCardService();
        mEncryptCreditCardService.preLoad();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        AniviaAnalytics.sendPageViewEvent();
    }







}
