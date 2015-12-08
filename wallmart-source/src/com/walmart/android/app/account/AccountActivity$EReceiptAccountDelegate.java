// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import android.app.ProgressDialog;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.ereceipt.service.EReceiptManager;

// Referenced classes of package com.walmart.android.app.account:
//            AccountDelegate, AccountActivity, AccountListener

private static class <init> extends AccountDelegate
{

    private void showEReceiptRegisterPresenter(Activity activity, Presenter presenter, final <init> callback)
    {
        AccountActivity.access$100(activity, presenter.getPresenterStack(), new AccountListener() {

            final AccountActivity.EReceiptAccountDelegate this$0;
            final AccountDelegate.DelegateCallback val$callback;

            public void onLoginCompleted(boolean flag, boolean flag1, boolean flag2)
            {
                callback.onComplete();
            }

            
            {
                this$0 = AccountActivity.EReceiptAccountDelegate.this;
                callback = delegatecallback;
                super();
            }
        });
    }

    public com.walmartlabs.anivia.Delegate getCreateAccountAniviaPageView()
    {
        return (new com.walmartlabs.anivia.Delegate("pageView")).Delegate("name", "Create Account").Delegate("section", "Saver").Delegate("subCategory", "Savings Catcher");
    }

    public com.walmartlabs.anivia.Delegate getLoginAniviaPageView()
    {
        return (new com.walmartlabs.anivia.Delegate("pageView")).Delegate("name", "SignIn").Delegate("section", "Saver").Delegate("subCategory", "Savings Catcher");
    }

    public void onCreateAccountComplete(Activity activity, Presenter presenter, ete ete)
    {
        showEReceiptRegisterPresenter(activity, presenter, ete);
    }

    public void onLoginComplete(final Activity activity, final Presenter presenter, final showEReceiptRegisterPresenter callback)
    {
        final ProgressDialog pd = CustomProgressDialog.create(activity);
        pd.setMessage(activity.getString(0x7f0900cc));
        pd.setIndeterminate(true);
        pd.setCancelable(true);
        EReceiptManager.get().walletRegisteredStatus(new com.walmartlabs.ereceipt.service.EReceiptManager.RegisteredPhoneNumberCallback() {

            final AccountActivity.EReceiptAccountDelegate this$0;
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
                this$0 = AccountActivity.EReceiptAccountDelegate.this;
                pd = progressdialog;
                activity = activity1;
                presenter = presenter1;
                callback = delegatecallback;
                super();
            }
        });
        pd.show();
        MessageBus.getBus().post(new com.walmartlabs.anivia.k("saverAccountSignin"));
    }


    private _cls2.val.callback()
    {
    }

    _cls2.val.callback(_cls2.val.callback callback)
    {
        this();
    }
}
