// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterVerifyPresenter

class this._cls0
    implements Runnable
{

    final EReceiptRegisterVerifyPresenter this$0;

    public void run()
    {
        if (EReceiptRegisterVerifyPresenter.access$400(EReceiptRegisterVerifyPresenter.this) != null)
        {
            ViewUtil.showKeyboard(EReceiptRegisterVerifyPresenter.access$400(EReceiptRegisterVerifyPresenter.this));
        }
    }

    ()
    {
        this$0 = EReceiptRegisterVerifyPresenter.this;
        super();
    }
}
