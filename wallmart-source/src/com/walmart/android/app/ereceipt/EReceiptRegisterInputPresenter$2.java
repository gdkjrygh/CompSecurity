// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterInputPresenter

class this._cls0 extends OnSingleClickListener
{

    final EReceiptRegisterInputPresenter this$0;

    public void onSingleClick(View view)
    {
        if (EReceiptRegisterInputPresenter.access$100(EReceiptRegisterInputPresenter.this) != null)
        {
            EReceiptRegisterInputPresenter.access$100(EReceiptRegisterInputPresenter.this).onLoginCompleted(false, false, false);
        } else
        {
            EReceiptRegisterInputPresenter.access$200(EReceiptRegisterInputPresenter.this).onBackPressed();
        }
        MessageBus.getBus().post((new com.walmartlabs.anivia.esenter("registerAction")).ng("action", "not now"));
    }

    (Presenter presenter)
    {
        this$0 = EReceiptRegisterInputPresenter.this;
        super(presenter);
    }
}
