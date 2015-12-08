// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import com.walmartlabs.payment.controller.PaymentActivity;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.GiftCard;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            ConfirmationActivity, AddGiftCardFragment, AddCreditCardFragment, EditGiftCardFragment, 
//            EditCreditCardFragment

public class PaymentEditActivity extends PaymentActivity
    implements AddCreditCardFragment.Callbacks, AddGiftCardFragment.Callbacks, EditCreditCardFragment.Callbacks, EditGiftCardFragment.Callbacks
{

    private static final long CONFIRMATION_TIME = 3000L;
    public static final String EXTRA_ADD_CREDIT_CARD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/PaymentEditActivity.getName()).append(".ADD_CREDIT_CARD").toString();
    public static final String EXTRA_ADD_GIFT_CARD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/PaymentEditActivity.getName()).append(".ADD_GIFT_CARD").toString();
    public static final String EXTRA_EDIT_CREDIT_CARD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/PaymentEditActivity.getName()).append(".EDIT_CREDIT_CARD").toString();
    public static final String EXTRA_PAYMENT_METHOD = (new StringBuilder()).append(com/walmartlabs/payment/controller/edit/PaymentEditActivity.getName()).append(".PAYMENT_METHOD").toString();
    private static final int REQUEST_CONFIRMATION = 1;

    public PaymentEditActivity()
    {
    }

    private void showConfirmation(int i)
    {
        Intent intent = new Intent(this, com/walmartlabs/payment/controller/edit/ConfirmationActivity);
        intent.putExtra(ConfirmationActivity.EXTRA_CONFIRMATION_TEXT, getText(i));
        intent.putExtra(ConfirmationActivity.EXTRA_CONFIRMATION_TIME, 3000L);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1)
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.payment.R.layout.pm_activity_edit);
        setSupportActionBar((Toolbar)findViewById(com.walmartlabs.android.payment.R.id.toolbar));
        bundle = getSupportActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(true);
            bundle.setDisplayHomeAsUpEnabled(true);
            bundle.setHomeButtonEnabled(true);
            bundle.setBackgroundDrawable(getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.actionbar_bg));
        }
        if (getIntent().getBooleanExtra(EXTRA_ADD_GIFT_CARD, false))
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, AddGiftCardFragment.newInstance(), com/walmartlabs/payment/controller/edit/AddGiftCardFragment.getName()).commit();
            return;
        }
        if (getIntent().getBooleanExtra(EXTRA_ADD_CREDIT_CARD, false))
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, AddCreditCardFragment.newInstance(), com/walmartlabs/payment/controller/edit/AddCreditCardFragment.getName()).commit();
            return;
        }
        bundle = getIntent().getParcelableExtra(EXTRA_PAYMENT_METHOD);
        if (bundle instanceof GiftCard)
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, EditGiftCardFragment.newInstance((GiftCard)bundle), com/walmartlabs/payment/controller/edit/EditGiftCardFragment.getName()).commit();
            return;
        }
        if (bundle instanceof CreditCard)
        {
            getSupportFragmentManager().beginTransaction().replace(com.walmartlabs.android.payment.R.id.content_frame, EditCreditCardFragment.newInstance((CreditCard)bundle), com/walmartlabs/payment/controller/edit/EditCreditCardFragment.getName()).commit();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onCreditCardAdded()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_add_credit_card_confirmation);
    }

    public void onCreditCardDeleted()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_delete_confirmation);
    }

    public void onCreditCardUpdated()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_edit_gift_card_confirmation);
    }

    public void onGiftCardCreated()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_add_gift_card_confirmation);
    }

    public void onGiftCardDeleted()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_delete_confirmation);
    }

    public void onGiftCardUpdated()
    {
        showConfirmation(com.walmartlabs.android.payment.R.string.pm_edit_gift_card_confirmation);
    }

}
