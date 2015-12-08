// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ScrollView;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            TransferRxUserInfoPresenter, TransferRxPrescriptionInfoPresenter

class this._cls0
    implements android.view.UserInfoPresenter._cls3
{

    final TransferRxUserInfoPresenter this$0;

    public void onClick(View view)
    {
        if (TransferRxUserInfoPresenter.access$200(TransferRxUserInfoPresenter.this))
        {
            ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(TransferRxUserInfoPresenter.access$300(TransferRxUserInfoPresenter.this).getWindowToken(), 0);
            TransferRxUserInfoPresenter.access$400(TransferRxUserInfoPresenter.this);
            view = new TransferRxPrescriptionInfoPresenter(mActivity);
            view.setTransferRxData(TransferRxUserInfoPresenter.access$500(TransferRxUserInfoPresenter.this));
            TransferRxUserInfoPresenter.access$600(TransferRxUserInfoPresenter.this, view);
        }
    }

    enter()
    {
        this$0 = TransferRxUserInfoPresenter.this;
        super();
    }
}
