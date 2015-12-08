// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.View;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter, EReceiptItemPresenterFactory

class t> extends OnSingleClickListener
{

    final EReceiptListPresenter this$0;

    public void onSingleClick(View view)
    {
        if (!EReceiptListPresenter.access$200(EReceiptListPresenter.this))
        {
            EReceiptListPresenter.access$300(EReceiptListPresenter.this).launchSignIn();
            return;
        } else
        {
            EReceiptListPresenter.access$300(EReceiptListPresenter.this).launchRegistration();
            return;
        }
    }

    tory(Presenter presenter)
    {
        this$0 = EReceiptListPresenter.this;
        super(presenter);
    }
}
