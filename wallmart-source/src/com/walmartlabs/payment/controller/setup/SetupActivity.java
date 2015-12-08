// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.FrameLayout;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.payment.controller.ErrorHandlingUtil;
import com.walmartlabs.payment.controller.PaymentActivity;
import com.walmartlabs.payment.controller.edit.AddCreditCardFragment;
import com.walmartlabs.payment.controller.edit.AddGiftCardFragment;
import com.walmartlabs.payment.controller.mpay.TermsConditionsFragment;
import com.walmartlabs.payment.controller.mpay.WebViewFragment;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.payment.integration.AppIntegration;
import com.walmartlabs.payment.integration.AppIntegrationFactory;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.model.GiftCardsModel;
import com.walmartlabs.payment.service.PaymentServices;
import com.walmartlabs.payment.service.customer.CardResponse;
import com.walmartlabs.payment.service.customer.CustomerService;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupCallbacks, SetupCreditCardFragment, SetupGiftCardFragment, SetupTutorialFragment, 
//            SetupCardData

public class SetupActivity extends PaymentActivity
    implements com.walmartlabs.payment.controller.edit.AddCreditCardFragment.Callbacks, com.walmartlabs.payment.controller.edit.AddGiftCardFragment.Callbacks, com.walmartlabs.payment.controller.mpay.TermsConditionsFragment.Callback, SetupCallbacks
{

    public static final String EXTRA_ADD_CREDIT_CARD = "add_credit_card";
    public static final String EXTRA_ADD_GIFT_CARD = "add_gift_card";
    public static final String EXTRA_START_SETUP = "start_setup";
    public static final String FRAGMENT_NAME = "fragment_name";
    public static final String FRAGMENT_PRIVACY = "privacy";
    public static final String FRAGMENT_SETUP_CC = "setup_cc";
    public static final String FRAGMENT_SETUP_GC = "setup_gc";
    public static final String FRAGMENT_TERMS_CONDITIONS = "terms_conditions";
    public static final String FRAGMENT_TUTORIAL = "tutorial";
    private static final int REQUEST_CREATE_PIN = 1;
    public static final int RESULT_TRY_NOW = 10;
    private static final String TAG = com/walmartlabs/payment/controller/setup/SetupActivity.getSimpleName();
    private static final String URL_PRIVACY = "http://www.walmartstores.com/PrivacySecurity/9243.aspx";
    private View mLoadingView;

    public SetupActivity()
    {
    }

    private void goToCreditCardSetup()
    {
        SetupCreditCardFragment setupcreditcardfragment = new SetupCreditCardFragment();
        setupcreditcardfragment.setCallbacks(this);
        replaceFragment(setupcreditcardfragment, "setup_cc");
    }

    private void goToFragment(String s)
    {
        if (s.equals("add_gift_card"))
        {
            replaceFragment(AddGiftCardFragment.newInstance(), "add_gift_card");
        } else
        {
            if (s.equals("add_credit_card"))
            {
                replaceFragment(AddCreditCardFragment.newInstance(), "add_credit_card");
                return;
            }
            if (s.equals("setup_gc"))
            {
                goToGiftCardSetup();
                return;
            }
            if (s.equals("setup_cc"))
            {
                goToCreditCardSetup();
                return;
            }
            if (s.equals("terms_conditions"))
            {
                goToTermsConditions();
                return;
            }
            if (s.equals("tutorial"))
            {
                goToTutorial();
                return;
            }
        }
    }

    private void goToGiftCardSetup()
    {
        SetupGiftCardFragment setupgiftcardfragment = new SetupGiftCardFragment();
        setupgiftcardfragment.setCallbacks(this);
        replaceFragment(setupgiftcardfragment, "setup_gc");
    }

    private void goToTermsConditions()
    {
        TermsConditionsFragment termsconditionsfragment = new TermsConditionsFragment();
        termsconditionsfragment.setCallbacks(this);
        replaceFragment(termsconditionsfragment, "terms_conditions");
    }

    private void goToTutorial()
    {
        SetupTutorialFragment setuptutorialfragment = new SetupTutorialFragment();
        setuptutorialfragment.setCallbacks(this);
        replaceFragment(setuptutorialfragment, "tutorial");
    }

    private void gotoPinSetup()
    {
        MobilePayPinController.launchPin(this, 1, true, true);
    }

    private void loadCardsAndGoToFragment(final String fragmentName)
    {
        PaymentServices.get().getCustomerService().getAllCards().addCallback(new CallbackSameThread() {

            final SetupActivity this$0;
            final String val$fragmentName;

            public void onResultSameThread(Request request, Result result)
            {
                mLoadingView.setVisibility(8);
                if (result.successful() && result.hasData() && !((CardResponse)result.getData()).hasClientErrorMessage())
                {
                    GiftCardsModel.get().setGiftCards(((CardResponse)result.getData()).getGiftCards());
                    CreditCardsModel.get().setCreditCards(((CardResponse)result.getData()).getCreditCards());
                    if (fragmentName == null || fragmentName.isEmpty())
                    {
                        if (CreditCardsModel.get().hasCreditCards())
                        {
                            goToCreditCardSetup();
                            return;
                        } else
                        {
                            goToGiftCardSetup();
                            return;
                        }
                    } else
                    {
                        goToFragment(fragmentName);
                        return;
                    }
                } else
                {
                    ErrorHandlingUtil.handleResponseError(SetupActivity.this, result);
                    return;
                }
            }

            
            {
                this$0 = SetupActivity.this;
                fragmentName = s;
                super();
            }
        });
    }

    private void replaceFragment(Fragment fragment, String s)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.replace(com.walmartlabs.android.payment.R.id.content_frame, fragment, fragment.getClass().getName());
        if (getSupportFragmentManager().getFragments() != null)
        {
            fragmenttransaction.addToBackStack(s);
        }
        fragmenttransaction.commit();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            goToTermsConditions();
        }
    }

    public void onAddCreditCard()
    {
        loadCardsAndGoToFragment("add_credit_card");
    }

    public void onAddGiftCard()
    {
        loadCardsAndGoToFragment("add_gift_card");
    }

    public void onBackPressed()
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        int i = fragmentmanager.getBackStackEntryCount();
        if (i >= 2 && fragmentmanager.getBackStackEntryAt(i - 1).getName().equals("tutorial") && fragmentmanager.getBackStackEntryAt(i - 2).getName().equals("terms_conditions"))
        {
            fragmentmanager.popBackStack(null, 1);
            finish();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (FrameLayout)findViewById(com.walmartlabs.android.payment.R.id.content_frame);
        mLoadingView = View.inflate(this, com.walmartlabs.android.payment.R.layout.loading_page, null);
        bundle.addView(mLoadingView);
        boolean flag = getIntent().getBooleanExtra("start_setup", false);
        bundle = getIntent().getStringExtra("fragment_name");
        if (flag)
        {
            loadCardsAndGoToFragment(null);
        } else
        {
            goToFragment(bundle);
        }
        bundle = getSupportActionBar();
        if (bundle != null)
        {
            bundle.setTitle("");
        }
    }

    public void onCreditCardAdded()
    {
        loadCardsAndGoToFragment("setup_cc");
    }

    public void onGiftCardCreated()
    {
        loadCardsAndGoToFragment("setup_gc");
    }

    public void onPrivacy()
    {
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, WebViewFragment.newInstance(getString(com.walmartlabs.android.payment.R.string.mpay_privacy_title), "http://www.walmartstores.com/PrivacySecurity/9243.aspx"), com/walmartlabs/payment/controller/mpay/WebViewFragment.getName()).addToBackStack("privacy").commit();
    }

    public void onSetupCreditCards()
    {
        if (SetupCardData.getInstance().hasGiftCardPayData())
        {
            gotoPinSetup();
            return;
        } else
        {
            goToGiftCardSetup();
            return;
        }
    }

    public void onSetupGiftCards()
    {
        if (SetupCardData.getInstance().hasCreditCardPayData())
        {
            gotoPinSetup();
            return;
        } else
        {
            goToCreditCardSetup();
            return;
        }
    }

    public void onTerms()
    {
        startActivity(AppIntegrationFactory.create(this).createTermsIntent(this));
    }

    public void onTermsConditionsAccepted()
    {
        goToTutorial();
    }

    public void onTryNow()
    {
        setResult(10);
        finish();
    }





}
