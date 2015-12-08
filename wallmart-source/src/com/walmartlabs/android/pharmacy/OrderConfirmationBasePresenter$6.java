// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter

class val.callback extends OnSingleClickListener
{

    final OrderConfirmationBasePresenter this$0;
    final this._cls0 val$callback;

    public void onSingleClick(View view)
    {
        view = getCreateAppAccountPresenter(val$callback);
        if (view != null)
        {
            getPresenterStack().popToRoot();
            OrderConfirmationBasePresenter.access$200(OrderConfirmationBasePresenter.this, view, true);
        }
    }

    ( )
    {
        this$0 = final_orderconfirmationbasepresenter;
        val$callback = ;
        super(Presenter.this);
    }
}
