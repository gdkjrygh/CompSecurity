// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.ereceipt.EReceiptRegisterInputPresenter;
import com.walmart.android.app.ereceipt.EReceiptRegisterVerifyPresenter;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.ereceipt.service.EReceiptManager;

// Referenced classes of package com.walmart.android.app.account:
//            AssociateLoginPresenter, CreateAccountPresenter, LoginPresenter, AccountListener, 
//            AccountDelegate

public class AccountActivity extends FullScreenActivity
{
    private static class EReceiptAccountDelegate extends AccountDelegate
    {

        private void showEReceiptRegisterPresenter(Activity activity, Presenter presenter, AccountDelegate.DelegateCallback delegatecallback)
        {
            AccountActivity.showEReceiptRegisterPresenter(activity, presenter.getPresenterStack(), delegatecallback. new AccountListener() {

                final EReceiptAccountDelegate this$0;
                final AccountDelegate.DelegateCallback val$callback;

                public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
                {
                    callback.onComplete();
                }

            
            {
                this$0 = final_ereceiptaccountdelegate;
                callback = AccountDelegate.DelegateCallback.this;
                super();
            }
            });
        }

        public com.walmartlabs.anivia.AniviaEventAsJson.Builder getCreateAccountAniviaPageView()
        {
            return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Create Account").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        }

        public com.walmartlabs.anivia.AniviaEventAsJson.Builder getLoginAniviaPageView()
        {
            return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "SignIn").putString("section", "Saver").putString("subCategory", "Savings Catcher");
        }

        public void onCreateAccountComplete(Activity activity, Presenter presenter, AccountDelegate.DelegateCallback delegatecallback)
        {
            showEReceiptRegisterPresenter(activity, presenter, delegatecallback);
        }

        public void onLoginComplete(final Activity activity, final Presenter presenter, AccountDelegate.DelegateCallback delegatecallback)
        {
            final ProgressDialog pd = CustomProgressDialog.create(activity);
            pd.setMessage(activity.getString(0x7f0900cc));
            pd.setIndeterminate(true);
            pd.setCancelable(true);
            EReceiptManager.get().walletRegisteredStatus(delegatecallback. new com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberCallback() {

                final EReceiptAccountDelegate this$0;
                final Activity val$activity;
                final AccountDelegate.DelegateCallback val$callback;
                final ProgressDialog val$pd;
                final Presenter val$presenter;

                public void onResult(com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberResult registeredphonenumberresult)
                {
                    pd.dismiss();
                    if (registeredphonenumberresult == com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberResult.NO)
                    {
                        showEReceiptRegisterPresenter(activity, presenter, callback);
                        return;
                    } else
                    {
                        callback.onComplete();
                        return;
                    }
                }

            
            {
                this$0 = final_ereceiptaccountdelegate;
                pd = progressdialog;
                activity = activity1;
                presenter = presenter1;
                callback = AccountDelegate.DelegateCallback.this;
                super();
            }
            });
            pd.show();
            MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("saverAccountSignin"));
        }


