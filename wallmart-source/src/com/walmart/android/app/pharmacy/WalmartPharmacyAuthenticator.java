// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import com.walmart.android.app.account.AccountDelegate;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.app.account.CreateAccountPresenter;
import com.walmart.android.app.account.LoginPresenter;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.android.pharmacy.PharmacyAuthenticator;
import com.walmartlabs.android.pharmacy.PharmacyManager;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyLinkAccountPresenter

public class WalmartPharmacyAuthenticator
    implements PharmacyAuthenticator
{
    private static class PharmacyAccountDelegate extends AccountDelegate
    {

        public com.walmartlabs.anivia.AniviaEventAsJson.Builder getCreateAccountAniviaPageView()
        {
            return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:CreateAccountPg2");
        }

        public com.walmartlabs.anivia.AniviaEventAsJson.Builder getLoginAniviaPageView()
        {
            return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:CreateAccountPg1");
        }

        public void onCreateAccountComplete(Activity activity, Presenter presenter, com.walmart.android.app.account.AccountDelegate.DelegateCallback delegatecallback)
        {
            activity = PharmacyManager.get().linkAccount(activity, delegatecallback. new com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted() {

                final PharmacyAccountDelegate this$0;
                final com.walmart.android.app.account.AccountDelegate.DelegateCallback val$callback;

                public void onFlowCompleted()
                {
                    if (callback != null)
                    {
                        callback.onComplete();
                    }
                }

            
            {
                this$0 = final_pharmacyaccountdelegate;
                callback = com.walmart.android.app.account.AccountDelegate.DelegateCallback.this;
                super();
            }
            });
            if (presenter != null)
            {
                presenter.getPresenterStack().popToRootSilent();
                presenter.getPresenterStack().pushPresenter(activity, true);
            }
        }

        public void onLoginComplete(Activity activity, Presenter presenter, com.walmart.android.app.account.AccountDelegate.DelegateCallback delegatecallback)
        {
            PharmacyManager.get().verifyLinkedAccount(activity, presenter.getPresenterStack(), delegatecallback. new com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted() {

                final PharmacyAccountDelegate this$0;
                final com.walmart.android.app.account.AccountDelegate.DelegateCallback val$callback;

                public void onFlowCompleted()
                {
                    if (callback != null)
                    {
                        callback.onComplete();
                    }
                }

            
            {
                this$0 = final_pharmacyaccountdelegate;
                callback = com.walmart.android.app.account.AccountDelegate.DelegateCallback.this;
                super();
            }
            });
        }

        public boolean optOut()
        {
            return true;
        }

        private PharmacyAccountDelegate()
        {
        }

    }


    public WalmartPharmacyAuthenticator()
    {
    }

    public Presenter createAppAccount(Activity activity, String s, String s1, String s2, final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted callback)
    {
        activity = new CreateAccountPresenter(activity, "Pharmacy");
        activity.addAccountDelegate(new PharmacyAccountDelegate());
        activity.prepopulate(s, s1, s2);
        activity.setAccountListener(new AccountListener() {

            final WalmartPharmacyAuthenticator this$0;
            final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted val$callback;

            public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
            {
                callback.onFlowCompleted();
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.this;
                callback = onflowcompleted;
                super();
            }
        });
        return activity;
    }

    public Presenter linkAccount(Activity activity, int i, int j, final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted callback)
    {
        activity = new WalmartPharmacyLinkAccountPresenter(activity);
        activity.prepopulate(i, j);
        activity.setAccountListener(new AccountListener() {

            final WalmartPharmacyAuthenticator this$0;
            final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted val$callback;

            public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
            {
                callback.onFlowCompleted();
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.this;
                callback = onflowcompleted;
                super();
            }
        });
        return activity;
    }

    public Presenter signIn(Activity activity, final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted callback)
    {
        activity = new LoginPresenter(activity, "Pharmacy");
        activity.setSignInHeaderTextResId(0x7f09057b);
        activity.addAccountDelegate(new PharmacyAccountDelegate());
        activity.setSignInHeaderTextResId(0x7f09057c);
        activity.setAccountListener(new AccountListener() {

            final WalmartPharmacyAuthenticator this$0;
            final com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted val$callback;

            public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
            {
                callback.onFlowCompleted();
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.this;
                callback = onflowcompleted;
                super();
            }
        });
        return activity;
    }

    public void verifySession(final com.walmartlabs.android.pharmacy.PharmacyManager.VerifySessionCallback callback)
    {
        Services.get().getAuthentication().renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

            final WalmartPharmacyAuthenticator this$0;
            final com.walmartlabs.android.pharmacy.PharmacyManager.VerifySessionCallback val$callback;

            public void onFailure(int i)
            {
                callback.onSessionUnavailable();
            }

            public void onSuccess()
            {
                callback.onSessionAvailable();
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.this;
                callback = verifysessioncallback;
                super();
            }
        });
    }
}
