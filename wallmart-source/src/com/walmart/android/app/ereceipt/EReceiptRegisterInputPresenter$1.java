// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.view.View;
import com.squareup.otto.Bus;
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
        EReceiptRegisterInputPresenter.access$000(EReceiptRegisterInputPresenter.this, 0);
        view = (new com.walmartlabs.anivia.esenter("pageView")).ng("name", "Why Enter Phone Number").ng("section", "Saver").ng("subCategory", "Savings Catcher");
        MessageBus.getBus().post(view);
    }

    (Presenter presenter)
    {
        this$0 = EReceiptRegisterInputPresenter.this;
        super(presenter);
    }
}