        private EReceiptAccountDelegate()
        {
        }

    }


    public static final String EXTRA_ACCOUNT_CREATED = "account_created";
    public static final String EXTRA_CART_MERGE_TYPE = "merge_type";
    public static final String EXTRA_CHECK_ASSOCIATE = "check_associate";
    public static final String EXTRA_EMAIL_SIGNUP = "email_signup";
    public static final String EXTRA_FROM = "from";
    public static final String EXTRA_GUEST_LOGIN = "guest_login";
    public static final String EXTRA_ORIGIN = "origin";
    public static final String EXTRA_SIGN_IN_MODE = "mode";
    public static final String EXTRA_SIGN_IN_TITLE_TEXT = "sign_in_title_text";
    public static final String EXTRA_SWEEP_CART_ON_SIGN_IN = "sweep_cart_on_sign_in";
    public static final String FROM_CART = "Cart";
    public static final String FROM_CHECKOUT = "Checkout";
    public static final String FROM_ERECEIPTS = "eReceipts";
    public static final String FROM_GUEST = "Guest";
    public static final String FROM_NAV = "Nav";
    public static final String FROM_OTHER = "Other";
    public static final String FROM_PHARMACY = "Pharmacy";
    public static final String FROM_PHOTO = "Photo";
    public static final String FROM_SNG = "SnG";
    public static final String FROM_WISH_LIST = "Wishlist";
    public static final int MODE_ASSOCIATE_SIGN_IN = 4;
    public static final int MODE_CREATE_ACCOUNT = 8;
    public static final int MODE_ERECEIPT_REGISTER = 16;
    public static final int MODE_SIGN_IN_OR_CREATE_ACCOUNT = 1;
    public static final int MODE_SIGN_IN_VERIFY = 2;
    public static final int RESULT_SIGN_IN__OK = 1;
    private final AccountListener mAccountListener = new AccountListener() {

        final AccountActivity this$0;

        public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
        {
            Intent intent = new Intent();
            intent.putExtra("guest_login", flag);
            intent.putExtra("account_created", flag1);
            intent.putExtra("email_signup", flag2);
            setResult(1, intent);
            finish();
        }

            
            {
                this$0 = AccountActivity.this;
                super();
            }
    };
    private String mFrom;

    public AccountActivity()
    {
    }

    private void showAssociateLoginPresenter()
    {
        AssociateLoginPresenter associateloginpresenter = new AssociateLoginPresenter(this);
        associateloginpresenter.setAccountListener(mAccountListener);
        getPresenterStack().pushPresenter(associateloginpresenter, false);
    }

    private void showCreateAccountPresenter(String s, boolean flag)
    {
        CreateAccountPresenter createaccountpresenter = new CreateAccountPresenter(this, mFrom);
        createaccountpresenter.setAccountListener(mAccountListener);
        if (flag)
        {
            createaccountpresenter.addAccountDelegate(new EReceiptAccountDelegate());
        }
        createaccountpresenter.setMergeType(s);
        getPresenterStack().pushPresenter(createaccountpresenter, false);
    }

    private static void showEReceiptRegisterPresenter(Activity activity, PresenterStack presenterstack, AccountListener accountlistener)
    {
        String s = SharedPreferencesUtil.getEReceiptPhoneNumber(activity);
        if (!TextUtils.isEmpty(s))
        {
            activity = new EReceiptRegisterVerifyPresenter(activity, s, true);
            activity.setAccountListener(accountlistener);
        } else
        {
            activity = new EReceiptRegisterInputPresenter(activity, true);
            activity.setAccountListener(accountlistener);
        }
        presenterstack.clear();
        presenterstack.pushPresenter(activity, false);
    }

    private void showLoginPresenter(String s, boolean flag, boolean flag1, int i, boolean flag2)
    {
        LoginPresenter loginpresenter = new LoginPresenter(this, mFrom);
        loginpresenter.setVerifyCredentials(flag);
        loginpresenter.setMergeType(s);
        loginpresenter.showGuestLogin(flag1);
        loginpresenter.setSignInHeaderTextResId(i);
        if (flag2)
        {
            loginpresenter.addAccountDelegate(new EReceiptAccountDelegate());
        }
        loginpresenter.setAccountListener(mAccountListener);
        getPresenterStack().pushPresenter(loginpresenter, false);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f05002f);
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        boolean flag = true;
        super.onCreate(bundle);
        if (!AppState.rerouteOnAppStart(this))
        {
            getWindow().setSoftInputMode(3);
            Intent intent = getIntent();
            int i = intent.getIntExtra("mode", 1);
            mFrom = intent.getStringExtra("from");
            if (mFrom == null)
            {
                mFrom = "Other";
            }
            boolean flag2 = intent.getBooleanExtra("sweep_cart_on_sign_in", false);
            String s = intent.getStringExtra("merge_type");
            bundle = s;
            if (TextUtils.isEmpty(s))
            {
                if (flag2)
                {
                    bundle = "sweep";
                } else
                {
                    bundle = "merge";
                }
            }
            if ((i & 4) > 0)
            {
                showAssociateLoginPresenter();
                return;
            }
            if ((i & 8) > 0)
            {
                if ((i & 0x10) <= 0)
                {
                    flag = false;
                }
                showCreateAccountPresenter(bundle, flag);
                return;
            }
            if ((i ^ 0x10) == 0)
            {
                showEReceiptRegisterPresenter(this, getPresenterStack(), mAccountListener);
                return;
            }
            int j;
            if ((i & 2) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag2 = intent.getBooleanExtra("guest_login", false);
            j = intent.getIntExtra("sign_in_title_text", 0x7f09057b);
            if ((i & 0x10) <= 0)
            {
                flag1 = false;
            }
            showLoginPresenter(bundle, flag, flag2, j, flag1);
            if (flag2)
            {
                GoogleAnalytics.trackEvent("Cart", "Guest Checkout", "Available");
                return;
            }
        }
    }

}
