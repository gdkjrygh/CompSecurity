// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.walmartlabs.payment.controller.PaymentActivity;
import com.walmartlabs.payment.integration.AppIntegration;
import com.walmartlabs.payment.integration.AppIntegrationFactory;
import com.walmartlabs.payment.service.payment.Transaction;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            ValuePropositionFragment, PairFragment, PaymentConfirmationFragment, MoreInfoFragment

public class MobilePayActivity extends PaymentActivity
    implements MoreInfoFragment.Callback, PairFragment.Callbacks, PaymentConfirmationFragment.Callbacks, ValuePropositionFragment.Callback
{

    public static final String CREDIT_CARD_ID = "credit_card_id";
    public static final String EXTRA_MORE_INFO = com/walmartlabs/payment/controller/mpay/MoreInfoFragment.getSimpleName();
    public static final String EXTRA_PAIR_DEVICE = com/walmartlabs/payment/controller/mpay/PairFragment.getSimpleName();
    public static final String EXTRA_PAYMENT_CONFIRM = com/walmartlabs/payment/controller/mpay/PaymentConfirmationFragment.getSimpleName();
    public static final String EXTRA_VALUE_PROP = com/walmartlabs/payment/controller/mpay/ValuePropositionFragment.getSimpleName();
    public static final String FRAGMENT_NAME = "fragment_name";
    private static final int REQUEST_SUBMIT_SC = 1;
    public static final int RESULT_PAIRING_ERROR = 11;
    public static final int RESULT_START_SETUP = 10;
    public static final String TOKEN_VALUE = "token_value";
    public static final String TRANSACTION = "transaction";
    public static final String TRANSACTION_ID = "transaction_id";
    private static final String URL_FAQ = "http://www.wmt.co/pay/faq.html";
    public static final String USER_FIRSTNAME = "user_firstname";
    public static final String USE_ASSOC_DISCOUNT = "use_assoc_discount";
    public static final String USE_GIFT_CARDS = "use_gift_cards";

    public MobilePayActivity()
    {
    }

    private void showConfirmation(Transaction transaction)
    {
        Bundle bundle = new Bundle();
        PaymentConfirmationFragment paymentconfirmationfragment = new PaymentConfirmationFragment();
        bundle.putParcelable("transaction", transaction);
        transaction = getIntent().getStringExtra("transaction_id");
        if (transaction != null)
        {
            bundle.putString("transaction_id", transaction);
        }
        paymentconfirmationfragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, paymentconfirmationfragment, com/walmartlabs/payment/controller/mpay/PaymentConfirmationFragment.getName()).commitAllowingStateLoss();
    }

    private void showMoreInfo(boolean flag)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, MoreInfoFragment.newInstance("http://www.wmt.co/pay/faq.html"), com/walmartlabs/payment/controller/mpay/MoreInfoFragment.getName());
        if (flag)
        {
            fragmenttransaction.addToBackStack(null);
        }
        fragmenttransaction.commit();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            Intent intent1 = AppIntegrationFactory.create(this).handleSubmitToSaverResult(this, j, intent);
            if (intent1 != null)
            {
                startActivity(intent1);
            }
            finish();
        }
        super.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getStringExtra("fragment_name");
        if (bundle.equals(EXTRA_VALUE_PROP))
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, new ValuePropositionFragment(), com/walmartlabs/payment/controller/mpay/ValuePropositionFragment.getName()).commit();
        } else
        {
            if (bundle.equals(EXTRA_PAIR_DEVICE))
            {
                bundle = new PairFragment();
                Bundle bundle1 = new Bundle();
                bundle1.putString("token_value", getIntent().getStringExtra("token_value"));
                bundle1.putString("user_firstname", getIntent().getStringExtra("user_firstname"));
                bundle1.putString("credit_card_id", getIntent().getStringExtra("credit_card_id"));
                bundle1.putBoolean("use_assoc_discount", getIntent().getBooleanExtra("use_assoc_discount", false));
                bundle1.putBoolean("use_gift_cards", getIntent().getBooleanExtra("use_gift_cards", true));
                bundle.setArguments(bundle1);
                getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, bundle, com/walmartlabs/payment/controller/mpay/PairFragment.getName()).commit();
                return;
            }
            if (bundle.equals(EXTRA_PAYMENT_CONFIRM))
            {
                showConfirmation((Transaction)getIntent().getParcelableExtra("transaction"));
                return;
            }
            if (bundle.equals(EXTRA_MORE_INFO))
            {
                showMoreInfo(false);
                return;
            }
        }
    }

    public void onHowTo()
    {
        showMoreInfo(true);
    }

    public void onPairingError()
    {
        setResult(11);
        finish();
    }

    public void onSetup()
    {
        setResult(10);
        finish();
    }

    public void onSubmitToSaver(String s, String s1)
    {
        startActivityForResult(AppIntegrationFactory.create(this).createSubmitToSaverIntent(this, s, s1), 1);
    }

    public void onTransaction(Transaction transaction)
    {
        showConfirmation(transaction);
    }

}
