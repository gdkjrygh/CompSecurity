// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import com.walmart.android.app.account.AccountDelegate;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.android.pharmacy.PharmacyManager;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            WalmartPharmacyAuthenticator

private static class <init> extends AccountDelegate
{

    public com.walmartlabs.anivia.tDelegate getCreateAccountAniviaPageView()
    {
        return (new com.walmartlabs.anivia.tDelegate("pageView")).tDelegate("name", "Rx:CreateAccountPg2");
    }

    public com.walmartlabs.anivia.tDelegate getLoginAniviaPageView()
    {
        return (new com.walmartlabs.anivia.tDelegate("pageView")).tDelegate("name", "Rx:CreateAccountPg1");
    }

    public void onCreateAccountComplete(Activity activity, Presenter presenter, final com.walmart.android.app.account. callback)
    {
        activity = PharmacyManager.get().linkAccount(activity, new com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted() {

            final WalmartPharmacyAuthenticator.PharmacyAccountDelegate this$0;
            final com.walmart.android.app.account.AccountDelegate.DelegateCallback val$callback;

            public void onFlowCompleted()
            {
                if (callback != null)
                {
                    callback.onComplete();
                }
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.PharmacyAccountDelegate.this;
                callback = delegatecallback;
                super();
            }
        });
        if (presenter != null)
        {
            presenter.getPresenterStack().popToRootSilent();
            presenter.getPresenterStack().pushPresenter(activity, true);
        }
    }

    public void onLoginComplete(Activity activity, Presenter presenter, final com.walmart.android.app.account. callback)
    {
        PharmacyManager.get().verifyLinkedAccount(activity, presenter.getPresenterStack(), new com.walmartlabs.android.pharmacy.PharmacyManager.OnFlowCompleted() {

            final WalmartPharmacyAuthenticator.PharmacyAccountDelegate this$0;
            final com.walmart.android.app.account.AccountDelegate.DelegateCallback val$callback;

            public void onFlowCompleted()
            {
                if (callback != null)
                {
                    callback.onComplete();
                }
            }

            
            {
                this$0 = WalmartPharmacyAuthenticator.PharmacyAccountDelegate.this;
                callback = delegatecallback;
                super();
            }
        });
    }

    public boolean optOut()
    {
        return true;
    }

    private _cls2.val.callback()
    {
    }

    _cls2.val.callback(_cls2.val.callback callback)
    {
        this();
    }
}
